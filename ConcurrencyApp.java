package com.softwaredevl.concurrency;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrencyApp  {
	
	
	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		Runnable processor = new ParallelArrayProcessor();
		executor.execute(processor);
		
		Runnable processor2 = new ParallelArrayProcessor();
		executor.execute(processor2);
		
		executor.shutdown(); 

	}
	
	
}	

