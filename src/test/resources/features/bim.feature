Feature:
  Background:
    Given kullanici "bimUrl" anasayfaya gider
    Then cerezler red edilir

  @Bim1
  Scenario:
    Then header butonlari tıklayarak geri donus yapılır

  @Bim2
  Scenario:
    Given anasayfanin bu haftanin aktuel urunlerine tıklar
    Then sayfayi asagiya indirerek Kumtel Cam Set Üstü Ocak urunu secilir
    Then urun bilgileri ekrana yazdirilir

  @Bim3
  Scenario:
    Then anasayfadaki karsimiza cikan urunleri yana kaydir
    Then anasaydan iken yavasca sayfayi asagiya dogru kaydir sonra tekrar yukari dogru kaydir



