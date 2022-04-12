package com.saher123290.dal_course_review_app.Model;

public class VerifierFactory {
    public IVerifier getVerifier(String type){
        switch(type){
            case "email":
                return new EmailVerifier();
            case "password":
                return new PasswordVerifier();
            default:
                return null;
        }
    }
}
