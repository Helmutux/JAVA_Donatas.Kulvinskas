
//Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers
import java.util.Scanner;

class task6{
	public static void main(String[] args) {
  		Scanner in = new Scanner(System.in);
   
	  	System.out.print("Ivesti pirma skaiciu: ");
	  	int numFirst = in.nextInt();
	   
	  	System.out.print("Ivesti antra skaiciu: ");
	  	int numSecond = in.nextInt();
	   
	  	System.out.println(numFirst + " + " + numSecond + " = " + (numFirst + numSecond));
	  	System.out.println(numFirst + " - " + numSecond + " = " + (numFirst - numSecond));
	  	System.out.println(numFirst + " x " + numSecond + " = " + (numFirst * numSecond));
	  	System.out.println(numFirst + " / " + numSecond + " = " + (numFirst / numSecond));
	  	System.out.println(numFirst + " mod " + numSecond + " = " + (numFirst % numSecond));
 	
	}
}

