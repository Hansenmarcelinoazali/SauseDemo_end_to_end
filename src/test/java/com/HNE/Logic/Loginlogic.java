package com.HNE.Logic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginlogic {
    WebDriver driver;

    public Loginlogic(WebDriver driver) {
        this.driver = driver;
    }


    public void userinloginpage() {
        driver.get("https://www.saucedemo.com/");
    }

    public void userinputusername(String username){
        driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
    }

    public void userinputpassword(String password){
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
    }

    public void userclickloginbutton(){
        driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
    }
}
