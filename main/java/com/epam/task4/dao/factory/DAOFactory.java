package com.epam.task4.dao.factory;

import com.epam.task4.dao.Impl.DomTreasureDAO;
import com.epam.task4.dao.Impl.SaxTreasureDAO;
import com.epam.task4.dao.Impl.StaxTreasureDAO;

/**
 * @author serge
 *         19.04.2017.
 */
public final class DAOFactory {
    private static final DAOFactory INSTANCE = new DAOFactory();
    private final DomTreasureDAO domTreasureDAO = new DomTreasureDAO();
    private final SaxTreasureDAO saxTreasureDAO = new SaxTreasureDAO();
    private final StaxTreasureDAO staxTreasureDAO = new StaxTreasureDAO();

    private DAOFactory() {
    }

    public static DAOFactory getInstance() {
        return INSTANCE;
    }

    public DomTreasureDAO getDomTreasureDAO() {
        return domTreasureDAO;
    }

    public SaxTreasureDAO getSaxTreasureDAO() {
        return saxTreasureDAO;
    }

    public StaxTreasureDAO getStaxTreasureDAO() {
        return staxTreasureDAO;
    }
}
