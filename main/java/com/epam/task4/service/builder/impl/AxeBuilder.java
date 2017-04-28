package com.epam.task4.service.builder.impl;

import com.epam.task4.bean.Axe;
import com.epam.task4.bean.Treasure;
import com.epam.task4.service.builder.TreasureBuilder;

/**
 * @author serge
 *         19.04.2017.
 */
public class AxeBuilder implements TreasureBuilder {
    private final String id = "id";
    private final String title = "title";
    private final String type = "type";
    private final String typeBlade = "type_blade";
    private final String price = "price";
    private final String typeHandle = "type_handle";
    private final String damage = "damage";
    private Axe axe;

    @Override
    public TreasureBuilder createTreasure() {
        axe = new Axe();
        return this;
    }

    @Override
    public TreasureBuilder setParameter(String tagName,String tagValue) {
        switch (tagName) {
            case id:
                axe.setId(Integer.parseInt(tagValue));
                return this;
            case title:
                axe.setTitle(tagValue);
                return this;
            case type:
                axe.setType(tagValue);
                return this;
            case typeBlade:
                axe.setTypeBlade(tagValue);
                return this;
            case typeHandle:
                axe.setTypeHandle(tagValue);
                return this;
            case price:
                axe.setPrice(Double.parseDouble(tagValue));
                return this;
            case damage:
                axe.setDamage(Double.parseDouble(tagValue));
                return this;
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override
    public Treasure build() {
        return axe;
    }

}
