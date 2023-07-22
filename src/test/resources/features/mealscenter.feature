Feature:

  Background:
    Given Kullanici "mealsCenterUrl" sayfasina gider
    Then cerezleri KabulEder


  @mealsCenter
  Scenario:
    Then Header bolumundeki butonlari tanıtır


    @mealsFooter
    Scenario:
      Then Footer bolumundeki Contact us butonuna tıkla
      Then Contact us sayfasının iceriginideki text'i yazdır
      And anasayfaya geri doner
      And cart sekmesini giris yaparak icergini yazdirir
      And sayfayi kapatir


