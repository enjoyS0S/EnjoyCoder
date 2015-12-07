package com.enjoy.test.practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.enjoy.practice.TwoToOne;

public class TwoToOneTest {

	TwoToOne tto = new TwoToOne();

	@Test
	public void testLongest_01() {
		System.out.println("longest Fixed Tests");
		assertEquals(null, tto.longest_01("", "yestheyarehere"));
		assertEquals("aehrsty", tto.longest_01("aretheyhere", "yestheyarehere"));
		assertEquals("abcdefghilnoprstu", tto.longest_01(
				"loopingisfunbutdangerous", "lessdangerousthancoding"));
		assertEquals("acefghilmnoprstuy",
				tto.longest_01("inmanylanguages", "theresapairoffunctions"));
	}

	@Test
	public void testLongest_02() {
		System.out.println("longest Fixed Tests");
		assertEquals(null, tto.longest_02("", "yestheyarehere"));
		assertEquals("aehrsty", tto.longest_02("aretheyhere", "yestheyarehere"));
		assertEquals("abcdefghilnoprstu", tto.longest_02(
				"loopingisfunbutdangerous", "lessdangerousthancoding"));
		assertEquals("acefghilmnoprstuy",
				tto.longest_02("inmanylanguages", "theresapairoffunctions"));
	}

}
