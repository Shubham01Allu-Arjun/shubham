import java.util.Scanner;
	public class InvalidMailIdException {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Emain Id :");
			String id=sc.next();
			try {
				boolean b= (id.contains(".") && id.contains("@") && id.endsWith("com")
						|| id.contains(" "));
				if(b==false) 
				throw new IllegalArgumentException();
				
				System.out.println("Valid Email.");
			}
			catch(Exception iae) {
				System.out.println("InValid Email.");

			}
		}
		
	}

