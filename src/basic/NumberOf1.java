package basic;

import java.util.Scanner;

/**
 * 求一个数转换成2进制，2进制里边有多少个1
 * 
 * @author S0S
 *
 */
public class NumberOf1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		NumberOf1 nbo = new NumberOf1();
		System.out.println(nbo.numberOf1_1(input));
		sc.close();
	}

	/**
	 * 利用位运算，这个方法完美的解决了统计一个数二进制中1的个数，但是有一个问题，当我们输入的数为负数时，这个方法就不是那么的强大的。
	 * 比如0x80000000,运算的时候会发生什么情况？
	 */
	public int numberOf1_1(int n) {
		int count = 0;
		while (n > 0) {
			if ((n & 1) == 1)
				count++;
			n >>= 1;
		}
		return count;
	}
}
