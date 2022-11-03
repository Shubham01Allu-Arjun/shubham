package com.coll;
import java.util.*;
public class StudentList {
}
class Main 
    public static void main(String[] args)
    {
        //create 2 ArrayLists list1 and list2 and add 3 objects of Student in each list
        ArrayList<Student> list1 = new ArrayList<>();
        ArrayList<Student> list2 = new ArrayList<>();

        //list1
        list1.add(new Student(1, "John"));
        list1.add(new Student(2, "Smith"));
        list1.add(new Student(3, "Brown"));

        //list2
        list2.add(new Student(1, "John"));
        list2.add(new Student(2, "Smith"));
        list2.add(new Student(3, "Brown"));

        //sort the lists on sid and name
        Collections.sort(list1, new StudentSorter());
        Collections.sort(list2, new StudentSorter());
        Iterator<Student> i=Student.Iterator();
        while( i.hasNext());
        System.out.println(i.Next());
}
}