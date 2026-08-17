package StepDefenitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class ContactSteps {

    @Then("User moves to contact page")
    public void user_moves_to_contact_page() {

        LoginSteps.driver.findElement(
                By.xpath("//a[@href='/contacts']")
        ).click();
    }
    @Then("User enters {string} and {string} and {string}")
    public void user_enters_and_and(
            String firstName,
            String lastName,
            String position) {
        LoginSteps.wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(.,'Create')]")));
        LoginSteps.driver.findElement(By.xpath("//button[contains(.,'Create')]")).click();
        LoginSteps.wt.until(ExpectedConditions.visibilityOfElementLocated(By.id("first-name")));
        LoginSteps.driver.findElement(By.id("first-name")).sendKeys(firstName);
        LoginSteps.driver.findElement(By.id("last-name")).sendKeys(lastName);
        LoginSteps.driver.findElement(By.id("position")).sendKeys(position);
        LoginSteps.driver.findElement(By.xpath("//button[contains(.,'Save')]")).click();
    }

}
