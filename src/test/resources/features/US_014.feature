Feature:Physician "Edit Inpatient" (Yatılı Tedavi) işlemleri yapabilmeli


  Background:
    Given Kullanıcı siteye gider "medunnaUrl"

  Scenario: Doktor"ID, start and end dates, description, created date
  appointment id, status, room and patient" bilgilerini görüntülüyebilmeli ve güncelenebilmeli

    When  Sayfaya gidildiği ana sayfadaki WELCOME TO MEDUNNA texti ile doğrulanır
    And   Kullanıcı sayfaya giriş için CONTACT linkinin sağında bulunan kullanıcı girişi linkine tıklar
    And Doktor acilan menuden 'Sign In' e tiklar
  And Doktor kendi User Name ve passwordunu girip Sign In butonuna tiklar
  Then Doktor sag ust kosede kendi adini gorur
  Then Doktor ust tarafta bulunan MY PAGES butonuna tiklar
  And Doktor acilan menuden My Inpatients butununa tiklar
  Then Doktor yatan hastalarin ID, start and end dates, description bilgilerini goruntuleyebilir
  And Doktor yatan hastalarin created date, appointment id bilgilerini goruntuleyebilir
  And Doktor yatan hastalarin status, room and patient bilgilerini görüntüleyebilir
  Then Doktor yatan hasta satirinin yaninda bulunan Edit butonuna tiklar
  And Doktor yatan hastalarin ID, start and end dates, description bilgilerini guncelleyebilir
  And Doktor yatan hastalarin created date, appointment id bilgilerini guncelleyebilir
  Then Doktor yatan hastalarin patient bilgilerini guncelleyebilir
