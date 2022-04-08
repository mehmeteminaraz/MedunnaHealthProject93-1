Feature: US02 Kayit olmak icin email and username bilgileri girilebilmelidir.
  Background:
    Given Kullanici siteye gider "medunnaUrl"
  Scenario: TC01 Herhangi bir karakter içeren ve boş bırakılamayan geçerli bir "Username" olmalıdır
    When  Sayfaya gidildigi ana sayfadaki WELCOME TO MEDUNNA texti ile dogrulanir
    And   Kullanici sayfaya giris icin CONTACT linkinin sagında bulunan kullanici girisi linkine tiklar
    Then  Kullanici kayıt olusturabilmek icin Register linkine tiklar
    And   Kayit sayfasinda olundugu Registration yazisi ile dogrulanir
    Then  Kullanici gecerli bir ssn numarasi girmeli
    Then  Firstname textboxina gecerli bir isim girilmeli
    Then  Lastname textboxina gecerli bir soyisim girilmeli
    And   Username textboxi bos birakildiginda cikan Your username is required textinin gorunurlugu test edilmeli
    Then  Bosluk birakilarak girilen bir username in gecersiz oldugu Your username is invalid textinin gorunurlugu ile test edilmeli
    And   Username textboxina gecerli bir kullanici adı girilmeli
  Scenario Outline: TC02 Email adresi "@" ve "." karakterleri olmadan doldurulamamalıdır.
    When  Sayfaya gidildigi ana sayfadaki WELCOME TO MEDUNNA texti ile dogrulanir
    And   Kullanici sayfaya giris icin CONTACT linkinin sagında bulunan kullanici girisi linkine tiklar
    Then  Kullanici kayıt olusturabilmek icin Register linkine tiklar
    And   Kayit sayfasinda olundugu Registration yazisi ile dogrulanir
    Then  Kullanici gecerli bir ssn numarasi girmeli
    Then  Firstname textboxina gecerli bir isim girilmeli
    Then  Lastname textboxina gecerli bir soyisim girilmeli
    And   Username textboxina gecerli bir kullanici adı girilmeli
    Then  Email textboxina "<isaretler>" @ ve . isareti icermeyen bir adres girildiginde cikan This field is invalid textin gorunurlugu test edilmeli
    And   Email textboxina bes karakterden az olucak sekilde email adresi yazildiginda cikan Your email is required to be at least five characters textin gorunurlugu test edilmeli
    Examples:
      | isaretler          |
      |qakubrahotmail.com  |
      |qakubra@hotmailcom |
      |qakubrahotmailcom   |
  Scenario: TC03 e-mail bos birakilamaz
    When  Sayfaya gidildigi ana sayfadaki WELCOME TO MEDUNNA texti ile dogrulanir
    And   Kullanici sayfaya giris icin CONTACT linkinin sagında bulunan kullanici girisi linkine tiklar
    Then  Kullanici kayıt olusturabilmek icin Register linkine tiklar
    And   Kayit sayfasinda olundugu Registration yazisi ile dogrulanir
    Then  Kullanici gecerli bir ssn numarasi girmeli
    Then  Firstname textboxina gecerli bir isim girilmeli
    Then  Lastname textboxina gecerli bir soyisim girilmeli
    And   Username textboxina gecerli bir kullanici adı girilmeli
    Then  Email textboxi bos birakildiginda cikan Your email is required textinin gorunurlugu test edilmeli
    And   Email textboxina gecerli bir adres girilmeli