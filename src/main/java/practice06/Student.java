package practice06;

public class Student extends Person {
    private int klass;
    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass.getNumber();
    }

    public int getKlass() {return klass;}


    public String introduce() {
        return String.format("My name is %s. I am %d years old. I am a Student. I am at Class %d." , super.getName(),super.getAge(),getKlass());
    }
}