package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class StepDefinition {
	WebDriver d;
	@Given("User should be in the telecom home pagess")
	public void user_should_be_in_the_telecom_home_pagess() {
	 System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\Addtariff\\Driver\\chromedriver.exe");
	 d=new ChromeDriver();
	 d.get("http://demo.guru99.com/telecom/");
	}

	@Given("click add tariff buttons")
	public void click_add_tariff_buttons() {
	 d.findElement(By.xpath("/html/body/section/div/div[3]/div[1]/h3/a")).click();
	}

	//@When("User enter all the datasss.")
	//public void user_enter_all_the_datasss(DataTable tList) {
		
		//List<List<String>> datas = tList.asLists(String.class);
		//d.findElement(By.id("rental1")).sendKeys(datas.get(1).get(0));
		//d.findElement(By.id("local_minutes")).sendKeys(datas.get(1).get(1));
		//d.findElement(By.id("inter_minutes")).sendKeys(datas.get(0).get(3));
		//d.findElement(By.id("sms_pack")).sendKeys(datas.get(0).get(2));
		//d.findElement(By.id("minutes_charges")).sendKeys(datas.get(2).get(4));
		//d.findElement(By.id("inter_charges")).sendKeys(datas.get(3).get(5));
		//d.findElement(By.id("sms_charges")).sendKeys(datas.get(1).get(6));
	//}
	//@When("user chooses to tariff plans")
	//public void user_chooses_to_tariff_plans(io.cucumber.datatable.DataTable onemap) {
	//Map<String,String> datas=onemap.asMap(String.class, String.class);
	//d.findElement(By.id("rental1")).sendKeys(datas.get("re"));
	//d.findElement(By.id("local_minutes")).sendKeys(datas.get("lm"));
	//d.findElement(By.id("inter_minutes")).sendKeys(datas.get("im"));
	//d.findElement(By.id("sms_pack")).sendKeys(datas.get("sp"));
	//d.findElement(By.id("minutes_charges")).sendKeys(datas.get("mc"));
	//d.findElement(By.id("inter_charges")).sendKeys(datas.get("ic"));
	//d.findElement(By.id("sms_charges")).sendKeys(datas.get("sc"));
	//}
	
	@When("user check the tariff plans")
	public void user_check_the_tariff_plans(io.cucumber.datatable.DataTable twomap) {
		List<Map<String,String>>datas=twomap.asMaps(String.class,String.class);
		d.findElement(By.id("rental1")).sendKeys(datas.get(0).get("ren"));
		d.findElement(By.id("local_minutes")).sendKeys(datas.get(1).get("lme"));
		d.findElement(By.id("inter_minutes")).sendKeys(datas.get(1).get("ime"));
		d.findElement(By.id("sms_pack")).sendKeys(datas.get(0).get("sps"));
		d.findElement(By.id("minutes_charges")).sendKeys(datas.get(1).get("mcs"));
		d.findElement(By.id("inter_charges")).sendKeys(datas.get(0).get("ics"));
		d.findElement(By.id("sms_charges")).sendKeys(datas.get(1).get("scs"));
	}
	
	@When("click on submit buttonss")
	public void click_on_submit_buttonss() {
		d.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("user should be displayed home button is enteredd")
	public void user_should_be_displayed_home_button_is_enteredd() {
		WebElement tfId = d.findElement(By.xpath( "(//a[text()='Home'])[1]"));
	    Assert.assertTrue(tfId.isDisplayed());
	}
	}


