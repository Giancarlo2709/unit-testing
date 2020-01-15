package com.platzi.javatest.util;

import static org.junit.Assert.*;

import org.junit.Test;

import com.platzi.javatest.util.PasswordUtil.SecurityLevel;

public class PasswordUtilTest {

	@Test
	public void weak_when_has_less_than_8_letters() {
		assertEquals(SecurityLevel.WEAK, PasswordUtil.assessPassword("123aa!"));
	}
	
	@Test
	public void weak_when_has_less_only_letters() {
		assertEquals(SecurityLevel.WEAK, PasswordUtil.assessPassword("abcdefgh"));
	}
	
	@Test
	public void medium_when_has_letters_and_numbers() {
		assertEquals(SecurityLevel.MEDIUM, PasswordUtil.assessPassword("abcd1234"));
	}
	
	@Test
	public void medium_when_has_letters_numbers_and_symbols() {
		assertEquals(SecurityLevel.STRONG, PasswordUtil.assessPassword("abcd1234!"));
	}

}
