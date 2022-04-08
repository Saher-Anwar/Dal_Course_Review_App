package com.saher123290.dal_course_review_app.Model;

import android.text.TextUtils;
import android.util.Patterns;

import java.util.ArrayList;

public class User implements IUser{
    private String firstName, lastName, email,password;
    ArrayList<ICourse> courses;

    public User(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;

        courses = new ArrayList<>();
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public ArrayList<ICourse> getCourses() {
        return courses;
    }

    @Override
    public void addCourse(ICourse course) {
        courses.add(course);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
