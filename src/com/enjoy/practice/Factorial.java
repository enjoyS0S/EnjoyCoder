package com.enjoy.practice;

/**
 * 计算阶乘 当小于0或者大于12的时候，抛出IllegalArgumentException
 * 
 * @author S0S
 * 
 */

public class Factorial {

	/**
	 * 最简单思路就是利用递归
	 * 
	 * @param n
	 * @return
	 */
	public int factorial_01(int n) {
		if (n < 0 || n > 12)
			new IllegalArgumentException("Useless fuffery!");
		return n <= 1 ? 1 : n * factorial_01(n - 1);
	}

	/**
	 * 利用循环来计算
	 */
	public int factorial_02(int n) {
		if (n < 0 || n > 12)
			new IllegalArgumentException("Useless fuffery!");
		int res = 1;
		while (n > 0) {
			res *= n;
			n--;
		}
		return res;
	}
}
