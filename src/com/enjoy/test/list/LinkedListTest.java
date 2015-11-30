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

	public LinkedList creatLinkedList(int len) {
		LinkedList linkedList = new LinkedList();
		for (int i = 0; i < 10; i++) {
			char randomInt = (char)RandomUtils.getRandomInt(10);
			linkedList.insertElementAt(i, randomInt);
		}
		return linkedList;
	}

	@Test
	public void testLinkedListSize() {
		LinkedList list = new LinkedList();
		System.out.println(list.size());
	}

	@Test
	public void testInsertElementAt() {
		LinkedList linkedList = creatLinkedList(10);
		System.out.println("\n" + linkedList.size());
		for (int i = 0; i < linkedList.size(); i++) {
			System.out.print(linkedList.get(i) + " ");
		}
	}

}
