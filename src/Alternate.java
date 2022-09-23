
public class Alternate
{
	int[] addArrays(int[] ar1,int[] ar2)
{
	int size;
	
	if(ar1.length>ar2.length)
		size=ar2.length;
	else
		size=ar1.length;	
	
	int[] sum=new int[size];
	
	for(int i=0;i<size;i++) 
	{
		sum[i]=ar1[i]+ar2[i];  
		
	}
	
	return sum;
}


public int add(int...a)
{
	int s=0;
	for(int i=0;i<a.length;i++)
	{
		s+=a[i];
	}
	return s;
	
}



public static void main(String[] args) {

	Alternate ma=new Alternate();
			
	 int []addary=ma.addArrays(new int[] {40,50,90,20,70,10,20}, new int[]{1,2,3,4,5});
	
	for(int i:addary)
	{
	   System.out.println(i);	
	}
	
	System.out.println("addition of two array is "+ma.add(addary));
}



}