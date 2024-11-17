package homeworks;

import java.util.Scanner;

public class Homework12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Сторона: ");
        int side = scanner.nextInt();
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side * 2; j++) {
                if(i == 0 || i == side - 1 || j == 0 || j == side * 2 - 1){
                    System.out.print("=");
                } else {
                    if(j % 2 == 1) System.out.print("\\");
                    else System.out.print("/");
                }
            }
            System.out.println();
        }
    }
}
