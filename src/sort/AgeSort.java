package sort;

/**
 * 常用的排序有冒泡，快排，堆排，插入等。但是其实还有一些我们没有听说过，但是用处也很普遍的排序算法，例如希尔排序、桶排序
 * 
 * @author S0S
 *
 */
public class AgeSort {

	public static void main(String[] args) {
		int[] source = {12};
	}

	/*
	 * 
	 */
	public int[] sortAge(int[] source, int len) {
		int[] temp = new int[99];
		for(int i = 0; i < len; i++){
			temp[source] ++;
		}
		for(int i = 0; i < len; i++){
			source[i] = temp[0];	
		}
		return null;
	}
}
