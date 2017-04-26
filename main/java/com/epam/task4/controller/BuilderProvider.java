package com.epam.task4.controller;

import com.epam.task4.service.builder.BuilderName;
import com.epam.task4.service.builder.TreasureBuilder;
import com.epam.task4.service.builder.impl.*;

import java.util.HashMap;

/**
 * @author serge
 *         18.04.2017.
 */
public final class BuilderProvider {
    private static final BuilderProvider INSTANCE = new BuilderProvider();
    private final HashMap<BuilderName, TreasureBuilder> repository = new HashMap<>();
    private TreasureBuilder treasureBuilder;

    public BuilderProvider() {
        repository.put(BuilderName.WRONG_REQUEST, new WrongRequestBuilder());
        repository.put(BuilderName.JEWEL, new JewelBuilder());
        repository.put(BuilderName.RING, new RingBuilder());
        repository.put(BuilderName.BRACELET, new BraceletBuilder());
        repository.put(BuilderName.CHAIN, new ChainBuilder());
        repository.put(BuilderName.AXE, new AxeBuilder());
    }

    public static BuilderProvider getInstance() {
        return INSTANCE;
    }

    public TreasureBuilder getConcreteBuilder(String name) {
        try {
            BuilderName builderName = BuilderName.valueOf(name.toUpperCase());
            treasureBuilder = repository.get(builderName);
        } catch (IllegalArgumentException | NullPointerException e) {
            treasureBuilder = repository.get(BuilderName.WRONG_REQUEST);
        }
        return treasureBuilder.createTreasure();
    }
}
