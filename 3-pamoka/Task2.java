// Duotas masyvas int[] matrix = 
//     1. Isvesti (output) atskirai masyvo stulpeliu ir eiluciu elementu suma
//     2. Naudojantis tik primityvais, surasti ir isvesti (output) masyvo elemento, kurio reiksme 300,
//     koordinates (eilutes indeksa, stulpelio indeksa).
class Task2 {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4, 5 }, { 10, 20, 30, 40, 50 }, { 100, 200, 300, 400, 500 } };
        int sumColumns = 0;
        // int sumRows;
        for (int i = 0; i < matrix.length; i++) {
            sumColumns = matrix[i][i]+matrix[i+1][i]+matrix[i+2][i];
            System.out.println(matrix[i+1] + " stulpelio suma yra " + sumColumns);    
        }
        
    }
}