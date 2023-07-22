Feature:Q1 Kullanici editor sayfasina gider
@ss


  Scenario:TC04 Kullanici editorr sayfasinda bilgi girisi yapar

   When kullanici editorUrl anasayfaya gider
    Then new butonuna basar
    And tum bilgileri girer
    And Create tusuna basar
    When kullanici ilk isim ile arama yapar
    Then isim bolumunde isminin oldugunu dogrular
