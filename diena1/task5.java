
import java.util.Scanner;

class task5{
	public static void main(String[] args) {
  		Scanner in = new Scanner(System.in);
   
	  	System.out.print("Ivesti pirma skaiciu: ");
	  	int numFirst = in.nextInt();
	   
	  	System.out.print("Ivesti antra skaiciu: ");
	  	int numSecond = in.nextInt();
	   
	  	System.out.println(numFirst + " x " + numSecond + " = " + numFirst * numSecond);
 	}
}