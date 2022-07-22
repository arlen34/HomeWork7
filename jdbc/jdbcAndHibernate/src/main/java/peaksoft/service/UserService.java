package peaksoft.service;

import peaksoft.model.User;

import java.util.List;

public interface UserService {

    void createUsersTable();

    void dropUsersTable();

    void saveUser(User user);

    void removeUserById(long id);

    List<User> getAllUsers();

    void cleanUsersTable();
}

