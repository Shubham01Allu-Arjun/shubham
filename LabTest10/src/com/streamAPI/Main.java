package com.streamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class Main{
public static void main(String[] args) {

	List<Employee> empList = new ArrayList<>();
	empList.add(new Employee("virat", 26,"french", 50000.00));
	empList.add(new Employee("rohit", 28, "germen", 20000.00));
	empList.add(new Employee("shubham", 29,"chines", 40000.00));
	empList.add(new Employee("payal", 30,"computer", 5000.00));
	empList.add(new Employee("Pratik", 27, "mathematics", 9000.00));
	empList.add(new Employee("nisha", 23, "japnies", 30000.00));
	
	System.out.println("List of employee before sorting using lambda expresiion....");
	empList.forEach(System.out::println);

	
	
	Collections.sort(empList,(e1,e2)->e1.getName().compareTo(e2.getName()));
	
	System.out.println("----------");
	System.out.println("\n List of employee after sorting..");
	empList.forEach(System.out::println);

	
       System.out.println(" \n Maximum salary of employees are ..");
        empList.stream()
        .filter(e -> e.getSalary()>10000)
        .forEach(System.out::println);
        
        
        
        System.out.println("\n");
        Optional<Employee> maxSalaryEmp = 
        		empList.stream()
                .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        System.out.println("Employee with max salary:"
                + (maxSalaryEmp.isPresent()? maxSalaryEmp.get():"Not Applicable"));
}
}


