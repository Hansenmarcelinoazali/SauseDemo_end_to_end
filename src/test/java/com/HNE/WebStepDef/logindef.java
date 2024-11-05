package com.HNE.WebStepDef;

import com.HNE.BaseTest;
import com.HNE.Logic.Loginlogic;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class logindef extends BaseTest {

    private static final Logger log = LoggerFactory.getLogger(logindef.class);
    Loginlogic loginlogic;

    public logindef() {
        loginlogic = new Loginlogic(driver);
    }

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        loginlogic.userinloginpage();
    }

    @And("user inserts valid username {string}")
    public void userInsertsValidUsername(String username) {
        loginlogic.userinputusername(username);
    }

    @And("user inserts valid password {string}")
    public void userInsertsValidPassword(String password) {
        loginlogic.userinputpassword(password);
    }

    @And("user click login button")
    public void userClickLoginButton() {
        loginlogic.userclickloginbutton();
    }
}
