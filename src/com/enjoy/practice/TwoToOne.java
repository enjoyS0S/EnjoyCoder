package com.enjoy.practice;

import java.util.TreeSet;

/**
 * 把两个字符串合并，返回一个新的最长的排序字符串，包含不同的字母，每个字母只有出现一次。 
 * 
 * 例如：a = "xyaabbbccccdefww"
 * 		b = "xxxxyyyyabklmopq" 
 * 		longest(a, b) 输出 "abcdefklmopqwxy"
 * 
 * 		a = "abcdefghijklmnopqrstuvwxyz" 
 * 		longest(a, a) 输出 "abcdefghijklmnopqrstuvwxyz"
 * 
 * @author S0S
 * 
 */

public class TwoToOne {

	public String longest_01(String s1, String s2) {
		if ((s1 == null || s1.isEmpty()) || (s2 == null || s2.isEmpty()))
			return null;
		StringBuffer sb = new StringBuffer();
		TreeSet<Character> set = new TreeSet<Character>();
		for (char a : (s1 + s2).toCharArray())
			set.add(a);
		Character[] ch = (Character[]) set.toArray(new Character[set.size()]);
		for (int i = 0; i < set.size(); i++)
			sb.append(ch[i]);
		return sb.toString();
	}

	public String longest_02(String s1, String s2) {
		if ((s1 == null || s1.isEmpty()) || (s2 == null || s2.isEmpty()))
			return null;
		String s = s1 + s2;
		StringBuffer sb = new StringBuffer();
		for (int i = 'a'; i <= 'z'; i++) {
			sb.append(i);
		}
		String result = "";
		for (char c : sb.toString().toCharArray()) {
			if (s.indexOf(c) != -1)
				result += c;
		}
		return result;
	}

}
