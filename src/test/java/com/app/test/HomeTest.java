package com.app.test;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.app.page.BasePage;
import com.app.page.HomePage;


public class HomeTest {

	HomePage homePage;
	BasePage bp;

	public HomeTest() {
		homePage = new HomePage();
		bp = new BasePage();
	}

	@Test
	public void Verifiwomen() {
		Assert.assertTrue(homePage.getWomen().isDisplayed());
	}
	@Test
	public void verifywomendress(){
		Assert.assertTrue(homePage.getdress().isDisplayed());
	}
	@Test
	public void verifywomen(){
		Assert.assertTrue(homePage.gettshirt().isDisplayed());
	}
	
	@Test
	public void verifyNavPanelHeading() {
		Assert.assertTrue(homePage.getnavPanelHeading().contains("women,Dresses,TShirt"));
	}	
	
	@Test
	public void verifyeMailSubs() {
		homePage.geteMailSubs("mahie@gmail.com");
	}

	@Test
	public void verifyeMailSubsSucces() {
		Assert.assertTrue(homePage.geteMailSubsSucces().isDisplayed());
	}

	@Test
	public void verifySizeDisp() {
		Assert.assertTrue(homePage.getSizeDisp().isDisplayed());
	}
	
	@Test
	public void verifyProductCount() {
		homePage.getHeaderProdCount();
		int actual=homePage.getHeaderProdCount();
		int expected=homePage.getDressProdCount();
		Assert.assertEquals(actual==expected, "Failed,Count not Matched");
	}

//	@Test
//	public void verifyTwitter() {
//		Assert.assertTrue(bp.elementFound(homePage.getTwitter()));
//	}
//
//	@Test
//	public void verifyFacebook() {
//		Assert.assertTrue(bp.elementFound(homePage.getFacebook()));
//	}
//
//	@Test
//	public void verifyYoutube() {
//		Assert.assertTrue(bp.elementFound(homePage.getyouTube()));
//	}
	

	@Test
	public void verifyDescription() {
		Assert.assertTrue(bp.elementFound(homePage.getProductDesc()));
	}
}


