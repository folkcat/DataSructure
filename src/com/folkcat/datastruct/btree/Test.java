package com.folkcat.datastruct.btree;

public class Test {
	
	public static void main(String args[]){
		
		BTNode<Integer> root=initTree();
		
		System.out.println("前序遍历\n");
		root.preOrderPrint();
		System.out.println("\n中序遍历\n");
		root.inOrderPrint();
		System.out.println("\n后序遍历\n");
		root.backOrderPrint();
	}
	
	private static BTNode<Integer> initTree(){ //初始化二叉树
		BTNode<Integer> root=new BTNode<Integer>(5, null, null);
		BTNode<Integer> child1=new BTNode<Integer>(6,null,null);
		BTNode<Integer> child2=new BTNode<Integer>(8,null,null);
		BTNode<Integer> grandChild1=new BTNode<Integer>(7,null,null);
		BTNode<Integer> grandChild2=new BTNode<Integer>(5,null,null);
		BTNode<Integer> grandChild3=new BTNode<Integer>(9,null,null);
		BTNode<Integer> grandChild4=new BTNode<Integer>(11,null,null);
		root.setLeft(child1);
		root.setRight(child2);
		child1.setLeft(grandChild1);
		child1.setRight(grandChild2);
		child2.setLeft(grandChild3);
		child2.setRight(grandChild4);
		return root;
	}
}
