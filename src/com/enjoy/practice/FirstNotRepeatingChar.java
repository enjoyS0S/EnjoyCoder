package com.enjoy.practice;

import java.util.HashMap;

/**
 * 求一个字符串中第一个只出现一次的字符
 * 
 * @author S0S
 * 
 */
public class FirstNotRepeatingChar {

	public int firstNotRepeatingChar_01(String str) {
		if (str == null || str.isEmpty())
			return -1;
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				int times = map.get(str.charAt(i));
				map.put(str.charAt(i), ++times);
			} else {
				map.put(str.charAt(i), 1);
			}
		}
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (map.get(c) == 1) {
				return c;
			}
		}
		return -1;
	}

	public int firstNotRepeatingChar_02(String str) {
		if (str == null || str.isEmpty())
			return -1;
		char[] charArray = str.toCharArray();
		final int tableSize = 256;
		int[] hashTable = new int[tableSize];
		for (int i = 0; i < hashTable.length; i++)
			hashTable[i] = 0;
		int hashKeyIndex = 0;
		while (hashKeyIndex < charArray.length)
			hashTable[charArray[hashKeyIndex++]]++;
		hashKeyIndex = 0;
		while (hashKeyIndex < charArray.length) {
			if (hashTable[hashKeyIndex] == 1) {
				return (char) hashTable[hashKeyIndex];
			}
			hashKeyIndex++;
		}
		return -1;
	}

}
