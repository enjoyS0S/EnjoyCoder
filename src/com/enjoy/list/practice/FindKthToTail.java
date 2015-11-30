package com.enjoy.list.practice;

import com.enjoy.model.ListNode;

/**
 * 寻找链表倒数第K个结点
 * 
 * @author S0S
 * 
 */
public class FindKthToTail {

	public ListNode findKthTail(ListNode listNode, int k) {
		if (listNode == null || k == 0)
			return null;
		ListNode pAHead = listNode;
		ListNode pBehind = null;
		for (int i = 0; i < k - 1; i++) {
			if (pAHead.next != null) {
				pAHead = pAHead.next;
			} else {
				return null;
			}
		}
		pBehind = listNode;
		while (pAHead.next != null) {
			pAHead = pAHead.next;
			pBehind = pBehind.next;
		}
		return pBehind;
	}

}
