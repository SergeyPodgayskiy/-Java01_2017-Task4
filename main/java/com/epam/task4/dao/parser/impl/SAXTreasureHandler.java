package com.epam.task4.dao.parser.impl;

import com.epam.task4.bean.Treasure;
import com.epam.task4.service.builder.TreasureBuilder;
import com.epam.task4.controller.BuilderProvider;
import com.epam.task4.util.ParserUtil;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

/**
 * @author serge
 *         17.04.2017.
 */
public class SAXTreasureHandler extends DefaultHandler {
    private StringBuilder tagValue;
    private TreasureBuilder treasureBuilder;
    private BuilderProvider builderProvider = BuilderProvider.getInstance();
    private ArrayList<Treasure> treasureList;

    public ArrayList<Treasure> getTreasureList() {
        return treasureList;
    }

    @Override
    public void startDocument() throws SAXException {
        System.out.println("Parsing started.");
        treasureList = new ArrayList<>();
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("Parsing ended");
    }

    @Override
    public void startElement(String uri, String localName, String tagName,
                             Attributes attributes) throws SAXException {
        tagValue = new StringBuilder();
        if (attributes.getValue("id") != null) {
            treasureBuilder = builderProvider.getConcreteBuilder(attributes.getValue("element"));
            treasureBuilder.setParameter("id", attributes.getValue("id"));
        }
    }

    @Override
    public void characters(char[] buffer, int start, int length) throws SAXException {
        tagValue.append(buffer, start, length);

    }

    @Override
    public void endElement(String uri, String localName, String tagName) throws SAXException {
        if (treasureBuilder != null) {
            if (!ParserUtil.isRootNode(tagName)) {
                if (!ParserUtil.isChildNode(tagName)) {
                    treasureBuilder.setParameter(tagName, String.valueOf(tagValue));
                } else {
                    Treasure treasure = treasureBuilder.build();
                    treasureList.add(treasure);
                }
            }
        }
    }

    @Override
    public void warning(SAXParseException e) throws SAXException {
        System.err.println("WARNING: line " + e.getLineNumber() + " : " + e.getMessage());
    }

    @Override
    public void error(SAXParseException e) throws SAXException {
        System.err.println("ERROR: line " + e.getLineNumber() + " : " + e.getMessage());
    }

    @Override
    public void fatalError(SAXParseException e) throws SAXException {
        System.err.println("FATAL ERROR: line " + e.getLineNumber() + " : " + e.getMessage());
    }
}
