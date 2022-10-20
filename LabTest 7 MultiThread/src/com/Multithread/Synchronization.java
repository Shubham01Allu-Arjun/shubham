package com.Multithread;

public class Synchronization {
	
		public class Fibonacci extends Thread {
		    int n, t1 = 0, t2 = 1;
		    public Fibonacci(int n) {
		        this.n = n;
		    }
		    @Override
		    public void run() {       // 10 Terms 
		        System.out.print("First " + n + " terms: ");
		        for (int i = 1; i <= n; ++i) {
		            System.out.print(t1 + " + ");
		            int sum = t1 + t2;
		            t1 = t2;
		            t2 = sum;
		        }
		    }
		}
		public class Reverse extends Thread {
		    int n;
		    public Reverse(int n) {     //Reverse Order
		        this.n = n;
		    }
		    @Override
		    public void run() {
		        System.out.print("Reverse: ");
		        for (int i = n; i >= 1; --i) {
		            System.out.print(i + " + ");
		        }
		    }
		    }
		}
