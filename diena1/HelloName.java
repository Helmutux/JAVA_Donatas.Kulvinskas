//Pirmoji programa java 

class HelloName
{
	 public static void main(String[] args)
	 {
	 	//Outout promt
	 	System.out.print("Enter Your name: ");
		
		//Asign input variable name
	 	String name = System.console().readLine();

	 	//Outout promt
	 	System.out.print("Enter Your surname: ");
		
		//Asign input variable name
	 	String surname = System.console().readLine();

	 	//Outout promt
	 	System.out.print("Enter Your age: ");
		
		//Asign input variable name
	 	String age = System.console().readLine();

	 	//Output greeting 
	 	System.out.println("Hello, " + name + " " + surname + ". Esi " + age + " metu amziaus. Mano supratimu - tikras senis :)");
	 }
}