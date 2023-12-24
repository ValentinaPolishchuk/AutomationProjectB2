package com.loop.test.day3_locators_css_xpath;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_css {
    public static void main(String[] args) {

        //go to URL
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app");

        //identify logo with css
        WebElement logo = driver.findElement(By.cssSelector("img[src=\"/img/logo.d7557277.svg\"]"));
        String docuport = logo.getAttribute("alt");

        if (DocuportConstants.LOGO_DOCUPORT.equalsIgnoreCase(docuport)){
            System.out.println("Expected logo text: " + DocuportConstants.LOGO_DOCUPORT + ", matches actual logo text: " + docuport);
            System.out.println("TEST PASSED");
        }else {
            System.out.println("Expected logo text: " + DocuportConstants.LOGO_DOCUPORT + ",DOES NOT matches actual logo text: "  + docuport);
            System.out.println("TEST FAILED");
        }
        // locate username with css
        WebElement userName = driver.findElement(By.cssSelector("input#input-14"));



        // locate password with css

        // locate login with css
        //WebElement login = driver.findElement(By.cssSelector());

        //login to docuport

        //locate home icon of docuport after login

        //validate that you logged in
    }
}
