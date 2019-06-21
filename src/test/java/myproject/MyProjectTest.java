package myproject;

import base.BaseScenario;
import cucumber.api.junit.Cucumber;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)

@Cucumber.Options(tags={"@focus"},format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"})
public class MyProjectTest {

  @AfterClass 
  public static void tearDownClass() {
    BaseScenario.quitDriver();
  }
}
