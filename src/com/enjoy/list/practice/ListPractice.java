package com.enjoy.list.practice;

import java.util.Stack;

import com.enjoy.model.ListNode;

/**
 * 关于链表的练习
 * 
 * @author S0S
 * 
 */
public class ListPractice {

	/**
	 * 链表从尾到头打印链表 算法思路：
	 * 我们想到的解决这个问题肯定要遍历链表。遍历的顺序时从头到尾的顺序，可输出的顺序确实从尾到头，也就是第一个遍历到的结点最后一个输出
	 * 。这就是典型的“后进先出
	 * ”，我们可以用栈来实现这种顺序。遍历链表，每经过一个结点，把该节点放入栈中，然后再把栈中的元素依次弹出，就把链表翻转过来了。
	 * 
	 * @param listNode
	 * @return
	 */
	public void printListFromTailToHead(ListNode<Integer> listNode) {
		if (listNode == null) {
			return;
		}
		Stack<ListNode<Integer>> stack = new Stack<>();
		while (listNode != null) {
			stack.push(listNode);
			listNode = listNode.next;
		}
		while (!stack.isEmpty()) {
			System.out.print(stack.pop().data + " ");
		}
	}

}
