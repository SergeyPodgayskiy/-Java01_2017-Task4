package com.epam.task4.service.builder.impl;

import com.epam.task4.bean.Chain;
import com.epam.task4.bean.Treasure;
import com.epam.task4.service.builder.TreasureBuilder;

/**
 * @author serge
 *         19.04.2017.
 */
public class ChainBuilder implements TreasureBuilder {
    private final String id = "id";
    private final String material = "material";
    private final String length = "length";
    private final String thickness = "thickness";
    private final String weight = "weight";
    private final String price = "price";
    private final String typeOfLock = "type_of_lock";
    private Chain chain;

    @Override
    public TreasureBuilder createTreasure() {
        chain = new Chain();
        return this;
    }

    @Override
    public TreasureBuilder setParameter(String tagName, String tagValue) {
        switch (tagName) {
            case id:
                chain.setId(Integer.parseInt(tagValue));
                return this;
            case length:
                chain.setLength(Double.parseDouble(tagValue));
                return this;
            case material:
                chain.setMaterial(tagValue);
                return this;
            case weight:
                chain.setWeight(Double.parseDouble(tagValue));
                return this;
            case thickness:
                chain.setThikness(Double.parseDouble(tagValue));
                return this;
            case typeOfLock:
                chain.setLockType(tagValue);
                return this;
            case price:
                chain.setPrice(Double.parseDouble(tagValue));
                return this;
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override
    public Treasure build() {
        return chain;
    }
}
