Feature: US01 Kayıt olmak için SSN, Firstname ve Lastname bilgileri girililebilmelidir.

  Background:
    Given Kullanıcı siteye gider "medunnaUrl"

  @TC01
  Scenario: TC01 Geçerli bir SSN, 3. ve 5. rakamdan sonra "-"  içermeli ve 9 rakamdan oluşmalıdır.

    When  Sayfaya gidildiği ana sayfadaki WELCOME TO MEDUNNA texti ile doğrulanır
    And   Kullanıcı sayfaya giriş için CONTACT linkinin sağında bulunan kullanıcı girişi linkine tıklar
    Then  Kullanıcı kayıt oluşturabilmek için Register linkine tıklar
    And   Kayıt sayfasında olunduğu Registration yazısı ile doğrulanır
    And   Kullanıcı SSN textbox'ına rakamlardan oluşan bir "ssn" numarası girmeli
    Then  Girilecek olan SSN numarası dokuzu geçmemli ve dokuzun altında olmamalı
    Then  Kullanıcı SSN numarasının üçüncü ve beşinci rakamından sonra - koymalı
    And   Geçerli bir SSN numarası girilip girilmediği Your SSN is invalid textinin görünürlüğü ile test edilmeli


