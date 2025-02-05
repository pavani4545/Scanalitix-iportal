package test;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.Login;

public class TestAllPages extends BaseTest {

    Login login;

    @Test
    public void portalLogin(){
        login= new Login(driver);
        login.setLogin();





    }

    }










