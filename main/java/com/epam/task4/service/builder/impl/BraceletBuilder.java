package com.epam.task4.service.builder.impl;

import com.epam.task4.bean.Bracelet;
import com.epam.task4.bean.Treasure;
import com.epam.task4.service.builder.TreasureBuilder;


public class BraceletBuilder implements TreasureBuilder {
    Bracelet bracelet;

    @Override
    public TreasureBuilder createTreasure() {
        bracelet = new Bracelet();
        return this;
    }

    @Override
    public TreasureBuilder setParameter(String tagName,String tagValue) {
        switch (tagName) {
            case "id":
                bracelet.setId(Integer.parseInt(tagValue));
                return this;
            case "material":
                bracelet.setMaterial(tagValue);
                return this;
            case "weight":
                bracelet.setWeight(Double.parseDouble(tagValue));
                return this;
            case "style":
                bracelet.setStyle(tagValue);
                return this;
            case "girth":
                bracelet.setGirth(Double.parseDouble(tagValue));
                return this;
            case "hardness":
                bracelet.setHardness(tagValue);
                return this;
            case "price":
                bracelet.setPrice(Double.parseDouble(tagValue));
                return this;
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override
    public Treasure build() {
        return bracelet;
    }
}
