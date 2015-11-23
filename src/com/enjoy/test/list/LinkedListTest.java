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

	public LinkedList<Integer> creatLinkedList(int len) {
		LinkedList<Integer> linkedList = new LinkedList<>();
		for (int i = 0; i < 10; i++) {
			int randomInt = RandomUtils.getRandomInt(10);
			System.out.println(linkedList.insertElementAt(i, randomInt) + ";"
					+ randomInt);
		}
		return linkedList;
	}

	@Test
	public void testLinkedListSize() {
		LinkedList<Character> list = new LinkedList<>();
		System.out.println(list.size());
	}

	@Test
	public void testInsertElementAt() {
		LinkedList<Integer> linkedList = creatLinkedList(10);
		System.out.println("\n" + linkedList.size());
		for (int i = 0; i < linkedList.size(); i++) {
			System.out.print(linkedList.get(i) + " ");
		}
	}

}
