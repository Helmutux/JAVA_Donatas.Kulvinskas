// Write a Java program that reads in two floating-point numbers and tests whether they are the same up to three decimal places.

// Test Data
// Input floating-point number: 1256
// Input floating-point another number: 3254
// Expected Output :
// They are different
class Task6{
    public static void main(String[] args){
        Float firstNumber;
        Float secondNumber;
        
        System.out.print("Input floating-point number: ");
        firstNumber = Float.valueOf(System.console().readLine());

        System.out.print("Input floating-point another number: ");
        secondNumber = Float.valueOf(System.console().readLine());

        firstNumber = Float.valueOf(Math.round(firstNumber * 1000));
        firstNumber = firstNumber / 1000;

        secondNumber = Float.valueOf(Math.round(secondNumber * 1000));
        secondNumber = secondNumber / 1000;

        if (firstNumber == secondNumber)
        {
            System.out.println("They are the same up to three decimal places");
        }
        else
        {
            System.out.println("They are different");
        }
    }
}