package StepDefinitions;

import Utils.CommonMethods;
import Utils.ConfigReader;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddEmployee extends CommonMethods {
    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
      WebElement pimBtn = driver.findElement(By.id("menu_pim_viewPimModule"));
      doClick(pimBtn);
    }
    @When("user clicks on add employee button")
    public void user_clicks_on_add_employee_button() {
       WebElement empBtn = driver.findElement(By.id("menu_pim_addEmployee"));
       doClick(empBtn);
    }
    @When("user enters firstname and middlename and lastname")
    public void user_enters_firstname_and_middlename_and_lastname() {
        WebElement firstnameTextBox =driver.findElement(By.id("firstName"));
        sendText(firstnameTextBox ,ConfigReader.getPropertyValue("firstname") );
        WebElement middlenameTextBox =driver.findElement(By.id("middleName"));
        sendText(middlenameTextBox,ConfigReader.getPropertyValue("middlename"));
        WebElement lastnameTextBox = driver.findElement(By.id("lastName"));
        sendText(lastnameTextBox,ConfigReader.getPropertyValue("lastname"));
    }
    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
     WebElement saveBtn = driver.findElement(By.id("btnSave"));
       doClick(saveBtn);
    }

}
