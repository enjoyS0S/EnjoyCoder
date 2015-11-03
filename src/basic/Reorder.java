package basic;

/**
 * 将一个已知数组分成两部分 对于一个已知的数组，经常会遇到将这个数组中的元素按照某种规律分成两部分，
 * 常见的是将一个数组中的奇数数放在前，偶数放在后,我们一般的第一反应是将这个数组从头扫到位
 * ，碰到一个偶数，拿出这个数字，并把位于这个数字后面的所有数字往前挪动一位
 * 。挪完之后在数组的末尾有一个空位，这时候把该数字放入这个空位。这是由于没碰到一个偶数就需要移动0
 * （n）个数字，此时总的时间复杂度就为O(n^2)。这不是一个最佳的解法，下面我写了一种解法，方便大家参考。
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
		int[] oddEven = even.reorderOddEven_0(source, source.length);
		for (int i : oddEven)
			System.out.print(i + " ");
		oddEven = even.reorderThreeAliquot(source, source.length);
		System.out.println();
		for (int i : oddEven)
			System.out.print(i + " ");
	}

	/*
	 * 问题：将数组中的元素奇数放在前，偶数放在后
	 * 分析：设置两个指正，一个指针（begin）指向数组的首位，一个指针（end）指向数组的末尾。首位指针（begin
	 * ）从前往后扫描，直到该指针指向偶数；末尾指针（end）从后往前扫描，直到该指针指向奇数。然后两个指针位的元素进行交换。
	 */
	public int[] reorderOddEven_0(int[] source, int len) {
		if (source == null || len <= 0)
			return null;
		int begin = 0;
		int end = source.length - 1;
		while (begin < end) {
			while (begin < end && (source[begin] & 0x01) == 1)
				begin++;
			while (begin < end && (source[end] & 0x01) == 0)
				end--;
			int temp = source[begin];
			source[begin] = source[end];
			source[end] = temp;
		}
		return source;
	}

	/*
	 * 问题：将数组中的元素奇数放在前，偶数放在后
	 * 分析：对于此题，上述解答已经算是一个很好的解决方案，但是，如果现在问题不是将奇数和偶数分离，而是将负数和正数分离怎么办
	 * ？我想很多人应该会说，我们只需要修改第2
	 * 、3个while里边的判断条件就可以了。但是如果我们有需要将能被3整除和不能被3整除的数分开，这是我们可能又会说还是只需要将第2
	 * 、3个while里边的判断条件修改一下就可以了
	 * 。但是，我们会发现整段代码，除了第2、3个while的判断条件不同之外，其它的代码都不变，这时我们就要考虑的程序的可扩展性。
	 * 解法：这是我们就会想到java的回调，我们只需要就其判断条件通过回调，然后在上层函数中实现对其的判断就可以了。具体实现如下。
	 */
	public int[] reorderOddEven_1(int[] source, int len) {
		return reorder(source, len, new IsTrue() {
			@Override
			public boolean isTrue(int key) {
				return (key & 1) == 0 ? false : true;
			}
		});
	}

	/*
	 * 问题：将数组中的元素能被3整除的放在前，不能被3整除的数放在后面
	 * 分析：我们利用上一题的分析，只需要实现对IsTrue接口中isTrue方法的实现就可以了。
	 */
	public int[] reorderThreeAliquot(int[] source, int len) {
		return reorder(source, len, new IsTrue() {
			@Override
			public boolean isTrue(int key) {
				return (key % 3) != 0 ? false : true;
			}
		});
	}

	public int[] reorder(int[] source, int len, IsTrue is) {
		if (source == null || len == 0)
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
