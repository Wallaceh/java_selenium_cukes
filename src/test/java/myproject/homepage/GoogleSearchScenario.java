package myproject.homepage;

import base.BaseScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertTrue;

public class GoogleSearchScenario extends BaseScenario {

  @When("^I search \"(.*?)\"$")
  public void i_search(String keyword) throws Throwable {
    WebElement element = driver.findElement(By.name("q"));
    element.sendKeys(keyword);
    element.submit();
    Thread.sleep(secondsToWait);
  }

  @Then("^The page title should contains \"(.*?)\"$")
  public void the_page_title_should_contains(String keyword) throws Throwable {
    assertTrue(driver.getTitle().contains(keyword));
    closeDriver();
  }
}
