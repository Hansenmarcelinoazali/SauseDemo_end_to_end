package com.HNE.Logic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class Homelogic {

    WebDriver driver;

    public Homelogic(WebDriver driver) {
        this.driver = driver;
    }

    public void Choserandomitem(){
        List<WebElement> addToCartButtons = driver.findElements(By.cssSelector("[data-test^='add-to-cart']"));

        Random random = new Random();
        for (int i = 0; i < 2; i++) {
            int randomIndex = random.nextInt(addToCartButtons.size());
            WebElement randomButton = addToCartButtons.get(randomIndex);
            randomButton.click();

            addToCartButtons.remove(randomIndex);
        }


    }
}
