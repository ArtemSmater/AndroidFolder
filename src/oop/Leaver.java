package oop;

public class Leaver extends Student {

    private String diplomaColor;
    private String gradeSpeciality;
    private int gradeRating;
    private int medalsCount;

    public Leaver(String lastName, String firstName, int age,
                  String speciality, String group, double rating, double attendance,
                  String diplomaColor, String gradeSpeciality, int gradeRating, int medalsCount) {
        super(lastName, firstName, age, speciality, group, rating, attendance);
        this.diplomaColor = diplomaColor;
        this.gradeSpeciality = gradeSpeciality;
        this.gradeRating = gradeRating;
        this.medalsCount = medalsCount;
    }

    public Leaver(Leaver leaver){
        super(leaver);
        this.diplomaColor = leaver.diplomaColor;
        this.gradeSpeciality = leaver.gradeSpeciality;
        this.gradeRating = leaver.gradeRating;
        this.medalsCount = leaver.medalsCount;
    }

    public Leaver (Student student, String diplomaColor, String gradeSpeciality, int gradeRating, int medalsCount){
        super(student);
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
