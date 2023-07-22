Feature: Kullanıcı farklı Url adreslerinde cesitli aramalar yapabilmelidir
  
  Scenario Outline: Kullanıcı karısık ornek test eder
    
    Given kullanici "samsungUrl" anasayfaya gider
    Then aramalogosunu tıklar
    Then samsung adresinde "<kelimeler>" icin arama yapar


    Examples:
      | kelimeler                  |
      | Televizyon                 |
      | Monitor                    |
      | Dijital Fotograf cercevesi |
      | PC                         |
      | Dijital Fotograf Makinesi  |

  Scenario Outline: Kullanıcı karısık ornek test eder






    Examples:
    ||
    ||
    ||
    ||
    ||
    ||
    ||
