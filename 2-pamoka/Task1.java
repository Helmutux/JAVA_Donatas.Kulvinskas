// Write a Java program to get a number from the user and print whether it is positive or negative. Go to the editor

// Test Data
// Input number: 35
// Expected Output :
// Number is positive
class Task1{
    public static void main(String[] args) {
        Integer number;
        String result;
        result = "nezinom";
        System.out.print("Nurodykite skaiciu: ");
        number = Integer.valueOf(System.console().readLine());
        if (number >= 0){
            result = "positive";
        } else {
            result = "negative";
        }
        System.out.println("Number is " + result);
    }
}