package homeworks;

import javax.swing.*;

public class Homework2 {
    public static void main(String[] args) {
        String line1 = "\r--------------------------------------\n";
        String line2 = "\t\tJAVA PRIMITIVE TYPES\t\t\n";
        String line3 = String.format("\r| %-12s | %-12s | %7s", "CATEGORY", "NAME", "BITS |\n");
        String line4 = String.format("\r| %-12s | %-12s | %04d |\n/", "Floating", "double", Double.SIZE);
        String line5 = String.format("\r| %-12s | %-12s | %04d |\n", "Floating", "float", Float.SIZE);
        String line6 = String.format("\r| %-12s | %-12s | %04d |\n", "Integral", "long", Long.SIZE);
        String line7 = String.format("\r| %-12s | %-12s | %04d |\n", "Integral", "int", Integer.SIZE);
        String line8 = String.format("\r| %-12s | %-12s | %04d |\n", "Integral", "short", Short.SIZE);
        String line9 = String.format("\r| %-12s | %-12s | %04d |\n", "Integral", "byte", Byte.SIZE);
        String line10 = String.format("\r| %-12s | %-12s | %04d |\n", "Integral", "char", Character.SIZE);
        String line11 = String.format("\r| %-12s | %-12s | %04d |\n", "Boolean", "boolean", 1);
        System.out.println(line1 + line2 + line1 + line3 + line1 + line4 + line5 + line6 + line7 + line8 + line9 + line10 + line11 + line1);

    }
}
