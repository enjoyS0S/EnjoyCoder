package basic;

import java.util.Scanner;

/**
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
