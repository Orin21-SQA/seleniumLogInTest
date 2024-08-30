package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page.base.BasePage;

    public class LogIn extends BasePage {
        //constructor is added
        public LogIn(WebDriver driver) {
        super(driver);
    }

    //call config string
         public LogIn enterUsername(String username){
             getWebElement(By.id("username")).sendKeys(username);
             return this;
         }


        public LogIn enterPassword(String password){
            getWebElement(By.id("password")).sendKeys(password);
            return this;
        }

        public Home submitSignIn(){
            getWebElement(By.cssSelector("input[id='kc-login']")).click();
            //call home class as this value redirects to home page
            return getInstance(Home.class);

        }


    }

