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

	private ListNode<T> headNode = new ListNode<>(); // 头结点

	public LinkedList() {
		// TODO Auto-generated constructor stub
	}

	public void setH(ListNode<T> h) {
		this.headNode = h;

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
		ListNode<T> p = headNode, s;
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
			System.out.println(get(0));
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
	public ListNode<T> search(T element) {
		ListNode<T> p = headNode.next;
		while (p != null && p.data != element) {
			p = p.next;
		}
		return p;
	}

	@Override
	public int size() {
		ListNode<T> p = headNode.next; // p指向第一个结点
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
		return size() == 0 ? true : false;
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
		int j = 1;
		ListNode<T> p = headNode.next;
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
		return false;
	}

	/**
	 * 算法思路： 1.将q指向p结点的直接后继 2.改变指针链接，把q结点的直接后继作为p结点的直接后继 3.从单链表中删除q结点 4.释放q结点空间
	 * 
	 * 算法的时间复杂度为：O(1)
	 */
	public boolean remove(ListNode<T> p) {
		ListNode<T> q;
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
