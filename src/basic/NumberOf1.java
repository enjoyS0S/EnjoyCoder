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
		System.out.println(nbo.numberOf1_2(input));
		sc.close();
	}

	/**
	 * 利用位运算，这个方法完美的解决了统计一个数二进制中1的个数，但是有一个问题，当我们输入的数为负数时，这个方法就不是那么的强大的。
	 * 比如0x80000000,运算的时候会发生什么情况？
	 * 把负数0x80000000右移以为的时候，并不是把最高位的1移到第二位变成0x40000000
	 * ,而是0xC0000000。这是因为一位前是一个负数
	 * ，仍然要保证移位后也是一个负数，因此移位后的最高位会设为1。如果一直做右移运算，最终这个数字就会变成0xFFFFFFFF(-1)而陷入死循环。
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

	/**
	 * 为了避免上述方法出现死循环，我们可以不右移输入的数字n，首先把n和1做与运算，判断n的最低位是不是为1.接着把1左移移位得到2，再和n做与运算，
	 * 就能判断n的次低位是不是1……这样反复左移，每次都能判断n的其中一位是不是1.基于这个思路，改进的程序如下：
	 */
	public int numberOf1_2(int n) {
		int count = 0;
		int flag = 1;
		while (flag != 0) {
			if ((n & flag) == 1)
				count++;
			flag <<= 1;
		}
		return count;
	}

	public int numberOf1_3(int n) {
		return 0;
	}
}
