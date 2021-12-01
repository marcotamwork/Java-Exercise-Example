package practice07;


public class Klass {
    private int klass;
    private Student leader;

    public Klass(int klass) {
        this.klass = klass;
    }

    public int getNumber() {return klass;}
    public String getDisplayName() {return String.format("Class "+klass);}
    public int getKlass() {return klass;}

    public Student assignLeader(Student student) {return this.leader = leader;}
    public Student getLeader() {return leader;}
//    public String introduce() {
//        return String.format("My name is %s. I am %d years old." , this.name,this.age);
//    }
}