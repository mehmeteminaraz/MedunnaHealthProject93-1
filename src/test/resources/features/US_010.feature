Feature: US_10

  Scenario Outline: Doktor randevu listesini gorebilmeli
    Given kullanici "<title>" olarak oturum acar
    And kullanici Randevularim ogesini secer ve tiklar
    When kullanici Randevular sayfasinda oldugunu dogrular
    And kullanici "<fromDate>" ve "<toDate>" saglayan zaman dilimlerini secer
    Then kullanici randevularin ve zaman araliklarinin listesini gormelidir
    Then kullanici randevu listesinin bilgilerini gormelidir

    Examples:
      |title |fromDate|toDate|
      |doctor|26/02/2022  |11/03/2022|

  Scenario Outline:  Yonetici olarak yeni bir randevu olusturma
    Given kullanici "<username>","<password>" yonetici olarak oturum acar
    And kullanici randevu sayfasina gider
    And kullanici yeni bir Randevu Olustur dugmesini tiklar
    And kullanici baslangic tarihi ve bitis tarihi saatini saglar
    And kullanici "<status>" durumunu secer
    And kullanici HastalikGecmisi "<Anamnesis>" ,Tedavi  "<Treatment>" ,Teshis "<Diagnosis>" ,Recete "<Prescription>" ,Aciklama "<Description>" saglar
    And kullanici ,Doktor "<Physician>", Hasta "<Patient>" secer
    When kullanici kaydet dugmesine tiklar
    Then kullanici basarı mesajini dogrular

    Examples: test data
      | username       | password         | status  | Anamnesis | Treatment   | Diagnosis | Prescription | Description | Physician | Patient |
      | adminTeam93-10 | adminTeam93-10   | PENDING | wdesfrg   | paracetamol | headache  | dwefrdfdr    | fergtfese   | 10504     | 4859    |