package StepDefenitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginSteps {
WebDriver driver;

    WebDriverWait wt;
    @Given("user is already on the login page")
    public void user_is_already_on_the_login_page() {
        // Write code here that turns the phrase above into concrete actions

        driver = new ChromeDriver();
        wt   = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://new.freecrm.com/login");
        driver.manage().window().maximize();
    }
    @When("Title off login page is Free CRM")
    public void title_off_login_page_is_free_crm() {
        // Write code here that turns the phrase above into concrete actions
       String title = driver.getTitle();
       System.out.println(title);
        Assert.assertEquals("FreeCRM", title);
    }
    @Then("User enters username and password")
    public void user_enters_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
       driver.findElement(By.id("email")).sendKeys("Pradiksh99@gmail.com");
       driver.findElement(By.id("password")).sendKeys("Pradiksh@99");
    }
    @Then("User clicks on the login button")
    public void user_clicks_on_the_login_button() {
        // Write code here that turns the phrase above into concrete actions
driver.findElement(By.xpath("//button[text()='Login']")).click();
    }


    @Then("USer lands on homepage of Free CRM")
    public void u_ser_lands_on_homepage_of_free_crm() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        // Thread.sleep(Duration.ofSeconds(2));
        wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Good morning']")));


        WebElement Element =  driver.findElement(By.xpath("//h1[text()='Good morning']"));
        String Greeting = Element.getText();
        System.out.println(Greeting);
        Assert.assertEquals("Good morning, coco", Greeting);
        driver.close();
        driver.quit();
    }

}

