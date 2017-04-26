package com.epam.task4.dao;

import com.epam.task4.bean.Treasure;
import com.epam.task4.dao.exception.DAOException;

import java.util.ArrayList;

/**
 * @author serge
 *         19.04.2017.
 */
public interface TreasureDAO {
    ArrayList<Treasure> getTreasureList() throws DAOException;
}
