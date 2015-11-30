package com.enjoy.list;

import com.enjoy.model.ListNode;

/**
 * 单链表
 * 
 * @author S0S
 * 
 * @param <T>
 */
public class LinkedList {

	private ListNode headNode = new ListNode(); // 头结点

	public LinkedList() {
	}

	public void setH(ListNode h) {
		this.headNode = h;
	}

	/**
	 * 在结点p后加入值为x的结点 
	 * 
	 * 算法思路：1.生成一个新结点s 
	 * 			2.将新 c 赋给新结点s的数据域 
	 * 			3.新结点链入单链表
	 * 
	 * 时间复杂度：O(1)
	 * 
	 * @param p
	 * @param element
	 */
	public void insertElementAfter(ListNode p, char c) {
		ListNode s = new ListNode();
		s.data = c;
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
	public boolean insertElementAt(int i, char c) {
		ListNode p = headNode, s;
		int j = 0;
		while (p != null && j < i) { // 寻找第i号结点
			p = p.next;
			j++;
		}
		if (p != null) {
			s = new ListNode();
			s.data = c;
			s.next = p.next; // 改变指针状态
			p.next = s;
			return true; // 表示插入成功
		} else
			return false; // 表示插入失败
	}

	/**
	 * 查找值为element的结点
	 * 
	 * 算法思路： 
	 * 1.从第一个结点开始扫描整个单链表，将结点数据域的值逐个与element相比较 
	 * 2.找到该结点后返回指向该结点的指针
	 * 
	 * @param element
	 * @return
	 */
	public ListNode search(char c) {
		ListNode p = headNode.next;
		while (p != null && p.data != c) {
			p = p.next;
		}
		return p;
	}

	public int size() {
		ListNode p = headNode.next; // p指向第一个结点
		int count = 0;
		while (p != null) { // 循环访问单链表的每个结点，p == null 时循环结束
			count++;
			p = p.next; // 指针后移
		}
		return count;
	}

	public void clear() {
		headNode.next = null;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	/**
	 * 获取链表第i个结点
	 * 
	 * 算法思路：
	 * 1.p从单链表的第一个数据结点出发，并定义j = 1
	 * 2.在单链表中移动指针p，同时累计j
	 * 3.通过j的累计查找j=i的结点
	 * 4.重复2、3知道p为空或p指向第i个元素
	 */
	public ListNode get(int i) {
		int j = 0;
		ListNode p = headNode.next;
		while (p != null && j < i) { // 移动指针p，直到p为空或p指向第i个元素
			p = p.next;
			j++;
		}
		if (j == i) {
			return p; // 返回第i个元素的存储位置
		} else
			return null;
	}

	/**
	 * 获取链表值为c的结点
	 * @param c
	 * @return
	 */
	public ListNode get(char c) {
		ListNode p = headNode.next;
		while (p != headNode && c != p.data)
			p = p.next;
		if (p == null)
			return null;
		return p;
	}

	/**
	 * 查找链表listNode
	 * @param listNode
	 * @return 返回listNode结点的索引
	 */
	public int indexOf(ListNode listNode) {
		int position = 0;
		ListNode p = headNode.next;
		while (p != null && p != listNode																					) {
			p = p.next;
			position++;
		}
		return position;
	}

	/**
	 * 删除结点p之后的结点
	 * 
	 * 算法思路：1.将q指向p结点的直接后继 
	 * 			2.改变指针链接，把q结点的直接后继作为p结点的直接后继 
	 * 			3.从单链表中删除q结点 
	 * 			4.释放q结点空间
	 * 
	 * 算法的时间复杂度为：O(1)
	 */
	public boolean remove(ListNode p) {
		ListNode q;
		if (p.next != null) {
			q = p.next;
			p.next = q.next;
			q = null;
			return true;
		} else {
			return false;
		}
	}

}
