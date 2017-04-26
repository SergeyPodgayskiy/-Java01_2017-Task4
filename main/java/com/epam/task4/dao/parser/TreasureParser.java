package com.epam.task4.dao.parser;

import com.epam.task4.bean.Treasure;
import com.epam.task4.dao.exception.DAOException;

import java.util.ArrayList;

/**
 * @author serge
 *         17.04.2017.
 */
public interface TreasureParser {
     ArrayList<Treasure> parse(String path) throws DAOException;
}
