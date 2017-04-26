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
 *         20.04.2017.
 */
public class GetMostExpensiveTreasureCmd implements Command {
    @Override
    public String execute(String request, String parserType) {
        String response;
        ServiceFactory serviceFactory = ServiceFactory.getINSTANCE();
        TreasureService treasureService = serviceFactory.getConcreteService(parserType);
        try {
            ArrayList<Treasure> list = treasureService.getMostExpensiveTreasure();
            response = "Most expensive treasure:  ";
            CollectionUtil.printCollection(response, list);
        } catch (ServiceException e){
            response = "Error during get list of treasure!";
        }
        return response;
    }
}
