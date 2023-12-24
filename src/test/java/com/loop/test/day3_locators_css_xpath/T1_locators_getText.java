package com.loop.test.day3_locators_css_xpath;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_locators_getText {
    public static void main(String[] args) {

        //setup driver or as we did WebDriverFactory we can call that method
        //WebDriverManager.chromedriver().setup();
        //create the driver object
        //WebDriver driver = new ChromeDriver();

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app");

        WebElement userName = driver.findElement(By.id("input-14"));
        userName.sendKeys("b1g3_client@gmail.com");

        //or we can do this way since we did utility DocuportContains
        //WebElement userName = driver.findElement(By.id("input-14"));
        //userName.sendKeys(DocuportConstants.Username_Client);

        WebElement loginButton = driver.findElement(By.className("v-btn__content"));
        loginButton.click();

        WebElement errorMessageForEmptyPassword = driver.findElement(By.className("v-messages__message"));
        String actualErrorMessage = errorMessageForEmptyPassword.getText();

        String expectedResult = "Please enter your password";

        if (actualErrorMessage.equals(DocuportConstants.ERROR_MESSAGE_FOR_EMPTY_PASSWORD)){
            System.out.println("Expected error message: " + DocuportConstants.ERROR_MESSAGE_FOR_EMPTY_PASSWORD + ", matches actual error message: " + actualErrorMessage + ". Test PASSED");

        }else {
            System.out.println("Expected error message: " + DocuportConstants.ERROR_MESSAGE_FOR_EMPTY_PASSWORD + ",DOES NOT matches actual error message: " + actualErrorMessage + ". Test PASSED");
            System.out.println("TEST FAILED");
        }

        driver.quit();
    }
}
