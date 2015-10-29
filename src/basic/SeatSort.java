package basic;

import java.util.Scanner;

/**
 * 程序猿喜欢按性别交换座位，比如女生喜欢做到一起。现在假定程序猿坐成一排，每个程序猿用一个不同的数字表示，女生用奇数，设计一套算法，将他们的座位按性别交换，
 * 女生排在前边。 
 * 输入： 
 * 1.输入为一行 
 * 2.第一个数字N代表程序猿的个数 
 * 3.接下来N个不同正整数，分别代表不同的程序猿 
 * 输出：
 * 1.输出为一行N个数字，代表交换之后的程序猿序列 
 * 2.结果中奇数在前，偶数在后 
 * 3.输出结果可能不唯一
 * 
 * @author S0S
 *
 */
public class SeatSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int[] input = new int[count];
		for (int i = 0; i < count; i++) {
			input[i] = sc.nextInt();
		}
		sc.close();
		SeatSort ss = new SeatSort();
		input = ss.seatSort(input);
		for (int i : input) {
			System.out.print(i + " ");
		}
	}

	public int[] seatSort(int[] source) {
		int start = 0;
		int end = source.length - 1;
		while (start < end) {
			if (source[start] % 2 == 0) {
				int temp = source[start];
				source[start] = source[end];
				source[end] = temp;
				end--;
			} else
				start++;
		}
		return source;

	}
}
