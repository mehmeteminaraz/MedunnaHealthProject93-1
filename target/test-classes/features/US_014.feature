Feature:Physician "Edit Inpatient" (Yatılı Tedavi) işlemleri yapabilmeli

  Scenario: Doktor"ID, start and end dates, description, created date
  appointment id, status, room and patient" bilgilerini görüntülüyebilmeli ve güncelenebilmeli

  Given Doktor url'ye gider
  And  Doktor url'ye ulastigini title'dan kontrol eder
  And Doktor sayfanin sagindaki kullanici iconuna tiklar
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
