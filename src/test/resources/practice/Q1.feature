Feature: Q1 Kullanici Amazon sayfasina gider

  Scenario:TC01 Kullanici amazon sayfasinda iphone aratir
    Given  kullanici "amazonUrl" anasayfaya gider
    And arama kutusuna iPhone yazar ve enter tusuna basar
    Then sonuclarin iPhone icerdigini test eder

    Scenario:TC02 Kullanici amazon sayfasinda tea pot aramasi yapar
    Given kullanici Amazon anasayfaya gider
    And arama kutusuna "tea pot" yazar ve enter tusuna basar
    Then sonuclarin "tea pot" icerdigini test eder


    Scenario: TC03 Kullanici amazon sayfasinda flower aratir
    Given kullanici Amazon anasayfaya gider
    And arama kutusuna "flower" yazar ve enter tusuna basar
    Then sonuclarin "flower" icerdigini test eder

