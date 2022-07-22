package peaksoft.service;

import peaksoft.dao.UserDao;
import peaksoft.dao.UserDaoHibernateImpl;
import peaksoft.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserDao dao = new UserDaoHibernateImpl();

    public void createUsersTable() {
        dao.createUsersTable();
    }

    public void dropUsersTable() {
        dao.dropUsersTable();
    }

    @Override
    public void saveUser(User user) {
        dao.saveUser(user);
    }

    public void removeUserById(long id) {
        dao.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return  dao.getAllUsers();

    }

    public void cleanUsersTable() {
        dao.cleanUsersTable();
    }
}
