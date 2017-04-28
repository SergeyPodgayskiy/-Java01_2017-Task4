package com.epam.task4.service.builder.impl;

import com.epam.task4.bean.Jewel;
import com.epam.task4.bean.Treasure;
import com.epam.task4.service.builder.TreasureBuilder;


/**
 * @author serge
 *         18.04.2017.
 */
public class JewelBuilder implements TreasureBuilder {
    private final String id = "id";
    private final String material = "material";
    private final String type = "type";
    private final String diameter = "diameter";
    private final String weight = "weight";
    private final String price = "price";
    private Jewel jewel;

    @Override
    public TreasureBuilder createTreasure() {
        jewel = new Jewel();
        return this;
    }

    @Override
    public TreasureBuilder setParameter(String tagName, String tagValue) {
        switch (tagName) {
            case id:
                jewel.setId(Integer.parseInt(tagValue));
                return this;
            case type:
                jewel.setType(tagValue);
                return this;
            case material:
                jewel.setMaterial(tagValue);
                return this;
            case diameter:
                jewel.setDiameter(Double.parseDouble(tagValue));
                return this;
            case weight:
                jewel.setWeight(Double.parseDouble(tagValue));
                return this;
            case price:
                jewel.setPrice(Double.parseDouble(tagValue));
                return this;
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override
    public Treasure build() {
        return jewel;
    }
}
