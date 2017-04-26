package com.epam.task4.controller.command.Impl;

import com.epam.task4.bean.Treasure;
import com.epam.task4.controller.command.Command;
import com.epam.task4.service.TreasureService;
import com.epam.task4.service.exception.ServiceException;
import com.epam.task4.service.factory.ServiceFactory;
import com.epam.task4.util.CollectionUtil;

import java.util.ArrayList;

/**
 * @author serge
 *         21.04.2017.
 */
public class GetByPriceRangeCmd implements Command {
    @Override
    public String execute(String request, String parserType) {
        String response;
        double firstPrice;
        double secondPrice;
        String[] parameters = request.split(" ");
        if (parameters.length != 3) {
            throw new IllegalArgumentException("Incorrect input values." +
                    "Check your price range(two values only!)");
        } else {
            firstPrice = Double.parseDouble(parameters[1]);
            secondPrice = Double.parseDouble(parameters[2]);
        }
        ServiceFactory serviceFactory = ServiceFactory.getINSTANCE();
        TreasureService treasureService = serviceFactory.getConcreteService(parserType);
        try {
            ArrayList<Treasure> list = treasureService.getByPriceRange(firstPrice,secondPrice);
            response = "Treasure of the price range between: " + firstPrice + " and " + secondPrice;
            CollectionUtil.printCollection(response, list);
        } catch (ServiceException e) {
            response = "Error during get list of treasure!";
        }
        return response;
    }
}
