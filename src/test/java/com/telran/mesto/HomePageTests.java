package com.telran.mesto;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase{

    @Test
    public void openHomePageTest() {
        System.out.println("Site opened!");
        isAuthFormPresent();
        isElementPresent(By.cssSelector(".auth__form"));
        isElementPresent2(By.cssSelector(".auth__form"));
    }

}
