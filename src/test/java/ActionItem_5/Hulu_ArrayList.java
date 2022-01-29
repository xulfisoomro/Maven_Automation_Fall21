package ActionItem_5;

import Day9_010822.Reusable_Actions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Hulu_ArrayList {

    //Define the web driver
    WebDriver driver;

    @BeforeSuite
    public void setDriver(){driver= Reusable_Actions.setDriver();} //end of precondition

    @Test (priority = 1)
    public void HuluSignuploop() {
        ArrayList<String> email = new ArrayList<>();
        email.add("xulfi19909@gmail.com");
        email.add("xulfi19909@yahoo.com");

        ArrayList<String> password = new ArrayList<>();
        password.add("Trump2024");
        password.add("Trump2024");

        ArrayList<String> name = new ArrayList<>();
        name.add("Xulfi Soomro");
        name.add("Xulmai Babur");

        ArrayList<String> birthMonth = new ArrayList<>();
        birthMonth.add("October");
        birthMonth.add("November");

        ArrayList<String> birthDay = new ArrayList<>();
        birthDay.add("25");
        birthDay.add("27");

        ArrayList<String> birthYear = new ArrayList<>();
        birthYear.add("1990");
        birthYear.add("2002");

        ArrayList<String> gender = new ArrayList<>();
        gender.add("Male");
        gender.add("Female");

        //set a loop
        for (int i=0;i< name.size();i++) {
            //navigating to google
            driver.navigate().to("https://www.hulu.com");


            //entering a unique keyword from array list
            //ReusableActions.sendKeysMethod(driver,"//*[@name='q']",cars.get(i),"Search Field");

            //verify the welcome page title appears as expected
            String actualTitle = driver.getTitle();

            //by using if else to compare expected with actual title
            if (actualTitle.equals("Stream TV and Movies Live and Online | Hulu")) {
                System.out.println("Title matches " + actualTitle);
            } else {
                System.out.println("Title doesn't match. Actual title is " + actualTitle);
            }

            //scroll method
            Reusable_Actions.scrollMethod(driver, "0", "3500", "scroll");
            //select Hulu plan
            Reusable_Actions.clickMethod(driver, "//*[@aria-label= 'Get Hulu plan']", "click on Select button");

            //enter email
            Reusable_Actions.sendKeysMethod(driver, "//*[@id= 'email']", email.get(i), "Email");

            //enter password
            Reusable_Actions.sendKeysMethod(driver, "//*[@id= 'password']", password.get(i), "Password");

            //enter name
            Reusable_Actions.sendKeysMethod(driver, "//*[@id= 'firstName']", name.get(i), "Name");

            //select value from birth month
            Reusable_Actions.clickMethod(driver, "//*[@class = 'selector-selected input__text placeholder']", "Birthmonth");
            Reusable_Actions.clickMethod(driver, "//*[text() = '" + birthMonth.get(i) +"']", "Birthmonth");
            //select value from birthday
            Reusable_Actions.clickMethod(driver, "//*[@class= 'selector-selected input__text placeholder']", "Birthday");
            Reusable_Actions.clickMethod(driver, "//*[text()= '" + birthDay.get(i) + "']",  "Birthday");

            //select value from birth year
            Reusable_Actions.clickMethod(driver, "//*[@class= 'selector-selected input__text placeholder']", "Birthyear");
            Reusable_Actions.clickMethod(driver, "//*[text() = '"+ birthYear.get(i) + "']", "birthYear");

            //select value from gender
            Reusable_Actions.clickMethod(driver, "//*[@class= 'selector-selected input__text placeholder']", "Gender");
            Reusable_Actions.clickMethod(driver, "//*[text() ='" + gender.get(i) + "']",  "Male");

            //click Continue
            Reusable_Actions.clickMethod(driver, "//*[@class='button button--continue ']", "Continue");

            //capture text $0.00
            String result = Reusable_Actions.getTextMethod(driver, "//*[@class= 'ledger__price']", "$6.99");
            System.out.println("The amount is " + result);

            String results = Reusable_Actions.getTextMethod(driver, "//*[@class= 'summary__price']", "$0.00");
            System.out.println("The amount is " + results);




            //delete cookies
            driver.manage().deleteAllCookies();
        } //end of forloop
    }//end of test1

    @Test (dependsOnMethods = "HuluSignuploop")
    public void Login()

    {
        driver.navigate().to("https://www.hulu.com");
        driver.manage().window().fullscreen();
        Reusable_Actions.clickMethod(driver, "//*[text()='Log In']", "click Login");
        Reusable_Actions.sendKeysMethod(driver, "//*[@id='email_id']", "xulfi19909@gmail.com", "enter Email");
        Reusable_Actions.sendKeysMethod(driver, "//*[@id='password_id']", "Trump2024", "enter Password");
        Reusable_Actions.clickMethod(driver, "//*[@class='jsx-4282396490 button-dark login-button']", "clicking on login button");
        String username = Reusable_Actions.getTextMethod(driver, "//*[text()='Xulfi Soomro']", "Xulfi Soomro");
        System.out.println("The username is " + username);
        //end of test 2
    }
    @AfterSuite
    public void endSession () {
        driver.quit();
    }

    //end of test

}//end of java class




