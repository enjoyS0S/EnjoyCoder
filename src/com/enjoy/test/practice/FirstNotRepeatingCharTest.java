package com.enjoy.test.practice;

import org.junit.Test;

import com.enjoy.practice.FirstNotRepeatingChar;

public class FirstNotRepeatingCharTest {

	private String str = "aasgddajjg";

	@Test
	public void testFirstNotRepeatingChar_01() {
		FirstNotRepeatingChar fnrc = new FirstNotRepeatingChar();
		int firstNotRepeatingChar = fnrc.firstNotRepeatingChar_01(str);
		System.out.println(firstNotRepeatingChar);
	}

	@Test
	public void testFirstNotRepeatingChar_02() {
		FirstNotRepeatingChar fnrc = new FirstNotRepeatingChar();
		int firstNotRepeatingChar = fnrc.firstNotRepeatingChar_02(str);
		System.out.println(firstNotRepeatingChar);
	}
}
