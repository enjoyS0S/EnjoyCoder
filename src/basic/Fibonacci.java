package basic;

import java.util.Scanner;

/**
 * 测试斐波那契数列
 * 
 * 斐波那契数列数列的应用 问题：一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。 分析：
 * 
 * 考虑1个台阶，只有1跳法，则 f(1) = 1
 * 
 * 考虑2个台阶，可以1级级条，可以一次跳2级，有两种跳法,则f(2) = 2
 * 
 * 考虑3个台阶，它可以由1级跳来得到，也可以由2级跳来得到，所以它的跳法为 f(3-1) + f(3-2) = f(1) + f(2)
 * 
 * 考虑n个台阶，它的跳法为 f(n-1) + f(n-2)
 * 
 * 实则上为斐波那契数列。可以用递归，也可以用循环方法求解。
 * 
 * @author S0S
 *
 */
public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		Fibonacci f = new Fibonacci();
		System.out.print(f.fibonacci2(n) + " ");
	}

	/**
	 * 循环实现斐波那契数列
	 * 
	 * @param n
	 * @return
	 */
	public int fibonacci1(int n) {
		if (n <= 0)
			return 0;
		if (n == 1)
			return 1;
		int pre = 0, next = 1;
		int curr = 0;
		for (int i = 2; i <= n; i++) {
			curr = pre + next;
			pre = next;
			next = curr;
		}
		return curr;
	}

	/**
	 * 递归实现
	 * 
	 * @param n
	 * @return
	 */
	public int fibonacci2(int n) {
		if (n < 0)
			return 0;
		int[] result = { 0, 1, 2 };
		return n < 3 ? result[n] : fibonacci2(n - 1) + fibonacci2(n - 2);
	}
}
