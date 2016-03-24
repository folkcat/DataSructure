package com.folkcat.datastruct.queue;
import java.util.NoSuchElementException;
public class ArrayQueue<E> implements Cloneable {
	private E[] data;
	private int manyItems;
	private int front;
	private int rear;
	
	public static void main(String args[]){
		ArrayQueue<Integer> queue=new ArrayQueue<Integer>();
		//入队
		int i;
		Integer j;
		for(i=0;i<15;i++){
			queue.add(i);
		}
		System.out.println("队列大小:"+queue.size());
		System.out.println("队列容量:"+queue.getCapacity());
		//出队
		for(i=0;i<15;i++){
			j=queue.remove();
			System.out.print("  "+j);
		}
	}
	
	public ArrayQueue(){
		final int INITIAL_CATACITY=10;
		manyItems=0;
		data=(E[]) new Object[INITIAL_CATACITY];
		//对于空队列，不必关心front和rear
	}
	public void add(E item){
		if(manyItems==data.length){
			ensureCapacity(manyItems*2+1);
		}
		if(manyItems==0){
			front=0;
			rear=0;
		}else{
			rear=nextIndex(rear);
		}
		data[rear]=item;
		manyItems++;
	}
	
	public int getCapacity(){
		return data.length;
	}
	public boolean isEmpty(){
		return (manyItems==0);
	}
	private int nextIndex(int i){
		if(++i==data.length){
			return 0;
		}else{
			return i;
		}
	}
	public void ensureCapacity(int miniCapacity){
		E[] biggerArray;
		int n1,n2;
		
		if(data.length>=miniCapacity){
			return ;
			//不变化
		}else if(manyItems==0){
			//由于队列为空，只需增加数组的大小。
			data=(E[]) new Object[miniCapacity];
		}else if(front<=rear){
			//生成一个更大的数组，并将data[front].....data[rear]复制到新的数组中。
			biggerArray=(E[])new Object[miniCapacity];
			System.arraycopy(data, front, biggerArray, front, manyItems);
			data=biggerArray;
		}else{
			biggerArray=(E[])new Object[miniCapacity];
			n1=data.length-front;
			n2=rear+1;
			System.arraycopy(data, front, biggerArray, 0, n1);
			System.arraycopy(data, 0, biggerArray, n1, n2);
			front=0;
			rear=manyItems-1;
			data=biggerArray;
		}
	}
	public E remove(){
		E answer;
		if(manyItems==0){
			throw new NoSuchElementException("Queue underflow.");
			
		}
		answer=data[front];
		front=nextIndex(front);
		manyItems--;
		return answer;
	}
	public int size(){
		return manyItems;
	}
}
