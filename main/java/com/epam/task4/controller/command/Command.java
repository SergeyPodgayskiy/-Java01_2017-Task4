package com.epam.task4.controller.command;

/**
 * @author serge
 *         19.04.2017.
 */
public interface Command {
    String execute(String request, String parserType);
}
