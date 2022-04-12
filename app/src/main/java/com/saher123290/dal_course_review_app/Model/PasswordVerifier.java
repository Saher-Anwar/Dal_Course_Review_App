package com.saher123290.dal_course_review_app.Model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordVerifier implements IVerifier{

    @Override
    public boolean verifyInput(String password) {
        // TODO: Check how this password works
//        Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\\\S+$).{4,}$");
//        Matcher matcher = pattern.matcher(password);
//
//        return matcher.matches();
        return true;
    }
}
