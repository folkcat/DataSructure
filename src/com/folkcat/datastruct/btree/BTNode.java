package com.folkcat.datastruct.btree;

public class BTNode<E> {
	private E data;
	private BTNode<E> left;
	private BTNode<E> right;
	
	public BTNode(E initialData,BTNode<E> initialLeft,BTNode<E> initialRight){
		data=initialData;
		left=initialLeft;
		right=initialRight;
	}
	
	public E getData(){
		return this.data;
	}
	public BTNode<E> getLeft(){
		return left;
	}
	public BTNode<E> getRight(){
		return right;
	}
	public void setLeft(BTNode<E> left){
		this.left=left;
	}
	public void setRight(BTNode<E> right){
		this.right=right;
	}
	public boolean isLeaf(){
		return (left==null)&&(right==null);
	}
	
	//先序遍历
	public void preOrderPrint(){
		System.out.println(data);
		if(left!=null)
			left.preOrderPrint();
		if(right!=null)
			right.preOrderPrint();
	}
	//中序遍历
	public void inOrderPrint(){
		if(left!=null)
			left.inOrderPrint();
		System.out.println(data);
		if(right!=null)
			right.inOrderPrint();
	}
	//后序遍历
	public void backOrderPrint(){
		if(left!=null)
			left.backOrderPrint();
		if(right!=null)
			right.backOrderPrint();
		System.out.println(data);
	}
}
