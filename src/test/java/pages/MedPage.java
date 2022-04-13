package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedPage {

    public MedPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    //------------------- Kubra--------------------------
    //------------------- Mehmet Emin--------------------------
    //------------------- Mustafa--------------------------
    //------------------- Zeynep--------------------------
    //------------------- Sezen--------------------------
    //------------------- Salih--------------------------

    //mainPage/signInIkonu
    @FindBy(xpath="//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement anasayfaSignInIkonElementi;

    //mainPage>signIn/Register
    @FindBy(xpath="//a[@href='/account/register']")
    public WebElement registerLinkiElementi;

    //mainPage>signIn>Register/RegistrationYazisi
    @FindBy(xpath="//span[text()='Registration']")
    public WebElement registirationYaziElementi;

    //mainPage>signIn>Register/SSNTextBox
    @FindBy(xpath="//input[@name='ssn']")
    public WebElement registerSSNTextBoxElementi;

    //mainPage>signIn>Register/FirstNameTextBox
    @FindBy(xpath="//input[@name='firstName']")
    public WebElement registerFirstNameTextBoxElementi;

    //mainPage>signIn>Register/LastNameTextBox
    @FindBy(xpath="//input[@name='lastName']")
    public WebElement lastNameTextBoxElementi;

    //mainPage>signIn>Register/UserNameTextBox
    @FindBy(xpath="//input[@name='username']")
    public WebElement usernameTextBoxElementi;

    //mainPage>signIn>Register/EmailTextBox
    @FindBy(xpath="//input[@name='email']")
    public WebElement emailTextBoxElementi;

    //mainPage>signIn>Register/FirstPasswordTextBox
    @FindBy(xpath="//input[@name='firstPassword']")
    public WebElement firstPasswordTextBoxElementi;

    //mainPage>signIn>Register/PasswordStrengthBariKirmizi
    @FindBy(xpath="(//li[@style='background-color: rgb(255, 0, 0);'])[1]")
    public WebElement strengthRedElementi;

    //mainPage>signIn>Register/PasswordStrengthBariTuruncu
    @FindBy(xpath="(//li[@style='background-color: rgb(255, 153, 0);'])[1]")
    public WebElement strengthOrangeElementi;

    //mainPage>signIn>Register/PasswordStrengthBariFistikYesili
    @FindBy(xpath="(//li[@style='background-color: rgb(153, 255, 0);'])[1]")
    public WebElement strengthPistachioElementi;

    //mainPage>signIn>Register/PasswordStrengthBariYesil
    @FindBy(xpath="(//li[@style='background-color: rgb(0, 255, 0);'])[1]")
    public WebElement strengthGreenElementi;

    //mainPage>signIn>Register/SecondPasswordTextBox
    @FindBy(xpath="//input[@name='secondPassword']")
    public WebElement secondPasswordTextBoxElementi;

    //mainPage>signIn>Register/RegisterButonu
    @FindBy(xpath="//button[@id='register-submit']")
    public WebElement registerButonElementi;

    //mainPage>signIn/signInYazisi
    @FindBy(xpath="(//span[text()='Sign in'])[2]")
    public WebElement signInYazisiElementi;

    //mainPage>signIn/UsernameTextBox
    @FindBy(xpath="//input[@id='username']")
    public WebElement signInUsernameTextBoxElementi;

    //mainPage>signIn/PasswordTextBox
    @FindBy(xpath="//input[@id='password']")
    public WebElement signInPasswordTextBoxElementi;

    //mainPage>signIn/UsernameTextBoxBosBirakilamazUyariYazisi
    @FindBy(xpath="(//div[@class='invalid-feedback'])[1]")
    public WebElement signInUsernameBosBirakilamazUyariElementi;

    //mainPage>signIn/PasswordTextBoxBosBirakilamazUyariYazisi
    @FindBy(xpath="(//div[@class='invalid-feedback'])[2]")
    public WebElement signInPasswordBosBirakilamazUyariElementi;

    //mainPage>signIn/RememberMeYazisi
    @FindBy(xpath="//span[text()='Remember me']")
    public WebElement signInRememberMeYaziElementi;

    //mainPage>signIn/RememberMeButonu
    @FindBy(xpath="//input[@id='rememberMe']")
    public WebElement signInRememberMeButonElementi;

    //mainPage>signIn/DidYouForgetYourPasswordLinki
    @FindBy(xpath="(//div[@class='alert alert-warning fade show'])[1]")
    public WebElement signInDidYouForgetPasswordLinkiElementi;

    //mainPage>signIn/YouDontHaveAnAccountYetRegisterANewAccountLinki
    @FindBy(xpath="(//div[@class='alert alert-warning fade show'])[2]")
    public WebElement signInRegisterANewAccountLinkiElementi;

    //mainPage>signIn/CancelButonu
    @FindBy(xpath="//button[@class='btn btn-secondary']")
    public WebElement signInCancelButonElementi;

    //mainPage>signIn/CancelButonu
    @FindBy(xpath="//button[@class='btn btn-primary']")
    public WebElement signInSignInButonElementi;

    //mainPage>signIn>DidYouForgetPasswordLinki>ResetYourPassword
    @FindBy(xpath="//span[text()='Reset your password']")
    public WebElement resetYourPasswordYaziElementi;

    //mainPage>signIn/Setting
    @FindBy(xpath="//a[@href='/account/settings']")
    public WebElement signInSettingLinkiElementi;

    //mainPage>signIn/Setting/FirstNameBoxElementi;
    @FindBy(xpath="//input[@id='firstName']")
    public WebElement settingFirstNameTextBoxElementi;

    //mainPage>signIn/Setting/LastNameBox
    @FindBy(xpath="//input[@id='lastName']")
    public WebElement settingLastNameTextBoxElementi;

    //mainPage>signIn/Setting/EmailBox
    @FindBy(xpath="//input[@id='email']")
    public WebElement settingEmailTextBoxElementi;

    //mainPage>signIn/Setting/SaveButonu
    @FindBy(xpath="//button[@class='btn btn-primary']")
    public WebElement settingSaveButonElementi;

    //mainPage>signIn/Setting/BasariliSaveYazisi
    @FindBy(xpath="//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement settingBasariliSaveYazisiElementi;
    //expected-> Settings saved!


    //mainPage>signIn>Register/BasariliKayitYapildiYazisi
    @FindBy(xpath="//div[@class='Toastify__toast-container Toastify__toast-container--top-left toastify-container']")
    public WebElement registerBasariliKayitYapildiYaziElementi;
    //expected-> Registration Saved
/*
    @FindBy(xpath="")
    public WebElement

    //
    @FindBy(xpath="")
    public WebElement

     //
    @FindBy(xpath="")
    public WebElement

    //
    @FindBy(xpath="")
    public WebElement
  */
    //------------------- Mehmet Ali--------------------------
    //------------------- Onur--------------------------
}
