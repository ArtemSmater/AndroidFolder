package classworks;

import java.util.function.Predicate;

public class Classwork9 {
    public static void main(String[] args) {
        Predicate<Integer> isSimple = num -> {
            if(num < 2) return false;
            for(int i = 2; i < num / 2; i++) {
                if(num % i == 0) {
                    return false;
                }
            }
            return true;
        };
        System.out.println("Число простое: " + isSimple.test(12));
    }
}