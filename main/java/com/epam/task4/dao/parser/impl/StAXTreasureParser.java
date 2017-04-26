package com.epam.task4.dao.parser.impl;

import com.epam.task4.bean.Treasure;
import com.epam.task4.service.builder.TreasureBuilder;
import com.epam.task4.controller.BuilderProvider;
import com.epam.task4.dao.exception.DAOException;
import com.epam.task4.dao.parser.TreasureParser;
import com.epam.task4.util.ParserUtil;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * @author serge
 *         18.04.2017.
 */
public class StAXTreasureParser implements TreasureParser {
    private XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
    private XMLStreamReader reader;
    private ArrayList<Treasure> treasureList;
    private BuilderProvider builderProvider = BuilderProvider.getInstance();
    private TreasureBuilder treasureBuilder;
    private String tagName;

    @Override
    public ArrayList<Treasure> parse(String path) throws DAOException {
        if (path == null || path.isEmpty()) {
            throw new DAOException("Incorrect filePath");
        }
        try {
            InputStream inputStream = new FileInputStream(path);
            reader = xmlInputFactory.createXMLStreamReader(inputStream);

        } catch (FileNotFoundException | XMLStreamException e) {
            throw new DAOException(e);

        }
        treasureList = getListTreasure();
        return treasureList;
    }

    private ArrayList<Treasure> getListTreasure() {
        treasureList = new ArrayList<>();
        try {
            while (reader.hasNext()) {
                int type = reader.next();
                switch (type) {
                    case XMLStreamConstants.START_ELEMENT:
                        startElement();
                        break;

                    case XMLStreamConstants.CHARACTERS:
                        characters();
                        break;

                    case XMLStreamConstants.END_ELEMENT:
                        endElement();
                        break;
                }
            }
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
        return treasureList;
    }

    private void startElement() {
        tagName = reader.getLocalName();
        if (!ParserUtil.isRootNode(tagName)) {
            String id = reader.getAttributeValue(null, "id");
            if (id != null) {
                treasureBuilder = builderProvider.
                        getConcreteBuilder(reader.getAttributeValue(null, "element"));
                if (treasureBuilder != null) {
                    treasureBuilder.setParameter("id", id);
                }
            }
        }
    }

    private void characters() {
        if (treasureBuilder != null) {
            String tagValue = reader.getText().trim();
            if (!tagValue.isEmpty()) {
                treasureBuilder.setParameter(tagName, tagValue);
            }
        }
    }

    private void endElement(){
        if (treasureBuilder != null) {
            tagName = reader.getLocalName();
            if (!ParserUtil.isRootNode(tagName)) {
                if (ParserUtil.isChildNode(tagName)) {
                    Treasure treasure = treasureBuilder.build();
                    treasureList.add(treasure);
                }
            }
        }
    }
}
