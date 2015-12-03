package com.enjoy.test.list;

import com.enjoy.list.LinkedList;
import com.enjoy.utils.RandomUtils;

public class ListUtil {

	/**
	 * 创建一个测试链表
	 * 
	 * @param len
	 * @return
	 */
	public static LinkedList creatLinkedList(int len) {
		LinkedList linkedList = new LinkedList();
		for (int i = 0; i < len; i++) {
			char randomInt = (char) RandomUtils.getRandomInt(10);
			linkedList.insertElementAt(i, randomInt);
		}
		return linkedList;
	}

}
