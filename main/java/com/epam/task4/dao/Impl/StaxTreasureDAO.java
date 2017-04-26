package com.epam.task4.dao.Impl;

import com.epam.task4.bean.Treasure;
import com.epam.task4.dao.TreasureDAO;
import com.epam.task4.dao.exception.DAOException;
import com.epam.task4.dao.parser.factory.TreasureParserFactory;
import com.epam.task4.dao.parser.impl.StAXTreasureParser;

import java.util.ArrayList;

/**
 * @author serge
 *         19.04.2017.
 */
public class StaxTreasureDAO implements TreasureDAO {
    @Override
    public ArrayList<Treasure> getTreasureList() throws DAOException {
        TreasureParserFactory treasureParserFactory = TreasureParserFactory.getInstance();
        StAXTreasureParser stAXTreasureParser =
                (StAXTreasureParser) treasureParserFactory.createTreasureParser("stax");
        ArrayList<Treasure> treasureList = stAXTreasureParser.parse("src/main/resources/treasure.xml");
        return treasureList;
    }
}
