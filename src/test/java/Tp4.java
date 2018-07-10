import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Tp4 {

   WebDriver driver;


   @Before
   public void init(){
      driver = new ChromeDriver();
      driver.get("https://www.amazon.fr");
      driver.manage().window().maximize();

   }

   @Test
   public void testAmazon(){
      //List<WebElement> allCategory = (List<WebElement>) driver.findElement(By.cssSelector(".nav-a.nav-a-2 "));
      //WebElement item8= allCategory.get(8);
      Actions action=new actions(driver);



   }































}

