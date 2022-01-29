package ActionItem_4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.List;

public class WeightWachers_Arraylist {

    public static void main(String[] args) throws InterruptedException {
        //Create an Arraylist to store 3 zipcodes

        ArrayList<String> zipcode = new ArrayList<>();
        zipcode.add("11010");
        zipcode.add("11011");
        zipcode.add("11012");

        //call the webdrivermanager
        WebDriverManager.chromedriver().setup();
        //call chromeoptions
        ChromeOptions options = new ChromeOptions();
        //set incognito and maximize the driver
        options.addArguments("start-maximized");
        //options.addArguments("incognito");
        // set my webdriver
        WebDriver driver = new ChromeDriver(options);

        for (int i = 0; i < zipcode.size(); i++) {

            //navigate to weight watchers
            driver.navigate().to("https://www.weightwatchers.com/");
            Thread.sleep(2500);

            //click to Attend Dropdown
            try {
                driver.findElement(By.xpath("//*[text()='Attend']")).click();
            } catch (Exception e) {
                System.out.println("unable to click on Show advanced options " + e);
            }

            //click to unlimited dropdown
            try {
                driver.findElement(By.xpath("//*[@ data-e2e-name='unlimited_workshops']")).click();

            } catch (Exception e) {
                System.out.println("unable to click on Show advanced options " + e);
            }
            try {
                driver.findElement(By.xpath("//*[text()='Studio']")).click();


            } catch (Exception e) {
                System.out.println("unable to click on Show advanced options " + e);
            }
            //enter your zipcode
            try {
                driver.findElement(By.xpath("//*[@id='location-search']")).sendKeys(zipcode.get(i));
            } catch (Exception e) {
                System.out.println("unable to click on Show advanced options " + e);
            }
            //click on search arrow
            try {
                driver.findElement(By.xpath("//*[@class='rightArrow-daPRP']")).click();
            } catch (Exception e) {
                System.out.println("unable to click on Show advanced options " + e);
            }
            Thread.sleep(2500);
            //click on the specific link for studios
            try {
                List<WebElement> myList = driver.findElements(By.xpath("//*[@class='linkUnderline-1_h4g']"));
                //use if condition
                if (i == 0) {
                    myList.get(i).click();
                }
                if (i == 1) {
                    myList.get(i).click();
                }
                if (i == 2) {
                    myList.get(i).click();
                }

            } catch (Exception e) {
                System.out.println("unable to click on Show advanced options " + e);
            }
            //capture the results on a variable and print out the address
            //String result = driver.findElement(By.xpath("//*[@class='sb_count']")).getText();
            String results = driver.findElement(By.xpath("//*[@class='infoContainer-12kv1']")).getText();
            System.out.println(results);

            //capture the entire address on a variable and print out the address
            //String results = driver.findElement(By.xpath("//*[@class='address-2PZwW']")).getText();

           //System.out.println(results);


            //scroll to the bottom using javascriptExecutor


            try {
                JavascriptExecutor jse = (JavascriptExecutor) driver;
                //capture the entire table with days and hours for studio

                WebElement studioHours = driver.findElement(By.xpath("//*[@class='scheduleContainerMobile-1RfmF']"));

                jse.executeScript("arguments [0].scrollIntoView(true);", studioHours);

                Thread.sleep(1500);


            } catch (Exception e) {

                System.out.println("unable to capture the entire with the days and hours" + e);


            }

            try {
                String table = driver.findElement(By.xpath("(//*[contains(@class,'scheduleContainerMobile')]) [1]")).getText();
                System.out.println(table);
            } catch (Exception error){
               System.out.println("unable to get the table from the webstie " + error);
            } // end of try and catch for table

        }//end of forloop



    }//end of main

}//end of java class
