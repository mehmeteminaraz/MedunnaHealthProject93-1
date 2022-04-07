Feature: US01 Kayıt olmak için SSN, Firstname ve Lastname bilgileri girililebilmelidir.

  Background:
    Given Kullanıcı siteye gider "medunnaUrl"


  Scenario Outline: TC01 Geçerli bir SSN, 3. ve 5. rakamdan sonra "-"  içermeli ve 9 rakamdan oluşmalıdır.

    When  Sayfaya gidildiği ana sayfadaki WELCOME TO MEDUNNA texti ile doğrulanır
    And   Kullanıcı sayfaya giriş için CONTACT linkinin sağında bulunan kullanıcı girişi linkine tıklar
    Then  Kullanıcı kayıt oluşturabilmek için Register linkine tıklar
    And   Kayıt sayfasında olunduğu Registration yazısı ile doğrulanır
    Then  Girilecek olan "<ssn>" numarası dokuzu geçmemeli ve dokuzun altında olmamalı
    Then  Kullanıcı SSN numarasının üçüncü ve beşinci rakamından sonra - "<tireliSSN>" koymalı
    And   Geçersiz SSN numarası girildğinde Your SSN is invalid text'inin görünürlüğü test edilmeli

    Examples:test
             |     ssn   |      tireliSSN    |
             |0          | -12364-569-7      |
             |63         | 23-98-48-237      |
             |987        | 1-2-3-4-5-6-7-8-9 |
             |0236       | 123654987-        |
             |12354      | 1234567-89        |
             |654832     | -1-29-48-963-4    |
             |8756214    | 223-897-456       |
             |12345678   | --------          |
             |12345-67891|  -1236-           |

  Scenario: TC02 SSN boş bırakılamaz

    When  Sayfaya gidildiği ana sayfadaki WELCOME TO MEDUNNA texti ile doğrulanır
    And   Kullanıcı sayfaya giriş için CONTACT linkinin sağında bulunan kullanıcı girişi linkine tıklar
    Then  Kullanıcı kayıt oluşturabilmek için Register linkine tıklar
    And   Kayıt sayfasında olunduğu Registration yazısı ile doğrulanır
    And   SSN textboxı boş bırakıldığında Your SSN is required textinin görünürlüğü test edilmeli
    Then  Kullanıcı geçerli bir ssn numarası girmeli

  Scenario: TC03 Herhangi bir karakter içeren ve boş bırakılamayan geçerli bir "First Name" olmalıdır

    When  Sayfaya gidildiği ana sayfadaki WELCOME TO MEDUNNA texti ile doğrulanır
    And   Kullanıcı sayfaya giriş için CONTACT linkinin sağında bulunan kullanıcı girişi linkine tıklar
    Then  Kullanıcı kayıt oluşturabilmek için Register linkine tıklar
    And   Kayıt sayfasında olunduğu Registration yazısı ile doğrulanır
    And   Kullanıcı geçerli bir ssn numarası girmeli
    Then  Firstname textboxı boş bırakıldığında çıkan Your FirstName is required textinin görünürlüğü test edilmeli
    And   Firstname textboxına geçerli bir isim girilmeli

  Scenario: TC04 Herhangi bir karakter içeren ve boş bırakılamayan geçerli bir "Last Name" olmalıdır

    When  Sayfaya gidildiği ana sayfadaki WELCOME TO MEDUNNA texti ile doğrulanır
    And   Kullanıcı sayfaya giriş için CONTACT linkinin sağında bulunan kullanıcı girişi linkine tıklar
    Then  Kullanıcı kayıt oluşturabilmek için Register linkine tıklar
    And   Kayıt sayfasında olunduğu Registration yazısı ile doğrulanır
    And   Kullanıcı geçerli bir ssn numarası girmeli
    Then  Firstname textboxına geçerli bir isim girilmeli
    And   Lastname textboxı boş bırakıldığında çıkan Your LastName is required textinin görünürlüğü test edilmeli
    Then  Lastname textboxına geçerli bir soyisim girilmeli