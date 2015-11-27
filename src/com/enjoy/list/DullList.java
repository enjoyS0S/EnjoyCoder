package com.enjoy.list;

import com.enjoy.model.DullNode;

/**
 * 双向链表
 * 
 * @author S0S
 * 
 */
public class DullList {

	/**
	 * 双向链表的插入
	 * 算法思路：
	 * 1.通过指针p的移动在双向循环链表中依次查找第i个元素
	 * 2.如果找到，则建立一个新结点s；
	 * 3.将s和p以及p的前驱链接起来，也就是说，令s的前驱是p原来的前驱，s的后继是p
	 * 
	 * @param h
	 * @param i
	 * @param x
	 * @return
	 */
	public boolean insert(DullNode h, int i, char x) {
		DullNode p, s;
		int j;
		p = h.next;
		j = 0;
		// 查找第i个元素，直到p指向头结点h或p指向第i个元素的结束
		while (p != h && j < i) {
			j++;
			p = p.next;
		}
		if (j == i) {
			s = new DullNode();
			s.data = x;
			s.prior = p.prior;
			p.prior.next = s;
			s.next = p;
			p.prior = s;
			return true;
		} else
			return false;
	}

	/**
	 * 双向链表的删除
	 * 算法思路：
	 * 1.通过指针p的移动在双向链表中依次查找第i个元素
	 * 2.如果找到，改变指正链接，也就是说，令p的前驱指向p的后继，p的后继结点的前驱指针指向p原来的前驱
	 * 3.释放p
	 * @param h
	 * @param i
	 * @return
	 */
	public boolean delete(DullNode h, int i) {
		DullNode p;
		int j;
		p = h.next;
		j = 0;
		while (p != h && j < i) {
			j++;
			p = p.next;
		}
		if (j == i) {
			p.prior.next = p.next;
			p.next.prior = p.prior;
			p = null;
			return true;
		} else
			return false;
	}
}
