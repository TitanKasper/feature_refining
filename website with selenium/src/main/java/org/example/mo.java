package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class mo{
    public static void main(String[] args) {
        System.setProperty("web-driver.chrome.driver", "path/to/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://mo.com.mm/");

        driver.manage().window().maximize();

        //click Momoney
        driver.findElement(By.className("elementor-item")).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)","");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement element1 = driver.findElement(By.cssSelector("a[href='#get-started']"));
        element1.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.className("elementor-item")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        js.executeScript("window.scrollBy(0,200)","");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        js.executeScript("window.scrollBy(0,400)","");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        js.executeScript("window.scrollBy(0,600)","");
        //click Download Mobiz
        WebElement element2 = driver.findElement(By.cssSelector("a[href='/momoney/mo-biz/']"));
        element2.click();

        driver.findElement(By.className("elementor-item")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        js.executeScript("window.scrollBy(0,200)","");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        js.executeScript("window.scrollBy(0,400)","");
        js.executeScript("window.scrollBy(0,600)","");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        js.executeScript("window.scrollBy(0,800)","");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        js.executeScript("window.scrollBy(0,1000)","");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        js.executeScript("window.scrollBy(0,1200)","");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        js.executeScript("window.scrollBy(0,1400)","");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        js.executeScript("window.scrollBy(0,1600)","");

        //click aboutmo
        WebElement aboutMo = driver.findElement(By.linkText("About MO"));
        aboutMo.click();

        js.executeScript("window.scrollBy(0,200)","");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        js.executeScript("window.scrollBy(0,400)","");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        js.executeScript("window.scrollBy(0,600)","");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        js.executeScript("window.scrollBy(0,800)","");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        js.executeScript("window.scrollBy(0,1000)","");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        js.executeScript("window.scrollBy(0,1200)","");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        js.executeScript("window.scrollBy(0,1400)","");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //click MoBiz
        WebElement Mobiz = driver.findElement(By.linkText("MoBiz"));
        Mobiz.click();
        js.executeScript("window.scrollBy(0,200)","");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        js.executeScript("window.scrollBy(0,400)","");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        js.executeScript("window.scrollBy(0,600)","");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        js.executeScript("window.scrollBy(0,800)","");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        js.executeScript("window.scrollBy(0,1000)","");

        //click Mo Foundation
        WebElement element3 = driver.findElement(By.linkText("MO Foundation"));
        element3.click();
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        //return click to Mo website
        WebElement element4 = driver.findElement(By.cssSelector("a[href='https://mo.com.mm']"));
        element4.click();

        //click Resources
        WebElement resources= driver.findElement(By.linkText("Resources"));
        resources.click();
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        //click Contact Us
        WebElement contactus= driver.findElement(By.linkText("Contact Us"));
        contactus.click();
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        js.executeScript("window.scrollBy(0,200)","");

        driver.quit();


    }

}
