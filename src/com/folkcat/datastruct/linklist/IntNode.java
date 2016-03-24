package com.folkcat.datastruct.linklist;
public class IntNode{
	private int data;
	private IntNode link;
	
	public IntNode(int data,IntNode link){
		this.data=data;
		this.link=link;
	}
	public int getData(){
		return this.data;
	}
	public IntNode getLink(){
		return this.link;
	}
	public void setLink(IntNode newLink){
		this.link=newLink;
	}

}