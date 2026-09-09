package com.rays.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestPriorityQueue {
	public static void main(String[] args) {
		Queue q = new PriorityQueue();
		q.add("Dinesh");
		q.add("Ranu");
		q.add("Aman");
		q.add("Sita");
		q.add("Chinmay");
		System.out.println("PriorityQueue" + q);
		//q.add(23);//ClassCastException aati hai jab dusre type ka data store karte  hai 
		//System.out.println("PriorityQueue:" + q);
	}

}
