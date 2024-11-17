import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String byteVar = String.format("Переменная типа byte   занимает %s  байт памяти (%s бит памяти), " +
                "и принимает значения в диапазоне от %s до %s.", Byte.BYTES, Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);
        String shortVar = String.format("Переменная типа short  занимает %s байт памяти (%s бит памяти), " +
                "и принимает значения в диапазоне от %s до %s.", Short.BYTES, Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
        String integerVar = String.format("Переменная типа int    занимает %s байт памяти (%s бит памяти), " +
                "и принимает значения в диапазоне от %s до %s.", Integer.BYTES, Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        String longVar = String.format("Переменная типа long   занимает %s байт памяти (%s бит памяти), " +
                "и принимает значения в диапазоне от %s до %s.", Long.BYTES, Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);
        String floatVar = String.format("Переменная типа float  занимает %s байт памяти (%s бит памяти), " +
                "и принимает значения в диапазоне от %s до %s.", Float.BYTES, Float.SIZE, Float.MIN_VALUE, Float.MAX_VALUE);
        String doubleVar = String.format("Переменная типа double занимает %s байт памяти (%s бит памяти), " +
                "и принимает значения в диапазоне от %s до %s.", Double.BYTES, Double.SIZE, Double.MIN_VALUE, Double.MAX_VALUE);
        System.out.println(byteVar + "\n" + shortVar + "\n" + integerVar + "\n" + longVar + "\n" + "\n" + floatVar + "\n" + doubleVar);
    }
}
