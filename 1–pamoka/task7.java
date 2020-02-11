
// Write a Java program that takes a number as input and prints its multiplication table upto 10.
// Test Data:
// Input a number: 8
// Expected Output :
// 8 x 1 = 8
// 8 x 2 = 16
// 8 x 3 = 24
// ...
// 8 x 10 = 80

class task7{
	public static void main(String[] args) {
  		Integer numeris;
	  	System.out.print("Ivesti skaiciu: ");
	  	numeris = Integer.valueOf(System.console().readLine());
	  	for (int i=1; i<=10; i++){
   		System.out.println(numeris + " x " + i + " = " + 
     	(numeris * i));
  		}
	}
}

