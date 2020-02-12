// Take three numbers from the user and print the greatest number.

// Test Data
// Input the 1st number: 25
// Input the 2nd number: 78
// Input the 3rd number: 87
// Expected Output :
// The greatest: 87
class Task3{
    public static void main(String[] args){
        Integer number1;
        Integer number2;
        Integer number3;
        
        System.out.print("Input the 1st number: ");
        number1 = Integer.valueOf(System.console().readLine());
        System.out.print("Input the 2st number: ");
        number2 = Integer.valueOf(System.console().readLine());
        System.out.print("Input the 3st number: ");
        number3 = Integer.valueOf(System.console().readLine());
        if (number1 > number2 && number1 > number3){
            System.out.println("The greatest: " + number1);
        }
        if(number2 > number1 && number2 > number3){
            System.out.println("The greatest: " + number2);
        }
        if(number3 > number1 && number3 >number2){
            System.out.println("The greatest: " + number3);
        }
    }
}