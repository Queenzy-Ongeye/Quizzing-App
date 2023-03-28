package org.example.userTable.models;

public class Teachers {
    private int teacherId;
    private String name;
    private String email;
    private String password;

    public Teachers (int teacherId, String name, String email, String password){
        this.teacherId = teacherId;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}