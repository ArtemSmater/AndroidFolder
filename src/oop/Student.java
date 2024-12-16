package oop;

public class Student extends Human {

    private String speciality;
    private String group;
    private double rating;
    private double attendance;


    public Student(String lastName, String firstName, int age, String speciality, String group, double rating, double attendance) {
        super(lastName, firstName, age);
        setSpeciality(speciality);
        setGroup(group);
        setRating(rating);
        setAttendance(attendance);
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Специальность: %-9s Группа: %s, Рейтинг: %-4.1f Посещаемость: %.1f",
                speciality, group, rating, attendance);
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setAttendance(double attendance) {
        this.attendance = attendance;
    }
}

