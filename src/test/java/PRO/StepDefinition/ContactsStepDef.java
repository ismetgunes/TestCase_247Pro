package PRO.StepDefinition;

import PRO.Pages.ContactsPage;
import PRO.Utilities.BrowserUtils;
import PRO.Utilities.ConfigurationReader;
import PRO.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ContactsStepDef {

    ContactsPage contactsPage = new ContactsPage();
    Actions actions = new Actions(Driver.get());

    @Given("User navigates the webpage")
    public void user_navigates_the_webpage() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
        Assert.assertEquals("Incorrect url",url,Driver.get().getCurrentUrl());
        BrowserUtils.waitFor(4);
    }
    @Given("User clicks on Add new button")
    public void user_clicks_on_add_new_button() {
        contactsPage.addNew.click();
        BrowserUtils.waitFor(10);
        // Assert.assertFalse(contactsPage.addBttn.isEnabled());
    }
    @Given("User fills the blank with given datas")
    public void user_fills_the_blank_with_given_datas() {
        contactsPage.name.click();
        contactsPage.name.sendKeys(ConfigurationReader.get("name"));
        BrowserUtils.waitFor(2);
        contactsPage.phone.click();
        contactsPage.phone.sendKeys(ConfigurationReader.get("phone"));
        BrowserUtils.waitFor(2);
        contactsPage.email.click();
        contactsPage.email.sendKeys(ConfigurationReader.get("email"));
        BrowserUtils.waitFor(2);
    }
    @Then("User clicks Add button")
    public void user_clicks_add_button() {
        contactsPage.addBttn.click();
        BrowserUtils.waitFor(2);
        Assert.assertTrue(contactsPage.addedContact.isDisplayed());
        BrowserUtils.waitFor(2);
    }
    @Given("User writes the name in search box")
    public void user_writes_the_name_in_search_box() {
        contactsPage.serachBox.click();
        BrowserUtils.waitFor(2);
        contactsPage.serachBox.sendKeys(ConfigurationReader.get("name"));
        BrowserUtils.waitFor(2);
    }
    @Given("User sees the contact at the top")
    public void user_sees_the_contact_at_the_top() {
        String name = contactsPage.contact.getText();
        BrowserUtils.waitFor(2);
        Assert.assertEquals("Name is not on the top","Adam Smith",name);
        BrowserUtils.waitFor(2);
    }
    @Given("User hover over the contact which is required to be editted")
    public void user_hover_over_the_contact_which_is_required_to_be_editted() {
        actions.moveToElement(contactsPage.addedContact).perform();
    }
    @Given("User clicks the edit button")
    public void user_clicks_the_edit_button() {
        contactsPage.edit.click();
        BrowserUtils.waitFor(2);
    }
    @When("User changes the datas")
    public void user_changes_the_datas() {
        contactsPage.phone.clear();
        BrowserUtils.waitFor(2);
        contactsPage.phone.sendKeys(ConfigurationReader.get("secondPhone"));
        BrowserUtils.waitFor(2);
        contactsPage.email.clear();
        BrowserUtils.waitFor(2);
        contactsPage.email.sendKeys(ConfigurationReader.get("secondMail"));
        BrowserUtils.waitFor(2);
    }
    @When("User clicks edit button")
    public void user_clicks_edit_button() {
        contactsPage.edit2.click();
        BrowserUtils.waitFor(2);
    }
    @Given("User clicks the delete button")
    public void user_clicks_the_delete_button() {
        contactsPage.delete.click();
        BrowserUtils.waitFor(2);
    }
    @Given("User clicks confirm button")
    public void user_clicks_confirm_button() {
        contactsPage.confirm.click();
        BrowserUtils.waitFor(2);
        contactsPage.serachBox.clear();
    }
    @Given("User clicks on the language tab En")
    public void user_clicks_on_the_language_tab_en() {
        contactsPage.language.click();
        BrowserUtils.waitFor(2);
    }
    @Given("User clicks on Tr")
    public void user_clicks_on_tr() {
        contactsPage.turkish.click();
        BrowserUtils.waitFor(2);
        Assert.assertEquals("Language is not true","TR",contactsPage.tr.getText());
        BrowserUtils.waitFor(2);
    }
    @Given("User clicks on the star")
    public void user_clicks_on_the_star() {
        contactsPage.star.click();
        BrowserUtils.waitFor(2);
    }
    @Given("User writes the name of the shortcut")
    public void user_writes_the_name_of_the_shortcut() {
        contactsPage.shortCutSearchBox.sendKeys("contact");
        BrowserUtils.waitFor(2);
    }
    @Given("User clicks on the name of the shortcut")
    public void user_clicks_on_the_name_of_the_shortcut() {
        contactsPage.contactsShortcut.click();
        BrowserUtils.waitFor(2);
    }
    @Given("User verifies that added contact deleted")
    public void user_verifies_that_added_contact_deleted() {
        Assert.assertEquals("added contact is not deleted","0 Contacts",contactsPage.numOfContacts.getText());
        BrowserUtils.waitFor(2);
    }
    @Given("User verifies shortcut added")
    public void user_verifies_shortcut_added() {
        BrowserUtils.waitFor(3);
        Assert.assertTrue(contactsPage.contactShortcutSymbol.isDisplayed());
        BrowserUtils.waitFor(2);
    }
    @Given("User verifies shortcut removed")
    public void user_verifies_shortcut_removed() {
        boolean flag = false;
        List<WebElement> symbols = Driver.get().findElements(By.xpath("//*[@class='mat-focus-indicator mat-tooltip-trigger mat-icon-button mat-button-base']"));
        for (WebElement symbol : symbols) {
            if (symbol.getText()=="account_box"){
                flag=true;
            }
        }
        Assert.assertFalse(flag);
    }
    @Given("User writes the name of the shortcut for add")
    public void user_writes_the_name_of_the_shortcut_for_add() {
        contactsPage.shortCutSearchBox.sendKeys("customize");
        BrowserUtils.waitFor(2);
    }
    @Given("User clicks on the name of the shortcut for add")
    public void user_clicks_on_the_name_of_the_shortcut_for_add() {
        contactsPage.customizeShortcut.click();
        BrowserUtils.waitFor(2);
    }


}
