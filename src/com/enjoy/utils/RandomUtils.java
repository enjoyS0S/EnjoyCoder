package com.enjoy.utils;

import java.util.Random;

public class RandomUtils {

	public static int getRandomInt(int start, int end) {
		Random r = new Random();
		return r.nextInt(end - start) + start;
	}

	public static int getRandomInt(int end) {
		return getRandomInt(0, end);
	}

}
