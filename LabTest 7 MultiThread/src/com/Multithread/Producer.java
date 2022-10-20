package com.Multithread;


	public class Producer {
		class ProdCons{
			int availableProduct=0;
			
			public synchronized void demand(int n){
				System.out.println("Demanding for "+n);
				if(availableProduct<n){
					System.out.println("Not enough products available");
					 try{  
						wait();  
					}catch(Exception e){System.out.println(e);}  
				}
				availableProduct=availableProduct-n;
				System.out.println("Available Product: "+availableProduct);
			}
			
			public synchronized void supply(int n){
				System.out.println("Supplying "+n);
				availableProduct=availableProduct+n;
				System.out.println("Available Product: "+availableProduct);
				notify();  
			}
		}
	}

