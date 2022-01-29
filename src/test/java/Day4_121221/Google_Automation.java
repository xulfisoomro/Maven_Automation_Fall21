package Day4_121221;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Automation {

    public static void main(String[] args) {

        //set the property of the chromedriver we are using
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        //define the web driver you are using
        WebDriver driver = new ChromeDriver();

        //simply open the google website
        driver.navigate().to("http://www.google.com");

        //maximize my browser
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen(); //for mac

        //close it
        //driver.close();


    }//end of main
}//end of java class

