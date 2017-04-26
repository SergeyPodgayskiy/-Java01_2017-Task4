package com.epam.task4.controller;


import com.epam.task4.controller.command.Command;

public class Controller {
    private final CommandProvider cmdProvider = CommandProvider.getInstance();
    private final char paramDelimeter = ' ';
    private String parserType = "dom"; // default parser

    public String executeRequest(String request) {
        String commandName;
        Command executionCommand;
        String response;

        commandName = request.substring(0, request.indexOf(paramDelimeter));
        executionCommand = cmdProvider.getCommand(commandName.toUpperCase());
        response = executionCommand.execute(request, parserType);
        return response;
    }

    public void chooseParser(String parser) {
        parserType = parser.toLowerCase();
    }
}
