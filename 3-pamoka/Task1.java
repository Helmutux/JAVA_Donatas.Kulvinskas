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
        // int[] sequention = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int maxim = sequention[0];
        int min = sequention[sequention.length-1];
        int i;
        for(i=1; i<sequention.length; i++){
            if(sequention[i]>maxim){
                maxim = sequention[i];
            } else {
                for(i=sequention.length-2; i>=0; i--){
                    if(sequention[i]>min){
                    min = sequention[i];
                    } else {
                        System.out.println("Masyvas yra misrus");
                        break;
                    }
                    if(i==sequention.length){
                        System.out.println("Masyvas yra mazejanti seka");
                        break;
                    }
                }
            }
            if(i==sequention.length){
                System.out.println("Masyvas yra didejanti seka");
                break;
            }
        }
    }
}