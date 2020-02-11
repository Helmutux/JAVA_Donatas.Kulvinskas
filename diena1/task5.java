
// Dvieju skaiciu daugyba

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