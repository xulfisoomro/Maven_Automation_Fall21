package Express;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dressess {

    public class Dressess extends Reusable_Annotations {
        ExtentTest logger;
        public Dressess(WebDriver){
            PageFactory.initElements(driver,this);
            this.logger = Reusable_Annotations.logger;
        }//end of constructor method

        //Define WebElement
        @FindBy(xpath = "//*[@name='firstname']")
        WebElement FirstName;
        @FindBy(xpath = "//*[@name='lastname']")
        WebElement LastName;
        @FindBy(xpath = "//*[@name='email']")
        WebElement Email;
        @FindBy(xpath = "//*[@name='confirmEmail']")
        WebElement ConfirmEmail;
        @FindBy(xpath = "//*[@name='phone']")
        WebElement Phone;
        @FindBy(xpath = "//*[text()='Continue']")
        WebElement Continue;
        @FindBy(xpath = "//*[@name='shipping.line1']")
        WebElement Address;
        @FindBy(xpath = "//*[@name='shipping.postalCode']")
        WebElement Zipcode;
        @FindBy(xpath = "//*[@name='shipping.city']")
        WebElement City;
        @FindBy(xpath = "//*[@name='shipping.state']")
        WebElement State;
        @FindBy(xpath = "//*[text()='continue']")
        WebElement Continue1;
        @FindBy(xpath = "//*[text()='continue']")
        WebElement Continue2;
        @FindBy(xpath = "//*[@name='creditCardNumber']")
        WebElement CardNumber;
        @FindBy(xpath = "//*[text()='NO, THANK YOU']")
        WebElement PopUP;
        @FindBy(xpath = "//*[@name='expMonth']")
        WebElement EXPYear;
        @FindBy(xpath = "//*[@name='cvv']")
        WebElement CVV;
        @FindBy(xpath = "//*[text()='Place Order']")
        WebElement PlaceOrder;

        public void FirstName(String userDate){
            Reusable_Actions_Loggers_POM.sendKeysMethod(driver,FirstName,userDate,logger,"firstName");
        }//end of method

        public void LastName(String userDate){
            Reusable_Actions_Loggers_POM.sendKeysMethod(driver,LastName,userDate,logger,"LastName");
        }//end of method

        public void Email(String userDate){
            Reusable_Actions_Loggers_POM.sendKeysMethod(driver,Email,userDate,logger,"Email");
        }//end of method

        public void ConfirmEmail(String userDate){
            Reusable_Actions_Loggers_POM.sendKeysMethod(driver,ConfirmEmail,userDate,logger,"Confirm Email");
        }//end of method

        public void phoneNumber(String userDate){
            Reusable_Actions_Loggers_POM.sendKeysMethod(driver,Phone,userDate,logger,"Phone Number");
        }//end of method

        public void ClickOnContinue(){
            Reusable_Actions_Loggers_POM.clickMethod(driver,Continue,logger,"Continue");
        }//end of method

        public void Address(String userData){
            Reusable_Actions_Loggers_POM.sendKeysMethod(driver,Address,userData,logger,"Address");
        }//end of method

        public void Zipcode(String userDate){
            Reusable_Actions_Loggers_POM.sendKeysMethod(driver,Zipcode,userDate,logger,"Zipcode");
        }//end of method

        public void City(String userDate){
            Reusable_Actions_Loggers_POM.sendKeysMethod(driver,City,userDate,logger,"City");
        }//end of method

        public void State(String userDate){
            Reusable_Actions_Loggers_POM.sendKeysMethod(driver,State,userDate,logger,"State");
        }//end of method

        public void Continue1(String userDate){
            Reusable_Actions_Loggers_POM.sendKeysMethod(driver,Continue1,userDate,logger,"Continue1");
        }//end of method

        public void Continue2(String userDate){
            Reusable_Actions_Loggers_POM.sendKeysMethod(driver,Continue2,userDate,logger,"Continue2");
        }//end of method

        public void CardNumber(String userDate){
            Reusable_Actions_Loggers_POM.sendKeysMethod(driver,CardNumber,userDate,logger,"Card Number");
        }//end of method

        public void PopUP(String userDate){
            Reusable_Actions_Loggers_POM.sendKeysMethod(driver,PopUP,userDate,logger,"PopUP");
        }//end of method

        public void EXPYear(String userDate){
            Reusable_Actions_Loggers_POM.sendKeysMethod(driver,EXPYear,userDate,logger,"EXP Year");
        }//end of method

        public void CVV(String userDate){
            Reusable_Actions_Loggers_POM.sendKeysMethod(driver,CVV,userDate,logger,"CVV");
        }//end of method

        public void PlaceOrder(String userDate){
            Reusable_Actions_Loggers_POM.sendKeysMethod(driver,PlaceOrder,userDate,logger,"Place Order");
        }//end of method

    }
}
