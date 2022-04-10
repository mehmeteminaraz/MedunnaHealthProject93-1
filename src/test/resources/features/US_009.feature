@Team93
Feature: US09


  Scenario: TC01 Staff View

    Given Kullanici siteye gider "medunnaUrl"
    Then Web Sayfasinda bulunan person ikonuna tiklar.
    Then Sign in sekmesine tiklar.
    And Username Box'a gecerli "staff_zeynep" girer.
    And Password Box'a gecerli "New2022." girer.
    Then Sign in butonuna tiklar.
    Then Ust menudeki MY_PAGES menusune tiklanir.
    Then Menunun altinda cikan Search Patient item'ina tiklanir.
    Then Patients basligi altinda hasta listesi gorunur.
    Then Staff hasta bilgi satirindaki View butonuna tiklar.
    Then Patient bilgilerinin altindaki Edit butonuna tiklanir.
    And First Name alanina isim girilir.
    And Last Name alanina soyisim girilir.
    And Birth Date alanindan dogum tarihi secilir.
    And Email alanina email bilgisi girilir.
    And Phone alanina telefon bilgisi girilir.
    And Gender alanina cinsiyet girilir.
    And Blood Group alanina kan grubu girilir.
    And Address alanina adres bilgisi girilir.
    And Description alanina veri girilir.
    And User alanindan kullanici secilir.
    And Country alanindan ulke secilir.
    And State City alanindan sehir secilir.
    And Save butonuna tiklanir.
    Then Back butonuna tiklanir.



  Scenario: TC02 Staff Edit

    Given Kullanici siteye gider "medunnaUrl"
    Then Kullanici Web Sayfasinda bulunan person ikonuna tiklar.
    Then Kullanici Sign in sekmesine tiklarr.
    And Kullanici Username Box'a gecerli "staff_zeynep" girer.
    And Kullanici Password Box'a gecerli "New2022." girer.
    Then Kullanici Sign in butonuna tiklarr.
    Then Ust menudeki MY_PAGES menusune tiklanir.
    Then Menunun altinda cikan Search Patient item'ina tiklanir.
    And Staff hasta bilgi satirindaki Edit butonuna tiklar.
    And Create or edit a Patient formu gorunur.
    And First Name alanina isim girilir.
    And Last Name alanina soyisim girilir.
    And Birth Date alanindan dogum tarihi secilir.
    And Email alanina email bilgisi girilir.
    And Phone alanina telefon bilgisi girilir.
    And Gender alanina cinsiyet girilir.
    And Blood Group alanina kan grubu girilir.
    And Address alanina adres bilgisi girilir.
    And Description alanina veri girilir.
    And User alanindan kullanici secilir.
    And Country alanindan ulke secilir.
    And State City alanindan sehir secilir.
    Then Save butonuna tiklanir.
    Then Back butonuna tiklanir.



  Scenario: TC03  Staff Show Appointment

    Given Kullanici siteye gider "medunnaUrl"
    Then Web Sayfasinda bulunan person ikonuna tiklar.
    Then Sign in sekmesine tiklar.
    And Username Box'a gecerli "staff_zeynep" girer.
    And Password Box'a gecerli "New2022." girer.
    Then Sign in butonuna tiklar.
    Then Ust menudeki MY_PAGES menusune tiklanir.
    Then Menunun altinda cikan Search Patient item'ina tiklanir.
    Then Patients basligi altinda hasta listesi gorunur.
    Then Staff Hasta bilgi satirindaki Show Appointments butonuna tiklanir.
    And Hasta randevu bilgileri goruntulenir.
    Then Hasta bilgi satirindaki Edit butonuna tiklanir.
    And Start DateTime alanindan tarih secilir.
    And End DateTime alanindan tarih secilir.
    And Status alaninda statu durumu secilir.
    And Anamnesis alanina veri girilir.
    And Treatment alanina veri girilir.
    And Diagnosis alanina veri girilir.
    And Prescription alanina veri girilir.
    And Appointment Description alanina veri girilir.
    And Physician alanindan doktor secimi yapilir.
    And Hasta Appointment formundaki Save butonuna tiklanir.
    And Hasta Appointment bilgileri guncellenir.
    Then Back butonuna tiklanir.
    Then Staff Hasta bilgi satirindaki Show Appointments butonuna tiklanir.
    Then Appointments Hasta bilgi satirindaki Show Tests butonuna tiklanir.
    And Hasta testleri goruntulenir.



  Scenario: TC04 Staff SSN

    Given Kullanici siteye gider "medunnaUrl"
    Then Web Sayfasinda bulunan person ikonuna tiklar.
    Then Sign in sekmesine tiklar.
    And Username Box'a gecerli "staff_zeynep" girer.
    And Password Box'a gecerli "New2022." girer.
    Then Sign in butonuna tiklar.
    Then Ust menudeki MY_PAGES menusune tiklanir.
    Then Menunun altinda cikan Search Patient item'ina tiklanir.
    And Patients basligi altindaki Patient SSN textbox'una SSN numarasi girilir.
    And Staff hasta bilgi satirindaki View butonuna tiklar.
    Then Patient bilgilerinin altindaki Edit butonuna tiklanir.
    And First Name alanina isim girilir.
    And Last Name alanina soyisim girilir.
    And Birth Date alanindan dogum tarihi secilir.
    And Email alanina email bilgisi girilir.
    And Phone alanina telefon bilgisi girilir.
    And Gender alanina cinsiyet girilir.
    And Blood Group alanina kan grubu girilir.
    And Address alanina adres bilgisi girilir.
    And Description alanina veri girilir.
    And User alanindan kullanici secilir.
    And Country alanindan ulke secilir.
    And State City alanindan sehir secilir.
    And Save butonuna tiklanir.
    Then Back butonuna tiklanir.



  Scenario: TC05  Staff In Patient

    Given Kullanici siteye gider "medunnaUrl"
    Then Web Sayfasinda bulunan person ikonuna tiklar.
    Then Sign in sekmesine tiklar.
    And Username Box'a gecerli "staff_zeynep" girer.
    And Password Box'a gecerli "New2022." girer.
    Then Sign in butonuna tiklar.
    Then Ust menudeki MY_PAGES menusune tiklanir.
    Then Menunun altinda cikan In Patient item'ina tiklanir.
    And from textbox'undan tarih secilir
    And to textbox'undan tarih secilir
    Then In Patient Hasta bilgi satirindaki Edit butonuna tiklanir.
    Then Create or edit a In Patient formu gorunur.
    And Start Date alanindan tarih secilir.
    And End Date alanindan tarih secilir.
    And In Patient Description alanina veri girilir.
    And Created Date alanindan tarih secilir.
    And Status alanindan randevu statusu secilir.
    And Room alanindan oda secilir.
    And In Patient Save butonuna tiklanir.
    And In Patient Hasta bilgisi olusturulur.
    Then In Patient formunda back butonuna tiklanir.



  Scenario: TC06  Admin Delete & Create

    Given Kullanici siteye gider "medunnaUrl"
    Then Web Sayfasinda bulunan person ikonuna tiklar.
    Then Sign in sekmesine tiklar.
    And Username Box'a gecerli "admin_zeynep" girer.
    And Password Box'a gecerli "New2022." girer.
    Then Sign in butonuna tiklar.
    Then Items Titles menusune tiklanir.
    Then Altinda acilan Patient item'ina tiklanir.
    And Hasta bilgi satirindaki Delete butonuna tiklanir
    Then Confirm Delete Operation uyarisinda Delete butonuna tiklanir.
    Then Confirm Delete Operation uyarisinda Cancel butonuna tiklanir.
    Then Create a new Patient butonuna tiklanir.
    And First Name alanina isim girilir.
    And Last Name alanina soyisim girilir.
    And Birth Date alanindan dogum tarihi secilir.
    And Email alanina email bilgisi girilir.
    And Phone alanina telefon bilgisi girilir.
    And Gender alanina cinsiyet girilir.
    And Blood Group alanina kan grubu girilir.
    And Address alanina adres bilgisi girilir.
    And Description alanina veri girilir.
    And User alanindan kullanici secilir.
    And Country alanindan ulke secilir.
    And State City alanindan sehir secilir.
    Then Save butonuna tiklanir.
    Then New Patient Created mesaji gorunur.



  Scenario: TC07  Admin View

    Given Kullanici siteye gider "medunnaUrl"
    Then Web Sayfasinda bulunan person ikonuna tiklar.
    Then Sign in sekmesine tiklar.
    And Username Box'a gecerli "admin_zeynep" girer.
    And Password Box'a gecerli "New2022." girer.
    Then Sign in butonuna tiklar.
    Then Items Titles menusune tiklanir.
    Then Altinda acilan Patient item'ina tiklanir.
    Then Admin Hasta bilgi satirindaki View butonuna tiklar.
    Then Patient bilgilerinin altindaki Edit butonuna tiklanir.
    And First Name alanina isim girilir.
    And Last Name alanina soyisim girilir.
    And Birth Date alanindan dogum tarihi secilir.
    And Email alanina email bilgisi girilir.
    And Phone alanina telefon bilgisi girilir.
    And Gender alanina cinsiyet girilir.
    And Blood Group alanina kan grubu girilir.
    And Address alanina adres bilgisi girilir.
    And Description alanina veri girilir.
    And User alanindan kullanici secilir.
    And Country alanindan ulke secilir.
    And State City alanindan sehir secilir.
    Then Save butonuna tiklanir.


  Scenario: TC08  Admin Edit

    Given Kullanici siteye gider "medunnaUrl"
    Then Web Sayfasinda bulunan person ikonuna tiklar.
    Then Sign in sekmesine tiklar.
    And Username Box'a gecerli "admin_zeynep" girer.
    And Password Box'a gecerli "New2022." girer.
    Then Sign in butonuna tiklar.
    Then Items Titles menusune tiklanir.
    Then Altinda acilan Patient item'ina tiklanir.
    Then Admin Hasta bilgi satirindaki Edit butonuna tiklar.
    And First Name alanina isim girilir.
    And Last Name alanina soyisim girilir.
    And Birth Date alanindan dogum tarihi secilir.
    And Email alanina email bilgisi girilir.
    And Phone alanina telefon bilgisi girilir.
    And Gender alanina cinsiyet girilir.
    And Blood Group alanina kan grubu girilir.
    And Address alanina adres bilgisi girilir.
    And Description alanina veri girilir.
    And User alanindan kullanici secilir.
    And Country alanindan ulke secilir.
    And State City alanindan sehir secilir.
    Then Save butonuna tiklanir.