@obilet
  Feature: obilet Mobil Test Otomasyon UI Calismasi
    Scenario: Yeni Uyelik Olusturma ve Otel Rezervasyonu Yapma
      When Hesabim sekmesi ekran uzerinde gorunur olana kadar bekle
      When Hesabim sekmesine tikla
      When Uye girisi yapin butonuna tikla
      Then Hemen uye ol elementi sayfa uzerinde gorunur olana kadar bekle
      When Hemen uye ol elementine tikla
      Then Email elementi sayfa uzerinde gorunur olana bekle
      When Email elementine tikla ve random bir email adresi yaz
      When Sifre alanina tikla ve sifre gir
      When Uye ol butonuna tikla
      Then Seyahatlerim butonu sayfa uzerinde gorunur olana bekle
      When Ara butonuna tikla
      Then Anasayfa sayfa uzerinde gorunur olana kadar bekle
      When Otel butonuna tikla
      Then Otel rezervasyonu arama ekrani sayfa uzerinde gorunur olana kadar bekle
      When il ve ilce secimi yapilir
      When Otel ara butonuna tikla
      Then Otel listesi sayfa uzerinde gorunur olana kadar bekle
      When Otel secimini yap
      Then Otel detayi sayfa uzerinde gorunur olana kadar bekle
      When Oda sec butonuna tikla
      When Oda secimini yap
      Then Checkout ekrani sayfa uzerinde gorunur olana kadar bekle




