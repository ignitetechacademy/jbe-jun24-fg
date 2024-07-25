package com.syam.learn.java.threadz;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerDemo {

	public static void main(String[] args) {
		List<String> foods = new ArrayList<>();

		Runnable producerThread = () -> {
			System.out.println("Producing food ...");
			Thread.currentThread().setName("producer");

			synchronized (foods) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
				}
				foods.add("Dosa");
				foods.add("Poori");

				System.out.println("Producing complete ...");
				foods.notifyAll();
			}
		};

		Runnable consumerThread = () -> {
			System.out.println("Consuming Food ...");
			Thread.currentThread().setName("consumer");

			synchronized (foods) {
				try {
					foods.wait();
				} catch (InterruptedException e) {
					System.out.println("Interrupted");
				}

				for (String foodItem : foods) {
					System.out.println(foodItem);
				}
			}

			System.out.println("Consuming completed ..");
		};

		new Thread(producerThread).start();
		new Thread(consumerThread).start();

	}

}
