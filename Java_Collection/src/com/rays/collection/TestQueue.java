package com.rays.collection;

import java.util.ArrayDeque;
import java.util.Queue;

public class TestQueue {
//	FIFO(first in first out)
//	Queue is Interface
	public static void main(String[] args) {
		Queue q= new ArrayDeque();
		for(char c='a'; c<='z';c++) {
			q.offer(c);// queue add method 
		}
		System.out.println("Queue:"+q); 
		System.out.println("Queue ke first element:"+q.peek());
		System.out.println("Queue ke first element ko remove karta hai:"+q.poll());//poll() method queue ke first element ko remove karta hai
	}

}
