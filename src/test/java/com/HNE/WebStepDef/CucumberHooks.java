package com.HNE.WebStepDef;

import com.HNE.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks extends BaseTest {

    @Before
    public void beforeTest() {
        getDriver();

    }

    @After
    public void afterTest() {
        driver.quit();
    }
}