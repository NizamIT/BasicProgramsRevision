package hit.basicprograms;

import java.util.Scanner;

public class NumberReverse {
	@SuppressWarnings("resource")
	public static void main(String args[]) { 
	 int num=0; 
	 int reversenum =0; 
	 System.out.println("Input your number: "); 
	 Scanner scan = new Scanner(System.in);
	 num = scan.nextInt();
	 while(num != 0) { 
	 reversenum = reversenum * 10; 
	 reversenum = reversenum + num%10; 
	 num = num/10; 
	 } 
	 System.out.println("Reverse of input number is: "+reversenum); 
	 } 
}

