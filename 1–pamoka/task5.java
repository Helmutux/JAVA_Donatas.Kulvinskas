
// Write a Java program that takes two numbers as input and display the product of two numbers.
// Test Data:
// Input first number: 25
// Input second number: 5
// Expected Output :
// 25 x 5 = 125

class task5{
	public static void main(String[] args) {
   		Integer numFirst;
   		Integer numSecond;
   		Integer sum;
	  	System.out.print("Ivesti pirma skaiciu: ");
	  	numFirst = Integer.valueOf(System.console().readLine());
	  	System.out.print("Ivesti antra skaiciu: ");
	  	numSecond = Integer.valueOf(System.console().readLine());
	    sum = numFirst * numSecond;
	  	System.out.println(numFirst + " x " + numSecond + " = " + sum);
 	}
}