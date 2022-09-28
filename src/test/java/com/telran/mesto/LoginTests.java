package com.telran.mesto;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @Test
    public void loginUserPositiveTest() {
        //click on login link
        click(By.xpath("//h2[contains(text(),'Log in')]"));
        //fill login form
        type(By.cssSelector("[placeholder='Email']"), "mestomesto@gm.com");
        type(By.cssSelector("[placeholder='Password']"), "1111");
        //click on the button LOGIN
        click(By.xpath("//button[contains(text(),'Log in')]"));
        //assertthe button SignOut
        Assert.assertTrue(isElementPresent(By.xpath("//button[contains(text(),'Log in')]")));
        // driver.findElement(By.xpath("//button[contains(text(),'Log out')]")).click();




        driver.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/section[1]/button[1]")).click();
        //click on the button name of picture
        driver.findElement(By.cssSelector("[placeholder='Name']")).click();
        driver.findElement(By.cssSelector("[placeholder='Name']")).clear();
        driver.findElement(By.cssSelector("[placeholder='Name']")).sendKeys("WORK");

        //click on the button PICTURE LINK
        driver.findElement(By.cssSelector("[placeholder='Picture link']")).click();
        driver.findElement(By.cssSelector("[placeholder='Picture link']")).clear();
        driver.findElement(By.cssSelector("[placeholder='Picture link']")).sendKeys("https://images.unsplash.com/photo-1662581872342-3f8e0145668f?ixlib=rb-1.2.1&ixid=MnwxMjA3fDF8MHxlZGl0b3JpYWwtZmVlZHwxMXx8fGVufDB8fHx8&auto=format&fit=crop&w=500&q=60");

        //click on the button CREATE
        driver.findElement(By.xpath("//button[contains(text(),'Create')]")).click();

        //log out
        driver.findElement(By.cssSelector("[class='header__logout header__logout_active']")).click();

    }

}

