package practice06;


public class Teacher extends Person {
    private Klass klass;

    public Teacher(String name, int age, Object... klass) {
        super(name, age);
        if (klass.length == 1){
            this.klass = (Klass)klass[0];
        }
    }

    public Klass getKlass() {return klass;}


    public String introduce() {
        return String.format("My name is %s. I am %d years old. I am a Teacher. I teach No Class." , super.getName(),super.getAge());
    }
    public String introduceWith(Student Student) {
        return String.format("My name is %s. I am %d years old. I am a Teacher. I teach %s." , super.getName(),super.getAge(), Student.getName());
    }
}