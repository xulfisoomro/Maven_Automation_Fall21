package Express;

import Reusable_Library.Reusable_Annotations;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.zip.CheckedOutputStream;

public class BaseClass extends Reusable_Annotations {
    public BaseClass(WebDriver driver) {

        PageFactory.initElements(driver,this);
    }//end of constructor class

    public static Homepage Homepage(){
        Homepage Homepage = new Homepage(driver);
        return Homepage;

    }//end of method

    //create static reference for Dressess page
       public static Dresses dresses() {
        Dressess dressess = new Dresses (driver);
        return dressess;
       }///end of Dressess page

    //add to bag page
    public static AddToBag addToBag() {
        AddToBag addToBag = new AddToBag(driver);
    }//end of add to bag

    //check out page
    public static CheckOut checkOut() {
        CheckOut checkOut = new CheckedOut(driver);
        return checkOut;
    }//end of check out page

    //shipping information
    public static Shipping shipping() {
        Shipping shipping = new Shiping(driver);
        return shipping;
    }//end of method

}//end of java class
