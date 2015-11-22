package com.enjoy.test.list;

import java.util.Random;

import org.junit.Test;

import com.enjoy.list.SqList;

public class SqListTest {

	/**
	 * 创建一个长度为len的线性表
	 * @param len	线性表的长度
	 * @return	返回线性表
	 */
	private SqList creatSqList(int len) {
		Random r = new Random();
		SqList sqList = new SqList();
		for (int i = 1; i <= len; i++) {
			int obj = r.nextInt(20);
			sqList.insertElemetAt(obj, i);
		}
		return sqList;
	}

	/**
	 * 打印线性表
	 * @param sqList	线性表
	 */
	private void printSqList(SqList sqList) {
		for (int i = 0; i < sqList.size(); i++) {
			System.out.print(sqList.get(i) + " ");
		}
		System.out.println();
	}

	@Test
	public void testRemove() {
		SqList sqList = creatSqList(10);
		System.out.println("size:" + sqList.size());
		printSqList(sqList);
		sqList.remove(5);
		printSqList(sqList);
		System.out.println("size:" + sqList.size());
	}
}
