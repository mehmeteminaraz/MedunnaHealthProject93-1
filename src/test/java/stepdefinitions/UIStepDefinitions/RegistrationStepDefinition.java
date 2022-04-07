package stepdefinitions.UIStepDefinitions;


import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.MedunnaPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class RegistrationStepDefinition {

    MedunnaPage mp=new MedunnaPage();
   protected Faker faker=new Faker();

    @Given("Kullanıcı siteye gider {string}")
    public void kullanıcıSiteyeGider(String medunnaUrl){
        Driver.getDriver().get(ConfigurationReader.getProperty(medunnaUrl));
    }

    @When("Sayfaya gidildiği ana sayfadaki WELCOME TO MEDUNNA texti ile doğrulanır")
    public void sayfaya_gidildiği_ana_sayfadaki_welcome_to_medunna_texti_ile_doğrulanır() {
        Assert.assertTrue(mp.anaSayfaWelcomeToMedunnaYazısı.isDisplayed());
    }
    @When("Kullanıcı sayfaya giriş için CONTACT linkinin sağında bulunan kullanıcı girişi linkine tıklar")
    public void kullanıcı_sayfaya_giriş_için_contact_linkinin_sağında_bulunan_kullanıcı_girişi_linkine_tıklar() {
        mp.anaSayfaKullanıcıİkonu.click();
    }
    @Then("Kullanıcı kayıt oluşturabilmek için Register linkine tıklar")
    public void kullanıcı_kayıt_oluşturabilmek_için_register_linkine_tıklar() {
        mp.registerLinki.click();
    }
    @Then("Kayıt sayfasında olunduğu Registration yazısı ile doğrulanır")
    public void kayıt_sayfasında_olunduğu_registration_yazısı_ile_doğrulanır() {
        Assert.assertTrue(mp.registerYazısı.isDisplayed());
    }

    @Then("Girilecek olan {string} numarası dokuzu geçmemeli ve dokuzun altında olmamalı")
    public void girilecekOlanNumarasıDokuzuGeçmemeliVeDokuzunAltındaOlmamalı(String ssn) {
        mp.ssnTextBox.click();
        mp.ssnTextBox.sendKeys(ssn,Keys.ENTER);
    }

    @Then("Kullanıcı SSN numarasının üçüncü ve beşinci rakamından sonra - {string} koymalı")
    public void kullanıcıSSNNumarasınınÜçüncüVeBeşinciRakamındanSonraKoymalı(String tireliSSN) {
        mp.ssnTextBox.clear();
        mp.ssnTextBox.sendKeys(tireliSSN,Keys.ENTER);
    }

    @And("Geçersiz SSN numarası girildğinde Your SSN is invalid text'inin görünürlüğü test edilmeli")
    public void geçersizSSNNumarasıGirildğindeYourSSNIsInvalidTextIninGörünürlüğüTestEdilmeli() {
     Assert.assertTrue(mp.yourSsnIsInvalidYazısı.isDisplayed());
    }

    @And("SSN textboxı boş bırakıldığında Your SSN is required textinin görünürlüğü test edilmeli")
    public void ssnTextboxıBoşBırakıldığındaYourSSNIsRequiredTextininGörünürlüğüTestEdilmeli() {
        mp.ssnTextBox.click();
        mp.firstnameTextBox.click();
        Assert.assertTrue(mp.yourSsnIsRequiredYazısı.isDisplayed());
    }

    @And("Kullanıcı geçerli bir ssn numarası girmeli")
    public void kullanıcıGeçerliBirSsnNumarasıGirmeli() {
        mp.ssnTextBox.click();
        mp.ssnTextBox.sendKeys(faker.idNumber().ssnValid(),Keys.ENTER);
    }

    @Then("Firstname textboxı boş bırakıldığında çıkan Your FirstName is required textinin görünürlüğü test edilmeli")
    public void firstnameTextboxıBoşBırakıldığındaÇıkanYourFirstNameIsRequiredTextininGörünürlüğüTestEdilmeli() {
        mp.firstnameTextBox.click();
        mp.lastnameTextBox.click();
        Assert.assertTrue(mp.yourFirstnameIsRequiredYazısı.isDisplayed());
    }

    @And("Firstname textboxına geçerli bir isim girilmeli")
    public void firstnameTextboxınaGeçerliBirIsimGirilmeli() {;
        mp.firstnameTextBox.click();
        mp.firstnameTextBox.sendKeys(faker.name().firstName());
    }

    @And("Lastname textboxı boş bırakıldığında çıkan Your LastName is required textinin görünürlüğü test edilmeli")
    public void lastnameTextboxıBoşBırakıldığındaÇıkanYourLastNameIsRequiredTextininGörünürlüğüTestEdilmeli() {
        mp.lastnameTextBox.click();
        mp.firstnameTextBox.click();
        Assert.assertTrue(mp.yourLastnameIsRequiredYazısı.isDisplayed());
    }

    @Then("Lastname textboxına geçerli bir soyisim girilmeli")
    public void lastnameTextboxınaGeçerliBirSoyisimGirilmeli() {
        mp.lastnameTextBox.sendKeys(faker.name().lastName());
    }

    @And("Username textboxı boş bırakıldığında çıkan Your username is required textinin görünürlüğü test edilmeli")
    public void usernameTextboxıBoşBırakıldığındaÇıkanYourUsernameIsRequiredTextininGörünürlüğüTestEdilmeli() {
        mp.usernameTextBox.click();
        mp.lastnameTextBox.click();
        Assert.assertTrue(mp.yourUsernameIsRequiredYazısı.isDisplayed());
    }

    @Then("Boşluk bırakılarak girilen bir username in geçersiz olduğu Your username is invalid textinin görünürlüğü ile test edilmeli")
    public void boşlukBırakılarakGirilenBirUsernameInGeçersizOlduğuYourUsernameIsInvalidTextininGörünürlüğüIleTestEdilmeli() {
        mp.usernameTextBox.click();
        mp.usernameTextBox.sendKeys("QA Kubra");
        Driver.wait(2);
        Assert.assertTrue(mp.yourUsernameIsInvalidYazısı.isDisplayed());
    }

    @And("Username textboxına geçerli bir kullanıcı adı girilmeli")
    public void usernameTextboxınaGeçerliBirKullanıcıAdıGirilmeli() {
        mp.usernameTextBox.clear();
        mp.usernameTextBox.sendKeys(faker.name().username());
    }

    @Then("Email textboxına {string} @ ve . işareti içermeyen bir adres girildiğinde çıkan This field is invalid textin görünürlüğü test edilmeli")
    public void emailTextboxınaVeIşaretiIçermeyenBirAdresGirildiğindeÇıkanThisFieldIsInvalidTextinGörünürlüğüTestEdilmeli(String işaretler) {
        mp.emailTextBox.click();
        mp.emailTextBox.sendKeys(işaretler);
        Driver.wait(2);
    }

    @And("Email textboxına beş karakterden az olucak şekilde email adresi yazıldığında çıkan Your email is required to be at least five characters textin görünürlüğü test edilmeli")
   public void emailTextboxınaBeşKarakterdenAzOlucakŞekildeEmailAdresiYazıldığındaÇıkanYourEmailIsRequiredToBeAtLeastFiveCharactersTextinGörünürlüğüTestEdilmeli() {
       mp.emailTextBox.clear();
       mp.emailTextBox.sendKeys("abc0");
       Assert.assertTrue(mp.yourEmailIsRequiredToBeAtLeastFiveCharactersYazısı.isDisplayed());
   }

    @Then("Email textboxı boş bırakıldığında çıkan Your email is required textinin görünürlüğü test edilmeli")
    public void emailTextboxıBoşBırakıldığındaÇıkanYourEmailIsRequiredTextininGörünürlüğüTestEdilmeli() {
        mp.emailTextBox.click();
        mp.usernameTextBox.click();
        Assert.assertTrue(mp.yourEmailIsRequiredYazısı.isDisplayed());
    }

    @And("Email textboxına geçerli bir adres girilmeli")
    public void emailTextboxınaGeçerliBirAdresGirilmeli() {
        mp.emailTextBox.sendKeys(faker.internet().emailAddress());
    }


}
