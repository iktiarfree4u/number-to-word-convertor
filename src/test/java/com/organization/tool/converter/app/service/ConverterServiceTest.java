package com.organization.tool.converter.app.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import com.organization.tool.converter.app.utilities.TestUtilities;

@RunWith(MockitoJUnitRunner.class)
public class ConverterServiceTest {

	
	@Test
	public void test_service_method_convert_Null_Response() throws Exception {
		assertEquals(null, ConverterService.convert(null));
	}
	
	@Test
	public void test_service_method_convert_Ok_Response_Units() throws Exception {
		assertEquals(TestUtilities.validInputWord_9, ConverterService.convert(Integer.parseInt(TestUtilities.validInputNumber_9)));
	}
	
	@Test
	public void test_service_method_convert_Ok_Response_Teens() throws Exception {
		assertEquals(TestUtilities.validInputWord_17, ConverterService.convert(Integer.parseInt(TestUtilities.validInputNumber_17)));
	}
	
	@Test
	public void test_service_method_convert_Ok_Response_21() throws Exception {
		assertEquals(TestUtilities.validInputWord_21, ConverterService.convert(Integer.parseInt(TestUtilities.validInputNumber_21)));
	}
	
	@Test
	public void test_service_method_convert_Ok_Response_105() throws Exception {
		assertEquals(TestUtilities.validInputWord_105, ConverterService.convert(Integer.parseInt(TestUtilities.validInputNumber_105)));
	}
	
	@Test
	public void test_service_method_convert_Ok_Response_1386() throws Exception {
		assertEquals(TestUtilities.validInputWord_1386, ConverterService.convert(Integer.parseInt(TestUtilities.validInputNumber_1386)));
	}
	
	@Test
	public void test_service_method_convert_Ok_Response_56945781() throws Exception {
		assertEquals(TestUtilities.validInputWord_56945781, ConverterService.convert(Integer.parseInt(TestUtilities.validInputNumber_56945781)));
	}
	
}
