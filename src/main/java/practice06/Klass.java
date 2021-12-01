package practice06;

public class Klass {
    private int klass;


    public Klass(int klass) {
        this.klass = klass;

    }

    public int getNumber() {return klass;}
    public String getDisplayName() {return String.format("Class "+klass);}
    public int getKlass() {return klass;}

//    public String introduce() {
//        return String.format("My name is %s. I am %d years old." , this.name,this.age);
//    }
}