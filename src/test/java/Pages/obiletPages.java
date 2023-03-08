package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileCommand;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.time.Duration;
import java.util.List;

public class obiletPages {
    private AppiumDriver driver;
    private WebDriverWait wait;
    private ElementHelper elementHelper;
    private final By hesabimButton = By.xpath("//android.widget.FrameLayout[@content-desc=\"Hesabım\"]/android.widget.ImageView");
    private final By UyeGirisiYapButton = By.xpath("//*[text()='HEMEN ÜYE OL']");
    private final By hemenUyeOlButton = By.id("");
    private final By emailTextbox = By.xpath("(//*[@class='android.widget.EditText'])[1]");
    private final By sifreTextbox = By.xpath("(//*[@class='android.widget.EditText'])[2]");
    private final By uyeOlButton = By.xpath("(//*[@class='android.widget.TextView'])[9]");
    private final By seyahatlarimButton = By.xpath("(//*[@class='android.widget.TextView'])[3]");
    private final By aramaSearchbox =  By.id("com.obilet.androidside:id/icon");
    private final By otobusBiletiBulButton = By.id("find_bus_journey_find_button");
    private final By otelButton = By.xpath("(//*[@class='android.view.View'])[2]");
    private final By otelAraButton = By.id("find_hotel_reservation_find_button");
    private final By neredeTextbox = By.id("find_hotel_reservation_to_where_textView");
    private final By ilSecimiTextbox = By.id("search_editText");
    private final By otelListesi = By.id("toolbar_hotel_detail");
    private final By otelSecButton = By.xpath("(//*[@class='android.view.ViewGroup'])[4]");
    private final By odaSecButton = By.id("select_room_button");
    private final By odaSecimiYapButton = By.xpath("(//android.widget.LinearLayout[2]//android.widget.TextView[text(), \"Odayı Seç\"])[2]");
    private final By checkoutEkrani = By.xpath("(//*[@class='android.view.ViewGroup'])[6]");
    public obiletPages(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver,Duration.ofSeconds(10L));
        this.elementHelper = new ElementHelper(driver);
    }

    public void hesabimSekmesiEkranUzerindeGorunurOlanaKadarBekle() {
        elementHelper.checkVisible(hesabimButton);
    }

    public void hesabimSekmesineTikla() {
        driver.findElement(hesabimButton).click();
    }

    public void uyeGirisiYapinButonunaTikla() {
        driver.findElement(UyeGirisiYapButton).click();

    }

    public void hemenUyeOlElementiSayfaUzerindeGorunurOlanaKadarBekle() {
       elementHelper.checkVisible(hemenUyeOlButton);
    }

    public void hemenUyeOlElementineTikla() {
        driver.findElement(hemenUyeOlButton).click();
    }

    public void emailElementiSayfaUzerindeGorunurOlanaBekle() {
        elementHelper.checkVisible(emailTextbox);
    }

    public void emailAlaninaTiklaveRandomBirEmailAdresiYaz() {
        elementHelper.RandomeMail(emailTextbox,"testotomasyon");

    }

    public void sifreAlaninaTiklaSifreGir() {
        elementHelper.findElement(sifreTextbox).sendKeys("Eda10.97");
    }

    public void uyeOlButonunaTikla() {
        driver.findElement(uyeOlButton).click();

    }

    public void hesabimButonuSayfaUzerindeGorunurOlanaBekle() {
        elementHelper.checkVisible(hesabimButton);
    }

    public void seyahatlerimButonuSayfaUzerindeGorunurOlanaBekle(){
        elementHelper.checkVisible(seyahatlarimButton);

    }

    public void araButonunaTikla(){
        driver.findElement(aramaSearchbox).click();

    }

    public void anasayfaSayfaUzerindeGorunurOlanaKadarBekle(){
        elementHelper.checkVisible(otobusBiletiBulButton);
    }

    public void otelButonunaTikla(){
        driver.findElement(otelButton).click();
    }

    public void otelRezervasyonuAramaEkraniSayfaUzerindeGorunurOlanaKadarBekle(){
        elementHelper.checkVisible(otelAraButton);
    }

    public void ilVeIlceSecimiYapilir(){
        elementHelper.findElement(neredeTextbox).click();
        elementHelper.findElement(ilSecimiTextbox).sendKeys("Antalya");
        List<WebElement> ListofElement = driver.findElements(By.id("search_editText"));
        ListofElement.get(2).click();

    }

    public void otelAraButonunaTikla(){
        driver.findElement(otelAraButton).click();
    }

    public void otelListesiSayfaUzerindeGorunurOlanaKadarBekle(){
        elementHelper.checkVisible(otelListesi);
    }

    public void otelSeciminiYap(){
        driver.findElement(otelSecButton).click();
    }

    public void otelDetayiSayfaUzerindeGorunurOlanaKadarBekle() {
        elementHelper.checkVisible(odaSecButton);
    }

    public void odaSecButonunaTikla() {
        driver.findElement(odaSecButton).click();

    }

    public void odaSeciminiYap() {
        driver.findElement(odaSecimiYapButton).click();

    }

    public void checkoutEkraniSayfaUzerindeGorunurOlanaKadarBekle() {
        elementHelper.checkVisible(checkoutEkrani);
    }
}
