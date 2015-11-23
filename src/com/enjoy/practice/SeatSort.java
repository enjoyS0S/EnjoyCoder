package com.enjoy.practice;

import java.util.Scanner;

/**
 * 程序猿喜欢按性别交换座位，比如女生喜欢做到一起。现在假定程序猿坐成一排，每个程序猿用一个不同的数字表示，女生用奇数，设计一套算法，将他们的座位按性别交换，
 * 女生排在前边。 输入： 1.输入为一行 2.第一个数字N代表程序猿的个数 3.接下来N个不同正整数，分别代表不同的程序猿 输出：
 * 1.输出为一行N个数字，代表交换之后的程序猿序列 2.结果中奇数在前，偶数在后 3.输出结果可能不唯一
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
		input = ss.seatSort2(input);
		for (int i : input) {
			System.out.print(i + " ");
		}
	}
	
	/**
	 * 设置两个position，start是数组开头，end是数组的末尾
	 * 从start位置处开始检测数组中的元素，如果是偶数的话，将end处的元素与start处的元素交换，此时end--；当start处的元素为奇数的时候，start++，移动到下一位；
	 * 直至start=end的时候结束循环，说明整个数组的元素已经排序好。
	 * 这个算法的优点在于，不用将整个数组进行遍历，但是为不稳定算法。
	 */
	public int[] seatSort1(int[] source) {
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

	/**
	 * 将排序之后的数组存放在一个新的数组中去
	 * 遍历数组中的每个元素，将奇数从新数组的开头开始存放，将偶数从新数组的末尾开始存放。
	 */
	public int[] seatSort2(int[] source) {
		if (source.length <= 1)
			return source;
		int[] result = new int[source.length];
		int start = 0;
		int end = source.length - 1;
		for (int i = 0; i < source.length; i++) {
			int remainder = source[i] % 2;
			if (remainder == 1) {
				result[start++] = source[i];
			} else if (remainder == 0) {
				result[end--] = source[i];
			}
		}
		return result;
	}
}
