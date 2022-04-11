Feature: US_012 Physician (Doktor) test isteyebilmeli
  @requestatest
  Scenario Outline: TC01 Doctor test isteyebilmeli

    Given Kullanici siteye gider "medunnaUrl"
    And Siteye gidildigini dogrular.
    Then Web Sayfasinda bulunan person ikonuna tiklar.
    Then Sign in sekmesine tiklar.
    Then Username Box'a gecerli "<username>" girer.
    Then Password Box'a gecerli "<password>" girer.
    Then Sign in butonuna tiklar.
    Then Doktor kendi sayfasina basarili sekilde giris yaptigini dogrular.
    Then My Pages sekmesine tiklar.
    And My Appointments linkine tiklar.
    Then Test istemek istedigi hasta randevusunu secer
    Then Request A Test butonuna tiklar.
    And Doktor gerekli testleri secer.
    Then Testin ilgili birime gonderilmesi icin save butonuna tiklar.
    And Test isteginin ilgili birime gonderildigini test eder.
    And Ana sayfaya geri doner.
    Then Giris yapilan hesaptan signOut yapar.
    Then Web uygulamasindan cikis yapar.

    Examples:
      |     username    |password|
      |prof.dr.salihkaya|drsalih |


  @Team93
  Scenario Outline: TC02


    Given Kullanici siteye gider "medunnaUrl"
    And Siteye gidildigini dogrular.
    Then Web Sayfasinda bulunan person ikonuna tiklar.
    Then Sign in sekmesine tiklar.
    Then Username Box'a gecerli "<username>" girer.
    Then Password Box'a gecerli "<password>" girer.
    Then Sign in butonuna tiklar.
    Then Doktor kendi sayfasina basarili sekilde giris yaptigini dogrular.
    Then My Pages sekmesine tiklar.
    And My Appointments linkine tiklar.
    Then Test istemek istedigi hasta randevusunu secer
    Then Request A Test butonuna tiklar.
    Then Acilan sayfadaki testName'ler arasinda  Glucose, Urea, Creatinine, Sodium, Potassium, Total protein, Albumin, Hemoglobin secenekleri oldugunu gorur.
    And Ana sayfaya geri doner.
    Then Giris yapilan hesaptan signOut yapar.
    Then Web uygulamasindan cikis yapar.



    Examples:
      |username         |password|
      |prof.dr.salihkaya|drsalih |