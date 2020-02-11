
//Java program that takes a number as input and prints its multiplication table upto 10
import java.util.Scanner;

class task7{
	public static void main(String[] args) {
  		Scanner in = new Scanner(System.in);
   
	  	System.out.print("Ivesti skaiciu: ");
	  	int number = in.nextInt();
	   
	  	for (int i=1; i<=10; i++){
   		System.out.println(number + " x " + i + " = " + 
     	(number * i));
  		}
	}
}

