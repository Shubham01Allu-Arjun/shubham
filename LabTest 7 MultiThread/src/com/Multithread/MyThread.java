package com.Multithread;


	public class MyThread extends Thread {
	    public void run() {
	        String[] friends = {"Amar", "Akbar", "Anthony", "David ", "Emiway", "virat", "George", "Henry", "Shubham", "Jack"};
	        for (String friend : friends) {
	            System.out.println(friend);
	        }
	   }

	// Main Method 
	    public static void main(String[] args) {
	        MyThread firstThread = new MyThread();
	        MyThread secondThread = new MyThread();
	        MyThread thirdThread = new MyThread();
	        firstThread.start();
	        secondThread.start();
	        thirdThread.start();
	    }
	}

