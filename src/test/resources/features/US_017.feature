Feature:US017  Admin,Test items(oge) Olusturur Gunceller Siler
  Background:
    Given Kullanici siteye gider "medunnaUrl"
  Scenario:Yonetici yeni test ogeleri olusturabilir
    Given Kullanici giris sayfasina gider
    Given Kullanici yonetici olarak oturum acar
    Then  admin Items&Titles menusune tiklar
    And Kullanici TestItemi tiklar
    And Kullanici createNewTestItem acilir menusunu titular
    And Kullanici "<testName>" bir test adi saglar
    Then Kullanici "<descriptionNote>" aciklamasini girer
    And Kullanici "<currentPrice>" fiyatini girer
    And Kullanici bir "<minValue>" minimum degeri girin
    And Kullanici bir maksimum deger "<maxValue>" girer
    Then Kullanici  Kaydet dugmesine tiklar
    And Kullanici ,odanin basariyla kaydedildigini dogrular

  Scenario:Admin test ogelerini goruntuleyebilir ve guncelleyebilir .
    Given Kullanici giris sayfasina gider
    Given Kullanici yonetici olarak oturum acar
    Then  admin Items&Titles menusune tiklar
    And Kullanici TestItemi tiklar
    And Kullanici createNewTestItem acilir menusunu titular
    And Kullanici "<testName>" bir test adi saglar
    Then Kullanici "<descriptionNote>"yeni  aciklama girer
    And Kullanici "<currentPrice>"yeni fiyat girer
    And Kullanici bir "<minValue>"yeni minimum deger girer
    And Kullanici yeni bir maksimum deger "<maxValue>" girer
    Then Kullanici  Kaydet dugmesine tiklar
    And Kullanici ,odanin basariyla kaydedildigini dogrular
    And Kullanici last arrow buttonnuna tiklar
    And Kullanici  last itemNumbera tiklar
    And Kullanici sil dugmesine tiklar
    And Kullanici TestItemi silmeyi onaylar
    Then Kullanici , odanın basariyla silindigini dogrularr