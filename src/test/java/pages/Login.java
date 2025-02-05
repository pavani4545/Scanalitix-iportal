package pages;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

    WebDriver driver;

    public Login(WebDriver driver) {
        ;
        this.driver = driver;
    }

    public void setLogin() {
        System.out.println("Hello");
        String title = driver.getTitle();
        System.out.println("The title of the website is: " + title);
        try {
            Thread.sleep(1000);
            WebElement Login = driver.findElement(By.xpath("//input[@placeholder='Email or Username']"));
             Login.sendKeys("sudhir.i");
           WebElement Password =driver.findElement(By.xpath("//input[@placeholder='Password']")); //input[@placeholder='Password']
            Password.sendKeys("Iportal@3210");
            WebElement Loginbtn=driver.findElement(By.xpath("//button[@type='submit']"));
            Loginbtn.click();
        }



            catch (InterruptedException e) {
             e.printStackTrace(); // Handle the exception, e.g., logging it
             }




    }
}

