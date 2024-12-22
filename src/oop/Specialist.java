package oop;

public class Specialist extends Leaver{

    private final int diplomaGrade;

    public Specialist(Leaver leaver, int diplomaGrade) {
        super(leaver);
        this.diplomaGrade = diplomaGrade;
    }

    @Override
    public String toString() {
        return super.toString() + " Итоговая оценка: " + diplomaGrade;
    }
}
