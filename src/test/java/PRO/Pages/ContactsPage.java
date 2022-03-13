package PRO.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPage extends BasePage {

    @FindBy(xpath = "//button[@class='header_button btn']")
    public WebElement addNew;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement name;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phone;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//p[.='Add']")
    public WebElement addBttn;

    @FindBy(xpath = "(//*[.=' Adam Smith '])[1]")
    public WebElement addedContact;

    @FindBy(xpath = "//input[@name='search']")
    public WebElement serachBox;

    @FindBy(xpath = "//*[@class='contact_item_name']")
    public WebElement contact;

    @FindBy(xpath = "//*[@class='control_button edit btn']")
    public WebElement edit;

    @FindBy(xpath = "//*[@class='form-group_button submit btn']")
    public WebElement edit2;

    @FindBy(xpath = "//*[@class='control_button delete btn']")
    public WebElement delete;

    @FindBy(xpath = "//button[.='Confirm']")
    public WebElement confirm;

    @FindBy(xpath = "//*[@class='mat-focus-indicator mat-menu-trigger language-button mat-button mat-button-base']")
    public WebElement language;

    @FindBy(xpath = "(//*[@class='iso'])[2]")
    public WebElement turkish;

    @FindBy(xpath = "(//span[.='tr'])[2]")
    public WebElement tr;

    @FindBy(xpath = "//button[@class='mat-focus-indicator mat-tooltip-trigger mat-menu-trigger mat-icon-button mat-button-base']")
    public WebElement star;

    @FindBy(xpath = "//*[@class='mat-input-element mat-form-field-autofill-control ng-tns-c113-5 cdk-text-field-autofill-monitored']")
    public WebElement shortCutSearchBox;

    @FindBy(xpath = "//*[@class='w-100-p']")
    public WebElement contactsShortcut;

    @FindBy(xpath = "//*[.='account_box'][@class='mat-icon notranslate secondary-text material-icons mat-icon-no-color ng-star-inserted']")
    public WebElement contactShortcutSymbol;

    @FindBy(xpath = "(//div[@class='header']//p)[1]")
    public WebElement numOfContacts;

    @FindBy(xpath = "//*[@class='w-100-p']")
    public WebElement customizeShortcut;

    @FindBy(xpath = "//*[.='settings'][@class='mat-icon notranslate secondary-text material-icons mat-icon-no-color ng-star-inserted']")
    public WebElement customizeShortcutSymbol;
}
