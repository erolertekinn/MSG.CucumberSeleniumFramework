package com.msg.step_definitions;

import org.junit.Assert;

import com.msg.pages.HPZ3200WirelessMousePage;
import com.msg.pages.HomePage;
import com.msg.utilities.ConfigurationReader;
import com.msg.utilities.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShoppingCartStepDef {
	@Given("Benutzer ist auf der Home Page")
	public void benutzer_ist_auf_der_Home_Page() {
		String url = ConfigurationReader.get("url");
		Driver.get().get(url);
		Driver.get().manage().window().fullscreen();
	}

	@Given("Der Benutzer loggen sich in den Webshop ein")
	public void der_Benutzer_loggen_sich_in_den_Webshop_ein() {
		String username = ConfigurationReader.get("username");
		String password = ConfigurationReader.get("password");
		HomePage hp = new HomePage();
		hp.login(username, password);
	}

	@When("Der Benutzer navigiert zum Produkt HP Z3200 WIRELESS MOUSE")
	public void der_Benutzer_navigiert_zum_Produkt_HP_Z3200_WIRELESS_MOUSE() {
		HomePage hp = new HomePage();
		hp.navigateHPZ3200_WIRELESSMOUSE();
	}

	@When("Der Benutzer legt eine Maus der Farbe weiss und zwei der Farbe rot in den Warenkorb")
	public void der_Benutzer_legt_eine_Maus_der_Farbe_weiss_und_zwei_der_Farbe_rot_in_den_Warenkorb() {
		HPZ3200WirelessMousePage hpz3200 = new HPZ3200WirelessMousePage();
		hpz3200.addToCart();
	}

	@When("Der Benutzer fuehrt den Bezahlprozess bis zum Ende durch")
	public void der_Benutzer_fuehrt_den_Bezahlprozess_bis_zum_Ende_durch() {
		HPZ3200WirelessMousePage hpz3200 = new HPZ3200WirelessMousePage();
		hpz3200.paymentProcess();

	}

	@Then("Der richtige Preis der beiden roten Maeuse und der Gesamtpreis sollen verifiziert werden")
	public void der_richtige_Preis_der_beiden_roten_Maeuse_und_der_Gesamtpreis_sollen_verifiziert_werden() {
		HPZ3200WirelessMousePage hpz3200 = new HPZ3200WirelessMousePage();

		String str_redMaus = ConfigurationReader.get("redMouse_Price");
		double expectedPriceOfOne_redMaus = Double.parseDouble(str_redMaus);
		//System.out.println("Expected Price Of One Red Maus :"+expectedPriceOfOne_redMaus);

		String str_whiteMaus = ConfigurationReader.get("whiteMouse_Price");
		double expectedPriceOfOne_whiteMaus = Double.parseDouble(str_whiteMaus);
		//System.out.println("Expected Price Of One White Maus :"+expectedPriceOfOne_whiteMaus);

		String str_shippingCost = ConfigurationReader.get("shipping_Cost");
		double dbl_expectedShippingCost = Double.parseDouble(str_shippingCost);
		int expectedShippingCost = (int) (dbl_expectedShippingCost * 100);
		//System.out.println("Expected Price Of Shipping Cost :"+dbl_expectedShippingCost);
		
		
		
		
		double dbl_expectedWhiteMausPrice = hpz3200.getWhiteMausNumber() * (expectedPriceOfOne_whiteMaus);
		int expectedWhiteMausPrice = (int) (dbl_expectedWhiteMausPrice * 100);
		double dbl_actualWhiteMausPrice =hpz3200.getWhiteMausPrice();
		int actualWhiteMausPrice = (int) (dbl_actualWhiteMausPrice * 100);


		double dbl_expectedRedMausPrice=hpz3200.getRedMausNumber() * (expectedPriceOfOne_redMaus);
		int expectedRedMausPrice = (int) (dbl_expectedRedMausPrice * 100);
		double dbl_actualRedMausPrice=hpz3200.getRedMausPrice();
		int actualRedMausPrice = (int) (dbl_actualRedMausPrice * 100);
		System.out.println("Actual Red Maus Price ="+dbl_actualRedMausPrice);
		System.out.println("Expected Red Maus Price ="+dbl_expectedRedMausPrice);

		Assert.assertEquals(expectedRedMausPrice, actualRedMausPrice);

		double dbl_actualShippingCost=hpz3200.getshippingCost();
		int actualShippingCost = (int) (dbl_actualShippingCost * 100);
		
		double dbl_actualTotalCost1=hpz3200.getTotalCost();
		System.out.println("\nActual Total Cost1 = "+dbl_actualTotalCost1);
		int actualTotalCost1 = (int) (dbl_actualTotalCost1 * 100);
		
		double dbl_actualTotalCost2=dbl_actualWhiteMausPrice+dbl_actualRedMausPrice+dbl_actualShippingCost;
		System.out.println("Actual Total Cost2 = "+dbl_actualTotalCost2);
		double dbl_expectedTotalCost=dbl_expectedWhiteMausPrice+dbl_expectedRedMausPrice+dbl_expectedShippingCost;
		System.out.println("Expected Total Cost = "+dbl_expectedTotalCost);
		int expectedTotalCost = expectedWhiteMausPrice + expectedRedMausPrice + expectedShippingCost;
		int actualTotalCost2 = actualWhiteMausPrice + actualRedMausPrice + actualShippingCost;

		Assert.assertEquals(expectedTotalCost, actualTotalCost1);
		Assert.assertEquals(expectedTotalCost, actualTotalCost2);
		
		

	}
}
