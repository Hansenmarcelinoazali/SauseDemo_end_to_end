package com.HNE.WebStepDef;

import com.HNE.BaseTest;
import com.HNE.Logic.Cartlogic;
import com.HNE.Logic.Checkoutlogic;
import com.HNE.Logic.Homelogic;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Checkoutdef extends BaseTest {

    Checkoutlogic checkoutlogic;
    public Checkoutdef() {
        checkoutlogic = new Checkoutlogic(driver);
    }
    @And("user click checkout button")
    public void userclickcheckoutbutton() {
        checkoutlogic.ClickCheckout();
    }

    @And("user fill form {string}")
    public void userFillForm(String name) {
        checkoutlogic.firstnamecheckout(name);
    }

    @And("user fill lastname form {string}")
    public void userFillLastnameForm(String lastname) {
        checkoutlogic.lastnamecheckout(lastname);
    }

    @And("user fill postalcode {string}")
    public void userFillPostalcode(String postalcode) {
        checkoutlogic.postalcodecheckout(postalcode);
    }


    @And("user click continue")
    public void userClickContinue() {
        checkoutlogic.clickcontinuebutton();
    }

    @And("user click finish")
    public void userClickFinish() {
        checkoutlogic.clickfinishbutton();
    }

    @Then("thank you page is appear")
    public void thankYouPageIsAppear() {
        checkoutlogic.thankyoupage();
    }
}
