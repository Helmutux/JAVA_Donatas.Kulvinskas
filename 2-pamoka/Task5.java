// Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.
// Test Data
// Input number: 3
// Expected Output :
// Wednesday
class Task5{
    public static void main(String[] args){
        Integer number;
        System.out.print("Input number: ");
        number = Integer.valueOf(System.console().readLine());
        String weekdays [] = {"Monday", "Tuesday", "Wednesday","Thursday","Friday","Saturday","Sunday"};
        String weekday;
        weekday = "none";
        
        if (number <1 || number >7){
            weekday = "Please, input number between 1 and 7";
        } else {
            for(Integer i=0; i<weekdays.length; i++){
                if(number == i+1){
                    weekday = weekdays[i];
                }
            }
        }
        System.out.println(weekday);
    }
}