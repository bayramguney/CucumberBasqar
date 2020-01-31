package PageObjectModel;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class signInPage {

/*
        Advantage of Page Factory

                1)Code reusability – We could achieve code reusability
            by writing the code once and use it in different tests.
                2)Code maintainability – There is a clean separation
           between test code and page specific code such as
           locators and layout which becomes very easy to maintain code.
           Code changes only on Page Object Classes when a UI change occurs.
           It enhances test maintenance and reduces code duplication.
                3)Object Repository – Each page will be defined as a java class.
           All the fields in the page will be defined in an interface as members.
           The class will then implement the interface.
                4)Readability – Improves readability due to clean separation between
           test code and page specific code

 */

    WebDriver driver ;

    public signInPage(){

        driver = Driver.getDriver();
        PageFactory.initElements( driver , this );

    }

//    public void signInMethod(){
//
//        driver.findElement(By.cssSelector("[formcontrolname=\"username\"]")).sendKeys("nigeria_tenant_admin");
//        driver.findElement(By.cssSelector("[formcontrolname=\"password\"]")).sendKeys("TnvLOl54WxR75vylop2A");
//        driver.findElement(By.cssSelector("button[aria-label=\"LOGIN\"]")).click();
//    }

    @FindBy(css="[formcontrolname=\"username\"]")
    private WebElement inputUserName;


}