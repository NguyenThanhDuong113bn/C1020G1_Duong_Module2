package _7_abstract_class_interface._02_exercise.QuanlyCn;

public class Worker  {
    private String name;
    private int age;

    public Worker ( String name, int age){
         this.name = name;
         this.age = age;

    }

    public String getName(){
        return name;
    }
     public void setName(){
        this.name = name;
     }

     public int getAge() {
        return age;
     }
     public void setAge(){
        this.age= age;
     }
}
