Feature:Physician "Edit Inpatient" (Yatılı Tedavi) işlemleri yapabilmeli

  Background:
    Given Kullanici siteye gider "medunnaUrl"

  Scenario Outline: Doktor"ID, start and end dates, description, created date
  appointment id, status, room and patient" bilgilerini görüntülüyebilmeli ve güncelenebilmeli

    When  Sayfaya gidildigi ana sayfadaki WELCOME TO MEDUNNA texti ile dogrulanir
    And   Kullanici sayfaya giris icin CONTACT linkinin sagında bulunan kullanici girisi linkine tiklar
    And Doktor acilan menuden Sign In e tiklar
    And Doktor kendi "<userName>" ve "<password>" girip Sign In butonuna tiklar
    Then Doktor sag ust kosede kendi adini gorur
    Then Doktor ust tarafta bulunan MY PAGES butonuna tiklar
    And Doktor acilan menuden My Inpatients butununa tiklar
    Then Doktor yatan hastalarin ID, start and end dates, description bilgilerini goruntuleyebilir
    And Doktor yatan hastalarin created date, appointment id bilgilerini goruntuleyebilir
    And Doktor yatan hastalarin status, room and patient bilgilerini goruntuleyebilir
    Then Doktor yatan hasta satirinin yaninda bulunan Edit butonuna tiklar
    And Doktor yatan hastalarin ID, start and end dates, description bilgilerini guncelleyebilir
    And Doktor yatan hastalarin created date, appointment id bilgilerini guncelleyebilir
    Then Doktor yatan hastalarin patient bilgilerini guncelleyebilir
    And Doktor tarayiciyi kapatir

    Examples:
      |userName|password|
      |doktoronur|Urfa2016|


  Scenario Outline: "Status" doktor tarafından "UNAPPROVED, DISCHARGED, STILL STAYING veya CANCELLED" olarak güncellenebilmeli

    When  Sayfaya gidildigi ana sayfadaki WELCOME TO MEDUNNA texti ile dogrulanir
    And   Kullanici sayfaya giris icin CONTACT linkinin sagında bulunan kullanici girisi linkine tiklar
    And Doktor acilan menuden Sign In e tiklar
    And Doktor kendi "<userName>" ve "<password>" girip Sign In butonuna tiklar
    Then Doktor sag ust kosede kendi adini gorur
    Then Doktor ust tarafta bulunan MY PAGES butonuna tiklar
    And Doktor acilan menuden My Inpatients butununa tiklar
    Then Doktor yatan hasta satirinin yaninda bulunan Edit butonuna tiklar
    And  Doktor acilan sayfadan Status bolumunden UNAPPOROVED'u secip kaydedebilir
    Then Doktor acilan sayfadan Status bolumunden STAYING secip kaydedebilir
    Then Doktor STAYING secildigini kontrol eder
    And Doktor acilan sayfadan Status bolumunden DISCHARGED secip kaydedebilir
    And Doktor STAYING secildigini kontrol eder
    Given Doktor acilan sayfadan Status bolumunden CANCELLED secip kaydedebilir
    Then Doktor CANCELLED secildigini kontrol eder
    And Doktor tarayiciyi kapatir

    Examples:
      |userName|password|
      |doktoronur|Urfa2016|


  Scenario Outline:Doktor rezerve edilmiş odayı güncelleyebilmeli

    When  Sayfaya gidildigi ana sayfadaki WELCOME TO MEDUNNA texti ile dogrulanir
    And   Kullanici sayfaya giris icin CONTACT linkinin sagında bulunan kullanici girisi linkine tiklar
    And Doktor acilan menuden Sign In e tiklar
    And Doktor kendi "<userName>" ve "<password>" girip Sign In butonuna tiklar
    Then Doktor sag ust kosede kendi adini gorur
    Then Doktor ust tarafta bulunan MY PAGES butonuna tiklar
    And Doktor acilan menuden My Inpatients butununa tiklar
    Then Doktor yatan hasta satirinin yaninda bulunan Edit butonuna tiklar
    And  Doktor Room bolumunden herhangi bir oda tipi secip guncelleyebilir
    Then Doktor oda tipini degistirdigini kontrol edebilir

    Examples:
      |userName|password|
      |doktoronur|Urfa2016|