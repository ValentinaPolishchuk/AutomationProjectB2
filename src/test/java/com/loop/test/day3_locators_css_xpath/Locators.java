package com.loop.test.day3_locators_css_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {

        //setup driver
        WebDriverManager.chromedriver().setup();

        //create the driver object
        WebDriver driver = new ChromeDriver();

        //navigate to google
        driver.get("https://www.google.com/");

        driver.manage().window().maximize();

        //locate the elements
        WebElement searchBoxWithID = driver.findElement(By.id("APjFqb"));
        WebElement searchBoxWithName = driver.findElement(By.name("q"));
        WebElement searchBoxWithLinkText = driver.findElement(By.linkText("About"));

        //searchBoxWithLinkText.click();

        //create a String what you want to search

        searchBoxWithID.clear(); //but first :"clear method" just for to be sure that our search is clear and nothing there before "sendKeys"

        String textToSearch = "Loop Academy";
        searchBoxWithID.sendKeys(textToSearch + Keys.ENTER);

        String actualURL = driver.getCurrentUrl();

        if (actualURL.contains("Loop")){
            System.out.println("Actual URL contains \"Loop\"");
        }else {
            System.out.println("Actual URL DOES NOT contains \"Loop\"");
        }

        String actualTitle = driver.getTitle();

        if (actualTitle.contains("Loop Academy - Google Search")){
            System.out.println("Actual title contains \"Loop Academy\"");
        }else {
            System.out.println("Actual title DOES NOT contains \"Loop Academy\"");
        }

    }
}
