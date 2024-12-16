package oop;

public class Teacher extends Human{

    private String speciality;
    private String patronymic;
    private int experience;
    private int groupCount;

    public Teacher(String lastName, String firstName, String patronymic, int age, String speciality, int experience, int groupCount) {
        super(lastName, firstName, age);
        setSpeciality(speciality);
        setPatronymic(patronymic);
        setExperience(experience);
        setGroupCount(groupCount);
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" Отчество: %-10s Специальность: %-12s Опыт работы: %d, Количество групп: %d",
                patronymic, speciality, experience, groupCount);
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setGroupCount(int groupCount) {
        this.groupCount = groupCount;
    }
}
