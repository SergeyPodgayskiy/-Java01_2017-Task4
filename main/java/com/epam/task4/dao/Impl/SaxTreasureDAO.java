package com.epam.task4.dao.Impl;

import com.epam.task4.bean.Treasure;
import com.epam.task4.dao.TreasureDAO;
import com.epam.task4.dao.exception.DAOException;
import com.epam.task4.dao.parser.factory.TreasureParserFactory;
import com.epam.task4.dao.parser.impl.SAXTreasureParser;

import java.util.ArrayList;

/**
 * @author serge
 *         19.04.2017.
 */
public class SaxTreasureDAO implements TreasureDAO {
    @Override
    public ArrayList<Treasure> getTreasureList() throws DAOException {
        TreasureParserFactory treasureParserFactory = TreasureParserFactory.getInstance();
        SAXTreasureParser saxTreasureParser =
                (SAXTreasureParser) treasureParserFactory.createTreasureParser("sax");
        ArrayList<Treasure> treasureList = saxTreasureParser.parse("src/main/resources/treasure.xml");
        return treasureList;
    }
}
