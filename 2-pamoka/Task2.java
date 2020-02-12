// Write a Java program to solve quadratic equations (use if, else if and else).

// Test Data
// Input a: 1
// Input b: 5
// Input c: 1
// Expected Output :
// The roots are -0.20871215252208009 and -4.7912878474779195
class Task2{
    public static void main(String[] args){
        Double a;
        Double b;
        Double c;

        System.out.print("Iveskite pirmaji skaiciu: ");
        a = Double.valueOf(System.console().readLine());

        System.out.print("Iveskite antraji skaiciu: ");
        b = Double.valueOf(System.console().readLine());
        
        System.out.print("Iveskite treciaji skaiciu: ");
        c = Double.valueOf(System.console().readLine());

        Double result = b * b - 4.0 * a * c;

        if (result > 0.0) {
            Double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
            Double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        } else if (result == 0.0) {
            Double r1 = -b / (2.0 * a);
            System.out.println("The root is " + r1);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}