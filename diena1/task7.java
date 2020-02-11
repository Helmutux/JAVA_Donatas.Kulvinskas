
//program that takes a number as input and prints its multiplication table upto 10
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

