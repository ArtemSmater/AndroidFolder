package homeworks;

enum Speed {
    CAR(65),
    TRUCK(55),
    AIRPLANE(500),
    TRAIN(70),
    BOAT(22);

    private int speed;

    Speed(int speed) {
        setSpeed(speed);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 0) this.speed = speed;
        else this.speed = 1;
    }

    public static String showInfo(int index) {
        Speed[] speeds = values();
        return String.format("%-8s типичная скорость составляет %-3d миль в час.",
                speeds[index], speeds[index].getSpeed());
    }
}

public class Homework25 {
    public static void main(String[] args) {
        System.out.println("Скорости транспортных средств: ");
        for (int i = 0; i < Speed.values().length; i++) {
            System.out.println(Speed.showInfo(i));
        }
    }
}
