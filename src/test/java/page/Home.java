package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page.base.BasePage;

public class Home extends BasePage {


    public Home(WebDriver driver) {
        super(driver);
    }

   public boolean hasLogout() {

      // return getWebElements(By.cssSelector("input[value='Logout']")).size() > 0;
       //driver.findElement(By.cssSelector("Logout")).click();
    //}

}
