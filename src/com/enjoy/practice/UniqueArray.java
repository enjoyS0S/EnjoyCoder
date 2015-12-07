package com.enjoy.practice;

import java.util.Arrays;

public class UniqueArray {

	public int[] unique(int[] integers) {
		return Arrays.stream(integers).distinct().toArray();
	}
}
