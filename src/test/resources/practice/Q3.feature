Feature:

  Scenario:


  Given kullanici "autoUrl" anasayfaya gider

    And user sign up linkine tiklar
    And user Create an account bölümüne name bilgisini girer
    And user Create an account bölümüne email adresi girer
    And signUp butonuna basar
    And user kisisel bilgilerini ve iletisim bilgilerini girer
    And user Create Account butonuna basar
    Then hesap olustugunu test edin
