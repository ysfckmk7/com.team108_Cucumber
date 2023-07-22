Feature:

  @trenyol
  Scenario Outline:

    Given Kullanici "trendyolUrl" sayfasina gider
    Then trendyolda "<listeler>" icin arama yapar
    Then sonuclarin "<listeler>" icerdigini kontrol eder

    Examples:
    |listeler      |
    |Termos        |
    |Kalemlik      |
    |Darbeli Matkap|
    |Utu masasi    |
    |Terlik        |
    |Yastik        |
    |Masa          |
