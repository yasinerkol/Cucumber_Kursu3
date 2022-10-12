package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.text.Utilities;

public class FormContent extends Parent{

    public FormContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//mat-select[@formcontrolname='id']/div/div)[1]")
    private WebElement academicPeriod;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[1]")
    private WebElement academicPeriod1;

    @FindBy(xpath = "(//mat-select[@formcontrolname='id']/div/div)[3]")
    private WebElement gradeLevel;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[2]")
    private WebElement gradeLevel2;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='firstName']//input")
    private WebElement firstNameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='lastName']//input")
    private WebElement lastNameInput;

    @FindBy(xpath = "(//mat-select[@formcontrolname='gender']/div/div)[1]")
    private WebElement gender;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[2]")
    private WebElement Male;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[3]")
    private WebElement Female;

    @FindBy(xpath = "(//mat-select[@formcontrolname='types']/div/div)[1]")
    private WebElement employeeType;

    @FindBy(xpath = "(//mat-option[@role='option']/mat-pseudo-checkbox )[1]")
    private WebElement Teacher;

    @FindBy(xpath = "(//mat-option[@role='option']/mat-pseudo-checkbox )[2]")
    private WebElement Supervisor;

    @FindBy(xpath = "(//mat-option[@role='option']/mat-pseudo-checkbox )[3]")
    private WebElement OtherType;

    @FindBy(css = "[formcontrolname='employeeId']")
    private WebElement employeeId;

    @FindBy(xpath = "(//mat-select[@formcontrolname='qualification']/div/div)[1]")
    private WebElement qualification;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[2]")
    private WebElement  SecondaryTechnical;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[3]")
    private WebElement   Bachelor;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[4]")
    private WebElement   Master;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[5]")
    private WebElement   PhD;

    @FindBy(xpath = "(//mat-select[@formcontrolname='type']/div/div)[1]")
    private WebElement documentType;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[1]")
    private WebElement PersonelID;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[2]")
    private WebElement Passport;

    @FindBy(xpath = "(//mat-option[@role='option']/span)[3]")
    private WebElement BirthCertificate;

    @FindBy(css = "[formcontrolname='documentNumber']")
    private WebElement documentNumber;



    WebElement myElement;

    public void findAndClick(String strElement) {
        switch (strElement) {
            case "academicPeriod": myElement =academicPeriod ;break;
            case "academicPeriod1": myElement =academicPeriod1 ;break;
            case "gradeLevel": myElement =gradeLevel ;break;
            case "gradeLevel2": myElement =gradeLevel2 ;break;
            case "gender": myElement =gender ;break;
            case "Male": myElement =Male ;break;
            case "Female": myElement =Female ;break;
            case "employeeType": myElement=employeeType; break;
            case "Teacher": myElement=Teacher; break;
            case "Supervisor": myElement=Supervisor; break;
            case "OtherType": myElement=OtherType; break;
            case "qualification": myElement=qualification; break;
            case "SecondaryTechnical": myElement=SecondaryTechnical; break;
            case "Bachelor": myElement=Bachelor; break;
            case "Master": myElement=Master; break;
            case "PhD": myElement=PhD; break;
            case "PersonelID": myElement=PersonelID; break;
            case "Passport": myElement=Passport; break;
            case "BirthCertificate": myElement=BirthCertificate; break;

        }
        clickFunction(myElement);
        }

    public void findAndSend(String strElement, String value) {

        switch (strElement) {
            case "firstNameInput": myElement = firstNameInput;break;
            case "lastNameInput": myElement = lastNameInput;break;
            case "employeeId": myElement = employeeId;break;
            case "documentType": myElement = documentType;break;
            case "documentNumber": myElement = documentNumber;break;

        }

        sendKeysFunction(myElement, value);
    }

}
