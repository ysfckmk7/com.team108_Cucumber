Feature:
  
  Scenario Outline:
    Given Kullanici "floUrl" sayfasina gider
    Then arama kutusuna "<aranan sozcukler>" yazar ve aratir
    Examples:
      |aranan sozcukler|
      |Ayakkabi|
      |Terlik|
      |Canta|
      |Saat|