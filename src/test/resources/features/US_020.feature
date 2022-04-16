Feature: US20 Admin; "User management" menusunden, kullanici Active eder ve gerekli rolleri olusturur.

  Background:
    Given Kullanici siteye gider "medunnaUrl"
    When  Sayfaya gidildigi ana sayfadaki WELCOME TO MEDUNNA texti ile dogrulanir

  Scenario Outline: TC01 Admin, kayitli kisilerin "firstname, lastname, email... Gibi bilgilerini gorebilmeli.

    Then  Kullanici sayfaya giris icin CONTACT linkinin sagında bulunan kullanici girisi linkine tiklar
    Given Kullanici Sign in sekmesine tiklar.
    Then  Kullanici username box'a gecerli "<username>" girer.
    And   Kullanici password box'a gecerli "<password>" girer.
    Then  Kullanici Sign in butonuna tiklar.
    And   Kullanici administration linkine tiklar
    And   Kullanici user management linkine tiklar
    Then  Kullanici creat a new user butonuna tiklar
    And   Yeni kullanici olusturmak icin dogru sayfaya gelindigi Create or edit a user yazisinin gorunurlugu ile dogrulanir
    Then  Kullanici login textboxina username girer
    And   Kullanici firstname textboxina isim girer
    Then  Kullanici lastname textboxina soyisim girer
    Given Kullanici email textboxina email adresi girer
    And   Kullanici ssn textboxina ssn numarasi girer
    Then  Olusturulan kullaniciya rol atamasi yapilir
    And   Kullanici create a new user sayfasindaki save butonuna tiklar
    #And   Kaydin basarili bir sekilde yapildigi sol ustte cikan textin gorunurlugu ile test edilir
    Then  Kullanici users sayfasinda en sonuncu sayfaya gider
    And   Kullanici view butonuna basarak olusturdugu hesabin bilgilerini dogrular
    And   Kullanici hesabindan cikis yapar

    Examples:test data
      | username | password |
      |adminKubra| Batch44Guru|

  Scenario Outline: TC02 Yonetici, kullaniciyi etkinlestirmek gibi mevcut kullanici bilgilerini duzenleyebilir,onlara YONETİCİ,KULLANICI,HASTA,PERSONEL ve HEKIM rolleri verebilir.

    Then  Kullanici sayfaya giris icin CONTACT linkinin sagında bulunan kullanici girisi linkine tiklar
    Given Kullanici Sign in sekmesine tiklar.
    Then  Kullanici username box'a gecerli "<username>" girer.
    And   Kullanici password box'a gecerli "<password>" girer.
    Then  Kullanici Sign in butonuna tiklar.
    And   Kullanici administration linkine tiklar
    And   Kullanici user management linkine tiklar
    Then  Kullanici users sayfasinda en sonuncu sayfaya gider
    And   Kullanici edit butonuna tiklar gerekli degisiklikleri yapar
    And   Kullanici hesabindan cikis yapar


    Examples:test data
      | username   | password    |
      | adminKubra | Batch44Guru |

  Scenario Outline: TC03 Yonetici kullanicilari silebilir

    Then  Kullanici sayfaya giris icin CONTACT linkinin sagında bulunan kullanici girisi linkine tiklar
    Given Kullanici Sign in sekmesine tiklar.
    Then  Kullanici username box'a gecerli "<username>" girer.
    And   Kullanici password box'a gecerli "<password>" girer.
    Then  Kullanici Sign in butonuna tiklar.
    And   Kullanici administration linkine tiklar
    And   Kullanici user management linkine tiklar
    Then  Kullanici users sayfasinda en sonuncu sayfaya gider
    And   Kullanici silmek istedigi hesabi delete butonuna basarak silme islemini gerceklestirir
   #Then Hesabin basarili bir sekilde silindigi dogrulanir
    And   Kullanici hesabindan cikis yapar


    Examples:test data
      | username   | password    |
      | adminKubra | Batch44Guru |