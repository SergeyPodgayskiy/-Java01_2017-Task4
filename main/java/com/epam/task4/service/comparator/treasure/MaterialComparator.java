package com.epam.task4.service.comparator.treasure;

import com.epam.task4.bean.*;
import com.epam.task4.util.TreasureUtil;

import java.util.Comparator;

/**
 * @author serge
 *         21.04.2017.
 */
public class MaterialComparator implements Comparator<Treasure> {
    @Override
    public int compare(Treasure o1, Treasure o2) {
        String firstMaterial = TreasureUtil.getMaterial(o1);
        String secondMaterial = TreasureUtil.getMaterial(o2);
        return firstMaterial.compareTo(secondMaterial);
    }
}
