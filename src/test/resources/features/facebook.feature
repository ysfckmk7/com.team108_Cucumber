Feature:
  Scenario Outline:

    Given kullanici "facebookUrl" anasayfaya gider
    Then facebook anasayfadan username olarak examples dan "<Mail>"  girer
    Then facebook anasayfadan password olarak examples dan "<Password>"  girer
    Then Login butonuna tıklar
    Then giris yapılamadıgını test eder
    And sayfayi kapatir

    Examples:
    |Mail|Password|
    |asf@gmail.com|Qdcsdf36|
    |iuy@gmail.com|dkYHJ785|
    |yst@gmail.com|SIKKoo78|
