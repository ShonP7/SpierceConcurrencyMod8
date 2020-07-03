package com.softwaredevl.concurrency;

import java.util.Random;

public class ParallelArrayProcessor implements Runnable{
	
	static Random randNum = new Random();
	static int prefixSum;
	
	int arrayNumber = randNum.nextInt(10-1) + 1;
	final int ARRAYDIMENSIONS = (int) Math.pow(100,4);
	
	
	@Override
	public void run() {
		int[] methodArray = masterArray(ARRAYDIMENSIONS);
		for (int i = 1; i <= ARRAYDIMENSIONS; i++) {
			
			long startTime = System.nanoTime();
			int prefixSum[] = new int[ARRAYDIMENSIONS];
			prefixSum [0] = methodArray[0];
			for(int j = 1; j <= ARRAYDIMENSIONS ; j++) {
			prefixSum[j] = prefixSum[j - 1] + methodArray[j];
			}
			long endTime = System.nanoTime();
			System.out.println(methodArray + "Compute Time:  " + (endTime-startTime) + "\n");	
		}
		
	}

	public static int[] masterArray(int length) {
		int[] array = new int[length];
		for (int i = 0; i < array.length; i++) {
		array[i] = randNum.nextInt(50);
		}
		return array;
			
		}
		
		
			public static int prefixSum(int[] arr) {
				int result = 0;
				for (int i = 0; i < arr.length; i++) {
					result += arr[i];
				}
				return result;
		}	
			
}
