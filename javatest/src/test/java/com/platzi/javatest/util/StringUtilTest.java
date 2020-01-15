package com.platzi.javatest.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void repeat_string_once() {
		assertEquals("Hola", StringUtil.repeat("Hola", 1));
	}
	
	@Test
	public void repeat_string_multiple_times() {
		assertEquals("HolaHolaHola", StringUtil.repeat("Hola", 3));
	}
	
	@Test
	public void repeat_string_zero_times() {
		assertEquals("", StringUtil.repeat("Hola", 0));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void repeat_string_negative_times() {
		StringUtil.repeat("Hola", -1);
	}
	
	@Test
	public void stringIsNotEmpty() {
		boolean response = StringUtil.isEmpty("abcd");
		assertFalse(response);
	}
	
	@Test
	public void stringIsEmpty() {
		boolean response = StringUtil.isEmpty("");
		assertTrue(response);
	}
	
	@Test
	public void stringIsNull() {
		boolean response = StringUtil.isEmpty(null);
		assertTrue(response);
	}
	
	@Test
	public void stringWithSpaces() {
		boolean response = StringUtil.isEmpty("       ");
		assertTrue(response);
	}

}
