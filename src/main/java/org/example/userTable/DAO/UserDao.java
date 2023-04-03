package org.example.userTable.DAO;

import org.example.userTable.models.Teachers;

import java.util.List;

public interface UserDao {
//    Create
    void addUser(Teachers teachers);

//    Read
    Teachers getTeacherById(int teacherId);
    List<Teachers> getAllTeachers();

//    Update
    void updateTeacher(Teachers teachers);

//    Delete
    void deleteTeacher (int teacherId);
}
