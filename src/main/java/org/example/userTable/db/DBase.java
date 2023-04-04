package org.example.userTable.db;

import org.sql2o.Sql2o;

public class DBase {
    public static Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/quiz_app", "postgres", "code001");
}
