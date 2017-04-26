package com.epam.task4.service.builder.impl;

import com.epam.task4.bean.Ring;
import com.epam.task4.bean.Treasure;
import com.epam.task4.service.builder.TreasureBuilder;

public class RingBuilder implements TreasureBuilder {
    private Ring ring;

    @Override
    public TreasureBuilder createTreasure() {
        ring = new Ring();
        return this;
    }

    @Override
    public TreasureBuilder setParameter(String tagName,String tagValue) {
        switch (tagName) {
            case "id":
                ring.setId(Integer.parseInt(tagValue));
                return this;
            case "material":
                ring.setMaterial(tagValue);
                return this;
            case "weight":
                ring.setWeight(Double.parseDouble(tagValue));
                return this;
            case "style":
                ring.setStyle(tagValue);
                return this;
            case "hasPreciousStone":
                ring.setHasPreciousStone(Boolean.parseBoolean(tagValue));
                return this;
            case "price":
                ring.setPrice(Double.parseDouble(tagValue));
                return this;
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override
    public Treasure build() {
        return ring;
    }
}
