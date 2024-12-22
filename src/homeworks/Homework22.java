package homeworks;

public class Homework22 {
    public static void main(String[] args) {
        Student[] students = new Student[6];
        students[0] = new Student("Вербов","Виктор","Gr111",4,5,5,5,4);
        students[1] = new Student("Иванов","Петр","Gr121",4,5,3,2,4);
        students[2] = new Student("Петров","Вася","Gr212",4,5,4,5,4);
        students[3] = new Aspirant("Карасев","Антон","Gr333", "Work1",3,2,4,5,5);
        students[4] = new Aspirant("Лупин","Вячеслав","Gr321", "Work2",4,5,5,5,5,4);
        students[5] = new Aspirant("Бобров","Леша","Gr435", "Work3",3,2,4,5,5,3);

        for (Student student : students){
            student.showInfo();
        }
    }
}

class Student {
    private String lastName;
    private String firstName;
    private String group;
    private int[] grades;

    public Student(String lastName, String firstName, String group, int...grades) {
        setLastName(lastName);
        setFirstName(firstName);
        setGroup(group);
        setGrades(grades);
    }

    public int cashValue(){
        double average = 0;
        for (int grade : grades) {
            average += grade;
        }
        long averageValue = Math.round(average / grades.length);
        if(averageValue == 5) return 1000;
        else return 800;
    }

    public void showInfo() {
        System.out.printf("\n%-8s%-8s группа: %-5s сумма стипендии: %d",
                lastName, firstName, group, cashValue());
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}

class Aspirant extends Student{
    private String gradeTopic;

    public Aspirant(String lastName, String firstName, String group, String gradeTopic, int... grades) {
        super(lastName, firstName, group, grades);
        setGradeTopic(gradeTopic);
    }

    @Override
    public void showInfo() {
        System.out.printf("\n%-8s%-8s группа: %-5s тема работы: %-6s сумма стипендии: %d",
                getLastName(), getFirstName(), getGroup(), gradeTopic, cashValue());
    }

    @Override
    public int cashValue() {
        return super.cashValue() + 1000;
    }

    public void setGradeTopic(String gradeTopic) {
        this.gradeTopic = gradeTopic;
    }
}
