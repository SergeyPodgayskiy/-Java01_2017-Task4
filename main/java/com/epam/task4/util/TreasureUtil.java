package com.epam.task4.util;

import com.epam.task4.bean.*;

/**
 * @author serge
 *         21.04.2017.
 */
public class TreasureUtil {

    public static String getMaterial(Treasure object) {
        if (object.getClass() == Jewel.class) {
            return ((Jewel) object).getMaterial();
        } else if (object.getClass() == Ring.class) {
            return ((Ring) object).getMaterial();
        } else if (object.getClass() == Chain.class) {
            return ((Chain) object).getMaterial();
        } else if (object.getClass() == Bracelet.class) {
            return ((Bracelet) object).getMaterial();
        } else if (object.getClass() == Bracelet.class) {
            return ((Bracelet) object).getMaterial();
        }else {
            throw new IllegalArgumentException("can't get material name!");
        }
    }

    public static double getPrice(Treasure object) { //todo: getDeclaredName(Reflection)
        if (object.getClass() == Jewel.class) {
            return ((Jewel) object).getPrice();
        } else if (object.getClass() == Ring.class) {
            return ((Ring) object).getPrice();
        } else if (object.getClass() == Chain.class) {
            return ((Chain) object).getPrice();
        } else if (object.getClass() == Bracelet.class) {
            return ((Bracelet) object).getPrice();
        } else if (object.getClass() == Axe.class) {
            return ((Axe) object).getPrice();
        } else {
            throw new IllegalArgumentException("can't get price!");
        }
    }
}
