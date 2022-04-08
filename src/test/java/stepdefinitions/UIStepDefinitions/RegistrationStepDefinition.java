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
    @Then("Doktor yatan hastalarin status, room and patient bilgilerini görüntüleyebilir")
    public void doktor_yatan_hastalarin_status_room_and_patient_bilgilerini_görüntüleyebilir() {

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

}