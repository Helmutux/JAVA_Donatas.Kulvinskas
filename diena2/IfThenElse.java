class IfThenElse{
public static void main (String[] args){
		Integer a;
		Integer b;
		String result;
		result = "nezinom";


		System.out.print("Ivesti pirma skaiciu: ");
	  	a = Integer.valueOf(System.console().readLine());
	   
	  	System.out.print("Ivesti antra skaiciu: ");
	  	b = Integer.valueOf(System.console().readLine());

		if (a > b){
			result = "daugiau";
		} else if (a < b){
			result = "maziau";
		} else if (a==b){
			result = "lygu";
		}
		System.out.println(a + " yra " + result + " " + b);
	}
}