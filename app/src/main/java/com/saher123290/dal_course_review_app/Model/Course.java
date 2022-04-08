package com.saher123290.dal_course_review_app.Model;

public class Course implements ICourse{
    String courseCode;
    int courseNum;

    public Course(String courseCode, int courseNum) {
        this.courseCode = courseCode;
        this.courseNum = courseNum;
    }

    @Override
    public String getCourseCode() {
        return courseCode;
    }

    @Override
    public int getCourseNum() {
        return courseNum;
    }
}
