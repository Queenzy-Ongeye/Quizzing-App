package org.example.DAO;

import org.example.models.User;

import java.util.List;

public interface UserDao {
//    Create
    void addUser(User user);

//    Read
    User getUserById(int userId);
    List<User> getAllUsers();

//    Update
    void updateUser(User user);

//    Delete
    void deleteUserById (int userId);
}
