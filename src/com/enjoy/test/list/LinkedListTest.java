package com.enjoy.test.list;

import org.junit.Test;

import com.enjoy.list.LinkedList;

/**
 * 单链表测试
 * 
 * @author S0S
 * 
 */
public class LinkedListTest {

	@Test
	public void testLinkedListSize() {
		LinkedList list = new LinkedList();
		System.out.println(list.size());
	}

	@Test
	public void testInsertElementAt() {
		LinkedList linkedList = ListUtil.creatLinkedList(10);
		System.out.println("\n" + linkedList.size());
		for (int i = 0; i < linkedList.size(); i++) {
			System.out.print(linkedList.get(i) + " ");
		}
	}

}
