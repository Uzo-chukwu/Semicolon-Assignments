import java.util.Scanner;
public class PrimeNumbers{
	public static void main(String [] args){
	int num = getPrimeCount(4);
	System.out.println(num);
	int[] primeNumbers = getPrimeNumbersBefore(19);
	for(int i = 0; i < primeNumbers.length; i++){
		System.out.print(primeNumbers[i]);}
}
	public static int getPrimeCount(int number){
		int primeCount = 0;
		int divideCount = 0;
        for (int count = number; count > 1; count--) {
		for(int x = 1; x <= count; x++){
			if(count % x == 0)
				divideCount++;
		}			
		if(divideCount == 2)
			primeCount++;

		divideCount = 0;
	}
				        
	return primeCount;
	}
	
	public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
	int primeCounter = 0;  
        for (int count = number; count > 1; count--) {
            if (number % count == 0) 
                primeCounter += 1;
            }
	    if(primeCounter == 1 )
		return true;
        return false;
    	}


	public static int[] getPrimeNumbersBefore(int number){
		int[] primeNumbers = new int[getPrimeCount(number)];
		
		for (int count = 0, num = number; num > 1; num--) {
			if(isPrimeNumber(num))
				primeNumbers[count] = num;
				count++	;
		}			
		return primeNumbers;
	}

		
	}	




