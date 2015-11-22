package com.enjoy.test.list;

import com.enjoy.list.ListIntf;
import com.enjoy.model.Lnode;

/**
 * 单链表
 * 
 * @author S0S
 * 
 * @param <T>
 */
public class LinkedList<T> implements ListIntf<T> {

	private Lnode<T> h = null; // 头结点

	public LinkedList() {
		// TODO Auto-generated constructor stub
	}

	public void setH(Lnode<T> h) {
		this.h = h;
		
	}

	/**
	 * 在结点p后加入值为x的结点
	 * 
	 * @param p
	 * @param x
	 */
	public void insertElementAfter(Lnode p, char x) {

	}

	/**
	 * 查找值为x的结点
	 * 
	 * @param x
	 * @return
	 */
	public Lnode search(char x) {
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
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
	public Object get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(T element) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getPre(T element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getNext(T element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object remove(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object remove(T element) {
		// TODO Auto-generated method stub
		return null;
	}

}
