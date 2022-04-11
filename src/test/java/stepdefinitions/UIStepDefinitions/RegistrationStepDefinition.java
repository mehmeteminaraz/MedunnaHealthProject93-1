package stepdefinitions.UIStepDefinitions;


import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.MedunnaPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class RegistrationStepDefinition {

    MedunnaPage mp=new MedunnaPage();
   protected Faker faker=new Faker();


    @Given("Kullanici siteye gider {string}")
    public void kullaniciSiteyeGider(String medunnaUrl) {
        Driver.getDriver().get(ConfigurationReader.getProperty(medunnaUrl));
    }

    @When("Sayfaya gidildigi ana sayfadaki WELCOME TO MEDUNNA texti ile dogrulanir")
    public void sayfaya_gidildigi_ana_sayfadaki_welcome_to_medunna_texti_ile_dogrulanir() {
        Assert.assertTrue(mp.anaSayfaWelcomeToMedunnaYazisi.isDisplayed());
    }
    @When("Kullanici sayfaya giris icin CONTACT linkinin sagında bulunan kullanici girisi linkine tiklar")
    public void kullanici_sayfaya_giris_icin_contact_linkinin_sagında_bulunan_kullanici_girisi_linkine_tiklar() {
        mp.anaSayfaKullaniciIkonu.click();
    }
    @Then("Kullanici kayıt olusturabilmek icin Register linkine tiklar")
    public void kullanici_kayıt_olusturabilmek_icin_register_linkine_tiklar() {
        mp.registerLinki.click();
    }
    @Then("Kayit sayfasinda olundugu Registration yazisi ile dogrulanir")
    public void kayit_sayfasinda_olundugu_registration_yazisi_ile_dogrulanir() {
        Assert.assertTrue(mp.registerYazisi.isDisplayed());
    }
    @Then("Girilecek olan {string} numarasi dokuzu gecmemeli ve dokuzun altinda olmamali")
    public void girilecek_olan_numarasi_dokuzu_gecmemeli_ve_dokuzun_altinda_olmamali(String ssn) {
        mp.ssnTextBox.click();
        mp.ssnTextBox.sendKeys(ssn,Keys.ENTER);
    }
    @Then("Kullanici SSN numarasinin ucuncu ve besinci rakamından sonra - isareti {string} koymali")
    public void kullaniciSSNNumarasininUcuncuVeBesinciRakamındanSonraIsaretiKoymali(String tireliSSN) {
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
        faker=new Faker();
        mp.ssnTextBox.click();
        mp.ssnTextBox.sendKeys(faker.idNumber().ssnValid());
    }

    @Then("Firstname textboxı bos birakildiginda cikan Your FirstName is required textinin gorunurlugu test edilmeli")
    public void firstnameTextboxıBosBirakildigindaCikanYourFirstNameIsRequiredTextininGorunurluguTestEdilmeli() {
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
    public void usernameTextboxinaGecerliBirKullaniciAdıGirilmeli() {
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
}
