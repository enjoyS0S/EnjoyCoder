package com.enjoy.test.list;

import java.util.ArrayList;
import java.util.Stack;

import org.junit.Test;

import com.enjoy.list.LinkedList;
import com.enjoy.model.ListNode;
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

	@Test
	public void test() {
		ListNode<Integer> lnode = new ListNode<>();
		printListFromTailToHead(lnode);
	}

	public ArrayList<Integer> printListFromTailToHead(ListNode<Integer> listNode) {
		Stack<Integer> stack = new Stack<>();
		while (listNode != null) {
			stack.push(listNode.data);
			listNode = listNode.next;
		}
			System.out.print("[");
		Integer pop = stack.pop();
		while (pop != null) {
			System.out.print(stack.pop());
			pop = stack.pop();
		}
		System.out.print("]");
		return null;
	}
}
