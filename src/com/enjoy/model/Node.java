package com.enjoy.model;

/**
 * ������
 * 
 * @author S0S
 *
 */
public class Node {

	private Node left;
	private Node right;
	private int value;

	public Node(int value) {
		super();
		this.value = value;
		this.right = null;
		this.left = null;
	}

	public Node(Node left, Node right, int value) {
		super();
		this.left = left;
		this.right = right;
		this.value = value;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
