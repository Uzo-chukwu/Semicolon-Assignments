public class DuplicateNumbersInArrayFinder{
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 3, 3, 4, 4, 4, 4, 5, 6, 7, 8, 9};

        for (int count = 0; count < numbers.length; count++) {
            int number = numbers[count];
            boolean isDuplicate = false;

            for (int innerCount = count + 1; innerCount < numbers.length; innerCount++) {
                if (number == numbers[innerCount]) {
                    if (!isDuplicate) {
                        System.out.println("Duplicate number: " + number);
                        isDuplicate = true;
                    }
                }
            }
        }
    }
}