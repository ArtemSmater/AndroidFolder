package homeworks;

public class Homework9 {
    public static void main(String[] args) {
        int[][] first = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        for(int i = 0; i < first.length; i++){
            for (int j = 0; j < first[i].length; j++) {
                System.out.print(first[i][j] + "\t");
            }
            System.out.println();
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for(int i = 0; i < first.length; i++){
            for (int j = 0; j < first[i].length; j++) {
                System.out.print(first[i][j] * first[i][j] + "\t");
            }
            System.out.println();
            System.out.println();
        }
    }
}
