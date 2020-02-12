// Write a Java program that reads a floating-point number and prints "zero" if the number is zero. 
// Otherwise, print "positive" or "negative". 
// Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
// Test Data
// Input a number: 25
// Expected Output :
// Input value: 25
// Positive number
class Task4{
    public static void main(String[] args){
        Float number;
        String result;
        result = "none";
        System.out.print("Input a number: ");
        number = Float.valueOf(System.console().readLine());
        if(number == 0){
            result = "zero";
        }
        if(number > 0){
            result = "Positive number";
            if (number <1){
                result = "Positive small number";
            }
            if(number >1000000){
                result = "Positive large number";
            }
        }
        if(number < 0){
            result = "Negative number";
            if (number > -1){
                result = "Negative small number";
            }
            if(number < -1000000){
                result = "Negative large number";
            }
        }
        System.out.println(result);
    }
}