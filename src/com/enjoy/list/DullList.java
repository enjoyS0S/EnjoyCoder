package com.enjoy.list;

import com.enjoy.model.DullNode;

/**
 * 双向链表
 * 
 * @author S0S
 * 
 */
public class DullList {

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
