package com.epam.task4.service;

import com.epam.task4.bean.Treasure;
import com.epam.task4.service.exception.ServiceException;

import java.util.ArrayList;

/**
 * @author serge
 *         19.04.2017.
 */
public interface TreasureService {
    ArrayList<Treasure> getAllTreasures() throws ServiceException;
    ArrayList<Treasure> getMostExpensiveTreasure() throws ServiceException;
    ArrayList<Treasure> getByCategory(String category) throws ServiceException;
    ArrayList<Treasure> getByPriceRange(double from, double to) throws ServiceException;
    ArrayList<Treasure> getByMaterial(String material) throws ServiceException;
}
