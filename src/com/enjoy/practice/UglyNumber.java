package com.enjoy.practice;

/**
 * 丑数
 * 
 * 我们把只包含因子2、3和5的数成为丑数。
 * 求：按从小到大顺序的第1500个丑数。例如6和8都是丑数，但14不是，因为它包含因子7.习惯上我们把1当做第一个丑数。
 * 
 * @author S0S
 * 
 */
public class UglyNumber {

	/**
	 * 判断一个数是不是丑数
	 * 
	 * @param number
	 * @return
	 */
	public boolean isUgly(int number) {
		while (number % 2 == 0)
			number /= 2;
		while (number % 3 == 0)
			number /= 3;
		while (number % 5 == 0)
			number /= 5;
		return number == 1 ? true : false;
	}

	public int getUglyNumber(int index) {
		if (index <= 0)
			return 0;
		int number = 0;
		int uglyFound = 0;
		while (uglyFound < index) {
			number++;
			if (isUgly(number)) {
				uglyFound++;
			}
		}
		return number;
	}

}
