package basic;

/**
 * 将一个已知数组分成两部分
 * 对于一个已知的数组，经常会遇到将这个数组中的元素按照某种规律分成两部分，
 * 常见的是将一个数组中的奇数数放在前，偶数放在后,我们一般的第一反应是将这个数组从头扫到位，碰到一个偶数，拿出这个数字，并把位于这个数字后面的所有数字往前挪动一位。挪完之后在数组的末尾有一个空位，这时候把该数字放入这个空位。这是由于没碰到一个偶数就需要移动0（n）个数字，此时总的时间复杂度就为O(n^2)。这不是一个最佳的解法，下面我写了一种解法，方便大家参考。
 * 
 * @author S0S
 *
 */
public class Reorder {

	public interface IsTrue {
		public boolean isTrue(int key);
	}

	public static void main(String[] args) {
		int[] source = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Reorder even = new Reorder();
		int[] oddEven = even.reorderOddEven(source);
		for (int i : oddEven)
			System.out.print(i + " ");
	}

	/*
	 * 问题：将数组中的元素奇数放在前，偶数放在后
	 * 分析：设置两个指正，一个指针（begin）指向数组的首位，一个指针（end）指向数组的末尾。首位指针（begin）从前往后扫描，直到该指针指向偶数；末尾指针（end）从后往前扫描，直到该指针指向奇数。然后两个指针位的元素进行交换。
	 */
	public int[] reorderOddEven_0(int[] source) {
		if(source.length == 0)
			return -1;
		int begin = 0;
		int end = source.length - 1;
		while(begin < end) {
			while(begin < end && (source[begin] & 0x01) == 1)
				begin++;
			while(begin < end && (source[end] & 0x01) == 0)
				end--;
			int temp = source[begin];
			source[begin] = source[end];
			source[end] = temp;
		}
		return source;
	}

	/*
	 * 问题：将数组中的元素奇数放在前，偶数放在后
	 * 分析：
	 */
	public int[] reorderOddEven_1(int[] source) {
		return reorder(source, new IsTrue() {
			@Override
			public boolean isTrue(int key) {
				return (key & 1) == 0 ? false : true;
			}
		});
	}

	public int[] reorder(int[] source, IsTrue is) {
		if (source.length == 0)
			return null;
		int begin = 0;
		int end = source.length - 1;
		while (begin < end) {
			while (begin < end && is.isTrue(source[begin]))
				begin++;
			while (begin < end && !is.isTrue(source[end]))
				end--;
			int temp = source[begin];
			source[begin] = source[end];
			source[end] = temp;
		}
		return source;
	}
}
