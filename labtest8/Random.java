package labtest8;

import java.io.IOException; 
import java.io.RandomAccessFile; 

public class Random {

    // Driver method 
    public static void main(String args[]) 
    { 
        try
        { 
            RandomAccessFile file = new RandomAccessFile("newfile.txt", "r"); 
            long length = file.length(); 
            if(length != 0) 
            { 
                // Set the file pointer at the last position 
                file.seek(length-10); 
                byte[] bytes = new byte[10]; 
                file.read(bytes, 0, 10); 
                System.out.println(new String(bytes)); 
            } 
            else
            { 
                System.out.println("File is empty"); 
            } 
        } 
        catch (IOException e) 
        { 
            e.printStackTrace(); 
        } 
    } 
}