Feature: Admin olarak; Yeni Physicians Oluştur / Güncelle / Görüntüle ve Sil

  Background:
    Given Kullanici siteye gider "medunnaUrl"

  Scenario Outline: Admin, SSN kimliğine göre kayıtlı bir kişiyi seçebilir/arayabilir.

    When  Sayfaya gidildigi ana sayfadaki WELCOME TO MEDUNNA texti ile dogrulanir
    And   Kullanici sayfaya giris icin CONTACT linkinin sagında bulunan kullanici girisi linkine tiklar
    And   admin acilan menuden Sign In e tiklar
    And   admin kendi "<userName>" ve "<password>" girip Sign In butonuna tiklar
    Then  admin sag ust kosede kendi adini gorur
    And   Items&Titles menusu gorunur olmali
    Then  admin Items&Titles menusune tiklar
    Then  admin Physician'a tiklar
    And   admin Create a new Physician'a tiklar
    Then  admin SSN Box'a kayitli bir kisinin SSN'nini girer
    Then  admin Use Search CheckBox'a tiklar
    Then  admin Search User butonuna tiklar
    Then  admin sol ust kosede User found with search SSN popup'ini gorur
    And   Doktor tarayiciyi kapatir

    Examples:
      |userName |password|
      |adminonur|Urfa2016|

    Scenario Outline: Kişilerin "firstname, lastname birth date .." bilgileri doldurulabilmeli.(Negatif)

      When  Sayfaya gidildigi ana sayfadaki WELCOME TO MEDUNNA texti ile dogrulanir
      And   Kullanici sayfaya giris icin CONTACT linkinin sagında bulunan kullanici girisi linkine tiklar
      And   admin acilan menuden Sign In e tiklar
      And   admin kendi "<userName>" ve "<password>" girip Sign In butonuna tiklar
      Then  admin sag ust kosede kendi adini gorur
      And   Items&Titles menusu gorunur olmali
      Then  admin Items&Titles menusune tiklar
      Then  admin Physician'a tiklar
      And   admin Create a new Physician'a tiklar
      Then  admin SSN Box'a kayitli bir kisinin SSN'nini girer
      Then  admin Search User butonuna tiklar
      And   admin firstname, lastname, birthname textboxlarini gorebilmeli
      Then  admin firstname textboxina "<firstname>" girer
      Then  admin isim icin "<uyari yazisi>" gorundugunu dogrular
      Then  admin lastname textboxina "<lastname>" girer
      Then  admin soyisim icin "<uyari yazisi1>" gorundugunu dogrular
      Then  admin birtdate textboxina "<birthdate>" girer
      And   admin birthdate icin  "<uyari yazisi2>" gorundugunu dogrular
      And   Doktor tarayiciyi kapatir

      Examples:Test Datalari
        | userName  |  password  |  birthdate  | uyari yazisi2       |firstname |uyari yazisi           |lastname  |uyari yazisi1          |
        | adminonur |  Urfa2016  |  10.10.0000 |This field is invalid|          |This field is required.|          |This field is required.|


  Scenario Outline: Kişilerin "firstname, lastname birth date .." bilgileri doldurulabilmeli(pozitif)

    When  Sayfaya gidildigi ana sayfadaki WELCOME TO MEDUNNA texti ile dogrulanir
    And   Kullanici sayfaya giris icin CONTACT linkinin sagında bulunan kullanici girisi linkine tiklar
    And   admin acilan menuden Sign In e tiklar
    And   admin kendi "<userName>" ve "<password>" girip Sign In butonuna tiklar
    Then  admin sag ust kosede kendi adini gorur
    And   Items&Titles menusu gorunur olmali
    Then  admin Items&Titles menusune tiklar
    Then  admin Physician'a tiklar
    And   admin Create a new Physician'a tiklar
    Then  admin SSN Box'a kayitli bir kisinin SSN'nini girer
    Then  admin Search User butonuna tiklar
    And   admin firstname, lastname, birthname textboxlarini gorebilmeli
    Then  admin firstname textboxina "<firstname>" girer
    Then  admin isim icin uyari yazisi gorunmedigini dogrular
    Then  admin lastname textboxina "<lastname>" girer
    Then  admin soyisim icin uyari yazisi gorunmedigini dogrular
    Then  admin birtdate textboxina "<birthdate>" girer
    And   admin birthdate icin  uyari yazisi gorunmedigini dogrular
    And   Doktor tarayiciyi kapatir

    Examples:Test Datalari
      | userName  |  password  |  birthdate  |firstname |lastname  |
      | adminonur |  Urfa2016  |  10.12.2000 |recep     |altin     |


    Scenario Outline: Admin Doktor için bir uzmanlık alanı seçebilmeli

    When  Sayfaya gidildigi ana sayfadaki WELCOME TO MEDUNNA texti ile dogrulanir
    And   Kullanici sayfaya giris icin CONTACT linkinin sagında bulunan kullanici girisi linkine tiklar
    And   admin acilan menuden Sign In e tiklar
    And   admin kendi "<userName>" ve "<password>" girip Sign In butonuna tiklar
    Then  admin sag ust kosede kendi adini gorur
    And   Items&Titles menusu gorunur olmali
    Then  admin Items&Titles menusune tiklar
    Then  admin Physician'a tiklar
    And   admin Create a new Physician'a tiklar
    Then  admin SSN Box'a kayitli bir kisinin SSN'nini girer
    Then  admin Search User butonuna tiklar
    Then  admin doktor icin farkli uzmanlik alanlari secebilir
    Then  Doktor tarayiciyi kapatir

      Examples:
        |userName |password|
        |adminonur|Urfa2016|


  Scenario Outline: Admin, doktorun profil resmini sağlayabilir.

    When  Sayfaya gidildigi ana sayfadaki WELCOME TO MEDUNNA texti ile dogrulanir
    And   Kullanici sayfaya giris icin CONTACT linkinin sagında bulunan kullanici girisi linkine tiklar
    And   admin acilan menuden Sign In e tiklar
    And   admin kendi "<userName>" ve "<password>" girip Sign In butonuna tiklar
    Then  admin sag ust kosede kendi adini gorur
    And   Items&Titles menusu gorunur olmali
    Then  admin Items&Titles menusune tiklar
    Then  admin Physician'a tiklar
    And   admin Create a new Physician'a tiklar
    Then  admin SSN Box'a kayitli bir kisinin SSN'nini girer
    Then  admin Search User butonuna tiklar
    Then  admin doktorun profil resmini degistirebilir
    Then  Doktor tarayiciyi kapatir

    Examples:
      |userName |password|
      |adminonur|Urfa2016|


  Scenario Outline: Admin, doktorun Muayene ücretini girebilmelidir. (Exam fee)

    When  Sayfaya gidildigi ana sayfadaki WELCOME TO MEDUNNA texti ile dogrulanir
    And   Kullanici sayfaya giris icin CONTACT linkinin sagında bulunan kullanici girisi linkine tiklar
    And   admin acilan menuden Sign In e tiklar
    And   admin kendi "<userName>" ve "<password>" girip Sign In butonuna tiklar
    Then  admin sag ust kosede kendi adini gorur
    And   Items&Titles menusu gorunur olmali
    Then  admin Items&Titles menusune tiklar
    Then  admin Physician'a tiklar
    And   admin Create a new Physician'a tiklar
    Then  admin SSN Box'a kayitli bir kisinin SSN'nini girer
    Then  admin Search User butonuna tiklar
    Then  admin doktorun muayene ucretini girebilmelidir
    Then  Doktor tarayiciyi kapatir

    Examples:
      |userName |password|
      |adminonur|Urfa2016|

  @recep
  Scenario Outline: Admin, bütün doctorların bilgilerini görebilmelidir.

    When  Sayfaya gidildigi ana sayfadaki WELCOME TO MEDUNNA texti ile dogrulanir
    And   Kullanici sayfaya giris icin CONTACT linkinin sagında bulunan kullanici girisi linkine tiklar
    And   admin acilan menuden Sign In e tiklar
    And   admin kendi "<userName>" ve "<password>" girip Sign In butonuna tiklar
    Then  admin sag ust kosede kendi adini gorur
    And   Items&Titles menusu gorunur olmali
    Then  admin Items&Titles menusune tiklar
    Then  admin Physician'a tiklar
    Then  admin edit'e tiklar
    Then  admin butun doktorlarin bilgilerini gorebilmelidir
    Then  Doktor tarayiciyi kapatir

    Examples:
      |userName |password|
      |adminonur|Urfa2016|