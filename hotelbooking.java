package vasuproject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import com.sun.javafx.PlatformUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class hotelbooking {

    WebDriver driver = new ChromeDriver();
    @Test
    public void shouldBeAbleToSearchForHotels() throws InterruptedException {
        //setDriverPath();

        driver.get("https://www.cleartrip.com/");
        //hotelLink.click();
    
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//Indiranagar, Bangalore Kempegowda International Airport
        driver.findElement(By.linkText("Hotels")).click();
        driver.findElement(By.id("Tags")).sendKeys("Indiranagar, Bangalore, Karnataka, India");
    	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        //checkin in datepicker
        driver.findElement(By.xpath("//*[@id='SearchForm']/section[2]/div[1]/dl/dd/div/i")).click();
        //click the check in dates
        driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[1]/a")).click();
      //checkout in datepicker
        driver.findElement(By.xpath("//*[@id='SearchForm']/section[2]/div[2]/dl/dd/div/i")).click();
        //click the check out dates
        driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[2]/a")).click();
        // select the drop down 
        new Select(driver.findElement(By.id("travellersOnhome"))).selectByVisibleText("2 rooms, 4 adults");
        Thread.sleep(3000);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Select the search Button 
        driver.findElement(By.id("SearchHotelsButton")).click();
        
        //driver.findElement(By.className("calendarIcon datePicker")).click();
      //*[@id="FromDate"]
      //*[@id="SearchForm"]/section[2]/div[1]/dl/dd/div/i
        
        //driver.findElement(By.tagName("i"));
        
    	/*List<WebElement> destinationOptions = driver.findElement(By.id("ui-id-1")).findElements(By.tagName("li"));
        destinationOptions.get(0).click();
      //*[@id="ui-datepicker-div"]
        driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[7]/a")).click();

        //all fields filled in. Now click on search
        driver.findElement(By.id("SearchBtn")).click();
    */
    //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    //@FindBy(linkText = "Hotels")
    //private WebElement hotelLink;
    
    /*@FindBy(linkText = "Hotels")
    private WebElement hotelLink;

    @FindBy(id = "Tags")
    private WebElement localityTextBox;

    @FindBy(id = "SearchHotelsButton")
    private WebElement searchButton;

    @FindBy(id = "travellersOnhome")
    private WebElement travellerSelection;

    @Test
    public void shouldBeAbleToSearchForHotels() {
        //setDriverPath();

        driver.get("https://www.cleartrip.com/");
        hotelLink.click();

        localityTextBox.sendKeys("Indiranagar, Bangalore");

        new Select(travellerSelection).selectByVisibleText("1 room, 2 adults");
        searchButton.click();

        driver.quit();

    }
    */
    }
    
    


@BeforeTest
public void beforeTest() {

	    System.setProperty("webdriver.chrome.driver","C:\\Users\\g vasu\\workspace\\vasuproject\\chromedriver.exe"); 
	    WebDriver driver = new ChromeDriver();
	    
	    

}
    }
    

    /*private void setDriverPath() {
        if (PlatformUtil.isMac()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver");
        }
        if (PlatformUtil.isWindows()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        }
        if (PlatformUtil.isLinux()) {
            System.setProperty("webdriver.chrome.driver", "chromedriver_linux");
        }
    }

}
*/