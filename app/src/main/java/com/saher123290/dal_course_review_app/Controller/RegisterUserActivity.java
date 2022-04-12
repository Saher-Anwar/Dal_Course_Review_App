package com.saher123290.dal_course_review_app.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.saher123290.dal_course_review_app.Model.IUser;
import com.saher123290.dal_course_review_app.Model.IVerifier;
import com.saher123290.dal_course_review_app.Model.User;
import com.saher123290.dal_course_review_app.Model.VerifierFactory;
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
            saveUserInfo();
        });
    }

    @Override
    public void saveUserInfo() {
        String firstName, lastName, email, password;

        firstName = ((EditText) findViewById(R.id.firstNameET)).getText().toString();
        lastName = ((EditText) findViewById(R.id.lastNameET)).getText().toString();
        email = ((EditText) findViewById(R.id.emailET)).getText().toString();
        password = ((EditText) findViewById(R.id.passwordET)).getText().toString();

        if(verifyUserInfo(email, password)){
            newUser = new User(firstName, lastName, email, password);
        } else{
            Toast.makeText(this, "either password or email is invalid", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean verifyUserInfo(String email, String password) {
        VerifierFactory verifierFactory = new VerifierFactory();

        IVerifier emailVerifier = verifierFactory.getVerifier("email");
        IVerifier passwordVerifier = verifierFactory.getVerifier("password");

        boolean isEmailValid = emailVerifier.verifyInput(email);
        boolean isPasswordValid = passwordVerifier.verifyInput(password);

        return isEmailValid && isPasswordValid;
    }
}