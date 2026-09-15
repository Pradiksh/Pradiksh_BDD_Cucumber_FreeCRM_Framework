package StepDefenitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static StepDefenitions.LoginSteps.driver;
import static StepDefenitions.LoginSteps.wt;
import io.cucumber.datatable.DataTable;
public class DealSteps {
    @Then("user enters username and password")
    public void user_enters_username_and_password(DataTable Credentials) {
        List<List<String>> data = Credentials.asLists();
        wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        driver.findElement(By.id("email")).sendKeys(data.get(0).get(0));
        driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));

    }

    @Then("User moves to deal page")
    public void user_moves_to_deal_page() {

        driver.findElement(
                By.xpath("//a[@href='/deals']")
        ).click();
    }

    @Then("User enters Deal Details")
    public void userEntersDealDetails(DataTable DealDetails) {
       List<List<String>>data = DealDetails.asLists();
        wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(.,'Create')]")));
        driver.findElement(By.xpath("//button[contains(.,'Create')]")).click();
        wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("title")));
        driver.findElement(By.id("title")).sendKeys(data.get(0).get(0));
        driver.findElement(By.id("amount")).sendKeys(data.get(0).get(1));
        driver.findElement(By.id("probability")).sendKeys(data.get(0).get(2));
        driver.findElement(By.id("commission")).sendKeys(data.get(0).get(3));

        driver.findElement(By.xpath("//button[contains(.,'Save')]")).click();

    }
}
