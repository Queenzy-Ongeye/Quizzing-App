package org.example.userTable.DAO;

import org.example.userTable.models.User;

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
