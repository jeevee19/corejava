package com.capg.demos;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {

	public static void main(String[] args) {


ExecutorService  executor =	Executors.newCachedThreadPool();
		
		System.out.println("main started...");
		
		for(int i=0; i<100; i++) {  // 10 tasks
		
		Runnable task = () -> System.out.println("Run is executed for task1 "+Thread.currentThread().getName());
		executor.execute(task); // t1.start()
		
		}

	}

}
