package oop;

public class Human {

    private String lastName;
    private String firstName;
    private int age;

    public Human(String lastName, String firstName, int age) {
        setLastName(lastName);
        setFirstName(firstName);
        setAge(age);
    }

    public Human (Human human){
        this.lastName = human.lastName;
        this.firstName = human.firstName;
        this.age = human.age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%-10s%-10sВозраст: %d", lastName, firstName, age);
    }

    public String getLastName(){
        return lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public int getAge(){
        return age;
    }
}
