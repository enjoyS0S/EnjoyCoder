package com.enjoy.list;

import java.lang.reflect.Array;
import java.util.Arrays;

import com.enjoy.model.Lnode;

/**
 * 顺序表的实现
 * 
 * 优点：1.随机存取元素容易实现，更具定位公式容易确定表中每个元素的存储位置，所以要制定第i个节点很方便 2.简单、直观
 * 缺点：1.插入和删除节点空难。由于表中的结点是一次连续存放的
 * ，所以插入或删除一个节点时，必须将插入点以后的节点依次向后移动，或将删除点以后的节点依次向前移动。
 * 2.扩展不灵活，建立表时，若估计不到表的最大长度，就难以确定分配的空间，影响扩展。 3.容易造成浪费。分配的空间过大时，会造成预留空间浪费。
 * 
 * @author S0S
 * 
 */
public class SqList<T> implements ListIntf<T> {

	// maxlen表示线性表可能的最大数据元素数目
	private final int maxlen = 1000;

	// 存放线性表元素的数组
	private T objs[];

	/* 表示线性表的长度 */
	private int len = 0;

	public SqList() {
		super();
		objs = newArrayByArrayClass(E, maxlen);
	}

	@SuppressWarnings({ "unchecked", "hiding" })
	public <T> T[] newArrayByArrayClass(Class<?> clazz, int length) {
		T[] newInstance = (T[]) Array.newInstance(clazz.getComponentType(),
				length);
		return newInstance;
	}

	/* 返回线性表可能的最大存储个数 */
	public int getMaxlen() {
		return maxlen;
	}

	@Override
	public int size() {
		return len;
	}

	@Override
	public void clear() {
		Arrays.fill(objs, null);
		len = 0;
	}

	/**
	 * 
	 * 线性表的插入算法 算法思路： 1.判断线性表的存储空间是否已满，若已满，则进行“溢出”处理。
	 * 2.检查i值是否超出所允许的范围（1<=i<=n+1）,若超出，则进行“超出处理”。 3.将线性表的第i个元素和它后面的所有元素均后移一个位置。
	 * 4.将新的数据元素写入下表为i-1的位置上。 5.线性表的长度增加1。
	 * 
	 * @param obj
	 *            要插入的元素
	 * @param i
	 *            插入的位置
	 */
	public void insertElemetAt(T element, int i) {
		if (len == maxlen) { // 判断线性表的存储空间是否已满
			throw new IndexOutOfBoundsException("线性表索引越界");
		} else {
			if ((i < 0) || (i > len)) { // 检查i值是否超出所运允许的范围
				throw new IndexOutOfBoundsException("插入位置不对");
			} else {
				for (int j = len - 1; j >= i; j--)
					objs[j + 1] = objs[j]; // 将第i个元素和它后面的所有元素均后移一个位置
				objs[i] = element; // 将新的元素写入空出的下标为i-1的位置上
				len++; // 线性表的长度增加1
			}
		}
	}

	// 在线性顺序表的开始处添加一个元素。
	public void add(T element) {
		insertElemetAt(element, len);
	}

	@Override
	public boolean isEmpty() {
		return len > 0 ? true : false;
	}

	@Override
	public Object get(int i) {
		if (i >= 0 && i < len)
			return objs[i];
		return null;
	}

	@Override
	public int indexOf(T element) {
		for (int i = 0; i < len; i++) {
			if (element.equals(objs[i]))
				return i;
		}
		return -1;
	}

	@Override
	public T getPre(T element) {
		int indexOf = indexOf(element);
		return indexOf < 0 ? null : objs[indexOf - 1];
	}

	@Override
	public T getNext(T element) {
		int indexOf = indexOf(element);
		return indexOf < 0 ? null : objs[indexOf + 1];
	}

	@Override
	/**
	 * 删除第i个元素，并返回其值，表长度减1 
	 * 算法思路：1.判断i值是否超出所允许的范围(1<=i<=n),若是，则进行“超出范围”处理
	 * 			2.把第i个元素赋值给临时变量obj，最后将其返回 
	 * 			3.把第i个元素的所有元素依次向前移动一个位置 
	 * 			4.线性表长度减1
	 */
	public boolean remove(int i) {
		if ((i < 0) || (i > len)) { // 判断i值是否超出所允许的范围
			throw new IndexOutOfBoundsException("删除位置不正确");
		} else {
			Object obj = objs[i];
			for (int j = i; j < len; j++)
				objs[j - 1] = objs[j];
			len--;
			return true;
		}
	}

	@Override
	public boolean remove(T element) {
		int indexOf = indexOf(element);
		boolean flag = remove(indexOf);
		return flag;
	}

}
