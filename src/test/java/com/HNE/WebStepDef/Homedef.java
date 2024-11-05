package com.HNE.WebStepDef;

import com.HNE.BaseTest;
import com.HNE.Logic.Homelogic;
import io.cucumber.java.en.And;

public class Homedef extends BaseTest {

    Homelogic homelogic;

    public Homedef() {
        homelogic = new Homelogic(driver);
    }

    @And("user click random item")
    public void userClickRandomItem() {
        homelogic.Choserandomitem();
    }
}
