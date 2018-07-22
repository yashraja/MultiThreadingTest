package com.yashraja.multithreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FizBuZ implements Runnable {

	int data;

	public FizBuZ(int data) {
		this.data = data;
	}

	private boolean divby3(int data) {
		if (data % 3 == 0) {
			System.out.println(data + " is Fiz");
			return true;
		}
		return false;
	}

	private boolean divby5(int data) {
		if (data % 5 == 0) {
			System.out.println(data + " is Buz");
			return true;
		}
		return false;
	}

	private boolean divby15(int data) {
		if (data % 15 == 0) {
			System.out.println(data + " is FizBuz");
			return true;
		}
		return false;
	}

	private void printit(int total) {
		if (divby15(total)) {

		} else if (divby3(total)) {

		} else if (divby5(total)) {

		} else {
			System.out.println(total);
		}
	}

	public void run() {
//		System.out.println("Starting thread" + Thread.currentThread().getName());
		printit(data);
//		System.out.println("Ending thread" + Thread.currentThread().getName());
	}

	public static void main(String[] args) {

		int total_numb = 15;

		ExecutorService es = Executors.newFixedThreadPool(4);

		while (total_numb > 0) {
			FizBuZ obj = new FizBuZ(total_numb);
			es.execute(obj);
			total_numb--;
		}
		es.shutdown();

		while (!es.isTerminated()) {
		}
	}
}
