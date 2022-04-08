package com.saher123290.dal_course_review_app.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.saher123290.dal_course_review_app.R;

public class LoginActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void OnLoginSuccess(String message) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }

    public void OnLoginError(String message) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }
}