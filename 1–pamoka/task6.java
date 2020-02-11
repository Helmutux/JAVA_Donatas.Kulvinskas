
// Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
// Test Data:
// Input first number: 125
// Input second number: 24
// Expected Output :
// 125 + 24 = 149
// 125 - 24 = 101
// 125 x 24 = 3000
// 125 / 24 = 5
// 125 mod 24 = 5

class task6{
	public static void main(String[] args) {
   		Integer first;
   		Integer second;
	  	System.out.print("Ivesti pirma skaiciu: ");
	  	first = Integer.valueOf(System.console().readLine());
	  	System.out.print("Ivesti antra skaiciu: ");
	  	second = Integer.valueOf(System.console().readLine());
	  	System.out.println(first + " + " + second + " = " + (first + second));
	  	System.out.println(first + " - " + second + " = " + (first - second));
	  	System.out.println(first + " x " + second + " = " + (first * second));
	  	System.out.println(first + " / " + second + " = " + (first / second));
	  	System.out.println(first + " mod " + second + " = " + (first % second));
	}
}

