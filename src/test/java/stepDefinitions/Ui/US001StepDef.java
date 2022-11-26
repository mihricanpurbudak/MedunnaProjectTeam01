package stepDefinitions.Ui;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.US001Page;
import pages.US002Page;
import utilities.ConfigReader;
import utilities.Driver;

import static utilities.ReusableMethods.waitFor;

public class US001StepDef {
    US001Page us001=new US001Page();
    US002Page us002=new US002Page();

    @Given("Kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));
        waitFor(3);
    }
    @Given("Kullanici Anasayfada kullanici ikonuna tiklar")
    public void kullanici_anasayfada_kullanici_ikonuna_tiklar() {

        us001.accuntButton();

    }
    @Given("Kullanici ikonu altindaki register'i tiklar")
    public void kullanici_ikonu_altindaki_register_i_tiklar() {
        us001.registerButton();
    }
    @When("Kullanici SSN kutucuguna tiklar ve bos birakir")
    public void kullaniciSSNKutucugunaTiklarVeBosBirakir() {
        us001.ssnTextBox.click();

    }


    @Then("KUllanici SSN kutucugunu bos birakinca {string} uyari mesajini goruntuler")
    public void k_ullanici_ssn_kutucugunu_bos_birakinca_uyari_mesajini_goruntuler(String string) {
        us001.ssnRequiredMessage();
    }


    @Then("Kullanici Your SSN is invalid' uyari mesajini goruntuler")
    public void kullanici_your_ssn_is_invalid_uyari_mesajini_goruntuler() {
        us001.ssnRequiredMessage();

    }
    @And("Kullanici acilan sayfada SSN kutusu icerisine {string}lerden ve {string}lerden  olusan SSN girer")
    public void kullaniciAcilanSayfadaSSNKutusuIcerisineLerdenVeLerdenOlusanSSNGirer(String karekter, String harf) throws InterruptedException {
        us001.falseSsn(karekter,harf);
    }


    @And("Kullanici acilan sayfada SSN kutusunun icerisine dokuz rakamdan olusan ve ucuncu ve besinci rakamdan sonra - iceren  bir SSN girer")
    public void kullaniciAcilanSayfadaSSNKutusununIcerisineDokuzRakamdanOlusanVeUcuncuVeBesinciRakamdanSonraIcerenBirSSNGirer() throws InterruptedException {
        us001.GecerliSsn();
    }


    @And("Kullanici browseri kapatir")
    public void kullaniciBrowseriKapatir() {
        Driver.closeDriver();
    }

    @And("Kullanici acilan sayfada SSN kutusunun icerisine {string}rakam girer yada {string}  iceren bir SSN girer")
    public void kullaniciAcilanSayfadaSSNKutusununIcerisineRakamGirerYadaIcerenBirSSNGirer(String sayi1, String sayi2) throws InterruptedException {
        us001.YanlisSsn(sayi1,sayi2);
    }


    @And("Kullanici dogru SSN girdigini dogrular")
    public void kullaniciDogruSSNGirdiginiDogrular() {
        us001.ValidSsn();
    }
    @Then("Kullanici FirstName kutusuna tiklar")
     public void kullaniciFirstNameKutusunaTiklar(){
        us001.firstNameTextBox();
            }

    @Then("Kullanici FirstName kutusuna tiklar ve bos birakir")
    public void kullaniciFirstNameKutusunaTiklarVeBosBirakir() {
        us001.firstNameTextBox();
    }


    @And("Kullanici LastName kutusuna tiklar")
    public void kullaniciLastNameKutusunaTiklar() {
        us001.lastNameTextBox();

    }



    @And("Kullanici FirstName kutusunun icerisine herhangi bir {string} olusan isim girer")
    public void kullaniciFirstNameKutusununIcerisineHerhangiBirOlusanIsimGirer(String arg0) {
        us001.karisikfirstName(arg0);
    }

    @And("Kullanici dogru Firstname girdigini dogrular")
    public void kullaniciDogruFirstnameGirdiginiDogrular() {
        us001.firstNameValidConfirm();
    }

    @Then("Kullanici FirstName kutusuna gecerli bir isim girer")
    public void kullaniciFirstNameKutusunaGecerliBirIsimGirer() {
        us001.validfirstName();
    }

    @And("Kullanici LastName kutusuna tiklar ve bos birakir")
    public void kullaniciLastNameKutusunaTiklarVeBosBirakir() {
        us001.lastNameTextBox();

    }

    @And("Kullanici User name kutusuna tiklar")
    public void kullaniciUserNameKutusunaTiklar() {
        us002.userNameTextBox();

    }

    @And("KUllanici LastName kutucugunu bos birakinca Your LastName is required. uyari mesajini goruntuler")
    public void kullaniciLastNameKutucugunuBosBirakincaYourLastNameIsRequiredUyariMesajiniGoruntuler() {
        us001.lastNameRequiredMessage();
    }

    @Then("Kullanici Last Name kutusuna herhangi bir {string} olusan soyisim girer")
    public void kullaniciLastNameKutusunaHerhangiBirOlusanSoyisimGirer(String arg0) {
        us001.karisiklastName(arg0);
    }
    @And("Kullanici dogru LastName girdigini dogrular")
    public void kullaniciDogruLastNameGirdiginiDogrular() {
        us001.validfirstName();
    }


}
