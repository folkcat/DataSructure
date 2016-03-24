package com.folkcat.datastruct.queue;

import java.util.Queue;  
import java.util.LinkedList;  
public class Ex1 {  
	public static void main(String[] args) {  
		Queue<Character> queue = new LinkedList<Character>();  
		queue.offer('a');  
		queue.offer('b');  
		queue.offer('c');  
		queue.offer('d');
		queue.offer('e');  
		queue.offer('f');  
		System.out.println("队列的大小："+queue.size());  
		Character c;  
		while((c=queue.poll())!=null){  
			System.out.print(c+"   ");  
		}  
		System.out.println();  
		System.out.println("队列的大小："+queue.size());  
	}  
}  
