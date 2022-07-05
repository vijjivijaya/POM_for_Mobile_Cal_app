package com.bridgelabz.appium.pages;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import com.bridgelabz.appium.base.Base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Calc extends Base {
	// ADDITION
	@AndroidFindBy(id = "com.android.calculator2:id/digit_2")
	@CacheLookup
	private AndroidElement additiondigit1;

	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"plus\"]")
	@CacheLookup
	private AndroidElement plusBtn;

	@AndroidFindBy(id = "com.android.calculator2:id/digit_2")
	@CacheLookup
	private AndroidElement additiondigit2;

	@AndroidFindBy(id = ("com.android.calculator2:id/result"))
	@CacheLookup
	private AndroidElement additionresult;

	@AndroidFindBy(id = "com.android.calculator2:id/eq")
	@CacheLookup
	private AndroidElement additionequal;

	@AndroidFindBy(id = "com.android.calculator2:id/clr")
	@CacheLookup
	private AndroidElement clearadditionresult;

	// SUBTRACTION

	@AndroidFindBy(id = "com.android.calculator2:id/digit_7")
	@CacheLookup
	private AndroidElement subndigit1;

	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"minus\"]")
	@CacheLookup
	private AndroidElement minusBtn;

	@AndroidFindBy(id = "com.android.calculator2:id/digit_5")
	@CacheLookup
	private AndroidElement subndigit2;

	@AndroidFindBy(id = ("com.android.calculator2:id/result"))
	@CacheLookup
	private AndroidElement subtractionresult;

	@AndroidFindBy(id = "com.android.calculator2:id/eq")
	@CacheLookup
	private AndroidElement subtractionequal;

	@AndroidFindBy(id = "com.android.calculator2:id/clr")
	@CacheLookup
	private AndroidElement clearsubnresult;

	// MULTIPLICATION

	@AndroidFindBy(id = "com.android.calculator2:id/digit_5")
	@CacheLookup
	private AndroidElement multiplydigit1;

	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"multiply\"]")
	@CacheLookup
	private AndroidElement multiplyBtn;

	@AndroidFindBy(id = "com.android.calculator2:id/digit_5")
	@CacheLookup
	private AndroidElement multiplydigit2;

	@AndroidFindBy(id = ("com.android.calculator2:id/result"))
	@CacheLookup
	private AndroidElement multiplyresult;

	@AndroidFindBy(id = "com.android.calculator2:id/eq")
	@CacheLookup
	private AndroidElement multiplyequal;

	@AndroidFindBy(id = "com.android.calculator2:id/clr")
	@CacheLookup
	private AndroidElement clearmultiplyresult;

	// DIVISION

	@AndroidFindBy(id = "com.android.calculator2:id/digit_8")
	@CacheLookup
	private AndroidElement divisiondigit1;

	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"divide\"]")
	@CacheLookup
	private AndroidElement divisionBtn;

	@AndroidFindBy(id = "com.android.calculator2:id/digit_4")
	@CacheLookup
	private AndroidElement divisiondigit2;

	@AndroidFindBy(id = ("com.android.calculator2:id/result"))
	@CacheLookup
	private AndroidElement divisionresult;

	@AndroidFindBy(id = "com.android.calculator2:id/eq")
	@CacheLookup
	private AndroidElement divisionequal;

	@AndroidFindBy(id = "com.android.calculator2:id/clr")
	@CacheLookup
	private AndroidElement cleardivisionresult;

	public Calc(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public void addition() {
		additiondigit1.click();
		plusBtn.click();
		additiondigit2.click();
		additionresult.getText();
		additionequal.click();
		clearadditionresult.click();
	}

	public void subtraction() {
		subndigit1.click();
		minusBtn.click();
		subndigit2.click();
		subtractionresult.getText();
		subtractionequal.click();
		clearsubnresult.click();
	}

	public void multiplication() {
		multiplydigit1.click();
		multiplyBtn.click();
		multiplydigit2.click();
		multiplyresult.getText();
		multiplyequal.click();
		clearmultiplyresult.click();
	}

	public void division() {
		divisiondigit1.click();
		divisionBtn.click();
		divisiondigit2.click();
		divisionresult.getText();
		divisionequal.click();
		cleardivisionresult.click();
	}

}
