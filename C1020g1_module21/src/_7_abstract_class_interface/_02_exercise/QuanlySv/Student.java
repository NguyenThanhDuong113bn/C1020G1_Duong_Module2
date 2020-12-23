package _7_abstract_class_interface._02_exercise.QuanlySv;

public class Student implements Comparable<Student >{
   private  String name ; // chi co the chinh sua trong class
    private int age;

    public Student (String name, int age) {    // contructor khoi tao doi tuong
        this.name = name;
        this.age = age;
    }

    public String getName() {
    return name;
}

    public void setName(String name) {
        this.name = name;
    } // get lay; set sua

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public int compareTo(Student student) {
       if (this.getAge()> student.getAge()){
           return 1;
       }else  if (this.getAge()<student.getAge()){
           return -1;
       }else {
           return this.getName().compareTo(student.getName());
       }

    }
}
