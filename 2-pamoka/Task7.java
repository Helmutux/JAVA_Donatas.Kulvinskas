// Write a Java program to find the number of days in a month.

// Test Data
// Input a month number: 2
// Input a year: 2016
// Expected Output :
// February 2016 has 29 days
class Task7{
    public static void main(String[] args) {
        Integer years[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Integer years4[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        Integer month;
        Integer year;
        
        System.out.print("Input a month number: ");
        month = Integer.valueOf(System.console().readLine());
        System.out.print("Input a year: ");
        year =  Integer.valueOf(System.console().readLine());

        if(month<1 || month>12){
            System.out.println("You input wrong month number - " + month + ". Please, repeat and input number between 1 and 12");    
        } else {
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
            System.out.println(months[month-1] + " " + year + " has " + years4[month-1] + " days");    
            } else {
            System.out.println(months[month-1] + " " + year + " has " + years[month-1] + " days");    
            }
        }
    }
}