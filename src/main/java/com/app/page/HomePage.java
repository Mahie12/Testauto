package com.app.page;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
	
	@FindBy(xpath = "//a[@title='Women']")
	private WebElement women;

	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement Dresses;

	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[3]/a")
	private WebElement TShirt;

	@FindBys(@FindBy(xpath = "//*[@id='columns']"))
	private List<WebElement> navPanelHeading;

	@FindBy(id="newsletter-input")
	private WebElement eMailSubs;
	
	@FindBy(xpath="//*[@id='newsletter_block_left']/div/form/div/button")
	private WebElement eMailSubbtn;

	@FindBy(xpath = "//p[@class='alert alert-success']")
	private WebElement eMailSubsSucces;

// Dress Page	

	@FindBy(id="//*[@id='ul_layered_id_attribute_group_1']")
	private WebElement sizedisp;
	
	
	@FindBy(xpath="//*[@id='center_column']/h1/span[2]")
	private WebElement HeaderProdCount;
	
	@FindBy(xpath="//*[@id='center_column']")
	private List<WebElement> dressProdCount;
	
	@FindBy(xpath="//*[@id='center_column']/ul/li[1]/div/div[2]/div[2]/a[1]/span")
	private WebElement addToCart;
	
	@FindBy(xpath="//*[@id='layer_cart']/div[1]/div[1]/span")
	private WebElement closeAddToCart;
	
//	@FindBy(xpath = "//li[@class='facebook']/a")
//	private WebElement FacebookBtn;
//	
//	@FindBy(xpath = "//li[@class='twitter']/a")
//	private WebElement TwitterBtn;
//	
//	@FindBy(xpath = "//li[@class='youtube']/a")
//	private WebElement youTubeBtn;

	@FindBy(xpath = "//div[@id='short_description_content']/p")
	private WebElement ProductDesc;


	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getWomen() {
		women.click();
		return women;
	}
	public WebElement getdress() {
		Dresses.click();
		return Dresses;
	}
	
	public WebElement gettshirt() {
		TShirt.click();
		return TShirt;
	}
	
//	public WebElement getnavPanelHeading() {
//		return navPanelHeading;
//	}
	
	public List<WebElement> getnavPanelHeading() {
		ArrayList<WebElement>list = new ArrayList<WebElement>();
		for (WebElement element : navPanelHeading) {
			list.add(element);
		}
		return list;
	}

	public void geteMailSubs( String Email) {
		setText(eMailSubs, Email);
		eMailSubbtn.click();
	}
	
	public WebElement geteMailSubsSucces() {
		return eMailSubsSucces;
	}

	public WebElement getSizeDisp() {
		return sizedisp;
	}
	
	public int getHeaderProdCount() {
		return Integer.parseInt(HeaderProdCount.getText().split(" ")[2]);
	}
	
	public int getDressProdCount() {
		return dressProdCount.size();
	}
	
	public void getaddtocart() {
		action.moveToElement(addToCart).click();
		closeAddToCart.click();

	}
//	
//	public WebElement getFacebook() {
//		return FacebookBtn;
//	}
//	
//	public WebElement getTwitter() {
//		return TwitterBtn;
//	}
//	
//	public WebElement getyouTube() {
//		return youTubeBtn;
//	}
//
	public WebElement getProductDesc() {
			return ProductDesc;
	}
}
