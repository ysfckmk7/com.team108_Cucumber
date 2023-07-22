
Feature:
  @Samsung
  Scenario:


    Given kullanici samsung anasayfaya gider
    Then cerezleriKabulEder
    Then aramalogosunu tıklar
    Then aramakutusunanda samsung A32 cihazini aratir
    Then arama sonucunun Akıllı Telefonlar icerdigini test eder
    Then ilk urune tıklar
    And arama sonucunun Galaxy A32 icerdigini test eder
    And telefon rengini mavi olarak belirler
    And sayfayi kapatir

    @Vestel
    Scenario:

      Given Kullanici vestel anasayfaya gider
      Then aramakutusuna tıklar
      Then aramakutunda TV aratir
      Then sayfanini enaltindaki ürünü secer
      Then acilan sayfadaki urunun 55U9700T kodlu ürün oldugunu test eder
      And urunun 55 inc  oldugunu test eder
      And sayfayi asagıya dogru kaydırır sonra geri yukarı cıkar
      And vestel logosuna tıklayarak anasayfaya geri doner
      And beyazesya urunun butonu üzerine gelir
      And şarap sogutucu urunune tıklar
      And tek olan sogutucuyu secer
      Then urun bilgilerinin Vestel VLP 4000 kodlu urun oldugunu test eder
      And vestel logosuna tıklayarak anasayfaya geri doner
      And sayfayi kapatir








