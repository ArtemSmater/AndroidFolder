package oop;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Иванов","Илья",19);
        Student student1 = new Student("Петрова", "Надежда", 21,"Финансы", "AN_21",23,98);
        Student student2 = new Student("Магомедов", "Магомед", 22,"Спорт", "SG_32",9,87);
        Student student3 = new Student("Пирогова", "Евгения", 19,"Кулинария", "CF_18",3,100);

        Teacher teacher1 = new Teacher("Коршунова", "Лидия","Павловна", 47,"Информатика", 20, 3);
        Teacher teacher2 = new Teacher("Мешкова", "Ольга","Ивановна", 35,"Спорт", 10, 2);
        Teacher teacher3 = new Teacher("Лякина", "Татьяна","Евгеньевна", 52,"Физика", 27, 4);

        Leaver leaver1 = new Leaver("Борисов", "Петр", 23, "Красный","Сварщик", 2,2);
        Leaver leaver2 = new Leaver("Жиркова", "Светлана", 22, "Синий","Повар", 4,0);
        Leaver leaver3 = new Leaver("Стетхэм", "Джейсон", 24, "Красный","Водитель", 1,3);
        System.out.println(human);
        System.out.println("\nСтуденты: \n" + student1 + "\n" + student2 + "\n" + student3);
        System.out.println("\nПреподаватели: \n" + teacher1 + "\n" + teacher2 + "\n" + teacher3);
        System.out.println("\nВыпускники: \n" + leaver1 + "\n" + leaver2 + "\n" + leaver3);
    }
}
