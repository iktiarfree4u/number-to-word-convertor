package com.organization.tool.converter.app.service;

import com.organization.tool.converter.app.utilities.AppConstants;

public class ConverterService {
	public static String convert(Integer i) throws Exception {
		if (null != i) {
		if( i < 20)
			return AppConstants.units[i];
		if( i < 100)
			return AppConstants.tens[i/10] + ((i % 10 > 0) ? " " + convert(i % 10) : "");
		if( i < 1000)
			return AppConstants.units[i/100] + " hundred" + ((i % 100 > 0) ? " and " + convert(i % 100) : "");
		if( i < 1000000)
			return convert(i / 1000) + " thousand " + ((i % 1000 > 0)? " " + convert(i % 1000) :"") ;
		return convert(i / 1000000) + " million " + ((i % 1000000 > 0) ? " " + convert(i % 1000000) : "") ;
		} else 
			return null;
	}
}
