package org.leatherclub.testingSystem.service.factory;

import org.leatherclub.testingSystem.service.UserService;
import org.leatherclub.testingSystem.service.impl.UserServiceImpl;

public final class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private static final UserService userService = new UserServiceImpl();

    private ServiceFactory() {}

    public static ServiceFactory getInstance() {
        return instance;
    }

    public UserService getUserService() {
        return userService;
    }
}
