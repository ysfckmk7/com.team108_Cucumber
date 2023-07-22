Feature:

  Background:
    Given Kullanici "floUrl" sayfasina gider

  @Test01
  Scenario:
    Then kullanici header bolumunden Erkek butonuna tıklar
    Then kullanici header bolumunden Ayakkabi butonuna tıklar
    Then Kategori bolumunden Gunluk Ayakkabi urunlerini secer
    Then gunluk ayakkabi sekmesinden rahat ayakkabi secenegini tercih eder
    Then Cinsiyet'e kadin olarak ekleme yapilir
    Then beden olarak 42 numara secilir
    And marka'yi Polaris olarak belirler
    And ilk urun secilir
    And secilen urunun ismi console'a yazdirilir
    And urun sepete eklenir ve sepetime gidilir
    And urun fiyatinin 1000 Tl'nin altinda oldugu dogrulanir

    @Flo2
    Scenario:
      Then kullanici ana ekranda 3 saniye bekler
      Then kullanici arama kutusuna "spor ayakkabi" yazar ve aratir
      And ekrana cikan urunlerin 3. urunu secer
      And urun bilgilerini ekrana yazdirir


