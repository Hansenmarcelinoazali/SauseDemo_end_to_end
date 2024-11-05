package com.HNE.Logic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class Cartlogic {
    WebDriver driver;

    public Cartlogic (WebDriver driver){
        this.driver = driver;
    }


    public void clickcart(){
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
    }

    public void randomremover(){
        List<WebElement> removebutton = driver.findElements(By.cssSelector("[data-test^='remove']"));

        Random random = new Random();

        int randomIndex = random.nextInt(removebutton.size());
        WebElement randomRemoveButton = removebutton.get(randomIndex);

        randomRemoveButton.click();
    }
}
