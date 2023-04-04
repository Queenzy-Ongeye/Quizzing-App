package org.example;

import org.example.DAO.Sql2oUserDao;
import org.example.DAO.UserDao;
import org.example.models.User;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        String connectionString = "jdbc:postgresql://localhost:5432/quiz_app";
        Sql2o sql2o = new Sql2o(connectionString, "postgres", "code001");

        UserDao userDao = new Sql2oUserDao(sql2o);

        User user = new User(0, "Queenzy", "queenzy@gmail.com", "queen-01");
        User user1 = new User(1, "Benjamin", "benjamin-mutua@yahoo.com", "benjimutua98");
        userDao.addUser(user);
        userDao.addUser(user1);

        List<User> userList = userDao.getAllUsers();
        System.out.println(userList);

        try (Connection conn = sql2o.open()) {
            String sql = "CREATE TABLE usertable ("
                    + "id SERIAL PRIMARY KEY,"
                    + "name VARCHAR(50) NOT NULL,"
                    + "email VARCHAR(100) NOT NULL,"
                    + "password VARCHAR(100) NOT NULL"
                    + ")";
            conn.createQuery(sql).executeUpdate();
        }


    }

}
