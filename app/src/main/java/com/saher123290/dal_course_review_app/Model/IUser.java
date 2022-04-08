package com.saher123290.dal_course_review_app.Model;

import java.util.ArrayList;

public interface IUser {
    String getEmail();

    String getPassword();

    ArrayList<ICourse> getCourses();

    void addCourse(ICourse course);
}
