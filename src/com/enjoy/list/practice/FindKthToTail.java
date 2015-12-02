package com.enjoy.list.practice;

import com.enjoy.model.ListNode;


/**
 * 寻找链表倒数第k个结点
 * 
 * @author S0S
 * 
 */
public class FindKthToTail {

	/**
	 * 算法思路：
	 * 		为了得到倒数第k个结点，很自然的想法是先走到链表的为尾端，再从尾部回溯k步。可是我们从链表结点的定义
	 * 可以看出来题中的链表是单向链表，单向链表的结点只有从前往后的指针而没有从后往前，依次这个思路并不适合此题。
	 * 		既然不能从链表的尾结点开始遍历这个链表，我们还是把思想回到头结点上来。假设整个链表有n个结点，那么倒
	 * 数第k个结点就是从头结点开始的第n-k+1个结点。如果我们能够得到链表中结点的个数n，那我们只要从头结点开始往后
	 * 走n-k+1步就可以了如果得到链表中结点的个数n，那我们只要从头结点开始往后走n-k+1步就可以了。如何得到结点数
	 * n？这个我们只需要从头开始遍历链表，没经过一个结点，计数器加1就可以了。
	 * 		也就是说，我们需要遍历两次链表，第一此统计出链表中结点的个数，第二次就能找到倒数第k个结点。
	 * @param listNode
	 * @param k
	 * @return
	 */
	public ListNode findKthTail_01(ListNode head, int k) {
		if (head == null || k == 0)
			return null;
		int n = 0;
		ListNode p = head;
		while (p != null) {
			n++;
			p = p.next;
		}
		if (n < k) 	//如果链表的长度小于k，则返回null
			return null;
		p = head;
		int index = 0;
		while (index < n - k + 1) {
			p = p.next;
			index++;
		}
		return p;
	}
	
	
	
	/**
	 * 我们发现，在上述算法中，遍历了两次链表，这并不是最优解，需要找一种只需要遍历依次链表就可以找到链表的倒数第k个结点。
	 * 		为了实现只遍历一次链表就能找到倒数第k个结点，我们可以定义两个指针。第一个指针从立案表的头指针开始遍历链表向前
	 * 走k-1步，第二个指针保持不动；从第k步开始，第二个指针也开始从链表的头指针开始遍历，由于两个指针的距离保持在k-1，当
	 * 第一个（走在前面）指针到大链表的尾结点时，第二个指针（走在后面）指针正好是倒数第k个结点。
	 * @param listNode
	 * @param k
	 * @return
	 */
	public ListNode findKthTail_02(ListNode head, int k) {
		if (head == null || k <= 0)
			return null;
		ListNode pAHead = head;
		ListNode pBehind = null;
		for (int i = 0; i < k - 1; i++) {
			if (pAHead.next != null) {	//判断链表的长度是否大于等于k
				pAHead = pAHead.next;
			} else {
				return null;
			}
		}
		pBehind = head;
		while (pAHead.next != null) {
			pAHead = pAHead.next;
			pBehind = pBehind.next;
		}
		return pBehind;
	}

}
