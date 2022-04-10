Feature: Physician (Doktor) "Test Results" işlemleri yapabilmeli

  Scenario Outline: TC01 Test sonuçları güncellendikten sonra doktor
  "id, name(Urea, Sodium, Glucose etc..), default max value, default min value, test, description and the date"
  bilgilerini görebilmeli

    Given Kullanici web uygulamasinin url'ine gider.
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
    Then Acilan sayfadaki testName'ler arasinda  Glucose, Urea, Creatinine, Sodium, Potassium, Total protein, Albumin, Hemoglobin seçenekleri oldugunu gorur.
    Then Test sayfasindan istenilen testlerin checkbox kutusu tiklanir.
    Then Testin ilgili birime gonderilmesi icin save butonuna tiklar.
    And Test isteginin ilgili birime gonderildigini test eder.
    Then Show Test Result'a tiklar.
    Then View Result butonuna tiklar.
    And Ana sayfaya geri doner.
    Then Giris yapilan hesaptan signOut yapar.
    Then Web uygulamasindan cikis yapar.



    Examples:
      |username    |password|
      |prof.dr.salihkaya|drsalih |




  Scenario Outline: TC02 Doktor "Request Impatient" (hastanın yatılı tedavi görmesi) isteğinde bulunabilmeli

    Given Kullanici web uygulamasinin url'ine gider.
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
    Then Acilan sayfadaki testName'ler arasinda  Glucose, Urea, Creatinine, Sodium, Potassium, Total protein, Albumin, Hemoglobin seçenekleri oldugunu gorur.
    Then Test sayfasindan istenilen testlerin checkbox kutusu tiklanir.
    Then Testin ilgili birime gonderilmesi icin save butonuna tiklar.
    And Test isteginin ilgili birime gonderildigini test eder.
    Then Show Test Result'a tiklar.
    Then View Result butonuna tiklar.
    And Hasta edit sayfasina geri doner
    Then Request Inpatient butonuna tiklar.
    Then Hasta yatis isteginin gonderildigini dogrular.
    And Ana sayfaya geri doner.
    Then Giris yapilan hesaptan signOut yapar.
    Then Web uygulamasindan cikis yapar.



    Examples:
      |username    |password|
      |prof.dr.salihkaya|drsalih |
