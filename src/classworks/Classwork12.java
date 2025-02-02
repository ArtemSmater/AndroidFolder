package classworks;

import java.util.*;

public class Classwork12 {
    public static void main(String[] args) {
        try{
            ArrayList<Integer> arrayList = (ArrayList<Integer>) inputNumbers();
            checkDuplicate(arrayList);
            System.out.println(Arrays.toString(new ArrayList[]{arrayList}));
        } catch (ThrowDuplicateException e) {
            System.out.println("Ошибка! " + e.getMessage());
        }


    }

    private static List<Integer> inputNumbers() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов: ");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.print("-> ");
            arrayList.add(scanner.nextInt());
        }
        return arrayList;
    }

    private static void checkDuplicate(List<Integer> array) throws ThrowDuplicateException {
        Set<Integer> setList = new HashSet<>();
        for (Integer num : array) {
            if(setList.contains(num)) {
                throw new ThrowDuplicateException("Обнаружен повторяющийся номер: " + num);
            }
            setList.add(num);
        }
    }
}

class ThrowDuplicateException extends Exception{
    public ThrowDuplicateException(String message) {
        super(message);
    }
}
