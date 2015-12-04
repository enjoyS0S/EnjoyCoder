package com.enjoy.list.practice;

import com.enjoy.model.ListNode;

/**
 * 链表反转
 * 
 * @author S0S
 * 
 */
public class ReverseList {

	public ListNode reverseList(ListNode head) {
		if (head == null)
			return null;
		ListNode reverseHead = null;
		ListNode node = head;
		ListNode prev = null;
		while (node != null) {
			ListNode next = node.next;
			if (next == null)
				reverseHead = node;
			node.next = prev;
			prev = node;
			node = next;
		}
		return reverseHead;
	}

}
