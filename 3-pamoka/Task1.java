// Duotas masyvas int[] sequention = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
// 1. Nustatyti, ar masyva sudarantys elementai atitinka viena is salygu:
// – tai didejanti skaiciu seka
// – tai mazejanti skaiciu seka
// – netinka nei viena auksciau paminetu salygu
// 2. Isvesti (output) masyvo elementus atvirkstine tvarka
// 3. Naudojantis tik primityvais, surasti ir isvesti (output) masyvo elemento, kurio reiksme 5, indeksa.
// 4. Isvesti (output) kas antra masyvo elemento reiksme
class Task1{
    public static void main(String[] args) {
        int[] sequention = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
        // int[] sequention = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};//masyvas pasitikrinimui
        // int[] sequention = {2, 4, 1, 3, 5, 1, 8};//masyvas pasitikrinimui
        int first = sequention[0];
        // int min = sequention[0];
        int i;
        int counter = 0;
        int counter2 = 0;

        for(i=1; i<sequention.length; i++){

                if(sequention[i]>first){
                counter++;
                }
                if(sequention[i]<first)  {
                    counter2++;
                }
                first = sequention[i];
            }
            if(counter != 0 && counter2 != 0){
                System.out.println("Masyvas nera nuosekli seka.");
            } else if(counter > 0 && counter2 == 0){
                System.out.println("Masyvas yra didejanti seka.");
            } else if(counter == 0 && counter2 > 0){
                System.out.println("Masyvas yra mazejanti seka.");
            }
            System.out.println("Isvedu masyvo elementus atvirkstine tvarka:");
        for (i=sequention.length-1; i>=0; i--) {
            System.out.println(sequention[i]);
        }
            System.out.println("Isvedu kas antro masyvo elemento reiksme:");
        for (i=1; i<sequention.length; i++) {
            System.out.println(sequention[i]);
            i+=1;
            
        }
    }
}
    