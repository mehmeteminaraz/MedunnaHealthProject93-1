package stepdefinitions.UIStepDefinitions;


import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.RegistrationPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class RegistrationStepDefinition {

// -------------------------- KÜBRA -----------------------------
    RegistrationPage rp=new RegistrationPage();
    Faker faker;
    Actions actions;

    @Given("Kullanıcı siteye gider {string}")
    public void kullanıcıSiteyeGider(String medunnaUrl){
        Driver.getDriver().get(ConfigurationReader.getProperty(medunnaUrl));
    }

    @When("Sayfaya gidildiği ana sayfadaki WELCOME TO MEDUNNA texti ile doğrulanır")
    public void sayfaya_gidildiği_ana_sayfadaki_welcome_to_medunna_texti_ile_doğrulanır() {
        Assert.assertTrue(rp.anaSayfaWelcomeToMedunnaYazısı.isDisplayed());
    }
    @When("Kullanıcı sayfaya giriş için CONTACT linkinin sağında bulunan kullanıcı girişi linkine tıklar")
    public void kullanıcı_sayfaya_giriş_için_contact_linkinin_sağında_bulunan_kullanıcı_girişi_linkine_tıklar() {
        rp.anaSayfaKullanıcıİkonu.click();
    }
    @Then("Kullanıcı kayıt oluşturabilmek için Register linkine tıklar")
    public void kullanıcı_kayıt_oluşturabilmek_için_register_linkine_tıklar() {
        rp.registerLinki.click();
    }
    @Then("Kayıt sayfasında olunduğu Registration yazısı ile doğrulanır")
    public void kayıt_sayfasında_olunduğu_registration_yazısı_ile_doğrulanır() {
        Assert.assertTrue(rp.registerYazısı.isDisplayed());
    }
    @And("Kullanıcı SSN textbox'ına rakamlardan oluşan bir {string} numarası girmeli")
    public void kullanıcıSSNTextboxInaRakamlardanOluşanBirNumarasıGirmeli(String ssn) {
        rp.ssnTextBox.sendKeys(ConfigurationReader.getProperty(ssn));
    }
    @Then("Girilecek olan SSN numarası dokuzu geçmemeli ve dokuzun altında olmamalı")
    public void girilecek_olan_ssn_numarası_dokuzu_geçmemeli_ve_dokuzun_altında_olmamalı() {

    }
    @Then("Kullanıcı SSN numarasının üçüncü ve beşinci rakamından sonra - koymalı")
    public void kullanıcı_ssn_numarasının_üçüncü_ve_beşinci_rakamından_sonra_koymalı() {

    }
    @And("{string} numarası girildğinde Your SSN is invalid text'inin görünürlüğü test edilmeli")
    public void numarasıGirildğindeYourSSNIsInvalidTextIninGörünürlüğüTestEdilmeli(String GeçersizSSN) {
        rp.ssnTextBox.clear();
        rp.ssnTextBox.sendKeys(ConfigurationReader.getProperty(GeçersizSSN));
        Assert.assertTrue(rp.yourSsnIsInvalidYazısı.isDisplayed());
    }
}