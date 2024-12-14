package classworks;

import java.util.ArrayList;
import java.util.Scanner;

public class Classwork4 {
    public static void main(String[] args) {

//        FigureArea.triangleG(3,4,5);
//        FigureArea.triangle(6, 7);
//        FigureArea.box(7);
//        FigureArea.rectangle(2,6);
//        FigureArea.getCounter();
//        Student[] students = new Student[10];
//        students[0] = new Student("Петров В.О.", 1, new int[]{5,9,2,3,2});
//        students[1] = new Student("Петров А.В.", 2, new int[]{2,1,10,7,5});
//        students[2] = new Student("Иванов Ц.У.", 3, new int[]{3,5,9,10,10});
//        students[3] = new Student("Вербова Е.К.", 2, new int[]{11,12,12,11,9});
//        students[4] = new Student("Долгих С.У.", 3, new int[]{9,8,11,4,4});
//        students[5] = new Student("Шишкин М.Э.", 1, new int[]{2,4,8,9,3});
//        students[6] = new Student("Репкин И.Х.", 2, new int[]{2,9,5,5,6});
//        students[7] = new Student("Матрешкина Н.Ш.", 1, new int[]{12,11,12,12,11});
//        students[8] = new Student("Волков Я.Д.", 3, new int[]{11,1,5,5,11});
//        students[9] = new Student("Колганов Ч.Т.", 2, new int[]{3,4,7,3,10});
//        Student.getStudents(students);
//        Student.getBestStudents(students);

        MathActions.showInfo(10,11,2,3);
    }

    // 1 Класс Student

    public static class Student {
        private String name;
        private int group;
        private int[] grades = new int[5];

        public Student(String name, int group, int[] grades) {
            setName(name);
            setGroup(group);
            setGrades(grades);
        }

        public static void getStudents(Student[] students) {
            System.out.println("Все студенты: ");
            for (Student student : students) {
                String marks = "";
                for (int j = 0; j < student.getGrades().length; j++) {
                    marks += student.getGrades()[j] + " ";
                }
                String lastName = student.getName().substring(0, student.getName().indexOf(" "));
                String initials = student.getName().substring(student.getName().indexOf(" "));
                System.out.println(String.format("%-15s%s", lastName, initials) + "\s\sГруппа: " +
                        student.getGroup() + "\s\sОценки: " + marks);
            }
        }

        public static void getBestStudents(Student[] students) {
            System.out.println();
            System.out.println("Студенты с хорошей успеваемостью: ");
            for (Student student : students) {
                int sum = 0;
                for (int j = 0; j < student.getGrades().length; j++) {
                    sum += student.getGrades()[j];
                }
                if (sum >= 40) {
                    String marks = "";
                    for (int j = 0; j < student.getGrades().length; j++) {
                        marks += student.getGrades()[j] + " ";
                    }
                    String lastName = student.getName().substring(0, student.getName().indexOf(" "));
                    String initials = student.getName().substring(student.getName().indexOf(" "));
                    System.out.println(String.format("%-15s%s", lastName, initials) + "\s\sГруппа: " +
                            student.getGroup() + "\s\sОценки: " + marks);
                }
            }
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getGroup() {
            return group;
        }

        public void setGroup(int group) {
            this.group = group;
        }

        public int[] getGrades() {
            return grades;
        }

        public void setGrades(int[] grades) {
            this.grades = grades;
        }
    }


    // 2 Класс MathActions

    public static class MathActions {
        public static void showInfo(int i, int... v) {
            System.out.printf("""
                    Минимальное число: %d
                    Максимальное число: %d
                    Среднее арифметическое: %.1f
                    Факториал числа: %d""", findMin(v), findMax(v), findAverage(v), factorial(i));
        }

        public static int findMin(int... v) {
            int result = v[0];
            for (int j : v) {
                if (result > j) {
                    result = j;
                }
            }
            return result;
        }

        public static int findMax(int... v) {
            int result = v[0];
            for (int j : v) {
                if (result < j) {
                    result = j;
                }
            }
            return result;
        }

        public static double findAverage(int... v) {
            int result = 0;
            for (int j : v) {
                result += j;
            }
            return result / (double) v.length;
        }

        public static int factorial(int i) {
            if (i == 1) {
                return 1;
            }
            return i * factorial(i - 1);
        }
    }

    // 3 Площади фигур
    public static class FigureArea {
        private static int counter = 0;
        public static void triangleG(int a, int b, int c){
            counter++;
            double p = (a + b + c) / 2.;
            double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.printf("\nПлощадь треугольника по формуле Герона (%d, %d, %d): %.1f", a, b, c, result);
        }

        public static void triangle(int a, int b){
            counter++;
            System.out.printf("\nПлощадь треугольника через основание и высоту (%d, %d): %.1f", a, b, (a * b) /2.);
        }

        public static void box(int a){
            counter++;
            System.out.printf("\nПлощадь квадрата (%d) : %d", a, a * a);
        }

        public static void rectangle(int a, int b){
            counter++;
            System.out.printf("\nПлощадь прямоугольника (%d, %d) : %d", a, b,  a * b);
        }

        public static void getCounter(){
            System.out.println("\nКоличество подсчетов: " + counter);
        }
    }
}
