package com.enjoy.test.list;

import org.junit.Test;

import com.enjoy.list.LinkedList;
import com.enjoy.utils.RandomUtils;

/**
 * 单链表测试
 * 
 * @author S0S
 * 
 */
public class LinkedListTest {

	@Test
	public void testLinkedListSize() {
		LinkedList<Character> list = new LinkedList<>();
		System.out.println(list.size());
	}

	@Test
	public void testInsertElementAt() {
		LinkedList<Integer> list = new LinkedList<>();
		for (int i = 0; i <= 10; i++) {
			int randomInt = RandomUtils.getRandomInt(10);
			list.insertElementAt(i, randomInt);
			System.out.print(randomInt + " ");
		}
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}

	/**
	 * 公鸡5元 母鸡2元 小鸡1元3只
	 */
	@Test
	public void testBuyChicken() {
		// i代表公鸡的数量，公鸡最多可以买20只
		for (int i = 0; i <= 20; i++) {
			// j代表母鸡的数量，母鸡最多可以买50只
			for (int j = 0; j <= 50; j++) {
				// k代表小鸡的数量
				int k = 100 - i - j;
				// 小鸡的数量可以被3整除，三种鸡钱加起来等于100
				if (k % 3 == 0 && 5 * i + 2 * j + k / 3 == 100) {
					System.out.println("公鸡：" + i + "; 母鸡：" + j + "; 小鸡：" + k);
				}
			}
		}
	}
}
