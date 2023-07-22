@Beko
Feature: US1012 Kullanici Beko sayfasinda arama yapar


  Scenario: TC01 Kullanici Bekoda Iphone aratir

    Given Kullanici Beko anasayfaya gider
    Then Cerezler kabul edilmez
    Then Kullanıcı avrupa kıtasını secer ve turkıye ulkesını secer
    Then cerezler kabul edilmez ikinci sayfa
    Then Anasayfada arama kutusuna tıklar "Buzdolabi " aratır
    And Arama sonuclarının "Buzdolabi " yazıldıgını test eder
    And Sayfayı kapatır

    @tosbiha
  Scenario:
    Given Kullanici "tosbihaUrl" sayfasina gider
    Then anasayfadaki butonlarin tek tek uzerinden gecer
    Then business altbilgileri tıklar
    Then  Contact us kismindan iletisim numarasi-mail-adres bilgilerini ekrana yazdirir
    And toshiba logosuna tiklar ve anasayfaya geri doner
    And Tosbiha About butonuna tıklar ve bilgilere erisir
    And Tosbiha ile ilgili bilgileri ekrana yazdirir
    And sayfayi kapatir





