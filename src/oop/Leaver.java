package oop;

public class Leaver extends Human {

    private String diplomaColor;
    private String gradeSpeciality;
    private int gradeRating;
    private int medalsCount;

    public Leaver(String lastName, String firstName, int age, String diplomaColor, String gradeSpeciality, int gradeRating, int medalsCount) {
        super(lastName, firstName, age);
        setDiplomaColor(diplomaColor);
        setGradeSpeciality(gradeSpeciality);
        setGradeRating(gradeRating);
        setMedalsCount(medalsCount);
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Цвет диплома: %-10s Выпускная специальность: %-8s Рейтинг: %d Количество медалей: %d",
                diplomaColor, gradeSpeciality, gradeRating, medalsCount);
    }

    public void setDiplomaColor(String diplomaColor) {
        this.diplomaColor = diplomaColor;
    }

    public void setGradeSpeciality(String gradeSpeciality) {
        this.gradeSpeciality = gradeSpeciality;
    }

    public void setGradeRating(int gradeRating) {
        this.gradeRating = gradeRating;
    }

    public void setMedalsCount(int medalsCount) {
        this.medalsCount = medalsCount;
    }
}
