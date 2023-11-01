package com.ct.threads;

public class ThreadEx3 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println("child thread");
		}

	}

	public static void main(String[] args) throws InterruptedException {

		ThreadEx3 t = new ThreadEx3();
		t.start();
		t.join();
		for (int i = 0; i < 5; i++) {
			Thread.sleep(2000);
			System.out.println("main thread");
		}
	}
}
