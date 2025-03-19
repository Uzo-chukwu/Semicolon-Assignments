

public class Kata {
    public static void main(String[] args) {
    }

    public static int getLargestElement(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        for (double number : numbers) {
            if (number > largest)
                largest = (int) number;
        }
        return largest;
    }

    public static int[] reverseList(int[] numbers) {
        int[] reverseNumbers = new int[numbers.length];
        for (int count = numbers.length - 1; count >= 0; count--) {
            reverseNumbers[numbers.length - 1 - count] = numbers[count];
        }
        return reverseNumbers;
    }

    public static boolean checkElement(int number, int[] numbers) {
        for (int digit : numbers) {
            if (number == digit)
                return true;
        }
        return false;
    }

    public static void printOddPosition(int[] numbers) {
        for (int count = 0; count < numbers.length; count++) {
            if (count % 2 != 0)
                System.out.print(numbers[count] + " ");
        }
    }

    public static void printEvenPosition(int[] numbers) {
        int[] evenElement = new int[(numbers.length)];
        for (int count = 0; count < numbers.length; count++) {
            if (count % 2 == 0)
                System.out.print(numbers[count] + " ");
        }
    }

    public static int getRunningTotal(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public static boolean checkPalindrome(String word) {
        word = word.toLowerCase();
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equals(reversed);
    }

    public static int getSumOfNumbersFor(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }

    public static int getSumOfNumbersWhile(int[] numbers) {
        int total = 0;
        int count = 0;
        while (count < numbers.length) {
            total += numbers[count];
            count++;
        }
        return total;
    }

    public static int getSumOfNumbersDoWhile(int[] numbers) {
        int total = 0;
        int count = 0;
        do {
            total += numbers[count];
            count++;
        } while (count < numbers.length);
        return total;
    }

    public static char[] concatenateList(char[] letters, char[] numbers) {
        char[] combined = new char[(letters.length + numbers.length)];
        for (int count = 0; count < letters.length; count++) {
            combined[count] = letters[count];
        }
        for (int count = 0; count < numbers.length; count++) {
            combined[count + letters.length] = numbers[count];
        }
        return combined;
    }

    public static char[] concatenateListAlternatively(char[] letters, char[] numbers) {
        char[] combined = new char[(letters.length + numbers.length)];
        for (int count = 0; count < letters.length; count++) {
            combined[count] = letters[count];
        }
        for (int count = 0; count < numbers.length; count++) {
            combined[count + letters.length] = numbers[count];
        }
        return combined;
    }

    public static int[] getListOfDigits(int number) {
        int[] list = new int[String.valueOf(number).length()];
        int counter = (String.valueOf(number).length() - 1);
        while (number > 0) {
            list[counter] = number % 10;
            number /= 10;
            counter--;
        }
        return list;
    }
	
    public static boolean isEven(int number) {
	if (number % 2 == 0){
		return true;
	}else{
        	return false;
	}
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

    public static int subtract(int firstNumber, int secondNumber) {
        return Math.abs(firstNumber - secondNumber);
    }

    public static float divide(float dividend, float divisor) {
        if (divisor == 0) {
            return 0;
        }
        return  dividend / divisor;
    }

    public static int factorOf(int number) {
        int count = 0;
        for (int digit = 1; digit <= number; digit++) {
            if (number % digit == 0) {
                count++;
            }
        }
        return count;
    }

    public static boolean isSquare(double number) {
        double squareRoot =  Math.sqrt(number);
        return squareRoot * squareRoot == number;
    }

    public static boolean isPalindrome(int number) {
        String str = String.valueOf(number);
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static long factorialOf(int number) {
        long result = 1;
        for (int digit = 2; digit <= number; digit++) {
            result *= digit;
        }
        return result;
    }

    public static long squareOf(int number) {
        return (long) number * number;
    }


}