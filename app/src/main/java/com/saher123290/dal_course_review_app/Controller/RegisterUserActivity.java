package com.saher123290.dal_course_review_app.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.saher123290.dal_course_review_app.Model.IUser;
import com.saher123290.dal_course_review_app.Model.User;
import com.saher123290.dal_course_review_app.R;

public class RegisterUserActivity extends AppCompatActivity implements IRegisterUser{

    Button signUpBtn;
    IUser newUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        signUpBtn = findViewById(R.id.signUpBtn);

        signUpBtn.setOnClickListener(view -> {
            if(verifyUserInfo()){
                saveUserInfo();
            } else{
                // TODO: output error message
            }
        });
    }

    @Override
    public void saveUserInfo() {
        String firstName, lastName, email, password;

        firstName = ((EditText) findViewById(R.id.firstNameET)).getText().toString();
        lastName = ((EditText) findViewById(R.id.lastNameET)).getText().toString();
        email = ((EditText) findViewById(R.id.emailET)).getText().toString();
        password = ((EditText) findViewById(R.id.passwordET)).getText().toString();

        newUser = new User(firstName, lastName, email, password);
    }

    @Override
    public boolean verifyUserInfo() {
        return true;
    }
}