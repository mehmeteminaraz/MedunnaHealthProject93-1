package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import java.util.List;
public class MedPage {

    public MedPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    //------------------- Kubra--------------------------
    //mainpage>KullaniciIkonu>signInLinki/AdministrationLinki
    @FindBy(xpath ="//*[@id=\"admin-menu\"]/a/span")
    public WebElement administrationLinki;

    //mainpage>KullaniciIkonu>signInLinki/AdministrationLinki/UserManagementLinki
    @FindBy(xpath = "//span[text()='User management']")
    public WebElement usermanagementLinki;

    //mainpage>KullaniciIkonu>signInLinki/AdministrationLinki/UserManagementLinki/CreateANewUserButonu
    @FindBy(xpath = "//a[@class='btn btn-primary float-right jh-create-entity']")
    public WebElement createANewUserButonu;

    //mainpage>KullaniciIkonu>signInLinki/AdministrationLinki/UserManagementLinki/CreateANewUserButonu/createANewUserTexti
    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div[1]/div/h1/span")
    public WebElement createANewUserTexti;

    //mainpage>KullaniciIkonu>signInLinki/AdministrationLinki/UserManagementLinki/CreateANewUserButonu/CreateANewUserSayfasi/LoginTextBox
    @FindBy(xpath = "//input[@id='login']")
    public WebElement createANewUserSayfasiloginTextBox;

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement createANewUserSayfasifirstnameTextBox;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement createANewUserSayfasilastnameTextBox;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement createANewUserSayfasiEmailTextBox;

    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement createANewUserSayfasiSSNBox;

    @FindBy(xpath = "//select[@id='authorities']")
    public WebElement createANewUserSayfasiProfilesDropDownElementi;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement createANewUserSayfasiSaveButonu;

    @FindBy(xpath ="(//a[@class='page-link'])[9]")
    public WebElement usersSayfasiSonSayfaElementi;

    //administrationButonu>UserManagement Sayfası/view butonu
    @FindBy(xpath = "//*[text()='View']")
    public WebElement viewButonu;

    @FindBy(xpath = "//*[@id=\"app-view-container\"]/div/div/div/div/div/dl/dd[8]")
    public WebElement hesapdogrulama;

    @FindBy(xpath = "//*[text()='Edit']")
    public WebElement editButtons;

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement editSayfasiFirstnameTextBox;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement editSayfasiSaveButonu;

    @FindBy(xpath = "//*[@id=\"authorities\"]/option[4]")
    public WebElement editSayfasiRole;

    @FindBy(xpath = "//*[text()='Delete']")
    public WebElement usersSayfasindakiDeleteButonu;

    @FindBy(xpath = "//button[@class='btn btn-danger']")
    public WebElement alertDeleteButonu;

    @FindBy(xpath = "(//a[@class='d-flex align-items-center dropdown-toggle nav-link'])[3]")
    public WebElement sagUstHesapIkonu;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[12]")
    public WebElement signOutButonu;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement signOutSonrasıSignInButonu;
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
    //Item/Titles
    @FindBy(xpath="(//*[@class=\"dropdown nav-item\"])[1]")
    public WebElement itemtitlesMenu;

    //Item/Titles--->Physician
    @FindBy(xpath="//*[@id=\"entity-menu\"]/div/a[3]")
    public WebElement itemtitlesPhysician;

    //Item/Titles--->Physician---->Creat Physician
    @FindBy(xpath="//a[@id='jh-create-entity']")
    public WebElement CreatPhysician;

    //Item/Titles--->Physician---->Creat Physician>SSn
    @FindBy(xpath="//input[@id='searchSSN']")
    public WebElement CreatPhysicianSsn;

    //Item/Titles--->Physician---->Creat Physician>Search _User Button
    @FindBy(xpath="//button[text()='Search User']")
    public WebElement searchUserButton;

    //Item/Titles--->Physician---->Creat Physician>Use Search tik
    @FindBy(xpath="//input[@id='useSSNSearch']")
    public WebElement useSearch;

    //Item/Titles--->Physician---->First Name
    @FindBy(xpath="//input[@id='physician-firstName']")
    public WebElement firstName;

    //Item/Titles--->Physician---->Last Name
    @FindBy(xpath="//input[@name='lastName']")
    public WebElement lastName;

    //Item/Titles--->Physician---->BirthDate
    @FindBy(xpath="//input[@name='birthDate']")
    public WebElement birthDate;

    //Item/Titles--->Physician---->speciality
    @FindBy(xpath="//select[@id='physician-speciality']")
    public WebElement speciality;

    //Item/Titles--->Physician---->image
    @FindBy(xpath="//input[@id='file_image']")
    public WebElement image;

    //Item/Titles--->Physician---->Exam fee
    @FindBy(xpath="//input[@id='physician-examFee']")
    public WebElement examFee;

    //Item/Titles--->Physician---->textbox alti uyari yazisi
    @FindBy(xpath="//div[text()='This field is required.']")
    public WebElement textboxaltiuyariyazisi;

    //Item/Titles--->Physician---->Birtdate textbox alti uyari yazisi
    @FindBy(xpath="//div[text()='This field is invalid']")
    public WebElement birtdatetextboxaltiuyariyazisi;

    //Item/Titles--->Physician---->sol ust kose pupop
    @FindBy(xpath="//div[@class='Toastify__toast-body']")
    public WebElement solustkosepupop;

    //Item/Titles--->Physician---->valid form kontrol
    @FindBy(xpath="(//input[@class='is-touched is-dirty av-valid form-control'])[2]")
    public WebElement validformkontrol;

    //Item/Titles--->Physician---->doktor edit button
    @FindBy(xpath="//*[@id=\"app-view-container\"]/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[18]/div/a[2]")
    public WebElement doktoredit;

    //Item/Titles--->Physician---->doktor delete button
    @FindBy(xpath="//a[@href='/physician/3652/delete?page=1&sort=id,asc']")
    public WebElement doktordelete;

    //Item/Titles--->Physician---->doktor delete button delete
    @FindBy(xpath="//button[@id='jhi-confirm-delete-physician']")
    public WebElement doktordeletedelete;


    //Item/Titles--->Physician---->doktor delete button--->alert message
    @FindBy(xpath="//div[text()='Internal server error.']")
    public WebElement doktordeletealertmessage;

    //Item/Titles--->Physician---->doktor wiev button
    @FindBy(xpath="//*[@id=\"app-view-container\"]/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[18]/div/a[1]")
    public WebElement doktorwiev;

    //Item/Titles--->Physician---->doktor wiev button-->Edit button
    @FindBy(xpath="//a[@class='btn btn-primary']")
    public WebElement doktorwieveditbutton;

    //Item/Titles--->Physician---->doktor bilgileri
    @FindBy(xpath="//div[@class='form-group']")
    public List<WebElement> doktorbilgileri;

    //Item/Titles--->Physician---->doktor edit button---->First name
    @FindBy(xpath="//input[@value='Doctorpp']")
    public WebElement doktoreditbuttonfirstname;

    @FindBy(xpath = "//select[@name='speciality']")
    public WebElement doktorspeciality;

    @FindBy(xpath = "//input[@name='examFee']")
    public WebElement doktorexamFee;

    //Item/Titles--->Physician---->doktor edit button---->gender
    @FindBy(xpath="//select[@name='gender']")
    public WebElement doktoreditbuttongender;
    //------------------- Mehmet Emin--------------------------
    //- US16_RoomCreateEditDeleteByAdminPage

    @FindBy(xpath ="(//a[@href='/room'])[2]" )
    public WebElement roomCta;

    @FindBy(xpath = "//*[text()='Create a new Room']")
    public WebElement createANewRoom;

    @FindBy(xpath = "//select[@id='room-roomType']")
    public WebElement roomTypeDropDown;

    @FindBy(xpath ="//input[@id='room-status']" )
    public WebElement statusCheck;

    @FindBy(xpath = "//input[@id='room-description']")
    public WebElement descriptionField;

    @FindBy(xpath = "//input[@id='room-createdDate']")
    public WebElement createdDate;

    @FindBy(xpath = "//span[text()='Save']")
    public WebElement saveButton;

    @FindBy(xpath = "(//*[text()='This field is required.'])[1]")
    public WebElement fieldRequiredRoom;

    @FindBy(xpath ="(//*[text()='This field is required.'])[2]" )
    public WebElement fieldRequiredPrice;

    @FindBy(xpath = "//input[@name='roomNumber']")
    public WebElement roomNumberTextBox;

    @FindBy(xpath = "//input[@id='room-price']")
    public WebElement priceTextBox;

    @FindBy(xpath = "//*[contains(text(), 'A new Room is created')]")
    public WebElement roomCreateSuccessMessage;

    @FindBy(xpath = "(//a[@class='page-link'])[9]")
    public WebElement lastPageArrow;

    @FindBy(xpath = "(//span[text()='Edit'])[last()]")
    public WebElement editButton;

    @FindBy(xpath = "(//span[text()='Delete'])[last()]")
    public WebElement deleteButton;

    @FindBy(xpath = "//button[@id='jhi-confirm-delete-room']")
    public WebElement confirmDelete;

    @FindBy(xpath ="//*[contains(text(), 'deleted')]" )
    public WebElement roomDeleteSuccessMessage;
    //--Mehmet Emin- US17_===============================================

    //Item/Titles
    @FindBy(xpath="//span[normalize-space()='Items&Titles']")
    public WebElement itemsTitles1;

    //Item/Titles--->testItem
    @FindBy(xpath="(//li[@id='entity-menu'])[1]")
    public WebElement itemsTitles;

    @FindBy(xpath = "(//a[@role='menuitem'])[5]")
    public WebElement testItem;

    @FindBy(xpath = "//a[@id='jh-create-entity']")
    public WebElement CreateTestItem;
    //a[class='dropdown-item active'] span

    @FindBy(xpath = "//input[@id='c-test-item-name']")
    public WebElement testNameBox;

    @FindBy(xpath = "//input[@id='c-test-item-description']")
    public WebElement description;

    @FindBy(xpath = "//input[@id='c-test-item-price']")
    public WebElement price;

    @FindBy(xpath = "//input[@id='c-test-item-defaultValMin']")
    public WebElement minValue;

    @FindBy(xpath = "//input[@id='c-test-item-defaultValMax']")
    public WebElement maxValue;

    @FindBy(xpath = "//input[@id='c-test-item-createdDate']")
    public WebElement createDate;

    @FindBy(id = "save-entity")
    public WebElement saveButton1;

    @FindBy(xpath = "//div[@id='app-view-container']")
    public WebElement savingSuccessMessage;

    @FindBy(xpath = "//div[@class='jh-card card']//li[7]")
    public WebElement arrowLastItem;

    @FindBy(xpath = "(//li[@class='page-item'])[5]")
    public WebElement lastFigureItem;

    @FindBy(xpath = "(//span[@class='d-none d-md-inline'])[45]")
    public WebElement deleteTestItem;

    @FindBy(xpath = "//button[@id='jhi-confirm-delete-cTestItem']")
    public WebElement confirmDeleteButton;

    @FindBy(xpath = "(//span[contains(text(),'Delete')])[17]")
    public WebElement deleteSuccessMessage;



}