Feature: US_11

  Background:
    Given Kullanici siteye gider "medunnaUrl"

  Scenario Outline: TC_01 Doktor mevcut tarih ile ileri tarihler arasindaki statusu unapproved,pending ve cancelled olan appointments lari gorebilmelidir

    Given Kullanici kendisine verilen "<username>" ve "<password>" ile sign in yapar ve Appointments sayfasina girer
    Then Kullanici mevcut gun ile ileri tarihleri arasindaki statusu unapproved olanlari gorur
    And Kullanici mevcut gun ile ileri tarihleri arasindaki statusu pending olanlari gorur
    Then Kullanici mevcut gun ile ileri tarihlkeri arasindaki statusu Canceled olanlari gorur
    Examples: Username and password data
      | username | password    |
      | szgn     | ervanaz2012 |

  @Team93
  Scenario Outline: TC_02 Doktor patient icin edit yapabilmeli
    Given Kullanici kendisine verilen "<username>" ve "<password>" ile sign in yapar ve Appointments sayfasina girer
    Then Kullanici mevcut gun ile ileri tarihleri arasindaki statusu unapproved olanlari gorur
    And Kullanici patient icin edit e tiklar
    Then Kullanici Create or Edit an Appointment yazisini gorur
    Examples: Username and password data
      | username | password    |
      | szgn     | ervanaz2012 |


  Scenario Outline: TC_03 Kullanici edit sayfasinda patient icin gerekli alanlari bos birakmamali
    Given Kullanici kendisine verilen "<username>" ve "<password>" ile sign in yapar ve Appointments sayfasina girer
    Then Kullanici mevcut gun ile ileri tarihleri arasindaki statusu unapproved olanlari gorur
    And Kullanici patient icin edit e tiklar
    Given Kullanici Anamnesis box i bos biraktiginda This field is required uyari yazisini gormeli
    Then  Kullanici Treatment box i bos biraktiginda This field is required uyari yazisini gormeli
    Then  Kullanici Diagnosis box i bos biraktiginda This field is required uyari yazisini gormeli
    Examples: Username and password data
      | username | password    |
      | szgn     | ervanaz2012 |

  @Team93
  Scenario Outline: TC_04 Kullanici edit sayfasinda patient icin gerekli bilgileri ekleyip save edebilmeli
    Given Kullanici kendisine verilen "<username>" ve "<password>" ile sign in yapar ve Appointments sayfasina girer
    Then Kullanici mevcut gun ile ileri tarihleri arasindaki statusu unapproved olanlari gorur
    And Kullanici patient icin edit e tiklar
    Given Kullanici "<anamnesis>" box a veri girisi yapabilmeli
    Then Kullanici "<treatment>" box a veri girisi yapar
    And Kullanici "<diagnosis>" box a veri girisi yaparsa
    Then Kullanici save yapar ve succesfully saved yazisini gorur

    Examples: Username and password data
      | username | password    |anamnesis | treatment | diagnosis |
      | szgn     | ervanaz2012 |anemi     | treatmentt | diagnosiss |


  Scenario Outline: TC_05 Kullanici patieint icin status u cancelled yapabilmeli
    Given Kullanici kendisine verilen "<username>" ve "<password>" ile sign in yapar ve Appointments sayfasina girer
    Then Kullanici mevcut gun ile ileri tarihleri arasindaki statusu unapproved olanlari gorur
    And Kullanici patient icin edit e tiklar
    And Kullanici statusu cancelled yapar
    Given Kullanici "<anamnesis>" box a veri girisi yapabilmeli
    Then Kullanici "<treatment>" box a veri girisi yapar
    And Kullanici "<diagnosis>" box a veri girisi yaparsa
    Then Kullanici save yapar ve succesfully saved yazisini gorur

    Examples: Username and password data
      | username | password    |
      | szgn     | ervanaz2012 |
    Examples: veriler
      | anamnesis | treatment | diagnosis |
      | anemi     | treatmentt | diagnosiss |


