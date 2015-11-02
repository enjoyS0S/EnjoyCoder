package basic;

/**
 * 调整数组顺序，使奇数位于偶数前面
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

	public int[] reorderOddEven(int[] source) {
		return reorder(source, new IsTrue() {
			@Override
			public boolean isTrue(int key) {
				boolean result = (key & 1) == 0 ? true : false;
				return result;
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
			while (begin < end && is.isTrue(source[end]))
				end--;
			int temp = source[begin];
			source[begin] = source[end];
			source[end] = temp;
		}
		return source;
	}
}
