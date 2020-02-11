
//sudetis, atimtis, daugyba, dalyba, likutis

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

