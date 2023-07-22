Feature:

  @TurkNet
  Scenario:

  Given kullanici "turkNetUrl" anasayfaya gider
  Then Üst menüden "Bireysel" kategorisi altından "Abone Ol"u seçin.
  Then "Kişisel Bilgiler" sekmesinde:
  Then E-postanın yanlış formatta girilmesi ve ilgili uyarı mesajının görüntülenip görüntülenmediğinin kontrol edilmesi ekranda
  Then Geçerli girişleri yaptıktan sonra "Devam Et" butonuna tıklayın
  And "Adres Bilgileri" kısmı aşağıdaki ekran görüntüsündeki gibi doldurulur.
  And "Tercihleriniz" sekmesindeki:
  And "Tek Fiyat" başlığı altındaki ücretin 249,90 ₺ olduğunu kontrol ediniz.
  Then "Ek Hizmet" seçim bölümünde "Modem","Statik IP Tekli(Bireysel)" ve
  Then "Her Yöne 1000 Dakika Ev Telefonu" seçenekleri görüntülenebilir ve tıklanabilir.
  And "Fatura Tercihi" bölümünde "Değiştir" linkine tıklayın, seçenekler listesinden E-posta'yı seçin ve "Devam"a tıklayın düğme.
  And "Telefon numarasını doğrulama" açılır penceresinin görünüp görünmediğini kontrol edin.