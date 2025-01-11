package classworks;

enum Meters {
    KM("Километр", 1000),
    MT("Метр", 1),
    DM("Дециметр", 0.1),
    SM("Сантиметр", 0.01),
    MM("Миллиметр", 0.001);

    private String title;
    private double number;

    Meters(String title, double number) {
        setTitle(title);
        setNumber(number);
    }

    @Override
    public String toString() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public double convertValue (Meters meter) {
        return number / meter.number;
    }
}


public class Classwork7 {
    public static void main(String[] args) {
        for (Meters column : Meters.values()) {
            for (Meters lines : Meters.values()) {
                if(column != lines) {
                    System.out.println(1 + " " + column + " = " + column.convertValue(lines) + " " + lines + "ов");
                }
            }
            System.out.println();
        }
    }
}
