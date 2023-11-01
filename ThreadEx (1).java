package com.ct.threads;

public class ThreadEx implements Runnable {

	@Override
	public void run() {//1-10
		System.out.println(Thread.currentThread());
		Thread.currentThread().setPriority(10);
		Thread.currentThread().setName("sleeping");
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread");
		}
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		ThreadEx thread = new ThreadEx();
		Thread th = new Thread(thread);
		th.start();// run
		for (int i = 0; i < 10; i++) {
			
			System.out.println("main thread");
		}
	}
}
