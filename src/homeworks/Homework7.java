package homeworks;

import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите высоту треугольника: ");
        int height = scanner.nextInt();
        int indent = (height / 2) - 1;
        for(int i = 0; i < height; i++){
            if(i % 2 == 1){
                int copy1 = indent;
                while (copy1 > 0){
                    System.out.print(" ");
                    copy1--;
                }
                int copy2 = i;
                while (copy2 > 0){
                    System.out.print("*");
                    copy2--;
                }
                indent--;
                System.out.println();
            }
        }
    }
}
