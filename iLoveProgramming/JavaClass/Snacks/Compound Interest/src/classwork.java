import java.util.Scanner;

public class classwork {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = {1,2,3,4,5,6,7};


    }
    
    public static int getIndexof(int number, int[] numbers) {
        for (int digit = 0; digit < numbers.length; digit++) {
            if (number == numbers[digit]) {
                return digit;
            
            }
        }

        return -1;
    }
}
