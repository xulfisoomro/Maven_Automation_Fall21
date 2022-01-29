package Pratice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;

public class OptAI {

    public static void main(String[] args) throws InterruptedException {

        //call the webdrivermanager
        WebDriverManager.chromedriver().setup();
        //add chromeoptions
        ChromeOptions options = new ChromeOptions();
        //set incognito and maximize the driver
        options.addArguments("start-maximized");
        //options.addArguments("incognito");
        // set my webdriver
        WebDriver driver = new ChromeDriver(options);

        //Create an array list zipcode & milesRange
        ArrayList<String> zipcode = new ArrayList<>();
        zipcode.add("11208");
        zipcode.add("11207");
        zipcode.add("11218");

        ArrayList<Integer> milesRange = new ArrayList<>();
        milesRange.add(5);
        milesRange.add(10);
        milesRange.add(15);

        for (int j = 0; j < zipcode.size(); j++) {


            //navigate to aetna.com
            driver.navigate().to("https://www.aetna.com");

            //verify home page title is Health Insurance Plans | Aetna
            driver.getTitle();
            if (driver.getTitle().contains("Health Insurance Plans | Aetna")) {
                System.out.println("The title is correct");
            } else {
                System.out.println("The title is not correct");
            }
            Thread.sleep(2500);
            //click on Shop for a plan
            try {
                driver.findElement(By.xpath("//*[text()='Shop for a plan']")).click();
            } catch (Exception e) {
                System.out.println("unable to click on shop for plan" + e);
            }
            //click on medicare link
            try {
                driver.findElement(By.xpath("//*[text()='Medicare']")).click();
            } catch (Exception e) {
                System.out.println("unable to click on shop for plan" + e);
            }
            // on the right side click on Find a doctor
            Thread.sleep(2500);
            try {
                driver.findElement(By.xpath("//*[contains(text(),'Find a doctor')]")).click();
            } catch (Exception e) {
                System.out.println("unable to click on find a doctor" + e);
            }
            // on guest section click on 2020 Medicare plans you purchase yourself
            Thread.sleep(2500);
            try {
                driver.findElement(By.xpath("//*[@class='primaryPurple BtnWidth mgbutton w400']")).click();
            } catch (Exception e) {
                System.out.println("unable to click on 2020 Medicare plans you purchase yourself " + e);
            }
            // clear and enter a zipcode(this is where you pass zipCode variable)
            Thread.sleep(2500);
            try {
                driver.findElement(By.xpath("//*[@type='text']")).sendKeys(zipcode.get(j));
            } catch (Exception e) {
                System.out.println("unable to click on search zipcode" + e);
            }
            //wait few seconds then zipcode drop down suggestion will appear and then click on the appropriate matching zipcode link
            Thread.sleep(2500);
            try {
                driver.findElement(By.xpath("//*[@class='typeahead_grouping active']")).click();
            } catch (Exception e) {
                System.out.println("unable to click on matching zipcode" + e);
            }
            //now there is a Slider bar under zipcode which has 25 miles selected as default..
            // I want you to go to google and research how to automate range slider using selenium and java and choose the example that you understand
            // and try to use that example on a try catch for this step and see if you can figure it out.
            Thread.sleep(2000);

            Actions action = new Actions(driver);

            WebElement slider = driver.findElement(By.xpath("//*[@class='rz-pointer rz-pointer-min']"));

            action.click(slider).build().perform();

            for (int i = 0; i < milesRange.get(j); i++) {
                action.sendKeys(Keys.ARROW_LEFT).build().perform();
                Thread.sleep(200);
            }

            //once you select the range based on your array list then click on Skip plan selection

            Thread.sleep(2500);
            try {
                driver.findElement(By.xpath("//*[@class='primaryPurple BtnWidth col-md-6 col-xs-12']")).click();


            } catch (Exception e) {
                System.out.println("unable to click on your array list then click on Skip plan selection" + e);
            }

            // on next page click on Medical Doctors & Specialists

            Thread.sleep(2500);
            try {
                driver.findElement(By.xpath("//*[@class='mobileMarAdj anchorTagGuided']")).click();
            } catch (Exception e) {
                System.out.println("unable to click on Medical Doctors & Specialists" + e);
            }

            //click on Doctors(Primary Care)

            Thread.sleep(2500);
            try {
                driver.findElement(By.xpath("//*[@class='dummyAnchor']")).click();
            } catch (Exception e) {
                System.out.println("unable to click on Doctors(Primary Care" + e);
            }

            //click on All Primary care physicians

            Thread.sleep(2500);
            try {
                driver.findElement(By.xpath("//*[@class='dummyLinkLabel']")).click();
            } catch (Exception e) {
                System.out.println("unable to click All Primary Physicians" + e);
            }

            //under Provider/Facility Information print out the first result for doctor's name and clinic address in a try catch exception
            Thread.sleep(8000);
            try {
                String result = driver.findElement(By.xpath("//*[@class='col-xs-12 col-md-4 dataGridContentCol']")).getText();
                System.out.println(result);
            } catch (Exception e) {
                System.out.println("unable to click result for doctor's name and clinic address in a try catch exception" + e);
            }
        }//end of forloop
        driver.quit();


    }//end of main method

}//end of java class
