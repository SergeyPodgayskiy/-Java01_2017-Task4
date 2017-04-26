package com.epam.task4.dao.parser.factory;

import com.epam.task4.dao.exception.DAOException;
import com.epam.task4.dao.parser.TreasureParser;
import com.epam.task4.dao.parser.impl.DOMTreasureParser;
import com.epam.task4.dao.parser.impl.SAXTreasureParser;
import com.epam.task4.dao.parser.impl.StAXTreasureParser;


public final class TreasureParserFactory {
    private static final TreasureParserFactory instance = new TreasureParserFactory();

    private TreasureParserFactory() {
    }

    public static TreasureParserFactory getInstance() {
        return instance;
    }

    public TreasureParser createTreasureParser(String parserType) throws DAOException {
        String type = parserType.toUpperCase();
        switch (type) {
            case "SAX": {
                return new SAXTreasureParser();
            }
            case "STAX": {
                return new StAXTreasureParser();
            }
            case "DOM": {
                return new DOMTreasureParser();
            }
            default: {
                throw new DAOException("Not existed parser type");
            }
        }
    }
}
