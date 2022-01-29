package ActionItem_6;

import Reusable_Library.Reusable_Actions_Loggers;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Express_Project {
        WebDriver driver;
        ExtentReports reports;
        ExtentTest logger;

        @BeforeSuite
        public void setDriver() {
            driver = Reusable_Actions_Loggers.setDriver();
            reports = new ExtentReports("src/main/java/HTML_Report/Automation_Report.html", true);

        }//end of pre-condition

        @Test
        public void ExpressTest() throws IOException, BiffException, WriteException, InterruptedException {
            //Step 1: read the data from the excel sheet you created
            Workbook readableFile = Workbook.getWorkbook(new File("src/main/resources/Express.xls"));
            //Step 2: locating the worksheet that you created for the workbook
            Sheet readableSheet = readableFile.getSheet(0);
            //will return the physical rows present on the sheet
            int rowCount = readableSheet.getRows();
            System.out.println("My row count is " + rowCount);

            //Step 3: create a writable file to mimic readable but you can also write back the results to this file
            WritableWorkbook writableFile = Workbook.createWorkbook(new File("src/main/resources/Express_Results.xls"),readableFile);
            WritableSheet writableSheet = writableFile.getSheet(0);
            //will return the physical rows present on the sheet
            int rowCount2 = writableSheet.getRows();
            System.out.println("My writable row count is " + rowCount2);

            logger = reports.startTest("Shop in Express");


            //generate the for/while loop
            for (int i = 1; i < rowCount2; i++) {
                // put down all the variables
                String size = writableSheet.getCell(0, i).getContents();
                String Quantity = writableSheet.getCell(1, i).getContents();
                String firstName = writableSheet.getCell(2, i).getContents();
                String lastName = writableSheet.getCell(3, i).getContents();
                String email = writableSheet.getCell(4, i).getContents();
                String phoneNumber = writableSheet.getCell(5, i).getContents();
                String address = writableSheet.getCell(6, i).getContents();
                String zipcode = writableSheet.getCell(7, i).getContents();
                String city = writableSheet.getCell(8, i).getContents();
                String state = writableSheet.getCell(9, i).getContents();
                String cardNumber = writableSheet.getCell(10, i).getContents();
                String expMonth = writableSheet.getCell(11, i).getContents();
                String expYear = writableSheet.getCell(12, i).getContents();
                String CVV = writableSheet.getCell(13, i).getContents();




                //Navigate to http://www.express.com
                logger.log(LogStatus.INFO, "Navigate to EXPRESS home page");
                driver.navigate().to("http://www.express.com");

                //verify the title
                driver.getTitle();
                if (driver.getTitle().contains("Express - Men's & Women's Clothing")) {
                    System.out.println("The title is correct");
                } else {
                    System.out.println("The title is not correct");
                }

                //HOVER on Women's tab
                Reusable_Actions_Loggers.mouseHover(driver, "//*[@href='/womens-clothing?W_HEADER_WOMENSCLOTHING']", logger, "Women's tab");

                //Click on Dresses link
                Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='Dresses']", logger, "Dresses");

                //Wait few seconds,  scroll 400-500 pixels
                Thread.sleep(3000);
                Reusable_Actions_Loggers.scrollMethod(driver, "0", "500", "scroll");

                //pop up
                Reusable_Actions_Loggers.PopUpClickMethod(driver,"//*[@name='bluecoreCloseButton']",logger,"popup");


                //Click on second image - use @class property with index number as 1, you can use clickByindex()
                Reusable_Actions_Loggers.clickByIndex(driver, "//*[@class='cdS1D9eKI7bXTMHp5xeAA']", 1, logger, "Second Dress");

                //wait a few seconds
                Thread.sleep(2200);

                //click on specific size
                Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='" + size + "']", logger, "size");

                //click on Add to Bag
                Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='Add to Bag']", logger, "Add to Bag");

                //click on view bag
                Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='View Bag']", logger, "view bag");
                Thread.sleep(2000);

                //Select a quantity
                Reusable_Actions_Loggers.dropDownByText(driver, "//*[@id='qdd-0-quantity']", Quantity, logger, "quantity");

                //Click on Check out button then wait a few seconds
                Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='Checkout']", logger, "check out");
                Thread.sleep(2000);

                //click checkout as a guest, then wait a few seconds
                Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='Checkout as Guest']", logger, "Checkout");
                Thread.sleep(2000);

                //Enter first name
                Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@id='contact-information-firstname']", firstName, logger, "First Name");

                //Enter last name
                Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='lastname']", lastName, logger, "Last Name");

                //Enter Email
                Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='email']", email, logger, "Email");

                //Re-enter Email
                Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='confirmEmail']", email, logger, "Re-enter email");

                //Enter phone #
                Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='phone']", phoneNumber, logger, "phone no");

                //Click on continue
                Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='Continue']", logger, "Continue");

                //Enter Address
                Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='shipping.line1']", address, logger, "Address");

                //Enter ZipCode
                Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='shipping.postalCode']", zipcode, logger, "ZipCode");

                //Enter City
                Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='shipping.city']", city, logger, "city");

                //Select State
                Reusable_Actions_Loggers.dropDownByText(driver, "//*[@name='shipping.state']", state, logger, "state");

                //Click on continue
                Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='Continue']", logger, "continue");

                //Click continue after selecting ship to home
                Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='Continue']", logger, "continue again");

                //Click and Enter card no
                Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@id='creditCardNumberInput']", cardNumber, logger, "card no");

                //pop up if needed
                //Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='NO, THANK YOU']", logger, "pop up");

                //Enter exp month
                Reusable_Actions_Loggers.dropDownByText(driver, "//*[@name='expMonth']", expMonth, logger, "expMonth");

                //Enter exp year
                Reusable_Actions_Loggers.dropDownByText(driver, "//*[@name='expYear']", expYear, logger, "expYear");

                //Enter CVV
                Reusable_Actions_Loggers.sendKeysMethod(driver, "//*[@name='cvv']", CVV, logger, "CVV");

                //Click on place order
                Reusable_Actions_Loggers.clickMethod(driver, "//*[text()='Place Order']", logger, "place order");

                //Capture the error message for card # and send it back to error message column in excel
                String result = Reusable_Actions_Loggers.getTextMethod(driver, "//*[@id='rvn-note-NaN']", "error");
                System.out.println("The error message is " + result);

                //storing the values to the writable sheet
                Label label = new Label(14, i, result);

                // need to write back to the writable sheet
                writableSheet.addCell(label);

                //delete cookies
                driver.manage().deleteAllCookies();


            }//end of loop

            //writing back to the writable file to see
            writableFile.write();
            writableFile.close();

            //end the logger
            reports.endTest(logger);



        }//end of test

        @AfterSuite
        public void endTest() {
            driver.quit();
            //write/log the information back to the html report
            reports.flush();
        }//end of after suite

    }//end of java class

