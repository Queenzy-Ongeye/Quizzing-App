package org.example.DAO;

import org.example.models.TeacherAccount;
import org.sql2o.Sql2o;

import java.util.List;

public class Sql2oTeacherAccountDao extends Sql2oUserDao implements TeacherAccountDao {
     public Sql2oTeacherAccountDao(Sql2o sql2o) {
        super(sql2o);
    }

    @Override
    public void addTeacherAccount(TeacherAccount teacherAccount) {

    }

    @Override
    public TeacherAccount getTeacherById(int userId) {
        return null;
    }

    @Override
    public List<TeacherAccount> getAllTeachers() {
        return null;
    }

    @Override
    public void updateTeacherAccount(TeacherAccount teacherAccount) {

    }

    @Override
    public void deleteTeacherById(int userId) {

    }

    @Override
    public TeacherAccount signIn(String email, String password) {
        return null;
    }
}
