package com.coll;
import java.util.ArrayList;
	 
public class TreeSet {
	
	public class Main 
	{
	    public static void main(String[] args)
	    {
	        ArrayList<String> list1 = new ArrayList<String>();
	 
	        list1.add("A");
	 
	        list1.add("B");
	 
	        list1.add("C");
	 
	        list1.add("D");
	 
	        list1.add("E");
	 
	        ArrayList<String> list2 = new ArrayList<String>();
	 
	        list2.add("A");
	 
	        list2.add("B");
	 
	        list2.add("C");
	 
	        list2.add("D");
	 
	        list2.add("E");
	 
	        TreeSet<String> set = new TreeSet<String>();
	 
	        set.addAll(list1);
	 
	        set.addAll(list2);
	 
	        System.out.println("Size of tree set : " + set.size());
	 
}
}}