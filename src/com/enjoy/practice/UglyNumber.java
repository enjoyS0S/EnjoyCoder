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
	 * 判断一个数是不是丑数 算法思路：
	 * 所谓一个数m是另一个数n的因子，是指n能被m整除，也就是说n%m==0。根据丑数的定义，丑数只能被2，3和5整除。
	 * 也就是说如果一个数只能被2整除，我们把它连续除以2；如果能被3整除，就连续除以3；如果能被5整除，就连续除以5。
	 * 如果我们最后得到的是1，那么这个数就是丑数，否则不是。
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

	/**
	 * 获取第index个丑数
	 * 
	 * @param index
	 * @return
	 */
	public int getUglyNumber_01(int index) {
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

	public void getUglyNumber_02(int index) {

	}

}
