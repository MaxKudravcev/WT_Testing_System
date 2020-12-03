package org.leatherclub.testingSystem.controller.command.impl;

import org.leatherclub.testingSystem.controller.command.Command;
import org.leatherclub.testingSystem.service.SubjectService;
import org.leatherclub.testingSystem.service.TestService;
import org.leatherclub.testingSystem.service.exception.ServiceException;
import org.leatherclub.testingSystem.service.factory.ServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EditEntityCommand implements Command {

    private static final String REQUEST_PARAM_ENTITY = "entity";
    private static final String REQUEST_PARAM_ID = "id";
    private static final String REQUEST_PARAM_TEXT = "text";
    private static final String ENTITY_SUBJECT = "subject";
    private static final String ENTITY_TEST = "test";

    private static final String REDIRECT_COMMAND_SUCCESS_SUBJECT = "Controller?command=go_to_main";
    private static final String REDIRECT_COMMAND_ERROR_SUBJECT = "Controller?command=go_to_main&error=subject";
    private static final String REDIRECT_COMMAND_SUCCESS_TEST = "Controller?command=go_to_tests";
    private static final String REDIRECT_COMMAND_ERROR_TEST = "Controller?command=go_to_tests&error=test";
    private static final String REDIRECT_COMMAND_ERROR = "Controller?command=go_to_main&error=error";

    @Override
    public void execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String entity = req.getParameter(REQUEST_PARAM_ENTITY);
        int id = Integer.parseInt(req.getParameter(REQUEST_PARAM_ID));
        String text = req.getParameter(REQUEST_PARAM_TEXT);

        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        Boolean result;

        switch (entity) {
            case ENTITY_SUBJECT:
                SubjectService subjectService = serviceFactory.getSubjectService();
                try {
                    result = subjectService.editSubject(id, text);
                    if(result)
                        resp.sendRedirect(REDIRECT_COMMAND_SUCCESS_SUBJECT);
                    else
                        resp.sendRedirect(REDIRECT_COMMAND_ERROR_SUBJECT);
                }
                catch (ServiceException e) {
                    resp.sendRedirect(REDIRECT_COMMAND_ERROR_SUBJECT);
                }
                break;

            case ENTITY_TEST:
                TestService testService = serviceFactory.getTestService();
                try {
                    result = testService.editTest(id, text);
                    if(result)
                        resp.sendRedirect(REDIRECT_COMMAND_SUCCESS_TEST);
                    else
                        resp.sendRedirect(REDIRECT_COMMAND_ERROR_TEST);
                }
                catch (ServiceException e) {
                    resp.sendRedirect(REDIRECT_COMMAND_ERROR_TEST);
                }
                break;

            default:
                resp.sendRedirect(REDIRECT_COMMAND_ERROR);
        }
    }
}
