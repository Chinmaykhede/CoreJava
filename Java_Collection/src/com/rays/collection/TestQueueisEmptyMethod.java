package com.rays.collection;

import java.util.ArrayDeque;
import java.util.Queue;

public class TestQueueisEmptyMethod {
	public static void main(String[] args) {
		Queue q= new ArrayDeque();
		for(char c='a'; c<='z';c++) {
			q.offer(c);
		}
		System.out.println("Queue:"+q);
		while (!q.isEmpty()) {
			System.out.println("Queue:"+q.poll());
		}
		System.out.println("Queue:"+q);
		System.out.println(q.peek());
	}
	

}
