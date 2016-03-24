package com.folkcat.datastruct.map;

public class Queue {

	private int[] values;
	private int begin = -1;
	private int end = -1;

	Queue(int size) {
		values = new int[size];
	}

	void push(int value) {
		values[++begin] = value;
	}

	int pop() {
		return values[++end];
	}

	boolean isEmpty() {
		return begin == end;
	}
}