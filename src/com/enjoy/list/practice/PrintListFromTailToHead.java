package com.enjoy.list.practice;

import java.util.Stack;

import com.enjoy.model.ListNode;

/**
 * 关于链表的练习
 * 
 * @author S0S
 * 
 */
public class PrintListFromTailToHead {

	/**
	 * 链表从尾到头打印链表 
	 * 
	 * 算法思路：我们想到的解决这个问题肯定要遍历链表。遍历的顺序时从头到尾的顺序，可输出的顺序确实从尾到头，也就是第一个
	 * 遍历到的结点最后一个输出。这就是典型的“后进先出”，我们可以用栈来实现这种顺序。遍历链表，每经过一个结点，把该节点放
	 * 入栈中，然后再把栈中的元素依次弹出，就把链表翻转过来了。
	 * 
	 * @param listNode
	 * @return
	 */
	public void printListFromTailToHead_1(ListNode listNode) {
		if (listNode == null) {
			return;
		}
		Stack<ListNode> stack = new Stack<>();
		while (listNode != null) {
			stack.push(listNode);
			listNode = listNode.next;
		}
		while (!stack.isEmpty()) {
			System.out.print(stack.pop().data + " ");
		}
	}

	/**
	 * 链表从尾到头打印链表 
	 * 
	 * 算法思路：上一个方法我们用栈来实现链表从尾到头的打印，既然我们用可以用栈来实现，自然而然的我们就想到了递归，递归的
	 * 本质就是一个栈结构。要实现反过来输出链表，我们美访问到一个结点的时候，先递归输出它后面的结点，再输出该结点本身，这
	 * 样就实现了将输出结果反转过来。
	 * 
	 * @param listNode
	 */
	public void printListFromTailToHead_2(ListNode listNode) {
		if (listNode != null) {
			if (listNode.next != null) {
				printListFromTailToHead_2(listNode.next);
			}
			System.out.println(listNode.data + " ");
		}
	}

}
