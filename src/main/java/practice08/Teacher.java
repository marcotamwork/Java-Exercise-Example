package practice08;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(int ID, String name, int age, Object... klass) {
        super(ID, name, age);
        if (klass.length == 1){
            this.klass = (Klass)klass[0];
        }
    }

    public Klass getKlass() {return klass;}


    public String introduce() {
        if (this.klass == null ){
            return String.format("My name is %s. I am %d years old. I am a Teacher. I teach No Class." , super.getName(),super.getAge());
        }
        else{
            return String.format("My name is %s. I am %d years old. I am a Teacher. I teach Class %d." , super.getName(),super.getAge(),this.klass.getNumber());
        }
    }
    public String introduceWith(Student Student) {
        if (Student.getKlass().getNumber() == this.klass.getNumber() ){
            return String.format("My name is %s. I am %d years old. I am a Teacher. I teach %s." , super.getName(),super.getAge(), Student.getName());
        }
        else{
            return String.format("My name is %s. I am %d years old. I am a Teacher. I don't teach %s." , super.getName(),super.getAge(),Student.getName());
        }

    }
}