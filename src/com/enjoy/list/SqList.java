package com.enjoy.list;

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
public class SqList implements ListIntf {

	// maxlen表示线性表可能的最大数据元素数目
	private final int maxlen = 1000;

	// 存放线性表元素的数组
	private Object v[] = new Object[maxlen];

	/* 表示线性表的长度 */
	private int len = 0;

	public SqList() {
		super();
	}

	/*返回线性表可能的最大存储个数*/
	public int getMaxlen() {
		return maxlen;
	}

	@Override
	public int size() {
		return len;
	}

	@Override
	public void clear() {
		for (int i = 0; i < len; i++)
			v[i] = null;
		len = 0;
	}

	/**
	 * 
	 * 线性表的插入算法
	 * 算法思路：1.判断线性表的存储空间是否已满，若已满，则进行“溢出”处理。
	 * 			2.检查i值是否超出所允许的范围（1<=i<=n+1）,若超出，则进行“超出处理”。
	 *			3.将线性表的第i个元素和它后面的所有元素均后移一个位置。
	 * 			4.将新的数据元素写入下表为i-1的位置上。
	 * 			5.线性表的长度增加1。
	 * 
	 * @param obj	要插入的元素
	 * @param i	插入的位置
	 */
	public void insertElemetAt(Object obj, int i) {
		if (len == maxlen) { // 判断线性表的存储空间是否已满
			System.out.println("溢出");
			return;
		} else {
			if ((i < 1) || (i > len + 1)) { // 检查i值是否超出所运允许的范围
				System.out.println("插入位置不对");
				return;
			} else {
				for (int j = len - 1; j >= i - 1; j--)
					v[j + 1] = v[j]; // 将第i个元素和它后面的所有元素均后移一个位置
				v[i - 1] = obj; // 将新的元素写入空出的下标为i-1的位置上
				len++; // 线性表的长度增加1
				return;
			}
		}
	}

	@Override
	public boolean isEmpty() {
		return len > 0 ? true : false;
	}

	@Override
	public Object get(int i) {
		if (i > 0 && i < len)
			return v[i];
		return null;
	}

	@Override
	public int indexOf(Object obj) {
		for (int i = 0; i < len; i++) {
			if (obj.equals(v[i]))
				return i;
		}
		return 0;
	}

	@Override
	public Object getPre(Object obj) {
		int indexOf = indexOf(obj);
		return indexOf == 0 ? null : v[indexOf - 1];
	}

	@Override
	public Object getNext(Object obj) {
		int indexOf = indexOf(obj);
		remove(9);
		return indexOf == 0 ? null : v[indexOf + 1];
	}

	
	@Override
	/**
	 * 删除第i个元素，并返回其值，表长度减1 
	 * 算法思路：1.判断i值是否超出所允许的范围(1<=i<=n),若是，则进行“超出范围”处理
	 * 			2.把第i个元素赋值给临时变量obj，最后将其返回 
	 * 			3.把第i个元素的所有元素依次向前移动一个位置 
	 * 			4.线性表长度减1
	 */
	public Object remove(int i) {
		if ((i < 1) || (i > len + 1)) { // 判断i值是否超出所允许的范围
			System.out.println("删除位置不正确");
			return null;
		} else {
			Object obj = v[i - 1];
			for (int j = i; j < len; j++)
				v[j - 1] = v[j];
			len--;
			return obj;
		}
	}

	@Override
	public Object remove(Object obj) {
		int indexOf = indexOf(obj);
		remove(indexOf);
		return obj;
	}

}
