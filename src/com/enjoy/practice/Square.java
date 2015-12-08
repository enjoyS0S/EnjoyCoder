package com.enjoy.practice;

/**
 * 判断一个数时候一个数平方
 * 
 * @author S0S
 * 
 */
public class Square {

	public boolean isSquare_01(int n) {
		return Math.pow(Math.sqrt(n), 2) == n;
	}

	public boolean isSquare_02(int n) {
		return Math.sqrt(n) % 1 == 0;
	}

}
