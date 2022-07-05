package com.bridgelabz.appium.test;

import org.testng.annotations.Test;

import com.bridgelabz.appium.base.Base;
import com.bridgelabz.appium.pages.Calc;

public class CalcTest extends Base {
	
	@Test
	public void addition() {
		Calc cal = new Calc(driver);
		cal.addition();
	}
	
	@Test
	public void subtraction() {
		Calc cal = new Calc(driver);
		cal.subtraction();
	}
	@Test
	public void multiplication() {
		Calc cal = new Calc(driver);
		cal.multiplication();
	}
    @Test
    public void division() {
    	Calc cal = new Calc(driver);
    	cal.division();
    }
}
