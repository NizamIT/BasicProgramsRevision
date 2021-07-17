package hit.basicprograms;

public class Swapping {
	public static void main(String[] args) { 
		 float first = 12.50f, second = 24.50f; 
		 System.out.println("--Before swap--"); 
		 System.out.println("First number = " + first); 
		 System.out.println("Second number = " + second);
		 float temp = first;
		 first = second;
		 second = temp; 
		 System.out.println("--After swap--"); 
		 System.out.println("First number = " + first); 
		 System.out.println("Second number = " + second); 
		 }
}
