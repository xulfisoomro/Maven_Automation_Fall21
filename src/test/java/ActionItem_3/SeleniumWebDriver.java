package ActionItem_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumWebDriver {

    public static void main(String[] args) throws InterruptedException {

        //search multiple sports and each time capture the search number from the result page

        //set an array
        String[] sports = new String[6];
        sports[0] = "Cricket";
        sports[1] = "Soccer";
        sports[2] = "Tennis";
        sports[3] = "Football";
        sports[4] = "Table tennis";
        sports[5] = "base ball";


        //define the webdriver outside of the for loop
        //set the property of the chromedriver we are using
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        ChromeOptions XulfiSports = new ChromeOptions();
        XulfiSports.addArguments("start-maximized");
        XulfiSports.addArguments("incognito");
        //XulfiSports.addArguments("headless");
        //define the web driver you are using
        WebDriver driver = new ChromeDriver(XulfiSports);

        for (int i = 0; i < sports.length; i++) {
            //simply open the bing web site
            driver.navigate().to("https://www.bing.com");

            //maximize my browser
            //driver.manage().window().fullscreen(); //for mac
           //driver.manage().window().maximize(); //for windows

            //anytime when you go to a new page you should put some wait statement
            Thread.sleep(2000);

            //enter the array variable in the search bar
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys (sports[i]);

            //hit submit on bing search button
            driver.findElement(By.xpath("//*[@class='sb_form_q']")).submit();

            //another wait statement since we came to a new page(result page)
            Thread.sleep(3000);

            //capture the search results and store it as a variable
            String result = driver.findElement(By.xpath("//*[@class='sb_count']")).getText();
            //declaring the variable to split result
            String[] arrayResult = result.split(" ");
            //now print the search number only
            System.out.println("My search number for sports " + sports[i] + " is " + arrayResult[0]);



        }//end of for loop

        //quit will be defined outside of loop because you are quiting only once at a time
        driver.close();


    }//end of main method

}//end of java class