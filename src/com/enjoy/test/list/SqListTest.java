package com.enjoy.test.list;

import java.util.Random;

import org.junit.Test;

import com.enjoy.list.SqList;

public class SqListTest {

	private SqList creatSqList() {
		Random r = new Random();
		SqList sqList = new SqList();
		for (int i = 1; i < 10; i++) {
			sqList.insertElemetAt(r.nextInt(20), i);
		}
		return sqList;
	}

	private void printSqList(SqList sqList) {
		for (int i = 0; i < sqList.size(); i++) {
			System.out.print(sqList.get(i) + " ");
		}
		System.out.println();
	}

	@Test
	public void testRemove() {
		SqList sqList = creatSqList();
		System.out.println("size:" + sqList.size());
		printSqList(sqList);
		sqList.remove(5);
		printSqList(sqList);
		System.out.println("size:" + sqList.size());
	}
}
