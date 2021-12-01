package practice10;

public class Person {
    private String name;
    private int age;
    private int ID;

    public Person(int ID, String name, int age) {
        this.ID = ID;
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public int getID() {
        return ID;
    }
    public String introduce() {
        return String.format("My name is %s. I am %d years old." , this.name,this.age);
    }
}