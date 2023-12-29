package com.step;

import com.Base.Base_Class;
import com.POM.Log_In_Page;
import com.POM.Log_In_Page_;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Step_definition extends Base_Class{
	Log_In_Page lp = new Log_In_Page();
	
	 @Given("User launch the Url {string}")
	public void user_launch_the_url(String s) {
	  LaunchUrl(s);
	}

    @And("User clicks on shop men")
	public void user_clicks_on_shop_men() throws InterruptedException {
    Thread.sleep(3000);
    lp.getShopmen().click();
	}
	@And("user clicks to women")
	public void user_clicks_to_women() throws InterruptedException {
	Thread.sleep(3000); 
	lp.getWomen().click();
	}
	@And("user clicks on sarees")
	public void user_clicks_on_sarees() throws InterruptedException {
	Thread.sleep(3000); 
	  lp.getSarees().click(); 
	}
	@Given("user clicks on model")
	public void user_clicks_on_model() throws InterruptedException {
	Thread.sleep(3000); 	
	lp.getModel().click();   
	}
	@And("user selects the varient")
	public void user_selects_the_varient() throws InterruptedException {
	Thread.sleep(3000); 
    lp.getVarient().click();   
	}
	@And("user selects the colour")
	public void user_selects_the_colour() throws InterruptedException  {
	Thread.sleep(3000); 
	lp.getColour().click();
	}
	@And("user clicks add to cart")
	public void user_clicks_add_to_cart() throws InterruptedException {
	Thread.sleep(3000); 
	lp.getAddtocart().click();
}

	

	
}
