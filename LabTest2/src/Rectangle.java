public class Rectangle {
    int length;
    int width;
    
   
    Rectangle()
    {
  	  length=0;
  	  width=0;
    }
    
   
    Rectangle(int len,int wid)
    {
  	  length=len;
  	  width=wid;
    }
    
   
    void area()
    {
  	  System.out.println("The area of the Rectangle is "+(length*width));
    }
    
    public static void main(String[] args) {
		
         
		   Rectangle Rec=new Rectangle();
         Rec.area();                               
         
         Rectangle Rec2=new Rectangle(4,6);
         Rec2.area();                              
	
}
}