package com.enjoy.list;


/**
 * 线性表，抽象数据类型定义
 * 
 * @author S0S
 * 
 */
public interface ListIntf {

	/**
	 * 返回线性表的长度
	 */
	public int size();

	/**
	 * 重置为空表
	 */
	public void clear();

	/**
	 * 若为空表则返回true，否则返回false
	 */
	public boolean isEmpty();

	/**
	 * 返回第i个元素的值
	 */
	public Object get(int i);

	/**
	 * 第一个与obj满足关系equals()的数据元素的位序。若这样的数据元素不存在，则返回为-1
	 */
	public int indexOf(Object obj);

	/**
	 * 返回链表的前驱
	 */
	public Object getPre(Object obj);

	/**
	 * 返回链表的后继
	 */
	public Object getNext(Object obj);

	/**
	 * 删除第i个元素，并返回其值，表长度减1
	 */
	public boolean remove(int i);

	/**
	 * 删除数据元素n，并返回其值，表长度减1
	 */
	public boolean remove(Object obj);

}
