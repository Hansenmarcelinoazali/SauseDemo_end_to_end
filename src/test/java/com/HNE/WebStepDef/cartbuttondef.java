package com.HNE.WebStepDef;

import com.HNE.BaseTest;
import com.HNE.Logic.Cartlogic;
import io.cucumber.java.en.And;

public class cartbuttondef extends BaseTest {
    Cartlogic cartlogic;

    public cartbuttondef() {
        cartlogic = new Cartlogic(driver);

    }

    @And("user click cart")
    public void userClickRandomItem() {
        cartlogic.clickcart();
    }

    @And("user click remove for one item")
    public void userClickRemoveForOneItem() {
cartlogic.randomremover();
    }
}
