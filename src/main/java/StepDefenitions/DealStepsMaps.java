package StepDefenitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.Map;

import static StepDefenitions.LoginSteps.driver;
import static StepDefenitions.LoginSteps.wt;

public class DealStepsMaps {

    @Then("User enters Username and Password")
    public void user_enters_username_and_password(DataTable Credentials) {

        for (Map<String, String> data :
                Credentials.asMaps(String.class, String.class)) {

            wt.until(ExpectedConditions.visibilityOfElementLocated(
                    By.id("email")));

            driver.findElement(By.id("email"))
                    .sendKeys(data.get("Username"));

            driver.findElement(By.id("password"))
                    .sendKeys(data.get("Password"));
        }
    }

    @Then("User moves to Deal Page")
    public void user_moves_to_deal_page() {

        driver.findElement(
                By.xpath("//a[@href='/deals']")
        ).click();
    }

    @Then("User Enters Deal Details")
    public void userEntersDealDetails(DataTable DealDetails) {

        for (Map<String, String> data :
                DealDetails.asMaps(String.class, String.class)) {

            wt.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//button[contains(.,'Create')]")));

            driver.findElement(
                    By.xpath("//button[contains(.,'Create')]")
            ).click();

            wt.until(ExpectedConditions.visibilityOfElementLocated(
                    By.id("title")));

            driver.findElement(By.id("title"))
                    .sendKeys(data.get("Title"));

            driver.findElement(By.id("amount"))
                    .sendKeys(data.get("Amount"));

            driver.findElement(By.id("probability"))
                    .sendKeys(data.get("Probablity"));

            driver.findElement(By.id("commission"))
                    .sendKeys(data.get("Comission"));

            driver.findElement(
                    By.xpath("//button[contains(.,'Save')]")
            ).click();
        }
    }
}