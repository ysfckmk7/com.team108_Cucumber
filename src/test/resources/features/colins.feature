Feature:
  Background:
    Given Kullanici "colinsUrl" sayfasina gider


  @Colins
  Scenario:
    Then header bolumundeki butonlari kontrol eder

  @ColinsSepet
    Scenario:
      Then Erkek butonunun uzerine gelir
      Then Giyim olarak pantolon butonuna tıklar
      And ucuncu fotodaki urune tıklar
      And urun acıklaması ve urun tanımını ekrana yazdırır
      And urun sepete eklenirken beden olarak 32-32 secilir
      And urunu sepete ekler
      And sepetimi kontrol eder
      And sepet icersinde TEBRİKLER KARGON BEDAVA ! yazisini dogrular
      And colins logosuna tıklayarak anasayfaya doner
      And sayfayi kapatir

  @Terlik
      Scenario:
        Then Outlet butonunun uzerine gelir
        Then Erkek bolumunden terlik urununu secer
        Then urun rengini mavi secer
        Then urun bedeni 43 numarayi secer
        Then tek cesit kalan urunu secer
        And urun renk secimini siyah olarak degistirir
        And urun fiyatinin 100 Tl'den düsük fiyat oldugunu dogrular
        And urun olcusu 41 olarak degistirilir
        And urun sepete eklenir ardından sepetime gidilir
        And colins logosuna tıklayarak anasayfaya doner

  @Test
  Scenario:
    Given cerez kapatılır
    Given Kullanıcı outlet bolumunden corap urununu secer
    Then cinsiyet erkek,renk siyah olarak belirlenir
    Then ucuncu urun secilir
    Then urun ismini ekarana yazdırır
    Then beden tablosunun kontrolu yapılır
    Then erkek olcu Tablosu secilir
    Then pantolon ve cargo secimi yapılır
    Then bel olarak 40 olcusu secilir
    And beden tablosundan cıkıs yapılır
    And colins logosuna tıklayarak anasayfaya doner


  @Arama
        Scenario Outline:
          Given cerez kapatılır
          Given kullanıcı arama kutusuna tıklar
          Then "<orneklem>" aramalari aratir
          Examples:
          |orneklem|
          |erkek Terlik|
          |bayan pantolon|
          |tshirt|
          |Regular Fit  Kadın Siyah Ceket|
