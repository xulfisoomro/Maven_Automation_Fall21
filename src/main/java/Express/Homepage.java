package Express;

import Reusable_Library.Reusable_Actions_Loggers_POM;
import Reusable_Library.Reusable_Annotations;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Homepage extends Reusable_Annotations {
    ExtentTest logger;
    public Homepage(WebDriver driver){

        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations.logger;

    }//end of the constructive method

    //define all the WebElement we need for this page per use case
    @FindBy(xpath = "//*[@href='/womens-clothing?W_HEADER_WOMENSCLOTHING']")
    WebElement WomenTab;
    @FindBy(xpath = "//*[@href='/womens-clothing/dresses/cat550007]")
    WebElement Dresslink;

    //hover over women tab
    public void HoverOnWomenTab(){
        Reusable_Actions_Loggers_POM.mouseHover(driver,WomenTab,logger,"WomenTab");
    }//end of hover

    //Click on Second Dress
    public void ClickOnDress(){
        Reusable_Actions_Loggers_POM.clickMethod(driver,Dresslink,logger,"WomenTab");
    }//end of click


}//end of java class
