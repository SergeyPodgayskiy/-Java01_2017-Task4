package com.epam.task4.service.builder;

import com.epam.task4.bean.Treasure;

/**
 * @author serge
 *         18.04.2017.
 */
public interface TreasureBuilder {
    TreasureBuilder createTreasure();

    TreasureBuilder setParameter(String tagName, String tagValue);

    Treasure build();
}
