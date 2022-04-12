package com.saher123290.dal_course_review_app.Model;

import java.util.regex.Pattern;

public class EmailVerifier implements IVerifier{
    @Override
    public boolean verifyInput(String email) {
        // TODO: implemented email verifier
        Pattern pattern = Pattern.compile("");
        return true;
    }
}
