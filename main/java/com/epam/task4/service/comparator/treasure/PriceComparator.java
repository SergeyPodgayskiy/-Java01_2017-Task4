package com.epam.task4.service.comparator.treasure;

import com.epam.task4.bean.*;
import com.epam.task4.util.TreasureUtil;

import java.util.Comparator;

/**
 * @author serge
 *         21.04.2017.
 */
public class PriceComparator implements Comparator<Treasure> {
    @Override
    public int compare(Treasure o1, Treasure o2) {
        double firstPrice = TreasureUtil.getPrice(o1);
        double secondPrice = TreasureUtil.getPrice(o2);
        if (firstPrice > secondPrice) {
            return 1;
        } else if (firstPrice < secondPrice) {
            return -1;
        } else {
            return 0;
        }
    }
}
