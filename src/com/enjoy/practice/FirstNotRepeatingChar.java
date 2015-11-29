package com.enjoy.practice;

import java.util.HashMap;

/**
 * 求一个字符串中第一个只出现一次的字符的位置
 * 
 * @author S0S
 * 
 */
public class FirstNotRepeatingChar {

	/**
	 * 当我们遇到这种问题的时候，第一时间想到的应该是需要用哈希表，用两次遍历。
	 * 
	 * 第一次遍历字符串，将所有的字符存当做哈希表的键，出现的次数作为哈希表的值村放入哈希表中。在存放的时候，先
	 * 判断一下表中是否存在该字符，如果不存在，则直接存入哈希表，并将其值存为1，如果存在，则取出哈希表中对应的 值，对其加1，在重新存入哈希表。
	 * 
	 * 第二次遍历字符串，依次将每个字符对应的值取出来，如果值等于1，则返回该字符对应的索引
	 * 
	 * @param str
	 * @return
	 */
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
				// 返回第一个只出现一次的字符位置
				return i;
				// 返回第一个只出现一个的字符
//				 return c;
			}
		}
		return -1;
	}

	/**
	 * 上述方法使我们采用Java已经给我们提供好哈希表，但是假设我们现在没有现成的数据结构去存储它，我们应该怎么来做呢。
	 * 
	 * 假设该字符串中出现的字符均在ASCII码表中，我们则创建一个长度为256的数组。将每个字符的ASCII码值作为数组的下表。
	 * 依旧需要两次遍历，第一次遍历，我们将每一字符在数组中对应的位置的值加1
	 * 第二次遍历，我们将遍历到的每个字符ASCII码值对应数组处的值进行判断，如果值为1，该返回该处的索引，如果不为1，则继续遍历
	 * 
	 * @param str
	 * @return
	 */
	public int firstNotRepeatingChar_02(String str) {
		if (str == null || str.isEmpty())
			return -1;
		char[] c = str.toCharArray();
		int[] a = new int[256];
		for (char d : c)
			a[(int) d]++;
		for (int i = 0; i < c.length; i++)
			if (a[(int) c[i]] == 1)
				return i;
		return -1;
	}

}
