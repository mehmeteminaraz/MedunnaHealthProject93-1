@Team93
Feature:Kayitli kullanici adi ve sifresi ile giris yapma, sifre güncelleme
  Background:
    Given Kullanici siteye gider "medunnaUrl"
    When  Sayfaya gidildigi ana sayfadaki WELCOME TO MEDUNNA texti ile dogrulanir
    And  Kullanici sayfaya giris icin CONTACT linkinin sagında bulunan kullanici girisi linkine tiklar
    Then Kullanici Sign in sekmesine tiklar.

  Scenario: Oturum acma
    Then Kullanici Username Box'a gecerli "username" girerr
    Then Kullanici Password Box'a gecerli "password" girer.
    Then Kullanici Sign in butonuna tiklar.
    Then Kullanici sayfayi kapatir

  Scenario: Mevcut parolayi güncelleme ( Pozitif Test)
    Then Kullanici Username Box'a gecerli "username" girerr
    Then Kullanici Password Box'a gecerli "password" girerr.
    Then Kullanici Sign in butonuna tiklar.
    Then Kullanici sayfa sag üstte isim ve soyisminin yer aldigi yaziya tiklar
    Then Kullanici acilan menüde password yazisina tiklar
    Then Kullanici acilan sayfadaki Current password kutucuğuna mevcut parolayi girer
    Then Kullanici new password kutucuğuna yeni parolayi girer
    Then Kullanici Password strength seviyesinin degistigini gorur
    Then Kullanici new password confirmation kutucuğuna yeni parolayi tekrar girer
    Then Kullanici save butonuna tiklar
    Then Passwordun basarili bir sekilde degistigi görülür
    Then Kullanici sayfayi kapatir
  Scenario Outline:Mevcut parolayi güncelleme ( Negatif Test)
    Then Kullanici username box'a gecerli "<username>" girer.
    Then Kullanici password box'a gecerli "<password>" girer.
    Then Kullanici Sign in butonuna tiklar.
    Then Kullanici sayfa sag üstte isim ve soyisminin yer aldigi yaziya tiklar
    Then Kullanici acilan menüde password yazisina tiklar
    Then Kullanici acilan sayfadaki Current password kutucuğuna "<mevcutparolayi>" girer
    Then Kullanici new password kutucuğuna "<yeniparolayi>" girer
    Then Kullanici new password confirmation kutucuğuna "<yeniparolayi>" tekrar girer
    Then Kullanici save butonuna tiklar
    Then Kullanici sayfa sag üstte isim ve soyisminin yer aldigi yaziya tiklar
    Then Kullanici acilan menüden signOut linkine tiklar
    Examples: Test Datalari
      | mevcutparolayi | yeniparolayi | username | password   |
      | Ab1234.        | 1234567890   | doc      | Ab1234.    |
      | 1234567890     | abcdef       | doc      | 1234567890 |
      | abcdef         | ABCDEFG      | doc      | abcdef     |
      | ABCDEFG        | Ab1234.      | doc      | ABCDEFG    |