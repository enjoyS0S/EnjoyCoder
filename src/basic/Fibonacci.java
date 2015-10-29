package basic;

import java.util.Scanner;

/**
 * 测试斐波那契数列
 */
public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Fibonacci f = new Fibonacci();
		System.out.print(f.fibonacci2(n) + " ");
	}

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

	public int fibonacci2(int n) {
		return n == 1 ? 1 : fibonacci2(n - 1) + fibonacci2(n - 2);
	}
}
