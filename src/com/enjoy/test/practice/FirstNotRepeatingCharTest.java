package com.enjoy.test.practice;

import org.junit.Test;

import com.enjoy.practice.FirstNotRepeatingChar;

public class FirstNotRepeatingCharTest {

	@Test
	public void testFirstNotRepeatingChar() {
		String str = "aassgddajjg";
		FirstNotRepeatingChar fnrc = new FirstNotRepeatingChar();
		char firstNotRepeatingChar = (char) fnrc.firstNotRepeatingChar_01(str);
		System.out.println(firstNotRepeatingChar);

		for (int i = -Integer.MAX_VALUE; i < Integer.MAX_VALUE; i++) {
			System.out.print((char) i);
		}
	}
}
