package com.enjoy.list;

import com.enjoy.model.ListNode;

/**
 * 单链表
 * 
 * @author S0S
 * 
 * @param <T>
 */
public class LinkedList<T> implements ListIntf<T> {

	private ListNode<T> h = new ListNode<>(); // 头结点

	public LinkedList() {
		// TODO Auto-generated constructor stub
	}

	public void setH(ListNode<T> h) {
		this.h = h;

	}

	/**
	 * 在结点p后加入值为x的结点 算法思路： 1.生成一个新结点s 2.将新 element 赋给新结点s的数据域 3.新结点链入单链表
	 * 
	 * 时间复杂度：O(1)
	 * 
	 * @param p
	 * @param element
	 */
	public void insertElementAfter(ListNode<T> p, T element) {
		ListNode<T> s = new ListNode<>();
		s.data = element;
		s.next = p.next;
		p.next = s;
	}

	/**
	 * 在单链表中第i个元素之前插入一个元素
	 * 
	 * 时间复杂度：O(n)
	 * 
	 * @param i
	 * @param element
	 */
	public boolean insertElementAt(int i, T element) {
		ListNode<T> p = h, s;
		int j = 0;
		while (p != null && j < i - 1) { // 寻找第i - 1号结点
			p = p.next;
			j++;
		}
		if (p != null) {
			s = new ListNode<>();
			s.data = element;
			s.next = p.next; // 改变指针状态
			p.next = s;
			return true; // 表示插入成功
		} else
			return false; // 表示插入失败
	}

	/**
	 * 查找值为x的结点
	 * 
	 * @param element
	 * @return
	 */
	public ListNode<T> search(T element) {
		return null;
	}

	@Override
	public int size() {
		ListNode<T> p = h.next; // p指向第一个结点
		int count = 0;
		while (p != null) { // 循环访问单链表的每个结点，p == null 时循环结束
			count++;
			p = p.next; // 指针后移
		}
		return count;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	/**
	 * 算法思路：
	 * 1.p从单链表的第一个数据结点出发，并定义j = 1
	 * 2.在单链表中移动指针p，同时累计j
	 * 3.通过j的累计查找j=i的结点
	 * 4.重复2、3知道p为空或p指向第i个元素
	 */
	public T get(int i) {
		int j = 0;
		ListNode<T> p = h.next;
		while (p != null && j < i) { // 移动指针p，直到p为空或p指向第i个元素
			p = p.next;
			j++;
		}
		if (j == i) {
			return p.data; // 返回第i个元素的存储位置
		} else
			return null;
	}

	@Override
	public int indexOf(T element) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public T getPre(T element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getNext(T element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(int i) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(T element) {
		// TODO Auto-generated method stub
		return false;
	}

}
