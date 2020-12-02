package org.leatherclub.testingSystem.controller.command.impl;

import org.leatherclub.testingSystem.controller.command.Command;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GoToMainCommand implements Command {

    private static final String MAIN_PAGE_URI = "index.jsp";

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher(MAIN_PAGE_URI);
        requestDispatcher.forward(req, resp);
    }
}
