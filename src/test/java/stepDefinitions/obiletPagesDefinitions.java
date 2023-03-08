package stepDefinitions;

import Pages.obiletPages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverFactory;

public class obiletPagesDefinitions {
    obiletPages obiletPages = new obiletPages(DriverFactory.getDriver());
    @When("Hesabim sekmesi ekran uzerinde gorunur olana kadar bekle")
    public void hesabimSekmesiEkranUzerindeGorunurOlanaKadarBekle() {
        obiletPages.hesabimSekmesiEkranUzerindeGorunurOlanaKadarBekle();
    }

    @When("Hesabim sekmesine tikla")
    public void hesabimSekmesineTikla() {
        obiletPages.hesabimSekmesineTikla();
    }

    @Then("Hemen uye ol elementi sayfa üzerinde gorunur olana kadar bekle")
    public void hemenUyeOlElementiSayfaUzerindeGorunurOlanaKadarBekle() {
        obiletPages.hemenUyeOlElementiSayfaUzerindeGorunurOlanaKadarBekle();
    }

    @When("Hemen uye ol elementine tikla")
    public void hemenUyeOlElementineTikla() {
        obiletPages.hemenUyeOlElementineTikla();
    }

    @Then("Email elementi sayfa uzerinde gorunur olana bekle")
    public void emailElementiSayfaUzerindeGorunurOlanaBekle() {
        obiletPages.emailElementiSayfaUzerindeGorunurOlanaBekle();
    }

    @When("Email elementine tikla ve random bir email adresi yaz")
    public void emailAlaninaTiklaveRandomBirEmailAdresiYaz() {
        obiletPages.emailAlaninaTiklaveRandomBirEmailAdresiYaz();
    }

    @When("Sifre alanina tikla ve sifre gir")
    public void sifreAlaninaTiklaSifreGir() {
        obiletPages.sifreAlaninaTiklaSifreGir();
    }

    @Then("Hesabim butonu sayfa uzerinde gorunur olana bekle")
    public void hesabimButonuSayfaUzerindeGorunurOlanaBekle() {
        obiletPages.hesabimButonuSayfaUzerindeGorunurOlanaBekle();
    }

    @When("Uye girisi yapin butonuna tikla")
    public void uyeGirisiYapinButonunaTikla() {
        obiletPages.uyeGirisiYapinButonunaTikla();

    }

    @Then("Seyahatlerim butonu sayfa uzerinde gorunur olana bekle")
    public void seyahatlerimButonuSayfaUzerindeGorunurOlanaBekle() {
        obiletPages.seyahatlerimButonuSayfaUzerindeGorunurOlanaBekle();
    }

    @When("Uye ol butonuna tikla")
    public void uyeOlButonunaTikla() {
        obiletPages.uyeOlButonunaTikla();
    }

    @When("Ara butonuna tıkla")
    public void araButonunaTikla() {
        obiletPages.araButonunaTikla();
    }

    @Then("Anasayfa sayfa uzerinde gorunur olana kadar bekle")
    public void anasayfaSayfaUzerindeGorunurOlanaKadarBekle() {
        obiletPages.anasayfaSayfaUzerindeGorunurOlanaKadarBekle();
    }

    @When("Otel butonuna tikla")
    public void otelButonunaTikla() {
        obiletPages.otelButonunaTikla();
    }

    @Then("Otel rezervasyonu arama ekrani sayfa uzerinde gorunur olana kadar bekle")
    public void otelRezervasyonuAramaEkraniSayfaUzerindeGorunurOlanaKadarBekle() {
        obiletPages.otelRezervasyonuAramaEkraniSayfaUzerindeGorunurOlanaKadarBekle();
    }

    @When("Il ve ilce secimi yapilir")
    public void ilVeIlceSecimiYapilir() {
        obiletPages.ilVeIlceSecimiYapilir();
    }

    @When("Otel ara butonuna tikla")
    public void otelAraButonunaTikla() {
        obiletPages.otelAraButonunaTikla();
    }

    @When("Otel listesi sayfa uzerinde gorunur olana kadar bekle")
    public void otelListesiSayfaUzerindeGorunurOlanaKadarBekle() {
        obiletPages.otelListesiSayfaUzerindeGorunurOlanaKadarBekle();
    }

    @When("Otel secimini yap")
    public void otelSeciminiYap() {
        obiletPages.otelSeciminiYap();
    }

    @Then("Otel detayi sayfa uzerinde gorunur oadar bekle")
    public void otelDetayiSayfaUzerindeGorunurOlanaKadarBekle() {
        obiletPages.otelDetayiSayfaUzerindeGorunurOlanaKadarBekle();
    }

    @When("Otel detayina tikla")
    public void odaSecButonunaTikla() {
        obiletPages.odaSecButonunaTikla();
    }

    @When("Oda secimini yap")
    public void odaSeciminiYap() {
        obiletPages.odaSeciminiYap();
    }

    @Then("Checkout ekrani sayfa uzerinde gorunur olana kadar bekle")
    public void checkoutEkraniSayfaUzerindeGorunurOlanaKadarBekle() {
        obiletPages.checkoutEkraniSayfaUzerindeGorunurOlanaKadarBekle();
    }
}
