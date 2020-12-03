package org.leatherclub.testingSystem.service.factory;

import org.leatherclub.testingSystem.service.SubjectService;
import org.leatherclub.testingSystem.service.TestService;
import org.leatherclub.testingSystem.service.UserService;
import org.leatherclub.testingSystem.service.impl.SubjectServiceImpl;
import org.leatherclub.testingSystem.service.impl.TestServiceImpl;
import org.leatherclub.testingSystem.service.impl.UserServiceImpl;

public final class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private static final UserService userService = new UserServiceImpl();
    private static final SubjectService subjectService = new SubjectServiceImpl();
    private static final TestService testService = new TestServiceImpl();

    private ServiceFactory() {}

    public static ServiceFactory getInstance() {
        return instance;
    }

    public UserService getUserService() {
        return userService;
    }

    public SubjectService getSubjectService() {
        return subjectService;
    }

    public TestService getTestService() {
        return testService;
    }
}
