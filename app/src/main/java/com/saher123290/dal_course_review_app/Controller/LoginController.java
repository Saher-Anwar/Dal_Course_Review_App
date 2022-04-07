package com.saher123290.dal_course_review_app.Controller;

import com.saher123290.dal_course_review_app.Model.IUser;
import com.saher123290.dal_course_review_app.Model.User;
import com.saher123290.dal_course_review_app.View.ILoginView;

public class LoginController implements ILoginController{

    ILoginView loginView;

    public LoginController(ILoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void OnLogin(String email, String password) {
        IUser user = new User(email,password);
        int loginCode = user.isValid();

        if(loginCode == 0)
        {
            loginView.OnLoginError("Please enter Email");
        }else  if (loginCode == 1){
            loginView.OnLoginError("Please enter A valid Email");
        } else  if (loginCode == 2)
        {
            loginView.OnLoginError("Please enter Password");
        }else  if(loginCode == 3){
            loginView.OnLoginError("Please enter Password greater the 6 char");
        }
        else {
            loginView.OnLoginSuccess("login Successful");
        }

    }
}
