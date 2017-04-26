package com.epam.task4.dao.parser.impl;

import com.epam.task4.bean.Treasure;
import com.epam.task4.dao.exception.DAOException;
import com.epam.task4.dao.parser.TreasureParser;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.IOException;
import java.util.ArrayList;

/**
 * @author serge
 *         17.04.2017.
 */
public class SAXTreasureParser implements TreasureParser {
    private SAXTreasureHandler saxTreasureHandler = new SAXTreasureHandler();

    @Override
    public ArrayList<Treasure> parse(String path) throws DAOException {
        if (path == null || path.isEmpty()){
            throw new DAOException("Incorrect filePath");
        }
        InputSource inputSource = new InputSource(path);
        try {
            XMLReader xmlReader = XMLReaderFactory.createXMLReader();
            xmlReader.setContentHandler(saxTreasureHandler);
            xmlReader.parse(inputSource);
        } catch (IOException | SAXException e){
            System.err.println(e);
        }
        return saxTreasureHandler.getTreasureList();
    }
}
