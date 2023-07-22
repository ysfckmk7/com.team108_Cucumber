Feature:
  @Sony
  Scenario:

    Given Kullanici "sonyUrl" sayfasina gider
    Then cerezleri kabul etmez
    Then sayfanın Url'sinin "Sony" kelimesinin icerdigini test eder
    Then Businesses_ProductsButonuna tıklar
    Then acılan bolumlerden Muzık butonunu secer
    Then ilgili okuma parcasina gider
    Then sayfanin "alt" urunune gidip geri yukarı "ust" urune gelir




