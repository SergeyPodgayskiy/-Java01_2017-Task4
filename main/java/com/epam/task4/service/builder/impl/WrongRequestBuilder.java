package com.epam.task4.service.builder.impl;

import com.epam.task4.bean.Treasure;
import com.epam.task4.service.builder.TreasureBuilder;

/**
 * @author serge
 *         26.04.2017.
 */
public class WrongRequestBuilder implements TreasureBuilder {
    @Override
    public TreasureBuilder createTreasure() {
        return null;
    }

    @Override
    public TreasureBuilder setParameter(String tagName, String tagValue) {
        return null;
    }

    @Override
    public Treasure build() {
        return null;
    }
}
