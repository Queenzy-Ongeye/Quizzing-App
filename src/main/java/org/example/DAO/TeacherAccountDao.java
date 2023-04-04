package org.example.DAO;

import org.example.models.TeacherAccount;

import java.util.List;

public interface TeacherAccountDao {
//    Create
    void addTeacherAccount(TeacherAccount teacherAccount);

//    Read
    TeacherAccount getTeacherById(int userId);
    List<TeacherAccount> getAllTeachers();

//    Update
    void updateTeacherAccount(TeacherAccount teacherAccount);

//    Delete
    void deleteTeacherById(int userId);

//    Sign-in to account
    TeacherAccount signIn(String email, String password);
}
