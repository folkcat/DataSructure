package com.folkcat.datastruct.stack;
import java.util.EmptyStackException;


public class ArrayStack<E> implements Cloneable {
	private E[] data;
	private int manyItems;//Num of elements
	
	
	public static void main(String args[]){
		String expression="[(1+2)*(4+6)]";
		
		if(isMatch(expression)){
			System.out.println("匹配");
		}else{
			System.out.println("不匹配");
		}
	}
	private static boolean isMatch(String expression){
		ArrayStack<Character> charStack=new ArrayStack<Character>(30);
		boolean fail=false;
		int i;
		for(i=0;i<expression.length();i++){
			Character c=expression.charAt(i);
			switch(c){
			case '(':
				charStack.push(c);
				break;
			case '[':
				charStack.push(c);
				break;
			case ')':
				if(charStack.isEmpty()||charStack.pop()!='(')
					fail=true;
				break;
			case ']':
				if(charStack.isEmpty()||charStack.pop()!='[')
					fail=true;
				break;
			}
		}
		return (charStack.isEmpty()&&!fail);
	}
	//Generate an stack which capacity is 10
	public ArrayStack(){
		final int INITIAL_CAPCITY=10;
		manyItems=10;
		data=(E[]) new Object[INITIAL_CAPCITY];
	}
	//Generate an stack which capacity ensure by argument
	public ArrayStack(int initialCapacity){
		if(initialCapacity<0)
			throw new IllegalArgumentException("initialCapacity too small"+initialCapacity);
		manyItems=0;
		data=(E[])new Object[initialCapacity];
	}
	public ArrayStack<E> clone(){
		//Generate a copy of ArrayList
		ArrayStack<E> answer;
		try{
			answer=(ArrayStack<E>)super.clone();
			
		}catch(CloneNotSupportedException e){
			throw new RuntimeException("This Class does not implements Cloneable");
		}
		answer.data=data.clone();
		return answer;
	}
	public void ensureCapacity(int minimumCapacity){
		E biggerArray[];
		if(data.length<minimumCapacity){
			biggerArray=(E[])new Object[minimumCapacity];
			System.arraycopy(data, 0, biggerArray, 0, manyItems);
			data=biggerArray;
		}
	}
	public int getCapacity(){
		return data.length;
	}
	public boolean isEmpty(){
		return (manyItems==0);
	}
	public E peek(){
		if(manyItems==0)
			throw new EmptyStackException();
		return data[manyItems-1];
	}
	public E pop(){
		E answer;
		if(manyItems==0){
			throw new EmptyStackException();
		}
		answer = data[--manyItems];
		data[manyItems]=null;
		return answer;
	}
	public void push(E item){
		if(manyItems==data.length){
			ensureCapacity(manyItems*2+1);
		}
		data[manyItems]=item;
		manyItems++;
	}
	public int size(){
		return manyItems;
	}
	public void trimmToSize(){
		E trimmeArray[];
		if(data.length!=manyItems){
			trimmeArray=(E[])new Object[manyItems];
			System.arraycopy(data, 0, trimmeArray, 0, manyItems);
			data=trimmeArray;
		}
	}
}
