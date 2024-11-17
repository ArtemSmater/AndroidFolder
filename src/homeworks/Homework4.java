package homeworks;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число от 1 до 99: ");
        int sum, rest;
        sum = scanner.nextInt();
        if(sum >= 1 && sum <= 99){
            rest = sum % 10;
            if(rest == 1 && sum != 11){
                System.out.println(sum + " копейка.");
            } else if(rest >=2 && rest <= 4 && sum > 20){
                System.out.println(sum + " копейки.");
            } else {
                System.out.println(sum + " копеек.");
            }
        } else {
            System.out.println("Неккоректное число!");
        }
    }
}
