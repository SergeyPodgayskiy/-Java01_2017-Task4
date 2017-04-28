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
        Parser type = Parser.valueOf(parserType.toUpperCase());
        switch (type) {
            case SAX: {
                return Parser.SAX.createParser();
            }
            case STAX: {
                return Parser.STAX.createParser();
            }
            case DOM: {
                return Parser.DOM.createParser();
            }
            default: {
                throw new DAOException("Not existed parser type");
            }
        }
    }

    enum Parser {
        SAX {
            @Override
            public TreasureParser createParser() {
                return new SAXTreasureParser();
            }
        },
        STAX {
            @Override
            public TreasureParser createParser() {
                return new StAXTreasureParser();
            }
        },
        DOM {
            @Override
            public TreasureParser createParser() {
                return new DOMTreasureParser();
            }
        };

        public abstract TreasureParser createParser();
    }
}
