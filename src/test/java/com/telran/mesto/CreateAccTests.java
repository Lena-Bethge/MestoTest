package com.telran.mesto;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccTests extends TestBase{

    //click on the link Register
    @Test
    public void registrationPositiveTest() {
        click(By.xpath("//*[@href='/sign-up']"));
        //fill registration form
        type(By.cssSelector("[placeholder='Email']"), "mestomesto@gm.com");
        type(By.cssSelector("[placeholder='Password']"), "1111");

        //click on the button Register
        click(By.xpath("//button[contains(text(),'Register')]"));
        //assert the button Sign out displayed
        Assert.assertTrue(isElementPresent(By.xpath("//button[contains(text(),'Log in')]")));
    }

}
