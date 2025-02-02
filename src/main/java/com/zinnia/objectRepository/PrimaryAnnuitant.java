package com.zinnia.objectRepository;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;

public class PrimaryAnnuitant {

	public static final By textbox_primaryAnnuitantFirstName = By.id("control296445_part2");
	public static final By textbox_primaryAnnuitantLastName = By.id("control296445_part4");
	public static final By radiobutton_primaryAnnuitantGender = By.id("control299761_RadioButtons_0");
	public static final By textbox_primaryAnnuitantDOB = By.id("control299762_dateTextBox");
	public static final By textbox_primaryAnnuitantSSN1 = By.id("control299763_part1");
	public static final By textbox_primaryAnnuitantSSN2 = By.id("control299763_part2");
	public static final By textbox_primaryAnnuitantSSN3 = By.id("control299763_part3");
	public static final By textbox_primaryAnnuitantPhysicalAddress = By.id("control299303_part1");
	public static final By textbox_primaryAnnuitantcity = By.id("control299303_part4");
	public static final By dropbox_primaryAnnuitantState = By.id("control299303_part5");
	public static final By textbox_primaryAnnuitantPostalCode = By.id("control299303_part6");
	public static final By dropbox_primaryAnnuitantRelationToOwner = By.id("control305351_dropBox");
	public static final By button_primaryAnnuitantNext = By.id("bottomNext");


	List<By> byList = Arrays.asList(By.id("control296445_part2"), By.id("control296445_part4"), By.id("control299762_dateTextBox"));
	List<String> values = Arrays.asList("value1", "value2", "value3");
	List<String> elementNames = Arrays.asList("Element 1", "Element 2", "Element 3");

//	sendKeys(byList, values, WaitStrategy.PRESENCE, elementNames);


}
