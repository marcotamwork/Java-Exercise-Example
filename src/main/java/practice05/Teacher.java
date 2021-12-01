package practice05;


public class Teacher extends Person {
    private int klass;
    public Teacher(String name, int age, int... klass) {
        super(name, age);
    }

    public int getKlass() {return klass;}


    public String introduce() {
        return String.format("My name is %s. I am %d years old. I am a Teacher. I teach No Class." , super.getName(),super.getAge());
    }
}