package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.Home;
import page.LogIn;

public class LogInTest extends BaseTest{

    @Test
    public void ErpLogInShouldSuccess(){
        Home home =(Home) page.getInstance(LogIn.class)
                .enterUsername(getUsername())
                .enterPassword(getPassword())
                .submitSignIn();

       Assert.assertTrue(Home.hasLogout());
    }
}
