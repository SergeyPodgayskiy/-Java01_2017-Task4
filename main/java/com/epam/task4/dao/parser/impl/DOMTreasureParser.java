package com.epam.task4.dao.parser.impl;

import com.epam.task4.bean.Treasure;
import com.epam.task4.service.builder.TreasureBuilder;
import com.epam.task4.controller.BuilderProvider;
import com.epam.task4.dao.exception.DAOException;
import com.epam.task4.dao.parser.TreasureParser;
import com.sun.org.apache.xerces.internal.parsers.DOMParser;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.util.ArrayList;

/**
 * @author serge
 *         18.04.2017.
 */
public class DOMTreasureParser implements TreasureParser {
    private ArrayList<Treasure> treasureList;
    private Treasure treasure;
    private BuilderProvider builderProvider = new BuilderProvider();
    private TreasureBuilder treasureBuilder;

    @Override
    public ArrayList<Treasure> parse(String path) throws DAOException {
        InputSource inputSource = new InputSource(path);
        DOMParser domParser = new DOMParser();
        try {
            domParser.parse(inputSource);
        } catch (SAXException | IOException e) {
            throw new DAOException(e);
        }
        Document document = domParser.getDocument();
        Element root = document.getDocumentElement();
        treasureList = getTreasureList(root);
        return treasureList;
    }

    private ArrayList<Treasure> getTreasureList(Element root) {
        treasureList = new ArrayList<>();
        NodeList treasureNodes = root.getElementsByTagName("treasure");
        for (int i = 0; i < treasureNodes.getLength(); i++) {
            Element element = (Element) treasureNodes.item(i);
            treasureBuilder = builderProvider.getConcreteBuilder(element.getAttribute("element"));
                treasureBuilder.setParameter("id", element.getAttribute("id"));
                NodeList nodeList = element.getChildNodes();
                for (int j = 1; j < nodeList.getLength(); j++) {
                    Node node = nodeList.item(j);
                    if (node.getLocalName() != null) {
                        treasureBuilder.setParameter(node.getNodeName(), node.getTextContent());
                    }
                }
                treasure = treasureBuilder.build();
                treasureList.add(treasure);
        }
        return treasureList;
    }
}
