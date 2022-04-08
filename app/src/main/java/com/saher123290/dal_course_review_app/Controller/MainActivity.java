package com.saher123290.dal_course_review_app.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.saher123290.dal_course_review_app.R;

public class MainActivity extends AppCompatActivity implements IMainNavController{

    private Button loginBtn;
    private Button signupBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBtn = findViewById(R.id.redirect2LoginBtn);
        signupBtn = findViewById(R.id.redirect2SignupBtn);

        loginBtn.setOnClickListener(view -> {
            setLoginView();
        });

        signupBtn.setOnClickListener(view -> {
            setSignupView();
        });
    }

    @Override
    public void setLoginView() {
        Intent loginIntent = new Intent(this, LoginActivity.class);
        startActivity(loginIntent);
    }

    @Override
    public void setSignupView() {
        Intent signUpIntent = new Intent(this, RegisterUserActivity.class);
        startActivity(signUpIntent);
    }
}