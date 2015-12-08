package com.enjoy.practice;

import java.util.Arrays;

/**
 * 数组去重
 * 
 * @author S0S
 * 
 */
public class UniqueArray {

	public int[] unique(int[] integers) {
		return Arrays.stream(integers).distinct().toArray();
	}
}
