package basic;

/**
 * 这里主要介绍常用的查找算法
 * 
 * @author S0S
 *
 */
public class Find {

	public static void main(String[] args) {
		int[] source = { 1, 2, 3, 4, 6, 7, 8, 12, 34, 56, 212 };
		Find f = new Find();
		System.out.println(f.orderFind(source, source.length, 50));
		System.out.println(f.middleFind(source, source.length, 4));
	}

	/*
	 * 顺序查找，顺序查找是最常见的一种查找算法，但是其效率是最低的。 它的时间复杂度为O(n)
	 */
	public int orderFind(int[] source, int len, int key) {
		if (source == null || len == 0)
			return -1;
		for (int i = 0; i < len; i++) {
			if (source[i] == key)
				return i;
		}
		return -1;
	}

	/*
	 * 二分查找，二分查找使我们用的最多的一种查找算法，效率也很高。它的时间复杂度为O(logN)
	 */
	public int middleFind(int[] source, int len, int key) {
		if (source == null || len == 0)
			return -1;
		int start = 0, end = source.length - 1;
		while (start <= end) {
			int middle = (start + end) / 2;
			if (key < source[middle])
				end = middle - 1;
			else if (key > source[middle])
				start = middle + 1;
			else
				return middle;
		}
		return -1;
	}

}
