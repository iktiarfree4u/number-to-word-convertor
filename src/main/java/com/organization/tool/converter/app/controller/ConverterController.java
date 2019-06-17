package com.organization.tool.converter.app.controller;

import org.apache.commons.lang3.StringUtils;

import com.organization.tool.converter.app.service.ConverterService;
import com.organization.tool.converter.app.utilities.AppConstants;

public class ConverterController {
	public static String proccessConverter(String inputNo) {
		String outoutString = null; String errorString = null; String outputWord = null;
		boolean isValidNumber = true;
		int number = 0;
		try {
			isValidNumber = StringUtils.isNumeric(inputNo);
			if (isValidNumber) {
				number = Integer.parseInt(inputNo);
			}
			if (number <= AppConstants.numberLimit) {
				outputWord = ConverterService.convert(number);
				if (null == outputWord) {
					isValidNumber = false;
					errorString = AppConstants.errorMsgInvalidNull;
				}
			} else {
				isValidNumber = false;
				errorString = AppConstants.errorMsgNoLimit;
			}
		} catch (NumberFormatException nfe) {
			isValidNumber = false;
			errorString = nfe.toString();
			//e.printStackTrace();
		} catch (Exception e) {
			isValidNumber = false;
			errorString = e.toString();
			//e.printStackTrace();
		}

		if (isValidNumber)
			outoutString = AppConstants.successMsg + inputNo +" = " + outputWord;
		else
			outoutString = errorString != null ? AppConstants.errorMsgInvalidNo + errorString : AppConstants.errorMsgInvalidNo;
		return outoutString;
	}
}
