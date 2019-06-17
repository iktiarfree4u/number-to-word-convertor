package com.organization.tool.converter.app.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.organization.tool.converter.app.service.ConverterService;
import com.organization.tool.converter.app.utilities.AppConstants;
import com.organization.tool.converter.app.utilities.TestUtilities;

@RunWith(MockitoJUnitRunner.class)
public class ConverterControllerTest {
	
	@Mock
	ConverterService service;
	
	@InjectMocks
	ConverterController controller;
	
	@Test
	public void test_controller_method_Null_Response() throws Exception {
		assertEquals(AppConstants.errorMsgInvalidNo, controller.proccessConverter(null));
	}
	
	@Test
	public void test_controller_method_Exception() throws Exception {
		assertEquals(TestUtilities.invalidOutputMsg, controller.proccessConverter(TestUtilities.invalidInputNumber));
	}
	
	@Test
	public void test_controller_method_Ok_Response() throws Exception {
		assertNotNull(controller.proccessConverter(TestUtilities.validInputNumber_105));
	}
}
