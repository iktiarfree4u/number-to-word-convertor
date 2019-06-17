package com.organization.tool.converter.app;

import java.util.Scanner;

import com.organization.tool.converter.app.controller.ConverterController;

public class ConverterApplication {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	    System.out.print("Enter a Number: ");
	    String inputNo = new Scanner(System.in).next();
	    System.out.println(ConverterController.proccessConverter(inputNo));
	}
}