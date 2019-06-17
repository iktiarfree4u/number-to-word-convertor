package com.organization.tool.converter.app.utilities;

public class AppConstants {
	private AppConstants() {}
	
	final public  static String[] units = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
			"eleven", "twelve", "thirteen",	"fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
	
	final public static String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
	final public static String[] specialNames = { "", "thousand", "million", "billion", "trillion", "quadrillion", "quintillion" };
	
	final public static String successMsg = "Entered number is successfully converted into corresponding word format. \n";
	final public static String errorMsgInvalidNo = "Invalid number entered. Please try entering a valid integer number. \n";
	public static String errorMsgNoLimit = "Number limit restricted up to 999999999. ";

	public static int numberLimit = 999999999;

	public static String errorMsgInvalidNull = "Null value entered. Please try entering a valid integer number. \n";
}
