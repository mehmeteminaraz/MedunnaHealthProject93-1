package stepdefinitions.UIStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import utilities.ConfigurationReader;
import utilities.Driver;
import pages.MedunnaPage;

import java.util.ArrayList;
import java.util.List;

public class RegistrationStepDefinition {
    MedunnaPage MedunnaPage=new MedunnaPage();
    MedunnaPage mp=new MedunnaPage();
    Faker faker;
    Actions actions;
    SoftAssert softAssert = new SoftAssert();
    String doktorName;
    // ------------------------- KÜBRA -----------------------------------
    @Given("Kullanici siteye gider {string}")
    public void kullaniciSiteyeGider(String medunnaUrl) {
        Driver.getDriver().get(ConfigurationReader.getProperty(medunnaUrl));
    }
    @When("Sayfaya gidildigi ana sayfadaki WELCOME TO MEDUNNA texti ile dogrulanir")
    public void sayfaya_gidildigi_ana_sayfadaki_welcome_to_medunna_texti_ile_dogrulanir() {
        Assert.assertTrue(mp.anaSayfaWelcomeToMedunnaYazisi.isDisplayed());
    }
    @When("Kullanici sayfaya giris icin CONTACT linkinin sagında bulunan kullanici girisi linkine tiklar")
    public void kullanici_sayfaya_giris_icin_contact_linkinin_saginda_bulunan_kullanici_girisi_linkine_tiklar() {
        mp.anaSayfaKullaniciIkonu.click();
    }
    @Then("Kullanici kayıt olusturabilmek icin Register linkine tiklar")
    public void kullanici_kayit_olusturabilmek_icin_register_linkine_tiklar() {
        mp.registerLinki.click();
    }
    @Then("Kayit sayfasinda olundugu Registration yazisi ile dogrulanir")
    public void kayit_sayfasinda_olundugu_registration_yazisi_ile_dogrulanir() {
        Assert.assertTrue(mp.registerYazisi.isDisplayed());
    }
    @Then("Girilecek olan {string} numarasi dokuzu gecmemeli ve dokuzun altinda olmamali")
    public void girilecek_olan_numarasi_dokuzu_gecmemeli_ve_dokuzun_altinda_olmamali(String ssn) {
        mp.ssnTextBox.click();
        mp.ssnTextBox.sendKeys(ssn, Keys.ENTER);
    }
    @Then("Kullanici SSN numarasinin ucuncu ve besinci rakamından sonra - isareti {string} koymali")
    public void kullaniciSSNNumarasininUcuncuVeBesinciRakamindanSonraIsaretiKoymali(String tireliSSN) {
        mp.ssnTextBox.clear();
        mp.ssnTextBox.sendKeys(tireliSSN,Keys.ENTER);
    }
    @Then("Gecersiz SSN numarasi girildiginde Your SSN is invalid text'inin gorunurlugu test edilmeli")
    public void gecersiz_ssn_numarasi_girildiginde_your_ssn_is_invalid_text_inin_gorunurlugu_test_edilmeli() {
        Assert.assertTrue(mp.yourSsnIsInvalidYazisi.isDisplayed());
    }
    @And("SSN textboxi bos birakildiginda Your SSN is required textinin gorunurlugu test edilmeli")
    public void ssnTextboxiBosBirakildigindaYourSSNIsRequiredTextininGorunurluguTestEdilmeli() {
        mp.ssnTextBox.click();
        mp.firstnameTextBox.click();
        Assert.assertTrue(mp.yourSsnIsRequiredYazisi.isDisplayed());
    }
    @Then("Kullanici gecerli bir ssn numarasi girmeli")
    public void kullaniciGecerliBirSsnNumarasiGirmeli() {
        mp.ssnTextBox.click();
        mp.ssnTextBox.sendKeys(faker.idNumber().ssnValid(),Keys.ENTER);
    }
    @Then("Firstname textboxı bos birakildiginda cikan Your FirstName is required textinin gorunurlugu test edilmeli")
    public void firstnameTextboxiBosBirakildigindaCikanYourFirstNameIsRequiredTextininGorunurluguTestEdilmeli() {
        mp.firstnameTextBox.click();
        mp.lastnameTextBox.click();
        Assert.assertTrue(mp.yourFirstnameIsRequiredYazisi.isDisplayed());
    }
    @And("Firstname textboxina gecerli bir isim girilmeli")
    public void firstnameTextboxinaGecerliBirIsimGirilmeli() {
        mp.firstnameTextBox.click();
        mp.firstnameTextBox.sendKeys(faker.name().firstName());
    }
    @And("Lastname textboxi bos birakildiginda cikan Your LastName is required textinin gorunurlugu test edilmeli")
    public void lastnameTextboxiBosBirakildigindaCikanYourLastNameIsRequiredTextininGorunurluguTestEdilmeli() {
        mp.lastnameTextBox.click();
        mp.firstnameTextBox.click();
        Assert.assertTrue(mp.yourLastnameIsRequiredYazisi.isDisplayed());
    }
    @Then("Lastname textboxina gecerli bir soyisim girilmeli")
    public void lastnameTextboxinaGecerliBirSoyisimGirilmeli() {
        mp.lastnameTextBox.sendKeys(faker.name().lastName());
    }
    @And("Username textboxi bos birakildiginda cikan Your username is required textinin gorunurlugu test edilmeli")
    public void usernameTextboxiBosBirakildigindaCikanYourUsernameIsRequiredTextininGorunurluguTestEdilmeli() {
        mp.usernameTextBox.click();
        mp.lastnameTextBox.click();
        Assert.assertTrue(mp.yourUsernameIsRequiredYazisi.isDisplayed());
    }
    @Then("Bosluk birakilarak girilen bir username in gecersiz oldugu Your username is invalid textinin gorunurlugu ile test edilmeli")
    public void boslukBirakilarakGirilenBirUsernameInGecersizOlduguYourUsernameIsInvalidTextininGorunurluguIleTestEdilmeli() {
        mp.usernameTextBox.click();
        mp.usernameTextBox.sendKeys("QA Kubra");
        Driver.wait(2);
        Assert.assertTrue(mp.yourUsernameIsInvalidYazisi.isDisplayed());
    }
    @And("Username textboxina gecerli bir kullanici adı girilmeli")
    public void usernameTextboxinaGecerliBirKullaniciAdiGirilmeli() {
        mp.usernameTextBox.clear();
        mp.usernameTextBox.sendKeys(faker.name().username());
    }
    @Then("Email textboxina {string} @ ve . isareti icermeyen bir adres girildiginde cikan This field is invalid textin gorunurlugu test edilmeli")
    public void emailTextboxinaVeIsaretiIcermeyenBirAdresGirildigindeCikanThisFieldIsInvalidTextinGorunurluguTestEdilmeli(String isaretler) {
        mp.emailTextBox.click();
        mp.emailTextBox.sendKeys(isaretler);
        Driver.wait(2);
    }
    @And("Email textboxina bes karakterden az olucak sekilde email adresi yazildiginda cikan Your email is required to be at least five characters textin gorunurlugu test edilmeli")
    public void emailTextboxinaBesKarakterdenAzOlucakSekildeEmailAdresiYazildigindaCikanYourEmailIsRequiredToBeAtLeastFiveCharactersTextinGorunurluguTestEdilmeli() {
        mp.emailTextBox.clear();
        mp.emailTextBox.sendKeys("abc0");
        Assert.assertTrue(mp.yourEmailIsRequiredToBeAtLeastFiveCharactersYazisi.isDisplayed());
    }
    @Then("Email textboxi bos birakildiginda cikan Your email is required textinin gorunurlugu test edilmeli")
    public void emailTextboxiBosBirakildigindaCikanYourEmailIsRequiredTextininGorunurluguTestEdilmeli() {
        mp.emailTextBox.click();
        mp.usernameTextBox.click();
        Assert.assertTrue(mp.yourEmailIsRequiredYazisi.isDisplayed());
    }
    @And("Email textboxina gecerli bir adres girilmeli")
    public void emailTextboxinaGecerliBirAdresGirilmeli() {
        mp.emailTextBox.sendKeys(faker.internet().emailAddress());
    }

    //-------------US014---Onur--------------------------------------------------------------------------------
    @When("Doktor acilan menuden Sign In e tiklar")
    public void doktor_acilan_menuden_sign_in_e_tiklar() {
        mp.signInlink.click();

    }
    @When("Doktor kendi {string} ve {string} girip Sign In butonuna tiklar")
    public void doktor_kendi_ve_girip_sign_in_butonuna_tiklar(String userName, String password) {
        mp.userName.sendKeys(userName);
        mp.passWord.sendKeys(password);
        mp.signIn.click();
    }
    @Then("Doktor sag ust kosede kendi adini gorur")
    public void doktor_sag_ust_kosede_kendi_adini_gorur() {

        Assert.assertTrue(mp.recepaltinkaya.isDisplayed());
    }
    @Then("Doktor ust tarafta bulunan MY PAGES butonuna tiklar")
    public void doktor_ust_tarafta_bulunan_my_pages_butonuna_tiklar() {
        Driver.waitAndClick(mp.myPages,5);

    }
    @Then("Doktor acilan menuden My Inpatients butununa tiklar")
    public void doktor_acilan_menuden_my_inpatients_butununa_tiklar() {
        mp.myInpatients.click();
        actions=new Actions(Driver.getDriver());
        Driver.wait1(2);
        actions.sendKeys(mp.inpatientsFromTextBox,"25").sendKeys("03").sendKeys("2022").sendKeys(Keys.TAB).perform();
        Driver.wait1(10);
        actions.sendKeys("08").perform();

        Driver.wait1(3);
        // actions.sendKeys(mp.inpatientsToTextBox,"10.04.2022").perform();
        // Driver.wait1(2);
        // mp.inpatientsFromTextBox.sendKeys("25.03.2022",Keys.ENTER);
        // Driver.wait1(5);
        // mp.inpatientsToTextBox.sendKeys("10.04.2022",Keys.ENTER);

    }
    @Then("Doktor yatan hastalarin ID, start and end dates, description bilgilerini goruntuleyebilir")
    public void doktor_yatan_hastalarin_id_start_and_end_dates_description_bilgilerini_goruntuleyebilir() {

        for (int i=1;i<=4;i++){
            Driver.wait1(2);
            String dinamikxpath="//tbody//tr//td["+i+"]";

            WebElement a= Driver.getDriver().findElement(By.xpath(dinamikxpath));
            Assert.assertTrue(a.isDisplayed());
        }
    }
    @Then("Doktor yatan hastalarin created date, appointment id bilgilerini goruntuleyebilir")
    public void doktor_yatan_hastalarin_created_date_appointment_id_bilgilerini_goruntuleyebilir() {

        for (int i=5;i<=7;i++){
            Driver.wait1(2);
            String dinamikxpath="//tbody//tr//td["+i+"]";

            WebElement a= Driver.getDriver().findElement(By.xpath(dinamikxpath));
            Assert.assertTrue(a.isDisplayed());
        }
    }
    @Then("Doktor yatan hastalarin status, room and patient bilgilerini goruntuleyebilir")
    public void doktor_yatan_hastalarin_status_room_and_patient_bilgilerini_goruntuleyebilir() {

        for (int i=7;i<=9;i++){
            Driver.wait1(2);
            String dinamikxpath="//tbody//tr//td["+i+"]";

            WebElement a= Driver.getDriver().findElement(By.xpath(dinamikxpath));
            Assert.assertTrue(a.isDisplayed());
        }
    }
    @Then("Doktor yatan hasta satirinin yaninda bulunan Edit butonuna tiklar")
    public void doktor_yatan_hasta_satirinin_yaninda_bulunan_edit_butonuna_tiklar() {
        Driver.wait1(5);
        mp.editButton.click();
    }
    @Then("Doktor yatan hastalarin ID, start and end dates, description bilgilerini guncelleyebilir")
    public void doktor_yatan_hastalarin_id_start_and_end_dates_description_bilgilerini_guncelleyebilir() {

    }
    @Then("Doktor yatan hastalarin created date, appointment id bilgilerini guncelleyebilir")
    public void doktor_yatan_hastalarin_created_date_appointment_id_bilgilerini_guncelleyebilir() {

        faker = new Faker();
        String date=faker.number().digits(2002) + faker.number().digits(03) +
                faker.number().digits(01) +
                faker.number().digits(12) +
                faker.number().digits(45);
        Driver.wait1(2);
        Driver.clickWithJS(mp.createdDateTextbox);
        mp.createdDateTextbox.sendKeys(date);
        Driver.clickWithJS(mp.saveButton);
        Driver.wait1(8);
        //Assert.assertFalse(mp.inpatientCreatedDate.getText().contains(date));
        //softAssert.assertAll();
    }
    @Then("Doktor yatan hastalarin patient bilgilerini guncelleyebilir")
    public void doktor_yatan_hastalarin_patient_bilgilerini_guncelleyebilir() {

        mp.editButton1.click();
        Driver.wait1(2);
        String post="a";
        Driver.clickWithJS(mp.patientTextbox);
        Driver.wait1(2);
        // mp.patientTextbox.sendKeys(post);
        Driver.clickWithJS(mp.saveButton);
        // System.out.println("inpatient"+mp.inpatientCreatedDate.getText());
        // softAssert.assertFalse(mp.inpatientCreatedDate.getText().contains(post));

    }
    @Then("Doktor tarayiciyi kapatir")
    public void doktor_tarayiciyi_kapatir() {
        Driver.closeDriver();
    }

    @Then("Doktor acilan sayfadan Status bolumunden UNAPPOROVED'u secip kaydedebilir")
    public void doktor_acilan_sayfadan_status_bolumunden_unapporoved_u_secip_kaydedebilir() {
        // Driver.clickWithJS(mp.statusTextbox);
        Driver.wait1(2);
        Select select = new Select(mp.statusTextbox);
        select.selectByValue("UNAPPROVED");
        Driver.clickWithJS(mp.saveButton);

    }
    @Then("Doktor UNAPPOROVED kaydedildigini kontrol eder")
    public void doktor_unapporoved_kaydedildigini_kontrol_eder() {
        Driver.wait1(4);

        Assert.assertTrue(mp.inpatientstatus.getText().equals("UNAPPROVED"));

    }
    @Then("Doktor acilan sayfadan Status bolumunden STAYING secip kaydedebilir")
    public void doktor_acilan_sayfadan_status_bolumunden_staying_secip_kaydedebilir() {

        mp.editButton1.click();
        Driver.wait1(2);
        Select select1 = new Select(mp.statusTextbox);
        select1.selectByIndex(1);
        Driver.wait1(2);
        Select select2 = new Select(mp.roomTextbox);
        select2.selectByIndex(4);
        Driver.clickWithJS(mp.saveButton);
    }
    @Then("Doktor STAYING secildigini kontrol eder")
    public void doktor_staying_secildigini_kontrol_eder() {
        Driver.wait1(5);
        Assert.assertFalse(mp.inpatientstatus.getText().equals("STAYING"));

    }
    @Then("Doktor acilan sayfadan Status bolumunden DISCHARGED secip kaydedebilir")
    public void doktor_acilan_sayfadan_status_bolumunden_discharged_secip_kaydedebilir() {
        mp.editButton1.click();
        Driver.wait1(2);
        Select select1 = new Select(mp.statusTextbox);
        select1.selectByIndex(2);
        Driver.wait1(2);
        Driver.clickWithJS(mp.saveButton);
    }
    @Given("Doktor acilan sayfadan Status bolumunden CANCELLED secip kaydedebilir")
    public void doktor_acilan_sayfadan_status_bolumunden_cancelled_secip_kaydedebilir() {
        mp.editButton1.click();
        Driver.wait1(2);
        Select select1 = new Select(mp.statusTextbox);
        select1.selectByIndex(3);
        Driver.wait1(2);
        Driver.clickWithJS(mp.saveButton);
    }
    @Then("Doktor CANCELLED secildigini kontrol eder")
    public void doktor_cancelled_secildigini_kontrol_eder() {
        Driver.wait1(2);
        Assert.assertFalse(mp.inpatientstatus.getText().equals("CANCELLED"));
    }
    @Then("Doktor Room bolumunden herhangi bir oda tipi secip guncelleyebilir")
    public void doktor_room_bolumunden_herhangi_bir_oda_tipi_secip_guncelleyebilir() {

    }
    @Then("Doktor oda tipini degistirdigini kontrol edebilir")
    public void doktor_oda_tipini_degistirdigini_kontrol_edebilir() {

    }

    // ------------------------US010 Mehmet Emin Araz-------------------------------------

    @Given("kullanici {string} olarak oturum acar")
    public void kullanici_olarak_oturum_acar(String arg0) {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunnaRegistration"));
        switch (arg0){
            case "doctor":
                Driver.waitAndSendText(MedunnaPage.username,ConfigurationReader.getProperty("doctor_username"));
                Driver.waitAndSendText(MedunnaPage.password,ConfigurationReader.getProperty("doctor_password"));
                Driver.waitAndClick(MedunnaPage.singInButton);
                Driver.waitAndClick(MedunnaPage.myPagesDropdown);
                Assert.assertTrue(MedunnaPage.myAppointment.isDisplayed());
                break;
            case "admin":
                Driver.waitAndSendText(MedunnaPage.username,ConfigurationReader.getProperty("admin_username"));
                Driver.waitAndSendText(MedunnaPage.password,ConfigurationReader.getProperty("admin_password"));
                Driver.waitAndClick(MedunnaPage.singInButton);
                Driver.waitAndClick(MedunnaPage.itemsTitlesDropdown);
                Assert.assertTrue(MedunnaPage.adminAppointment.isDisplayed());
                break;
            case "patient":
                Driver.waitAndSendText(MedunnaPage.username,ConfigurationReader.getProperty("patient_username"));
                Driver.waitAndSendText(MedunnaPage.password,ConfigurationReader.getProperty("patient_password"));
                Driver.waitAndClick(MedunnaPage.singInButton);
                Driver.waitAndClick(MedunnaPage.patientMyPagesDropdown);
                Assert.assertTrue(MedunnaPage.myAppointment.isDisplayed());
                break;
            case "user":
                Driver.waitAndSendText(MedunnaPage.username,ConfigurationReader.getProperty("user_username"));
                Driver.waitAndSendText(MedunnaPage.password,ConfigurationReader.getProperty("user_password"));
                Driver.waitAndClick(MedunnaPage.singInButton);
                break;
            default:
                System.out.println("No such user found");
                break;

        }
    }

    @Given("kullanici Randevularim ogesini secer ve tiklar")
    public void kullanici_randevularim_ogesini_secer_ve_tiklar() {
        Driver.waitAndClick(MedunnaPage.myAppointment);
    }

    @When("kullanici Randevular sayfasinda oldugunu dogrular")
    public void randevular_sayfasindaki_kullanici() {
        Driver.waitForVisibility(MedunnaPage.appointmentHeading,1);
        Assert.assertTrue(MedunnaPage.appointmentHeading.isDisplayed());
    }
    @When("kullanici {string} ve {string} saglayan zaman dilimlerini secer")
    public void kullanici_ve_saglayan_zaman_dilimlerini_secer(String arg0, String arg1) {
        Driver.waitAndSendText(MedunnaPage.fromDateAppointment, arg0);
        Driver.waitAndSendText(MedunnaPage.toDateAppointment, arg1);
        Driver.wait(1);
        try {
            System.out.println(Driver.waitAndGetText(MedunnaPage.alertMessage,1));
        } catch (Exception e) {
        }

    }
    @Then("kullanici randevularin ve zaman araliklarinin listesini gormelidir")
    public void kullanici_randevularin_ve_zaman_araliklarinin_listesini_gormelidir() {
        Driver.waitAndClick(MedunnaPage.editFirstAppointment);
    }
    @Then("kullanici randevu listesinin bilgilerini gormelidir")
    public void kullanici_randevu_listesinin_bilgilerini_gormelidir() {
        Assert.assertTrue(Driver.waitForVisibility(MedunnaPage.headersOfAppointmentsTable,1).
                getText().contains("ID"));
        Assert.assertTrue(Driver.waitForVisibility(MedunnaPage.headersOfAppointmentsTable,1).
                getText().contains("Start DateTime"));
        Assert.assertTrue(Driver.waitForVisibility(MedunnaPage.headersOfAppointmentsTable,1).
                getText().contains("End DateTime"));
        Assert.assertTrue(Driver.waitForVisibility(MedunnaPage.headersOfAppointmentsTable,1).
                getText().contains("Status"));

    }



    @Given("kullanici {string},{string} yonetici olarak oturum acar")
    public void kullanici_yonetici_olarak_oturum_acar(String username, String password) {
        Driver.waitAndSendText(MedunnaPage.signInUsernameTextBox,username);
        Driver.waitAndSendText(MedunnaPage.signInPasswordTextBox,password);
        Driver.waitAndClick(MedunnaPage.signInButonu);
    }

    @Given("kullanici randevu sayfasina gider")
    public void kullanici_randevu_sayfasina_gider() {
        Driver.waitAndClick(MedunnaPage.itemsTitlesDropdown);
        Driver.waitAndClick(MedunnaPage.adminAppointment);

    }

    @Given("kullanici yeni bir Randevu Olustur dugmesini tiklar")
    public void kullanici_yeni_bir_randevu_olustur_dugesini_tiklar() {
        Driver.waitAndClick(MedunnaPage.createANewAppointment);
    }

    @Given("kullanici baslangic tarihi ve bitis tarihi saatini saglar")
    public void kullanici_baslangic_tarihi_ve_bitis_tarihi_saatini_saglar() {
        Driver.waitAndSendText(MedunnaPage.startDateTime,"26-07-2022 09:15");
        Driver.waitAndSendText(MedunnaPage.endDateTime,"29-07-2022 11:30");
    }

    @Given("kullanici {string} durumunu secer")
    public void kullanici_durumunu_secer(String string) {
        Driver.waitAndClick(MedunnaPage.status);
        Driver.waitAndClick(MedunnaPage.pendingAnAppointment);


    }

    @Given("kullanici HastalikGecmisi {string} ,Tedavi  {string} ,Teshis {string} ,Recete {string} ,Aciklama {string} saglar")
    public void kullanici_hastalik_gecmisi_tedavi_teshis_recete_aciklama_saglar(String hastalikGecmisi, String tedavi, String teshis, String recete, String aciklama) {
        Driver.waitAndSendText(MedunnaPage.anamnesis, hastalikGecmisi);
        Driver.waitAndSendText(MedunnaPage.treatment, tedavi);
        Driver.waitAndSendText(MedunnaPage.diagnosis, teshis);
        Driver.waitAndSendText(MedunnaPage.prescription, recete);
        Driver.waitAndSendText(MedunnaPage.description, aciklama);
    }

    @Given("kullanici ,Doktor {string}, Hasta {string} secer")
    public void kullanici_doktor_hasta_secer(String doktor, String hasta) {
        Driver.selectByValue(MedunnaPage.physician,doktor);
        Driver.selectByValue(MedunnaPage.patient,hasta);

    }

    @When("kullanici kaydet dugmesine tiklar")
    public void kullanici_kaydet_dugmesine_tiklar() {
        Driver.waitAndClick(MedunnaPage.saveEntity);
    }

    @Then("kullanici basarı mesajini dogrular")
    public void kullanici_basari_mesajini_dogrular() {
        Assert.assertTrue( Driver.waitForVisibility(MedunnaPage.successMessageT,5).isDisplayed());

    }
    //------------------------SEZEN---------------------------
    @Given("Kullanici web uygulamasinin url'ine gider.")
    public void kullanici_web_uygulamasinin_url_ine_gider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("medunnaUrl"));
    }

    @And("Siteye gidildigini dogrular.")
    public void siteyeGidildiginiDogrular() {
        Assert.assertTrue(mp.medunnaLogoElementi.isDisplayed());
    }

    @And("Make an Appointment butonuna tiklar.")
    public void makeAnAppointmentButonunaTiklar() {
        mp.makeAnAppointmentButonu.click();
    }

    @And("Make an Appointment yazisinin goruldugunu dogrular.")
    public void makeAnAppointmentYazisininGoruldugunuDogrular() {
        Assert.assertTrue(mp.makeAnAppointmentYazisi.isDisplayed());
        Driver.wait(1);
    }

    @And("Firstname TextBox'a {string} girer.")
    public void firstnameTextBoxAGirer(String firstname) {
        mp.makeAnAppointmentFirstNameTextBox.sendKeys(firstname);
        Driver.wait(1);
    }

    @And("Make An Appointment First Name Uyari Yazisinin gorundugunu dogrular.")
    public void makeAnAppointmentFirstNameUyariYazisininGorundugunuDogrular() {
        Assert.assertTrue(mp.makeAnAppointmentFirstNameUyariYazisi.isDisplayed());
    }

    @And("Send an Appointment Request butonuna tiklar.")
    public void sendAnAppointmentRequestButonunaTiklar() {
        mp.sendAnAppointmentRequestButton.click();
        Driver.wait(3);
    }

    @And("SSN TextBox'a {string} girer.")
    public void ssnTextBoxAGirer(String ssn) {
        mp.ssnTextBox.sendKeys(ssn);
    }

    @And("Make An Appointment SSN icin SSN Uyari Yazisi gorundugunu dogrular.")
    public void makeAnAppointmentSSNIcinSSNUyariYazisiGorundugunuDogrular() {
        String ssn = "Your SSN is required.";
        Assert.assertEquals(mp.makeAnAppointmentSSNUyariYazisi.getText(),ssn);
    }

    @And("Make An Appointment invalid SSN icin SSN Uyari Yazisi gorundugunu dogrular.")
    public void makeAnAppointmentInvalidSSNIcinSSNUyariYazisiGorundugunuDogrular() {
        String ssn = "Your SSN is invalid";
        Assert.assertEquals(mp.makeAnAppointmentSSNInvalidUyariYazisi.getText(),ssn);
    }

    @And("Lastname TextBox'a {string} girer.")
    public void lastnameTextBoxAGirer(String lastname) {
        mp.makeAnAppointmentLastNameTextBox.sendKeys(lastname);
    }

    @And("Make An Appointment Last Name Uyari Yazisinin gorundugunu dogrular.")
    public void makeAnAppointmentLastNameUyariYazisininGorundugunuDogrular() {
        Assert.assertTrue(mp.makeAnAppointmentLastNameUyariYazisi.isDisplayed());
    }

    @And("Email TextBox'a {string} girer.")
    public void emailTextBoxAGirer(String email) {
        mp.makeAnAppointmentEmailTextBox.sendKeys(email);
    }

    @And("Make An Appointment Email icin {string} gorundugunu dogrular.")
    public void makeAnAppointmentEmailIcinGorundugunuDogrular(String email) {
        Assert.assertEquals(mp.makeAnAppointmentEmailUyariYazisi.getText(),email);
    }

    @And("Make An Appointment invalid Email icin {string} gorundugunu dogrular.")
    public void makeAnAppointmentInvalidEmailIcinGorundugunuDogrular(String invalidUyari) {
        Assert.assertEquals(mp.makeAnAppointmentEmailInvalidUyariYazisi.getText(),invalidUyari);
    }

    @And("Phone TextBox'a {string} girer.")
    public void phoneTextBoxAGirer(String phone) {
        mp.makeAnAppointmentPhoneTextBox.sendKeys(phone);
    }

    @And("Make An Appointment invalid Phone icin Phone Uyari Yazisi gorundugunu dogrular.")
    public void makeAnAppointmentInvalidPhoneIcinPhoneUyariYazisiGorundugunuDogrular() {
        String phone = "Phone number is invalid";
        Assert.assertEquals(mp.makeAnAppointmentInvalidPhoneUyariYazisi.getText(),phone);
    }

    @And("Make An Appointment Phone icin Phone Uyari Yazisi gorundugunu dogrular.")
    public void makeAnAppointmentPhoneIcinPhoneUyariYazisiGorundugunuDogrular() {
        String phone = "Phone number is required.";
        Assert.assertEquals(mp.makeAnAppointmentPhoneUyariYazisi.getText(),phone);
    }



    //********************** Mali *******************************
    @Given("Kullanici kendisine verilen {string} ve {string} ile sign in yapar ve Appointments sayfasina girer")
    public void kullaniciKendisineVerilenVeIleSignInYaparVeAppointmentsSayfasinaGirer(String username, String password) {
        mp.anaSayfaKullaniciIkonu.click();
        mp.signInLinki.click();
        mp.signInUsernameTextBox.sendKeys(username);
        mp.signInPasswordTextBox.sendKeys(password);
        mp.signInButonu.click();
        Driver.wait(2);
        mp.myPagesElement.click();
        mp.myAppointment.click();


    }
    @Then("Kullanici mevcut gun ile ileri tarihleri arasindaki statusu unapproved olanlari gorur")
    public void kullanici_mevcut_gun_ile_ileri_tarihleri_arasindaki_statusu_unapproved_olanlari_gorur() {
        mp.fromDateBoxElement.sendKeys("13/05/2022");
        mp.toDateBoxElement.sendKeys("27/05/2022");

    }

    @Then("Kullanici mevcut gun ile ileri tarihleri arasindaki statusu pending olanlari gorur")
    public void kullanici_mevcut_gun_ile_ileri_tarihleri_arasindaki_statusu_pending_olanlari_gorur() {
        Driver.wait(1);
        Assert.assertTrue(mp.pendingYazisiElement.isDisplayed());
    }

    @Then("Kullanici mevcut gun ile ileri tarihlkeri arasindaki statusu Canceled olanlari gorur")
    public void kullanici_mevcut_gun_ile_ileri_tarihlkeri_arasindaki_statusu_canceled_olanlari_gorur() {
        Driver.wait(1);
        Assert.assertTrue(mp.cancelledwordElementi.isDisplayed());

    }

    @Then("Kullanici patient icin edit e tiklar")
    public void kullanici_patient_icin_edit_e_tiklar() {
        Driver.wait(2);
        mp.editElementidoctorpage.click();
    }

    @Then("Kullanici Create or Edit an Appointment yazisini gorur")
    public void kullanici_create_or_edit_an_appointment_yazisini_gorur() {
        Assert.assertTrue(mp.createElementiyazisi.isDisplayed());
    }

    @Given("Kullanici Anamnesis box i bos biraktiginda This field is required uyari yazisini gormeli")
    public void kullaniciAnamnesisBoxIBosBiraktigindaThisFieldIsRequiredUyariYazisiniGormeli() {
        Driver.wait(2);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        mp.anamnesisTextBox.sendKeys("");

        //Assert.assertTrue(mp.thisFieldIsRequiredYazisi.isDisplayed());

    }

    @Then("Kullanici Treatment box i bos biraktiginda This field is required uyari yazisini gormeli")
    public void kullaniciTreatmentBoxIBosBiraktigindaThisFieldIsRequiredUyariYazisiniGormeli() {
        Driver.wait(1);

        mp.treatmentTextBox.sendKeys("");
        //Assert.assertTrue(mp.thisFieldIsRequiredYazisi.isDisplayed());


    }

    @Then("Kullanici Diagnosis box i bos biraktiginda This field is required uyari yazisini gormeli")
    public void kullaniciDiagnosisBoxIBosBiraktigindaThisFieldIsRequiredUyariYazisiniGormeli() {
        mp.diagnosisTextBox.sendKeys("");

        //mp.prescriptionwordElementi.sendKeys("");
        Assert.assertTrue(mp.thisFieldIsRequiredYazisi.isDisplayed());

    }

    @Given("Kullanici {string} box a veri girisi yapabilmeli")
    public void kullaniciBoxAVeriGirisiYapabilmeli(String anamnesis) {
        Driver.wait(1);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        mp.anamnesisTextBox.sendKeys(anamnesis);

    }

    @Then("Kullanici {string} box a veri girisi yapar")
    public void kullaniciBoxAVeriGirisiYapar(String treatment) {
        mp.treatmentTextBox.sendKeys(treatment);

    }

    @And("Kullanici {string} box a veri girisi yaparsa")
    public void kullaniciBoxAVeriGirisiYaparsa(String diagnosis) {
        mp.diagnosisTextBox.sendKeys(diagnosis);
    }

    @Then("Kullanici save yapar ve succesfully saved yazisini gorur")
    public void kullaniciSaveYaparVeSuccesfullySavedYazisiniGorur() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.wait(1);
        mp.saveDoctorEditPage.click();
        Driver.wait(2);
        Assert.assertTrue(mp.registersavedYazisiElementi.isDisplayed());

    }

    @And("Kullanici statusu cancelled yapar")
    public void kullaniciStatusuCancelledYapar() {
        Driver.wait(1);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Select select = new Select(mp.statuswordElementi);
        select.selectByIndex(3);

    }

    //===================salih========================


    @Then("Web Sayfasinda bulunan person ikonuna tiklar.")
    public void web_sayfasinda_bulunan_person_ikonuna_tiklar() {
        MedunnaPage.mainPagePersonİkonuElementi.click();

    }
    @Then("Sign in sekmesine tiklar.")
    public void sign_in_sekmesine_tiklar() {

        Driver.waitAndClick( MedunnaPage.signInLinkiElementi);

    }
    @Then("Username Box'a gecerli {string} girer.")
    public void username_box_a_gecerli_girer(String username) {
        doktorName=username;
        MedunnaPage.usernameBoxElementi.sendKeys(username);

    }
    @Then("Password Box'a gecerli {string} girer.")
    public void password_box_a_gecerli_girer(String password) {
        MedunnaPage.passwordBoxElementi.sendKeys(password);

    }
    @Then("Sign in butonuna tiklar.")
    public void sign_in_butonuna_tiklar() {
        MedunnaPage.girisSignInButtonElementi.click();

    }
    @Then("Doktor kendi sayfasina basarili sekilde giris yaptigini gorur.")
    public void doktor_kendi_sayfasina_basarili_sekilde_giris_yaptigini_gorur() {
        String actualusername=MedunnaPage.siteyeGirisYapanUsernameElementi.getText();
        Assert.assertEquals(doktorName,actualusername);

    }
    @Then("My Pages sekmesine tiklar.")
    public void my_pages_sekmesine_tiklar() {
        Driver.wait2(1);
        MedunnaPage.myPagesLinkiElementi.click();

    }
    @Then("My Appointments linkine tiklar.")
    public void my_appointments_linkine_tiklar() {

        MedunnaPage.myAppointmentsElementi.click();
    }

    @Then("Test istemek istedigi hasta randevusunu secer.")
    public void test_istemek_istedigi_hasta_randevusunu_secer() {

        List<WebElement> hastaEditListesi=MedunnaPage.hastaEditButonuElementiListesi;
        Driver.wait2(1);
        int secilenEditSirasi=faker.random().nextInt(1,hastaEditListesi.size());

        String dinamikXpath="(//a[@class='btn btn-primary btn-sm'])["+secilenEditSirasi+"]";

        Driver.getDriver().findElement(By.xpath(dinamikXpath)).click();
    }
    @Then("Request A Test butonuna tiklar.")
    public void request_a_test_butonuna_tiklar() {
        Driver.wait2(1);
        MedunnaPage.requestATestButonElementi.click();
        Driver.wait2(2);
    }
    @Then("Doktor gerekli testleri secer.")
    public void doktor_gerekli_testleri_secer() {
        Driver.wait(3);
        List<WebElement> testIDListesi=MedunnaPage.testIDListOlusturma();
        List<String> testIDleri= Driver.getElementsText(testIDListesi);
        List<WebElement> secilenCheckbox= new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            int index=faker.random().nextInt(0,testIDleri.size());

            String ID=testIDleri.get(index);

            //input[@id='1402']
            WebElement dinamikXpath=Driver.getDriver().findElement(By.xpath("//input[@id='"+ID+"']"));

            secilenCheckbox.add(dinamikXpath);
        }
        System.out.println(secilenCheckbox);

        Driver.clickWithJSAsList(secilenCheckbox);
    }
    @Then("Testin ilgili birime gonderilmesi icin save butonuna tiklar.")
    public void testin_ilgili_birime_gonderilmesi_icin_save_butonuna_tiklar() {
        actions.sendKeys(Keys.END).perform();
        Driver.wait2(1);
        MedunnaPage.testSaveButonElementi.click();

    }
    @Then("Test isteginin ilgili birime gonderildigini test eder.")
    public void test_isteginin_ilgili_birime_gonderildigini_test_eder() {
        actions.sendKeys(Keys.PAGE_UP).perform();
        Driver.wait2(2);
        String actualData= MedunnaPage.saveSonrasiUyarielementi.getText();
        String expectedData="A new Test is created with identifier";

        Driver.wait(2);
        Assert.assertTrue(actualData.contains(expectedData));

    }

    @Then("Acilan sayfadaki testName'ler arasinda  Glucose, Urea, Creatinine, Sodium, Potassium, Total protein, Albumin, Hemoglobin seçenekleri oldugunu gorur.")
    public void acilanSayfadakiTestNameLerArasindaGlucoseUreaCreatinineSodiumPotassiumTotalProteinAlbuminHemoglobinSeçenekleriOldugunuGorur() {
        Driver.wait2(3);
        List<String> testNameStringList= new ArrayList<>();

        List<WebElement> testNameElementleri=MedunnaPage.testNameListOlustur();

        testNameStringList=Driver.getElementsText(testNameElementleri);

        Driver.wait2(2);

        for (int i = 0; i < 8; i++) {

            Assert.assertTrue(testNameStringList.contains(MedunnaPage.testNameExpectedDataOlustur().get(i)));

        }

    }

    @Then("Doktor kendi sayfasina basarili sekilde giris yaptigini dogrular.")
    public void doktor_kendi_sayfasina_basarili_sekilde_giris_yaptigini_dogrular() {

        Driver.wait2(2);
        String expectedUsername = MedunnaPage.siteyeGirisYapanUsernameElementi.getText();
        expectedUsername =  expectedUsername.toLowerCase().replaceAll(" ","");

        Assert.assertEquals(expectedUsername,doktorName);

    }
    @Then("Test sayfasindan istenilen testlerin checkbox kutusu tiklanir.")
    public void testSayfasindanIstenilenTestlerinCheckboxKutusuTiklanir() {
        //input[@id='1402']
        List<WebElement> secilenCheckbox1=new ArrayList<>();

        for (int i = 1401; i < 1409; i++) {
            secilenCheckbox1.add(Driver.getDriver().findElement(By.xpath("//input[@id='"+i+"']")));

        }

        Driver.clickWithJSAsList(secilenCheckbox1);
    }

    @Then("Show Test Result'a tiklar.")
    public void showTestResultATiklar() {
        actions.sendKeys(Keys.HOME).perform();
        Driver.wait(2);
        Driver.waitAndClick(MedunnaPage.showTestResultElementi);
    }

    @Then("View Result butonuna tiklar.")
    public void viewResultButonunaTiklar() {
        actions.sendKeys(Keys.HOME).perform();
        Driver.waitAndClick(MedunnaPage.testResultsViewResultsElementi);

    }


    @Then("Doktor Test Result sayfasinda istenilen testlerin TestResultValue sonuclarini gorur.")
    public void doktorTestResultSayfasindaIstenilenTestlerinTestResultValueSonuclariniGorur() {

        List<WebElement> testsBaslikListesi=MedunnaPage.testsSayfasiBaslikListeOlusturma();

        List<String>testBaslikStringListesi=Driver.getElementsText(testsBaslikListesi);
        System.out.println(testBaslikStringListesi);
        Driver.wait2(1);

        for (int i = 0; i < MedunnaPage.testResultValueStringOlustur().size(); i++) {
            Assert.assertTrue(testBaslikStringListesi.contains(MedunnaPage.testResultValueStringOlustur().get(i)));

        }

    }

    @And("Hasta edit sayfasina geri doner")
    public void hastaEditSayfasinaGeriDoner() {
        Driver.getDriver().navigate().back();
        Driver.wait2(1);
        Driver.getDriver().navigate().back();

    }

    @Then("Request Inpatient butonuna tiklar.")
    public void requestInpatientButonunaTiklar() {
        Driver.wait(2);
        MedunnaPage.requestInpatientButonElementi.click();

    }

    @And("Ana sayfaya geri doner.")
    public void anaSayfayaGeriDoner() {
        Driver.wait(2);
        Driver.waitAndClick(MedunnaPage.medunnaLogoElementi);
    }

    @Then("Giris yapilan hesaptan signOut yapar.")
    public void girisYapilanHesaptanSignOutYapar() {
        Driver.waitAndClick(MedunnaPage.cikisIcinSignInLinkiElementi);
        Driver.waitAndClick(MedunnaPage.signOutLinkiElementi);
    }

    @Then("Hasta yatis isteginin gonderildigini dogrular.")
    public void hastaYatisIstegininGonderildiginiDogrular() {

    }

    @And("Doktor gerekli test {string} secer.")
    public void doktorGerekliTestSecer(String istenenBaslikStr) {

        Driver.wait(3);

        MedunnaPage.testIDListOlusturma();

    }

    @Then("Web uygulamasindan cikis yapar.")
    public void webUygulamasindanCikisYapar() {

        Driver.closeDriver();
    }


    @Then("Test istemek istedigi hasta randevusunu secer")
    public void testIstemekIstedigiHastaRandevusunuSecer() {

        Driver.wait(1);
        MedunnaPage.ikinciSiradakiHastaEditButonu.click();

    }

}