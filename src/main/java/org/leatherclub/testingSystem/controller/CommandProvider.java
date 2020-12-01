package org.leatherclub.testingSystem.controller;

import org.leatherclub.testingSystem.controller.command.Command;
import org.leatherclub.testingSystem.controller.command.impl.*;

import java.util.HashMap;

final class CommandProvider {
    private final HashMap<CommandName, Command> repository = new HashMap<>();

    CommandProvider() {
        repository.put(CommandName.GO_TO_SIGNUP, new GoToSignUpPageCommand());
        repository.put(CommandName.WRONG_REQUEST, new WrongRequestCommand());
    }

    Command getCommand(String name) {
        CommandName commandName = null;
        Command command = null;

        try {
            commandName = CommandName.valueOf(name.toUpperCase());
            command = repository.get(commandName);
        }
        catch (IllegalArgumentException | NullPointerException e) {
            //log
            command = repository.get(CommandName.WRONG_REQUEST);
        }
        return  command;
    }
}