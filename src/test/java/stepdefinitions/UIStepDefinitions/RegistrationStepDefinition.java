package stepdefinitions.UIStepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import utilities.ConfigurationReader;
import utilities.Driver;
import pages.MedunnaPage;

public class RegistrationStepDefinition {

    MedunnaPage mp=new MedunnaPage();
    Faker faker;
    Actions actions;

    // ------------------------- KÜBRA -----------------------------------
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
    @And("Kullanıcı SSN textbox'ına rakamlardan oluşan bir ssn numarası girmeli")
    public void kullanıcıSSNTextboxInaRakamlardanOluşanBirSsnNumarasıGirmeli() {
        faker=new Faker();
        String geçerliSSN=faker.idNumber().ssnValid();
        mp.ssnTextBox.click();
        mp.ssnTextBox.sendKeys(geçerliSSN);
        System.out.println(geçerliSSN);
    }
        @Then("Girilecek olan SSN numarası dokuzu geçmemeli ve dokuzun altında olmamalı")
        public void girilecek_olan_ssn_numarası_dokuzu_geçmemeli_ve_dokuzun_altında_olmamalı() {

        }
        @Then("Kullanıcı SSN numarasının üçüncü ve beşinci rakamından sonra - koymalı")
        public void kullanıcı_ssn_numarasının_üçüncü_ve_beşinci_rakamından_sonra_koymalı() {

        }
        @And("{string} numarası girildğinde Your SSN is invalid text'inin görünürlüğü test edilmeli")
        public void numarasıGirildğindeYourSSNIsInvalidTextIninGörünürlüğüTestEdilmeli(String GeçersizSSN) {
            mp.ssnTextBox.clear();
            mp.ssnTextBox.sendKeys(ConfigurationReader.getProperty(GeçersizSSN));
            Assert.assertTrue(mp.yourSsnIsInvalidYazısı.isDisplayed());
        }

}