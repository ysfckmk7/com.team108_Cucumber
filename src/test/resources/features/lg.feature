Feature:
  @LG
  Scenario: 
    
    Given Kullanici "https://www.lg.com/tr" sayfasina gider
    Then cerezleri Kabul Eder
    Then tv butonun uzerıne gelir
    Then ses butonun uzerıne gelir
    Then beyaz eşya butonun uzerıne gelir
    Then klima_isitma butonun uzerıne gelir
    Then monitor butonun uzerıne gelir
    Then projektor butonun uzerıne gelir
    Then lg brandshop butonun uzerıne gelir
    Then destek brandshop butonun uzerıne gelir
    Then arama butonuna tıklar
    Then arama kutusuna leptop yazar ve enter tusuna basar
    Then listede cıkan urunler butonuna tıklar
    And ikinci urunu secer
    And secilen urunun isminde "QHD Oyun Monitörü" icerdigini test eder
    And ikinci urunun ozellıkleri kontrol eder
    And ikici urunun ekran ozelliklerinden cozunurluk oranını ekrana yazdırır
    And anasayfaya doner
    And sayfayi kapatir




