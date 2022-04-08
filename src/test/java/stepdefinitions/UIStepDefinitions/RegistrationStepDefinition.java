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

}