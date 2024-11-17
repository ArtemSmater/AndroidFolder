package homeworks;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество символов: ");
        int count = scanner.nextInt();
        System.out.print("Введите тип символов: ");
        char sign = scanner.next().charAt(0);
        System.out.print("""
                Выберите ориентацию отображения:
                0 - горизонтальная
                1 - вертикальная
                Ваш выбор:\s""");
        int view = scanner.nextInt();
        for(int i = 0; i < count; i++){
            if(view == 0){
                System.out.print(sign);
            } else {
                System.out.println(sign);
            }
        }
    }
}
