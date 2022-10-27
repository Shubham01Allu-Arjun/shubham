import java.io.*;
	import java.util.*;

package labtest8;

public class Student{

	{
	    public static void main(String[] args) {
	        ArrayList<Student> al = new ArrayList<>();
	        
	        al.add(new Student(1,"Akshay",9876543210l));
	        al.add(new Student(2,"Bhaskar",9876543210l));
	        al.add(new Student(3,"Ajay",9876543210l));
	        
	        try{
	            
	            FileOutputStream fos = new FileOutputStream("student.ser");
	            ObjectOutputStream oos = new ObjectOutputStream(fos);
	            
	            oos.writeObject(al);
	            
	            FileInputStream fis = new FileInputStream("student.ser");
	            ObjectInputStream ois = new ObjectInputStream(fis);
	            
	            ArrayList<Student> al2 = (ArrayList<Student>)ois.readObject();
	            
	            for(Student s:al2){
	                if(s.name.startsWith("A")){
	                    System.
}
