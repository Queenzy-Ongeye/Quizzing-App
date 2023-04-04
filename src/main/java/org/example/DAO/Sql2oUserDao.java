package org.example.DAO;

import org.example.models.User;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

public class Sql2oUserDao implements UserDao {

    private final Sql2o sql2o;

    public Sql2oUserDao(Sql2o sql2o){
        this.sql2o = sql2o;
    }


    //============ Adding in new Users ===========//
    @Override
    public void addUser(User user) {
        String sql = "INSERT INTO usertable (name, email, password) VALUES (:name, :email,:password)";
        try(Connection connection = sql2o.open()){
            int userId = (int) connection.createQuery(sql, true)
                    .addParameter("name", user.getName())
                    .addParameter("email", user.getEmail())
                    .addParameter("password", user.getPassword())
                    .executeUpdate()
                    .getKey();
            user.setUserId(userId);
        }

    }

    //============ Finding a user by their userId ===========//
    @Override
    public User getUserById(int userId) {
        String sql = "SELECT * FROM usertable WHERE userId = :userId";

        try(Connection connection = sql2o.open()){
            return connection.createQuery(sql)
                    .addParameter("userId", userId)
                    .executeAndFetchFirst(User.class);
        }
    }

    //============ Listing all users in the userTable ===========//
    @Override
    public List<User> getAllUsers() {
        String sql = "SELECT * FROM usertable";
        try(Connection connection = sql2o.open()){
            return connection.createQuery(sql)
                    .executeAndFetch(User.class);
        }
    }

    //============ Updating users information ===========//
    @Override
    public void updateUser(User user) {
        String sql = "UPDATE usertable SET name = :name, email = :email, password = :password WHERE userId = :userId";

        try(Connection connection = sql2o.open()){
            connection.createQuery(sql)
                    .addParameter("name", user.getName())
                    .addParameter("email", user.getEmail())
                    .addParameter("password", user.getPassword())
                    .executeUpdate();
        }

    }

    //============ Deleting a user by their userId ===========//
    @Override
    public void deleteUserById(int userId) {
        String sql = "DELETE FROM usertable WHERE userId = :userId";

        try(Connection connection = sql2o.open()){
            connection.createQuery(sql)
                    .addParameter("userId", userId)
                    .executeUpdate();
        }

    }
}
