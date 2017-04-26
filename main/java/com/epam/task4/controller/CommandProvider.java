package com.epam.task4.controller;

import com.epam.task4.controller.command.Command;
import com.epam.task4.controller.command.CommandName;
import com.epam.task4.controller.command.Impl.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author serge
 *         19.04.2017.
 */
public final class CommandProvider {
    private final static CommandProvider INSTANCE = new CommandProvider();
    private final Map<CommandName, Command> commands = new HashMap<>();

    private CommandProvider() {
        commands.put(CommandName.GET_TREASURE_LIST,
                new GetTreasureListCmd());
        commands.put(CommandName.GET_BY_CATEGORY,
                new GetByCategoryCmd());
        commands.put(CommandName.GET_MOST_EXPENSIVE_TREASURE,
                new GetMostExpensiveTreasureCmd());
        commands.put(CommandName.GET_BY_MATERIAL,
                new GetByMaterialCmd());
        commands.put(CommandName.GET_BY_PRICE_RANGE,
                new GetByPriceRangeCmd());
    }

    public static CommandProvider getInstance() {
        return INSTANCE;
    }

    public Command getCommand(String name) {
        Command command;
        CommandName commandName;

        try {
            commandName = CommandName.valueOf(name.toUpperCase());
            command = commands.get(commandName);
        } catch (IllegalArgumentException | NullPointerException e) {
            command = commands.get(CommandName.WRONG_REQUEST);
        }
        return command;
    }
}
