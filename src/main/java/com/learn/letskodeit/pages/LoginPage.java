package com.learn.letskodeit.pages;

import com.learn.letskodeit.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Pradip
 */
public class LoginPage extends Utility {
    By emailField = By.id("user_email");
    By passwordField = By.id("user_password");
    By clickOnCommitButton = By.name("commit");


    public void setEmailField(){
        sendTextToElement(emailField,"dhanno@gmail.com");
    }public void setPasswordField(){
        sendTextToElement(passwordField,"123456789");
    }public void setClickOnLoginButton(){
        clickOnElement(clickOnCommitButton);
    }


}
