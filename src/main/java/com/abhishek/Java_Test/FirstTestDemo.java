package com.abhishek.Java_Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class FirstTestDemo {

    public WebDriver driver;


    @Test
    public void navigateToUrl() {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhishek.r.singh\\Downloads\\chromedriver_win32\\chromedriver.exe");
        
    	driver = new ChromeDriver();
    	
        driver.get("http://dev-81-ksi.int.kronos.com/wfc/htmlnavigator/logon");
        driver.manage().window().maximize();
        
		/*
		 * String text = driver.findElement(By.xpath(
		 * "//*[@id=\"rt-showcase\"]/div/div[1]/div/div/div/div/div[1]/div/div/h2/font")
		 * ).getText();
		 * 
		 * System.out.println(text);
		 * 
		 * if(text.equals("THIS IS A DEMO PAGE FOR TESTING")) {
		 * 
		 * System.out.println("Test is passed"); }
		 * 
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"rt-feature\"]/div/div[1]/div/div/div/div[2]/div[1]/div/div/div/div/div[1]/div/div/a/i"
		 * )).click();
		 * 
		 * 
		 * 
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"g-mainbar\"]/div/div/div/div/div/div/div[2]/table[1]/tbody/tr[1]/td[1]/a/strong"
		 * )).click();
		 */
        
        driver.findElement(By.id("username")).sendKeys("SuperUser");
        
        driver.findElement(By.id("passInput")).sendKeys("kronites");
        
        driver.findElement(By.id("loginSubmit")).click();
        
        driver.findElement(By.xpath("/html/body/krn-app/krn-navigator-container/ui-view/krn-workspace-manager-container/krn-workspace/krn-related-items/div/ul/li[12]/div/div/span[2]")).click();
        
        driver.findElement(By.id("quickfindsearch_btn")).click();
        
        driver.findElement(By.xpath("//*[@id=\"row4genieGrid\"]/div[1]/div")).click();
        
        driver.findElement(By.xpath("//*[@id=\"goto_caret\"]/button/i[1]")).click();
        
        driver.findElement(By.xpath("//*[@id=\"com.kronos.wfc.ngui.genies.controls.goto\"]/div/div/div[2]/section/section[1]/div/div/ul/li[10]/a")).click();
        
        
    }

}
