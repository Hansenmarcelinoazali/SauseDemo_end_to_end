package com.HNE.Logic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkoutlogic {

    WebDriver driver;

    public Checkoutlogic(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickCheckout(){
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
    }

    public void firstnamecheckout(String name){
        driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys(name);
    }

    public void lastnamecheckout(String lastname){
        driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys(lastname);
    }

    public void postalcodecheckout(String postalcode){
        driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys(postalcode);
    }

    public void clickcontinuebutton(){
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
    }

    public void clickfinishbutton(){
        driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
    }

    public void thankyoupage(){
        driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]")).isDisplayed();
    }
}
