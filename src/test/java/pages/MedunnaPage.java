package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class MedunnaPage {

    public MedunnaPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    //-------------------US001-US002 Kubra--------------------------

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
    public WebElement YourEmailIsRequiredToBeAtLeastFiveCharactersYazısı;

    //-----------------US05-Sezen------------------------------

    //Medunna>MainPage>Kullanıcı ikonu>Sign in Linki
    @FindBy(xpath = "//span[text()='Sign in']")
    public WebElement signInLinki;
    //Medunna>MainPage>Make an Appointment butonu
    @FindBy(xpath = "//a[@class='appointment-btn scrollto']")
    public WebElement makeAnAppointmentButonu;
    //Medunna>MainPage>Make an Appointment/FirstName TextBox
    @FindBy(xpath = "//input[@name='firstName']']")
    public WebElement makeAnAppointmentFirstNameTextBox;
    //Medunna>MainPage>Make an Appointment/FirstName Uyari Yazisi
    @FindBy(xpath = "//div[text()='Your FirstName is required.']")
    public WebElement makeAnAppointmentFirstNameUyariYazisi;
    //Medunna>MainPage>Make an Appointment/LastName TextBox
    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement makeAnAppointmentLastNameTextBox;
    //Medunna>MainPage>Make an Appointment/LastName Uyari Yazisi
    @FindBy(xpath = "//div[text()='Your LastName is required.']")
    public WebElement makeAnAppointmentLastNameUyariYazisi;
    //Medunna>MainPage>Make an Appointment/SSN TextBox
    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement makeAnAppointmentSSNTextBox;
    //Medunna>MainPage>Make an Appointment/SSN Uyari Yazisi
    @FindBy(xpath = "//div[text()='Your SSN is required.']")
    public WebElement makeAnAppointmentSSNUyariYazisi;
    //Medunna>MainPage>Make an Appointment/Email TextBox
    @FindBy(xpath = "//input[@name='email']")
    public WebElement makeAnAppointmentEmailTextBox;
    //Medunna>MainPage>Make an Appointment/Email Uyari Yazisi
    @FindBy(xpath = "//div[text()='Your email is required.']")
    public WebElement makeAnAppointmentEmailUyariYazisi;
    //Medunna>MainPage>Make an Appointment/Phone TextBox
    @FindBy(xpath = "//input[@name='phone']")
    public WebElement makeAnAppointmentPhoneTextBox;
    //Medunna>MainPage>Make an Appointment/Phone Uyari Yazisi
    @FindBy(xpath = "//div[text()='Phone number is required.']")
    public WebElement makeAnAppointmentPhoneUyariYazisi;
    //Medunna>MainPage>Make an Appointment/Date TextBox
    @FindBy(xpath = "//input[@name='appoDate']")
    public WebElement makeAnAppointmentAppointmentDateTextBox;
    //Medunna>MainPage>Make an Appointment/Date Uyari Yazisi
    @FindBy(xpath = "//span[text()='Appointment date can not be past date!']")
    public WebElement makeAnAppointmentAppointmentDateUyariYazisi;
    //Medunna>MainPage>Send an Appointment Request butonu
    @FindBy(xpath = "//button[@id='register-submit']")
    public WebElement SendAnAppointmentRequestButton;
    //Medunna>MainPage>Footer bolumu/Useful Links/Make an Appointment Linki
    @FindBy(xpath = "//a[text()='Make an appointment']")
    public WebElement makeAnAppointmentLinkiFooter;
    //Medunna>MainPage>Kullanici Ikonu>Sign In linki/ Username text box
    @FindBy(xpath = "//input[@name='username']")
    public WebElement signInUsernameTextBox;
    //Medunna>MainPage>Kullanici Ikonu>Sign In linki/ Username Uyari Yazisi
    @FindBy(xpath = "//div[text()='Username cannot be empty!']")
    public WebElement signInUsernameUyariYazisi;
    //Medunna>MainPage>Kullanici Ikonu>Sign In linki/ Password text box
    @FindBy(xpath = "//input[@name='password']")
    public WebElement signInPasswordTextBox;
    //Medunna>MainPage>Kullanici Ikonu>Sign In linki/ Password Uyari Yazisi
    @FindBy(xpath = "//div[text()='Password cannot be empty!']")
    public WebElement signInPasswordUyariYazisi;
    //Medunna>MainPage>Kullanici Ikonu>Sign In linki/Sign In butonu
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButonu;
    //Medunna>MainPage>Kullanici ikonu>Sign In>Hasta olarak giris yapildi/My Pages (Patient) Dropdownu
    @FindBy(xpath = "//span[text()='MY PAGES(PATIENT)']")
    public WebElement myPagesPatientDropdown;
    //Medunna>MainPage>Kullanici ikonu>Sign In>Hasta olarak giris yapildi/My Pages (Patient) Dropdownu/My Appointments linki
    @FindBy(xpath = "//span[text()='My Appointments']")
    public WebElement myAppointmentsLinki;
    //Medunna>MainPage>Kullanici ikonu>Sign In>Hasta olarak giris yapildi/My Pages (Patient) Dropdownu/Make an Appointment linki
    @FindBy(xpath = "//span[text()='Make an Appointment']")
    public WebElement makeAnAppointmentLinki;
    //Medunna>MainPage>Kullanici ikonu>Sign In>Hasta olarak giris yapildi/My Pages (Patient) Dropdownu/My Appointments/From Date Text Box
    @FindBy(xpath = "//input[@name='fromDate']")
    public WebElement myAppointmentsFromDateTextBox;
    //Medunna>MainPage>Kullanici ikonu>Sign In>Hasta olarak giris yapildi/My Pages (Patient) Dropdownu/My Appointments/To Date Text Box
    @FindBy(xpath = "//input[@name='toDate']")
    public WebElement myAppointmentsToDateTextBox;
    //Medunna>MainPage>Kullanici ikonu>Sign In>Hasta olarak giris yapildi/My Pages (Patient) Dropdownu/My Appointments/No Appointments Found Yazisi
    @FindBy(xpath = "//span[text()='No Appointments found']")
    public WebElement NoAppointmentsFoundYazisi;

//-------------------US09 Zeynep--------------------------

    // Staff --> MY PAGES menüsü
    @FindBy(xpath = "//li[7]")
    public WebElement myPagesMenu;
    // Staff --> MY PAGES menüsü --> Search Patient item
    @FindBy(xpath = "//li[7]//div[1]//a[1]//span[1]")
    public WebElement searchPatientItem;
    //  Staff --> MY PAGES menüsü --> In Patient item
    @FindBy(xpath = "//li[7]//div[1]//a[2]//span[1]")
    public WebElement inPatientItem;
    // Staff --> Search Patient item --> patientSSN textbox
    @FindBy(xpath = "//input[@name='ssn']")
    public WebElement patientSSN;
    // Admin --> Items&Titles menüsü
    @FindBy(xpath = "//nav//div//ul//li[7]")
    public WebElement itemsTitlesMenu;
    // Admin --> Items&Titles menüsü --> Patient item
    @FindBy(xpath = "(//div//a[@class='dropdown-item'])[1]")
    public WebElement patientItem;
    // Admin --> Items&Titles menüsü --> Patient item --> Create a new Patient
    @FindBy(xpath = "//a[@class='btn btn-primary float-right jh-create-entity']")
    public WebElement createNewPatient;
    //----------------------------------------//
    // Search Patient --> View
    // Staff --> Search Patient --> View Button --> Edit Button
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement editButtonView;
    // Staff --> Patients --> View Button --> Back Button
    @FindBy(xpath = "//a[@class='btn btn-info']")
    public WebElement backButtonView;
    //----------------------------------------//
    // Search Patient --> Edit -->
    // Staff --> Create or edit a Patient --> First Name Textbox
    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstNameEditTextBox;
    // Staff --> Create or edit a Patient --> Last Name Textbox
    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lastNameEditTextbox;
    // Staff --> Create or edit a Patient --> Birth Date Dropbox
    @FindBy(xpath = "//input[@name='birthDate']")
    public WebElement birthDateDropbox;
    // Staff --> Create or edit a Patient --> Email Textbox
    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailTextbox;
    // Staff --> Create or edit a Patient --> Phone Textbox
    @FindBy(xpath = "//input[@name='phone']")
    public WebElement phoneTextbox;
    // Staff --> Create or edit a Patient --> Gender Textbox
    @FindBy(xpath = "//select[@name='gender']")
    public WebElement genderSelect;
    // Staff --> Create or edit a Patient --> Blood Group Dropbox
    @FindBy(xpath = "//select[@name='bloodGroup']")
    public WebElement bloodGroupSelect;
    // Staff --> Create or edit a Patient --> Address Textbox
    @FindBy(xpath = "//input[@name='adress']")
    public WebElement adressTextBox;
    // Staff --> Create or edit a Patient --> Description Textbox
    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement descriptionTextBox;
    // Staff --> Create or edit a Patient --> User Dropbox
    @FindBy(xpath = "//select[@name='user.id']")
    public WebElement userSelect;
    // Staff --> Create or edit a Patient --> Country Dropbox
    @FindBy(xpath = "//select[@name='country.id']")
    public WebElement countrySelect;
    // Staff --> Create or edit a Patient --> State/City Dropbox
    @FindBy(xpath = "//select[@name='cstate.id']")
    public WebElement stateCitySelect;
    // Staff --> Search Patient item --> Edit Button --> Create or edit a Patient --> Save Button
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButtonEditPatientForm;
    // Staff --> Search Patient item --> Edit Button --> Create or edit a Patient --> Back Button
    @FindBy(xpath = "//a[@id='cancel-save']")
    public WebElement backButtonEditPatientForm;
    //----------------------------------------//
// Search Patient --> Show Appointments
// Staff --> Search Patient --> Appointments --> Edit --> Start DateTime
    @FindBy(xpath = "//input[@name='startDate']")
    public WebElement startDateTimeDropBox;
    // Staff --> Search Patient --> Appointments --> Edit --> End DateTime
    @FindBy(xpath = "//input[@name='endDate']")
    public WebElement endDateTimeDropBox;
    // Staff --> Search Patient --> Appointments --> Edit --> Status
    @FindBy(xpath = "//select[@name='status']")
    public WebElement statusSelect;
    // Staff --> Search Patient --> Appointments --> Edit --> Anamnesis
    @FindBy(xpath = "//textarea[@name='anamnesis']")
    public WebElement anamnesisTextBox;
    // Staff --> Search Patient --> Appointments --> Edit --> Treatment
    @FindBy(xpath = "//textarea[@name='treatment']")
    public WebElement treatmentTextBox;
    // Staff --> Search Patient --> Appointments --> Edit --> Diagnosis
    @FindBy(xpath = "//textarea[@name='diagnosis']")
    public WebElement diagnosisTextBox;
    // Staff --> Search Patient --> Appointments --> Edit --> Prescription
    @FindBy(xpath = "//textarea[@name='prescription']")
    public WebElement prescriptionTextBox;
    // Staff --> Search Patient --> Appointments --> Edit --> Description
    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement descriptionAppointmentTextBox;
    // Staff --> Search Patient --> Appointments --> Edit --> Physician
    @FindBy(xpath = "//select[@name='physician.id']")
    public WebElement physicianSelect;
    // Staff --> Search Patient --> Appointments --> Edit --> Save Button
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButtonAppointment;
    // Staff --> Search Patient --> Appointments --> Edit --> Back Button
    @FindBy(xpath = "//a[@id='cancel-save']")
    public WebElement backButtonAppointment;
    //----------------------------------------//
// In Patient --> In Patients --> from
    @FindBy(xpath = "//input[@name='fromDate']")
    public WebElement fromDateAppointment;
    // In Patient --> In Patients --> to
    @FindBy(xpath = "//input[@name='toDate']")
    public WebElement toDateAppointment;
    // In Patient --> In Patients --> Edit --> Create or edit a In Patient --> Start Date
    @FindBy(xpath = "//input[@name='startDate']")
    public WebElement startDateAppointmentTextBox;
    // In Patient --> In Patients --> Edit --> Create or edit a In Patient --> End Date
    @FindBy(xpath = "//input[@name='endDate']")
    public WebElement endDateAppointmentTextBox;
    // In Patient --> In Patients --> Edit --> Create or edit a In Patient --> Description
    @FindBy(xpath = "//input[@name='description']")
    public WebElement descriptionAppointmentInPatientTextBox;
    // In Patient --> In Patients --> Edit --> Create or edit a In Patient --> Created Date
    @FindBy(xpath = "//input[@name='createdDate']")
    public WebElement createdDateAppointmentTextBox;
    // In Patient --> In Patients --> Edit --> Create or edit a In Patient --> Status
    @FindBy(xpath = "//select[@name='status']")
    public WebElement statusAppointmentSelect;
    // In Patient --> In Patients --> Edit --> Create or edit a In Patient --> Room
    @FindBy(xpath = "//select[@name='room.id']")
    public WebElement roomSelect;
    // In Patient --> In Patients --> Edit --> Create or edit a In Patient --> Save
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveAppointmentButton;
    // In Patient --> In Patients --> Edit --> Create or edit a In Patient --> Back
    @FindBy(xpath = "//a[@id='cancel-save']")
    public WebElement backAppointmentButton;

    //--------------US010 Mehmet Emin Araz--------------------

    //Medunna>login Admin olarak/username
    @FindBy(xpath = "//*[@id='username']")
    public WebElement username;
    //Medunna>MainPage>login/password
    @FindBy(xpath = "//*[@id='password']")
    public WebElement password;
    //Medunna>MainPage>login/rememberMe
    @FindBy(id = "rememberMe")
    public WebElement rememberMe;
    //Medunna>MainPage>login/singInButton
    @FindBy(xpath = "//*[@type='submit']")
    public WebElement singInButton;
    //Medunna>MainPage>Admin olarak> items&titileDropdown
    @FindBy(xpath = "//*[span='Items&Titles']" )
    public WebElement itemsTitlesDropdown;
    //Medunna>MainPage>Admin olarak> items&titileDropdown/Appointment
    @FindBy(xpath = "//*[span='Appointment']" )
    public WebElement adminAppointment;
    //Medunna>MainPage>Admin olarak>Appointment/Create a new Appointment
    @FindBy (xpath = "(//*[.='Create a new Appointment']) [1]")
    public WebElement createANewAppointment;
    //Medunna>MainPage>Admin olarak>Appointment/Create a new Appointment/startDate
    @FindBy(xpath = "//*[@id='appointment-startDate']")
    public WebElement startDateTime;
    //Medunna>MainPage>Admin olarak>Appointment/Create a new Appointment/endDate
    @FindBy(xpath = "//*[@id='appointment-endDate']")
    public WebElement endDateTime;
    //Medunna>MainPage>Admin olarak>Appointment/Create a new Appointment/status
    @FindBy(xpath = "//*[@id='appointment-status']")
    public WebElement status;
    //Medunna>MainPage>Admin olarak>Appointment/Create a new Appointment/anamnesis
    @FindBy(xpath = "//*[@id='appointment-anamnesis']")
    public WebElement anamnesis;
    //Medunna>MainPage>Admin olarak>Appointment/Create a new Appointment/treatment
    @FindBy(xpath = "//*[@id='appointment-treatment']")
    public WebElement treatment;
    //Medunna>MainPage>Admin olarak>Appointment/Create a new Appointment/diagnosis
    @FindBy(xpath = "//*[@id='appointment-diagnosis']")
    public WebElement diagnosis;
    //Medunna>MainPage>Admin olarak>Appointment/Create a new Appointment/prescription
    @FindBy(xpath = "//*[@id='appointment-prescription']")
    public WebElement prescription;
    //Medunna>MainPage>Admin olarak>Appointment/Create a new Appointment/description
    @FindBy(xpath = "//*[@id='appointment-description']")
    public WebElement description;
    //Medunna>MainPage>Admin olarak>Appointment/Create a new Appointment/physician
    @FindBy(xpath = "//*[@id='appointment-physician']")
    public WebElement physician;
    //Medunna>MainPage>Admin olarak>Appointment/Create a new Appointment/patient
    @FindBy(xpath = "//*[@id='appointment-patient']")
    public WebElement patient;
    //Medunna>MainPage>Admin olarak>Appointment/Create a new Appointment/save
    @FindBy(xpath = "//*[@id='save-entity']")
    public WebElement saveEntity;


    //Medunna>MainPage>MY PAGES ikonu
    @FindBy(xpath =" (//a[span])[8]")
    public WebElement myAccountDropdownText;
    @FindBy(xpath = "//*[span='MY PAGES']" )
    public WebElement myPagesDropdown;

    //========PATIENT=======
    //Medunna>MainPage>PATIENT/MY PAGES(PATIENT)
    @FindBy(xpath = "//*[span='MY PAGES(PATIENT)']" )
    public WebElement patientMyPagesDropdown;
    //Medunna>MainPage>PATIENT/MY PAGES(PATIENT)Dropdown/My Appointments
    @FindBy(xpath = "//*[span='My Appointments']" )
    public WebElement myAppointment;

    //Medunna>MainPage> items&titileDropdown/Appointment/Appointments
    @FindBy(id="appointment-heading")
    public WebElement appointmentHeading;



    //--------------US08---Mustafa----------------------------------

    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement homePageKullaniciIkonu;
    @FindBy(xpath = "(//a[@class='dropdown-item'])[1]")
    public WebElement homePageSignInLinki;
    @FindBy(xpath = "//input[@name='username']")
    public WebElement homePageUsernameBox;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement homePagePasswordBox;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement homePageSignInButton;
    @FindBy(xpath = "(//a[@class='dropdown-item'])[5]")
    public WebElement kullaniciIkonuMenusuAltindakiPasswordYazisi;
    @FindBy(xpath = "//input[@name='currentPassword']")
    public WebElement passwordDegisikligiIcinGecerliPasswordBox;
    @FindBy(xpath = "//input[@name='newPassword']")
    public WebElement passwordDegisikligiIcinYeniPasswordbox;
    @FindBy(xpath = "//input[@name='confirmPassword']")
    public WebElement passwordDegisikligiIcinYeniPasswordConfirmBox;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement passwordDegisikligiIcinSaveButonu;

    //-------------------US12 - US013- Salih------------------------

    //mainPage/MedunnaLogo
    @FindBy(xpath = "//img[@src='content/images/logo.png']")
    public WebElement medunnaLogoElementi;

    //mainPage > signIn ikonu altindaki SignIn linki butonu
    @FindBy(xpath = "//a[@id='login-item']")
    public WebElement signInLinkiElementi;
    //mainPage > SignIn/usernameBox
    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameBoxElementi;
    //mainPage > SignIn/passwordBox
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordBoxElementi;
    ;
    //mainPage > signIn/SignIn butonu
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement girisSignInButtonElementi;
    //*******
    //mainPage> Siteye giris yapan Kullanicinin Username'i
    @FindBy(xpath = "//a[span='Prof.Dr.Salih Kaya']")
    public WebElement siteyeGirisYapanUsernameElementi;
    // mainPage> MY PAGES
    @FindBy(xpath = "//a[span='MY PAGES']")
    public WebElement myPagesDropdownElementi;
    //*******
    //mainPage>myPages>myAppointments/Edit Butonu
    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm'])[1]")
    public WebElement hastaEditButonuElementi;
    //mainPage>myPages>myAppointments>EditButton>Request a Test butonu
    @FindBy(xpath = "//a[text()='Request A Test']")
    public WebElement requestATestButonElementi;
    //mainPage>myPages>myAppointments>EditButton>RequestATest Butonu> Test Isimleri
    @FindBy(xpath = "//tr//td[2]")
    public List<String> testIsimleriElementi;
    //mainPage>myPages>myAppointments>EditButton>RequestATest Butonu> Test CheckBox'lari
    @FindBy(xpath = "//input[@id='1402']")
    public WebElement testCheckBoxElementi;
    //mainPage>myPages>myAppointments>EditButton>RequestATest Butonu> Test Id'leri
    @FindBy(xpath = "//a[@class='btn btn-link btn-sm']")
    public WebElement testIDElementleri;
    //mainPage>myPages>myAppointments>EditButton>RequestATest Butonu> Testleri Kayit etmek icin kullanilan Save butonu
    @FindBy(xpath = "//button[@id='save-entity']")
    public WebElement testSaveButonElementi;
    //mainPage>myPages>myAppointments>EditButton>RequestATest Butonu> Save butonu > testlerin save edildigiini gosteren uyari yazisi
    @FindBy(xpath = "//div[@style='pointer-events: none;']")
    public WebElement saveSonrasiUyarielementi;
    //mainPage>myPages>myAppointments>EditButton>Show Test Result butonu
    @FindBy(xpath = "//a[@href='/tests/appointment/47285']")
    public WebElement showTestResultElementi;
    //mainPage>myPages>myAppointments>EditButton>ShowTestResult>View Details butonu
    @FindBy(xpath = "(//a[@class='btn btn-info btn-sm'])[1]")
    public WebElement showTestResultViewDetailsElementi;
    //mainPage>myPages>myAppointments>EditButton>ShowTestResult>ViewDetails>Test Body
    @FindBy(xpath = "(//tbody//tr)[1]")
    public WebElement testBodyElementi;
    //mainPage>MyPages/My Appointments
    @FindBy(xpath = "//span[text()='My Appointments']")
    public WebElement myAppointmentsElementi;

    //-------------------US014 Locaten Onur--------------------------

      // Main Page>Kullanici iconu
    @FindBy(xpath = "//li[@id='account-menu']")
    public WebElement userIcon;

    // Main Page>Kullanici iconu>Sign In
    @FindBy(xpath = "(//a[@role='menuitem'])[1]")
    public WebElement signId;

    // Main Page>Kullanici iconu>Sign In>User Name
    @FindBy(xpath = "//input[@name='username']")
    public WebElement userName;

    // Main Page>Kullanici iconu>Sign In>User Name
    @FindBy(xpath = "//input[@name='password']")
    public WebElement passWord;

    // Doctor Page>My pages
    @FindBy(xpath = "//li[@id='entity-menu']")
    public WebElement mayPages;

    // Doctor Page>My pages>My Inpatients
    @FindBy(xpath = "(//a[@role='menuitem'])[3]")
    public WebElement myInpatients;

    // Doctor Page>My pages>My Inpatients>Id (For dongu ile digerlerine ulas)
    @FindBy(xpath = "//tbody//tr[2]//td[1]")
    public WebElement inpatientId;

    // Doctor Page>My pages>My Inpatients>Edit Button
    @FindBy(xpath = "(//div[@class='btn-group flex-btn-group-container'])[2]")
    public WebElement editButton;

    // Doctor Page>My pages>My Inpatients>Edit Button>id Textbox
    @FindBy(xpath = "//input[@name='id']")
    public WebElement idTextbox;

    // Doctor Page>My pages>My Inpatients>Edit Button>start Date Textbox
    @FindBy(xpath = "//input[@name='startDate']")
    public WebElement startDateTextbox;

    // Doctor Page>My pages>My Inpatients>Edit Button>end Date Textbox
    @FindBy(xpath = "//input[@name='endDate']")
    public WebElement endDateTextbox;

    // Doctor Page>My pages>My Inpatients>Edit Button>description Textbox
    @FindBy(xpath = "//input[@name='description']")
    public WebElement descriptionTextbox;

    // Doctor Page>My pages>My Inpatients>Edit Button>createdDate Textbox
    @FindBy(xpath = "//input[@name='createdDate']")
    public WebElement createdDateTextbox;

    // Doctor Page>My pages>My Inpatients>Edit Button>appointment Textbox
    @FindBy(xpath = "//select[@id='in-patient-appointment']")
    public WebElement appointmentTextbox;

    // Doctor Page>My pages>My Inpatients>Edit Button>status Textbox
    @FindBy(xpath = "//select[@id='in-patient-status']")
    public WebElement statusTextbox;

    // Doctor Page>My pages>My Inpatients>Edit Button>room Textbox
    @FindBy(xpath = "//select[@id='in-patient-room']")
    public WebElement roomTextbox;

    // Doctor Page>My pages>My Inpatients>Edit Button>patient Textbox
    @FindBy(xpath = "//select[@id='in-patient-patient']")
    public WebElement patientTextbox;

    // Doctor Page>My pages>My Inpatients>Edit Button>save Button
    @FindBy(xpath = "//button[@id='save-entity']")
    public WebElement saveButton;
}