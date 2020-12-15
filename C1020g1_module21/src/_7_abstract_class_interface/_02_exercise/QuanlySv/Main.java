package _7_abstract_class_interface._02_exercise.QuanlySv;



public class Main {
    public static void main(String[] args) {
        Student student = new Student("hung", 18);


        Student student1 = new Student("nam",20);


        Student student2 = new Student("hoa", 22);


        Student[] students = new Student[ 3];
        students[0] = student;
        students[1]= student1;
        students[2]= student2;

        for(int i=0 ; i< students.length; i++){
            System.out.println(students[i].getName());
        }
    }
}

