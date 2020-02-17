// Duotas masyvas int[] matrix = 
//     1. Isvesti (output) atskirai masyvo stulpeliu ir eiluciu elementu suma
//     2. Naudojantis tik primityvais, surasti ir isvesti (output) masyvo elemento, kurio reiksme 300,
//     koordinates (eilutes indeksa, stulpelio indeksa).
class Task2 {
    public static void main(String[] args) {
        int matrix[][]= {
        	{ 1, 2, 3, 4, 5 },
        	{ 10, 20, 30, 40, 50 },
        	{ 100, 200, 300, 400, 500 }
        };
        int sumColumns = 0;
        int sumRows = 0;
        int numberSpecial = 300;
        //aprasau cikla cikle, noredamas skaiciuoti masyvo stulpeliu sumas
		for (int i= 0; i< matrix[0].length; i++) {
			for (int j=0; j<matrix.length; j++) {
				sumColumns += matrix[j][i];
			}
			//isvedu i ekrana masyvo stulpeliu suma
            System.out.println((i+1) + " stulpelio suma:  " + sumColumns);
            //nunulinu gauta reiksme, kad suma skaiciuotusi is naujo
            sumColumns = 0;
    	}
    	//aprasau cikla, noredamas skaiciuoti masyvo eiluciu suma
    	for(int i=0; i<matrix.length; i++){
    		for(int j=0; j<matrix[0].length; j++){
    			sumRows += matrix[i][j];
    		}
    		//isvedu i ekrana masyvo eiluciu suma
            System.out.println((i+1) + " eilutes suma:  " + sumRows);
            //nunulinu gauta reiksme, kad suma skaiciuotusi is naujo
            sumRows = 0;
    	}
    	//ieskosiu pasirinkto skaiciaus (numberSpecial) koordinaciu masyve
    	for(int i=0; i<matrix.length; i++){
    		for(int j=0; j<matrix[i].length; j++){
    			if(matrix[i][j]==numberSpecial){
    				System.out.println("Pasirinkto skaiciaus " + numberSpecial + " vieta yra: " + (i+1) + " eiluteje ir " + (j+1) + " stulpelyje.");
    			}
    		}

    	}
    }
}
