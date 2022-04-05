package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RegistrationPage {

    public RegistrationPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }
// ------------------------ KÜBRA -----------------------------
//Medunna>MainPage/Ana sayfadaki Welcome To Medunna yazısı
@FindBy(xpath = "//*[@id=\"hero\"]/div/h1")
public WebElement anaSayfaWelcomeToMedunnaYazısı;

    //Medunna>MainPage/Ana sayfada sağ üstte ki kullanıcı ikonnu
    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement anaSayfaKullanıcıİkonu;

    //Medunna>MainPage>Kullanıcı ikonu>Register Linki
    @FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
    public WebElement registerLinki;

    //Medunna>MainPage>Kullanıcı ikonu>Register Linki/Register sayfasındaki Register yazısı
    @FindBy(xpath = "//*[@id=\"register-title\"]/span")
    public WebElement registerYazısı;

    //Medunna>MainPage>Kullanıcı ikonu>Register Linki/SSN textbox
    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement ssnTextBox;

    //Medunna>MainPage>Kullanıcı ikonu>Register Linki/firstname textbox
    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstnameTextBox;

    //Medunna>MainPage>Kullanıcı ikonu>Register Linki/lastname textbox
    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement lastnameTextBox;

    //Medunna>MainPage>Kullanıcı ikonu>Register Linki/username textbox
    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameTextBox;

    //Medunna>MainPage>Kullanıcı ikonu>Register Linki/email textbox
    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailTextBox;

    //Medunna>MainPage>Kullanıcı ikonu>Register Linki>SSN textbox/Geçerli bir SSN numarası girilmediğinde SSN textbox'ın altında çıkan uyarı yazısı
    @FindBy(xpath = "//div[text()='Your SSN is invalid']")
    public WebElement yourSsnIsInvalidYazısı;

    //Medunna>MainPage>Kullanıcı ikonu>Register Linki>SSN textbox/Herhangi bir SSN numarası girilmediğinde SSN textbox'ın altında çıkan uyarı yazısı
    @FindBy(xpath = "//div[text()='Your SSN is required.']")
    public WebElement yourSsnIsRequiredYazısı;

    //Medunna>MainPage>Kullanıcı ikonu>Register Linki>firstname textbox/Herhangi bir isim girilmediğinde firstname textbox'ın altında çıkan uyarı yazısı
    @FindBy(xpath = "//div[text()='Your FirstName is required.']")
    public WebElement yourFirstnameIsRequiredYazısı;

    //Medunna>MainPage>Kullanıcı ikonu>Register Linki/Herhangi bir soyisim girilmediğinde lastname textbox'ın altında çıkan uyarı yazısı
    @FindBy(xpath = "//div[text()='Your LastName is required.']")
    public WebElement yourLastnameIsRequiredYazısı;

    //Medunna>MainPage>Kullanıcı ikonu>Register Linki/Herhangi bir kullanıcı adı girilmediğinde username textbox'ın altında çıkan uyarı yazısı
    @FindBy(xpath = "//div[text()='Your username is required.']")
    public WebElement yourUsernameIsRequiredYazısı;

    //Medunna>MainPage>Kullanıcı ikonu>Register Linki/Geçerli bir kullanıcı adı girilmediğinde username textbox'ın altında çıkan uyarı yazısı
    @FindBy(xpath = "//div[text()='Your username is invalid.']")
    public WebElement yourUsernameIsInvalidYazısı;

    //Medunna>MainPage>Kullanıcı ikonu>Register Linki/Email adresinde "@" ve "." girilmediğinde email textbox'ın altında çıkan uyarı yazısı
    @FindBy(xpath = "//div[text()='This field is invalid']")
    public WebElement thisFieldIsInvalidYazısı;

    //Medunna>MainPage>Kullanıcı ikonu>Register Linki/Herhangi bir email adresi girilmediğinde email textbox'ın altında çıkan uyarı yazısı
    @FindBy(xpath = "//div[text()='Your email is required.']")
    public WebElement yourEmailIsRequiredYazısı;

    //Medunna>MainPage>Kullanıcı ikonu>Register Linki/Email adresi 5 karakterden az girildiği zaman email textbox'ın altında çıkan uyarı yazısı
    @FindBy(xpath = "//*[@id=\"register-form\"]/div[5]/div")
    public WebElement yourEmailIsRequiredToBeAtLeastFiveCharactersYazısı;


}