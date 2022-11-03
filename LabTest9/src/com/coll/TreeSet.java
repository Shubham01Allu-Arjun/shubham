package Collection.com;
package com.coll;
import java.util.TreeMap;

public class TreeSet {

	public static void main(String[] args) {//main method

	      System.out.println("(StudentList.java)!\n");
	      TreeMap <Integer, String>tMap = new TreeMap<Integer, String>();
	      tMap.put(1, "shubham");
	      tMap.put(2, "Araddhna");
	      tMap.put(3, "prachi");
	      tMap.put(4, "Sandy");
	      tMap.put(5, "rupesh");
	    
	      System.out.println("Keys of tree map: " + tMap.keySet());
	      System.out.println("Values of tree map: " + tMap.values());
	      System.out.println(" ");
	      
	      System.out.println(
	         "First element of ArryList Student: " + tMap.firstKey() + " Value: " + tMap.get(tMap.firstKey()));
	      System.out.println(
	         "Last element of ArryList Student:  " + tMap.lastKey() + " Value: "+ tMap.get(tMap.lastKey()));
	     
	   }
	}