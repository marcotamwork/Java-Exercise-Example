package practice10;

import java.util.ArrayList;
import java.util.List;


public class Klass {
    private int klass;
    private Student leader;
    private final List<Student> members = new ArrayList<>();
    private String teacher;
    public void getTeacher(String teacher){this.teacher = teacher;}

    public Klass(int klass) {
        this.klass = klass;
    }

    public int getNumber() {return klass;}
    public String getDisplayName() {return String.format("Class "+klass);}
    public void appendMember(Student student){
        members.add(student);
        System.out.printf("I am %s. I know %s has joined Class 2.\n", this.teacher,student.getName(),this.klass);
    }

    public void assignLeader(Student student) {
        if (members.contains(student)){
            this.leader = student;
            System.out.printf("I am %s. I know %s become Leader of Class %d.\n", this.teacher,student.getName(),this.klass);
        }
        else{
            System.out.printf("It is not one of us.\n");
        }

    }
    public Student getLeader() {return leader;}

//    public String introduce() {
//        return String.format("My name is %s. I am %d years old." , this.name,this.age);
//    }
}