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
        driver.findElement(By.xpath("//button[contains(text(),'Log out')]")).click();

        //driver.findElement(By.xpath("//body/div[@id='root']/div[1]/main[1]/section[1]/button[1]")).click();
    }

}

