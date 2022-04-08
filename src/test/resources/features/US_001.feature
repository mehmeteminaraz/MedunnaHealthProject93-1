Feature: US01 Kayit olmak icin SSN, Firstname ve Lastname bilgileri girililebilmelidir.
  Background:
    Given Kullanici siteye gider "medunnaUrl"
  Scenario Outline: TC01 Gecerli bir SSN, 3. ve 5. rakamdan sonra "-"  icermeli ve 9 rakamdan olusmalıdır.
    When  Sayfaya gidildigi ana sayfadaki WELCOME TO MEDUNNA texti ile dogrulanir
    And   Kullanici sayfaya giris icin CONTACT linkinin sagında bulunan kullanici girisi linkine tiklar
    Then  Kullanici kayıt olusturabilmek icin Register linkine tiklar
    And   Kayit sayfasinda olundugu Registration yazisi ile dogrulanir
    Then  Girilecek olan "<ssn>" numarasi dokuzu gecmemeli ve dokuzun altinda olmamali
    Then  Kullanici SSN numarasinin ucuncu ve besinci rakamından sonra - isareti "<tireliSSN>" koymali
    And   Gecersiz SSN numarasi girildiginde Your SSN is invalid text'inin gorunurlugu test edilmeli
    Examples:test
      | ssn         | tireliSSN          |
      | 0           |  -12364-569-7      |
      | 63          |  23-98-48-237      |
      | 987         |  1-2-3-4-5-6-7-8-9 |
      | 0236        |  123654987-        |
      | 12354       |  1234567-89        |
      | 654832      |  -1-29-48-963-4    |
      | 8756214     |  223-897-456       |
      | 12345678    |  --------          |
      | 12345-67891 |   -1236-           |
  Scenario: TC02 SSN bos birakilamaz
    When  Sayfaya gidildigi ana sayfadaki WELCOME TO MEDUNNA texti ile dogrulanir
    And   Kullanici sayfaya giris icin CONTACT linkinin sagında bulunan kullanici girisi linkine tiklar
    Then  Kullanici kayıt olusturabilmek icin Register linkine tiklar
    And   Kayit sayfasinda olundugu Registration yazisi ile dogrulanir
    And   SSN textboxi bos birakildiginda Your SSN is required textinin gorunurlugu test edilmeli
    Then  Kullanici gecerli bir ssn numarasi girmeli
  Scenario: TC03 Herhangi bir karakter içeren ve boş bırakılamayan geçerli bir "First Name" olmalıdır
    When  Sayfaya gidildigi ana sayfadaki WELCOME TO MEDUNNA texti ile dogrulanir
    And   Kullanici sayfaya giris icin CONTACT linkinin sagında bulunan kullanici girisi linkine tiklar
    Then  Kullanici kayıt olusturabilmek icin Register linkine tiklar
    And   Kayit sayfasinda olundugu Registration yazisi ile dogrulanir
    Then  Kullanici gecerli bir ssn numarasi girmeli
    Then  Firstname textboxı bos birakildiginda cikan Your FirstName is required textinin gorunurlugu test edilmeli
    And   Firstname textboxina gecerli bir isim girilmeli
  Scenario: TC04 Herhangi bir karakter içeren ve boş bırakılamayan geçerli bir "Last Name" olmalıdır
    When  Sayfaya gidildigi ana sayfadaki WELCOME TO MEDUNNA texti ile dogrulanir
    And   Kullanici sayfaya giris icin CONTACT linkinin sagında bulunan kullanici girisi linkine tiklar
    Then  Kullanici kayıt olusturabilmek icin Register linkine tiklar
    And   Kayit sayfasinda olundugu Registration yazisi ile dogrulanir
    Then  Kullanici gecerli bir ssn numarasi girmeli
    Then  Firstname textboxina gecerli bir isim girilmeli
    And   Lastname textboxi bos birakildiginda cikan Your LastName is required textinin gorunurlugu test edilmeli
    Then  Lastname textboxina gecerli bir soyisim girilmeli