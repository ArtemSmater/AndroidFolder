package classworks;

import java.util.Scanner;

public class Classwork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        if(first.equals(second)){
            System.out.println("Равны!");
        } else {
            System.out.println("Не равны!");
        }
    }
}
