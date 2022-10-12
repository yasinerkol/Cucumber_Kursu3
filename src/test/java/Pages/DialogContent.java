package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class DialogContent extends Parent {

    public DialogContent() {PageFactory.initElements(GWD.getDriver(), this);}

    @FindBy(id = "mat-input-0")
    private WebElement username;

    @FindBy(id = "mat-input-1")
    private WebElement password;

    @FindBy(css = "[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath = "(//span[contains(text(),'Dashboard')])[2]")
    private WebElement dashboard;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private WebElement codeInput;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName']//input")
    private WebElement shortName;

    @FindBy(xpath = "//div[contains(text(),'already exists')]")
    private WebElement alreadyExist;

    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    private WebElement closeDialog;

    @FindBy(xpath = "(//div[contains(@class,'mat-form-field-infix ng-tns-c74')]//input)[1]")
    private WebElement searchInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteDialogButton;

    @FindBy(xpath = "//ms-text-field[contains(@placeholder,'FIELD.INTEGRATION_CODE')]//input")
    private WebElement integrationCodeInput;

    @FindBy(xpath = "//ms-integer-field[contains(@placeholder,'FIELD.PRIORITY')]//input")
    private WebElement priorityInput;

    @FindBy(xpath = "(//button[@class='consent-give'])[1]")
    private WebElement acceptCookies;

    @FindBy(xpath = "//tbody/tr/td[2]")
    public List<WebElement> nameList;

    WebElement myElement;

    public void findAndSend(String strElement, String value) {
        //burada string isimden webelemente ulaşacam

        switch (strElement) {
            case "username": myElement = username;break;
            case "password": myElement = password;break;
            case "nameInput" : myElement=nameInput; break;
            case "codeInput" : myElement=codeInput; break;
            case "shortName" : myElement=shortName; break;
            case "searchInput" : myElement=searchInput; break;
            case "integrationCodeInput" : myElement=integrationCodeInput; break;
            case "priorityInput" : myElement=priorityInput; break;
        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {
        //burada string isimden webelemente ulaşacam

        switch (strElement) {
            case "loginButton": myElement = loginButton;break;
            case "addButton" : myElement=addButton; break;
            case "saveButton" : myElement=saveButton; break;
            case "closeDialog" : myElement=closeDialog; break;
            case "searchButton" : myElement=searchButton; break;
            case "deleteButton" : myElement=deleteButton; break;
            case "deleteDialogButton" : myElement=deleteDialogButton; break;
            case "acceptCookies" : myElement = acceptCookies; break;
        }

        clickFunction(myElement);
    }
    public void findAndContainsText(String strElement, String text) {
        //burada string isimden webelemente ulaşacam

        switch (strElement) {
            case "dashboard": myElement = dashboard; break;
            case "successMessage": myElement = successMessage; break;
            case "alreadyExist": myElement = alreadyExist; break;
        }

        verifyContainsText(myElement,text);
    }

    public void searchAndDelete(String searchText) {

        //scrollUp()
        findAndSend("searchInput", searchText);
        findAndClick("searchButton");

        //  WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
        //   wait.until((ExpectedConditions.stalenessOf(deleteButton)));
        //  GWD.Bekle(2); //  aşağıda metod oluşturuldu....

       // waitUntilLoading();
        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.textToBe(By.cssSelector("div[fxlayoutalign='center center'][class='control-full']"),"Search"));

        findAndClick("deleteButton");
        findAndClick("deleteDialogButton");
    }

}


