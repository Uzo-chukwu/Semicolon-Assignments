public class BinaryDeterminant {
    public int[][] determineBinary(String[][] words) {
        int[][] determinant = new int[words.length][words[0].length];
        for (int count = 0; count < words.length; count++) {
            for (int word = 0; word < words[count].length; word++) {
                if (words[count][word].equals("x")) determinant[count][word] = 1;
                else if (words[count][word].equals("o")) determinant[count][word] = 0;


            }
        }
        return determinant;
    }


}
