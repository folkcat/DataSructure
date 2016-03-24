package com.folkcat.datastruct.linklist;
public class LinkList {
	private IntNode head;

	public static void main(String args[]){
		LinkList linkList=new LinkList(100);
		int i;
		//循环添加节点
		System.out.println("以下是添加的节点数据");
		for(i=114;i<124;i++){
			linkList.add(i);
		}
		System.out.println("\n\n\n");
		
		System.out.println("查找3个节点");
		linkList.search(3);
		
		
		
	}
	public LinkList(int data){
		this.head=new IntNode(data,null);
	}
	public void add(int data){
		System.out.println(String.valueOf(data));
		this.head=new IntNode(data,this.head);
	}
	
	//按照指定的关键字查找节点
	public IntNode search(int key){
		IntNode cursor=this.head;
		int i=0;
		for(i=0;i<key;i++){
			
			if(i==key-1){
				System.out.println("所查找的节点的内容为："+String.valueOf(cursor.getData()));
			}
			cursor=cursor.getLink();
		}
		return cursor;
	}
	//按照指定的关键字删除节点
	public void delete(int key){
		IntNode cursor=this.head;
		int i;
		if(key<=0){
			throw new NullPointerException("不能删除小于0的");
		}
		if(key==1){
			head=head.getLink();
			return;
		}
		
		for(i=0;i<key;i++){
			if(i==key-2){
				cursor.setLink(cursor.getLink().getLink());
				System.out.println("第"+key+"个节点已删除");
				return ;
			}
			cursor=head.getLink();
		}
	}
	void printList(){
		IntNode cursor=this.head;
		int i;
		for(i=1;;i++){
			if(cursor==null){
				return;
			}
			System.out.println("第"+i+"个节点的数据为"+cursor.getData());
			cursor=cursor.getLink();
		}
	}
}