package org.leatherclub.testingSystem.dao.factory;

import org.leatherclub.testingSystem.dao.UserDAO;
import org.leatherclub.testingSystem.dao.impl.UserDAOImpl;

public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private final static UserDAO sqlUserImpl = new UserDAOImpl();

    private DAOFactory() {}
    public static DAOFactory getInstance() {
        return instance;
    }

    public UserDAO getUserDao() {
        return sqlUserImpl;
    }
}
