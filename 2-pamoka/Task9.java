//Write a Java program that takes a year from user and print whether that year is a leap year or not.

// Test Data
// Input the year: 2016
// Expected Output :
// 2016 is a leap year
class Task9{
    public static void main(String[] args) {
    Integer year;
    
    System.out.print("Input a year: ");
    year =  Integer.valueOf(System.console().readLine());

    if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
        System.out.println(year + " is a leap year");    
        } else {
        System.out.println(year + " is not a leap year");    
        }
    }
}
