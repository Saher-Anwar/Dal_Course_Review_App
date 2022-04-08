package com.saher123290.dal_course_review_app.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.saher123290.dal_course_review_app.R;

public class RegisterUserActivity extends AppCompatActivity implements IRegisterUser{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
    }

    @Override
    public void saveUserInfo() {

    }

    @Override
    public boolean verifyUserInfo() {
        return false;
    }
}