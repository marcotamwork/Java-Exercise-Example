package practice10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private LinkedList<Klass> klass;

    public Teacher(int ID, String name, int age, Object... klass) {
        super(ID, name, age);
        if (klass.length == 1){
            this.klass = (LinkedList<Klass>) klass[0];
        }
        List<Integer> classes = new ArrayList<>();
        for(Klass number : this.klass) {
            number.getTeacher(super.getName());
        }

    }

    public LinkedList<Klass> getKlass() {return klass;}

    public String introduce() {
        if (this.klass == null ){
            return String.format("My name is %s. I am %d years old. I am a Teacher. I teach No Class." , super.getName(),super.getAge());
        }
        else{
            List<Integer> classes = new ArrayList<>();
            for(Klass number : this.klass) {
                classes.add(number.getNumber());
            }
            return String.format("My name is %s. I am %d years old. I am a Teacher. I teach Class %s." , super.getName(),super.getAge(),classes.stream().map(String::valueOf)
                    .collect(Collectors.joining(", ")));
        }
    }
    public String introduceWith(Student student) {

        List<Integer> classes = new ArrayList<>();
        for(Klass number : this.klass) {classes.add(number.getNumber());}

        if(classes.contains(student.getKlass().getNumber())){
            return String.format("My name is %s. I am %d years old. I am a Teacher. I teach %s." , super.getName(),super.getAge(), student.getName());
        }
        return String.format("My name is %s. I am %d years old. I am a Teacher. I don't teach %s." , super.getName(),super.getAge(),student.getName());
    }

    public LinkedList<Klass> getClasses() {
        return this.klass;
    }


    public boolean isTeaching(Student student){
        List<Integer> classes = new ArrayList<>();
        for(Klass number : this.klass) {
            classes.add(number.getNumber());
        }
        if(classes.contains(student.getKlass().getNumber())){
            return true;
        }
        return false;
    }

}