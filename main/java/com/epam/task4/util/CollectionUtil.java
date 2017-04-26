package com.epam.task4.util;

import com.epam.task4.bean.Treasure;

import java.util.ArrayList;

/**
 * @author serge
 *         19.04.2017.
 */
public class CollectionUtil {

    public static void printCollection(String response, ArrayList<Treasure> treasureList){
        System.out.println(response);
        for(Treasure treasure : treasureList){
            System.out.println(treasure.toString());
        }
    }
}
