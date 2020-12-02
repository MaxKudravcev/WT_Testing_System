package org.leatherclub.testingSystem.dao.factory;

import org.leatherclub.testingSystem.dao.SubjectDAO;
import org.leatherclub.testingSystem.dao.UserDAO;
import org.leatherclub.testingSystem.dao.impl.SubjectDAOImpl;
import org.leatherclub.testingSystem.dao.impl.UserDAOImpl;

public final class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private final static UserDAO sqlUserImpl = new UserDAOImpl();
    private final static SubjectDAO sqlSubjectImpl = new SubjectDAOImpl();

    private DAOFactory() {}
    public static DAOFactory getInstance() {
        return instance;
    }

    public UserDAO getUserDao() {
        return sqlUserImpl;
    }

    public SubjectDAO getSubjectDao() {
        return sqlSubjectImpl;
    }
}
