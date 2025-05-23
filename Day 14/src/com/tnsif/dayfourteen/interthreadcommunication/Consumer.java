//Program to demonstrate InterThread Communication - Consumer Thread Class
package com.tnsif.dayfourteen.interthreadcommunication;

public class Consumer extends Thread {
	Q obj; 

	public Consumer(Q obj) {
		this.obj = obj;
		start();
	}

	public void run() {
			while (true) {
			try {
				Thread.sleep(0);
			} catch (Exception e) {
				System.out.println(e);
			}
			obj.get();
		}
	}
}