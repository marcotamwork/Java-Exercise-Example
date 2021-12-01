package practice09;


public class Student extends Person {
    private final Klass klass;

    public Student(int ID, String name, int age, Klass klass) {
        super(ID, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {return this.klass;}


    public String introduce() {
        if (this.klass.getLeader() == null ){
            return String.format("My name is %s. I am %d years old. I am a Student. I am at Class %d." , super.getName(),super.getAge(),this.klass.getNumber());
        }
        else if (this.klass.getLeader().getID() == super.getID()){
            return String.format("My name is %s. I am %d years old. I am a Student. I am Leader of Class %d." , super.getName(),super.getAge(),this.klass.getNumber());
        } else{
            return String.format("My name is %s. I am %d years old. I am a Student. I am at Class %d." , super.getName(),super.getAge(),this.klass.getNumber());
        }
    }
}
