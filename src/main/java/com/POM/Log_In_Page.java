package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base_Class;

public class Log_In_Page extends Base_Class{

public Log_In_Page() {
PageFactory.initElements(driver,this);
}

@FindBy(xpath = "//span[text()='SHOP MEN']")
private WebElement shopmen;
public WebElement getShopmen() {
	return shopmen;
}

@FindBy(xpath = "//div[@id='Woman']")
private WebElement women;
public WebElement getWomen() {
	return women;
}


@FindBy(xpath = "//div[@class='loaderCat vipsareesLdr dIb mA pA r0   h80 b4 l0 t0 ']")
private WebElement sarees;
public WebElement getSarees() {
	return sarees;
}
@FindBy(xpath = "(//div[@class='bs ls1 bgF _stt c0  fs14  ttU pR t6 lh28 z1 pb6 pt4 p08  wp100 oH toE wsN'])[1]")
private WebElement model;
public WebElement getModel() {
	return model;
}
@FindBy(xpath = "(//div[@class='prdC fs12 p8  pR taC bs  '])[2]")
private WebElement varient;
public WebElement getVarient() {
	return varient;
}
@FindBy(xpath = "//img[@class=' hbxs bxs color brp50 h40 w40 bs an-ll o0  sec']")
private WebElement colour;
public WebElement getColour() {
	return colour;
}
@FindBy(xpath = "//div[@data-pgn='Add to Cart']")
private WebElement addtocart;
public WebElement getAddtocart() {
	return addtocart;
}



}


