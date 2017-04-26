package com.epam.task4.service.impl;

import com.epam.task4.bean.Treasure;
import com.epam.task4.dao.Impl.SaxTreasureDAO;
import com.epam.task4.dao.exception.DAOException;
import com.epam.task4.dao.factory.DAOFactory;
import com.epam.task4.service.TreasureService;
import com.epam.task4.service.comparator.treasure.PriceComparator;
import com.epam.task4.service.exception.ServiceException;
import com.epam.task4.util.TreasureUtil;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author serge
 *         19.04.2017.
 */
public class SaxTreasureService implements TreasureService {

    @Override
    public ArrayList<Treasure> getAllTreasures() throws ServiceException {
        ArrayList<Treasure> treasureList;
        try {
            DAOFactory daoFactory = DAOFactory.getInstance();
            SaxTreasureDAO saxTreasureDAO = daoFactory.getSaxTreasureDAO();
            treasureList = saxTreasureDAO.getTreasureList();
        } catch (DAOException e){
            throw new ServiceException(e);
        }
        return treasureList;
    }

    @Override
    public ArrayList<Treasure> getMostExpensiveTreasure() throws ServiceException {
        ArrayList<Treasure> treasures;
        ArrayList<Treasure> expensiveTreasures = new ArrayList<>();
        treasures = getAllTreasures();
        expensiveTreasures.add(Collections.max(treasures, new PriceComparator()));
        return expensiveTreasures;
    }

    @Override
    public ArrayList<Treasure> getByCategory(String category) throws ServiceException {
        if (category == null || category.isEmpty()) {
            throw new ServiceException("Incorrect category name");
        }

        ArrayList<Treasure> treasures = getAllTreasures();
        ArrayList<Treasure> sameCategory = new ArrayList<>();

        for (Treasure treasure : treasures) {
            if (category.equals(treasure.getClass().getSimpleName().toLowerCase())) {
                sameCategory.add(treasure);
            }
        }
        return sameCategory;
    }

    @Override
    public ArrayList<Treasure> getByPriceRange(double from, double to) throws ServiceException {
        if (from > to) {
            throw new ServiceException("first parameter can't be more than second!");
        }

        ArrayList<Treasure> treasures = getAllTreasures();
        ArrayList<Treasure> selectedTreasures = new ArrayList<>();
        for (Treasure treasure : treasures) {
            if (TreasureUtil.getPrice(treasure) >= from &&
                    TreasureUtil.getPrice(treasure) <= to) {
                selectedTreasures.add(treasure);
            }
        }
        return selectedTreasures;
    }

    @Override
    public ArrayList<Treasure> getByMaterial(String material) throws ServiceException {
        if (material == null || material.isEmpty()) {
            throw new ServiceException("Incorrect name of material");
        }

        ArrayList<Treasure> treasures = getAllTreasures();
        ArrayList<Treasure> sameMaterial = new ArrayList<>();

        for (Treasure treasure : treasures) {
            if (TreasureUtil.getMaterial(treasure).toLowerCase().equals(material.toLowerCase())) {
                sameMaterial.add(treasure);
            }
        }
        return sameMaterial;
    }
}
