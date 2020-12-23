package _7_abstract_class_interface._02_exercise.QuanlySv;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("hung3", 45);


        Student student1 = new Student("hung2",20);


        Student student2 = new Student("hai1", 20);

        Student student3 = new Student("Tuan", 30);


        Student student4 = new Student("Long", 10);


        Student student5 = new Student("hai2", 20);


        ArrayList<Student> students =new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student);
        students.add(student3);
        students.add(student4);
        students.add(student5);

//        System.out.println(" truoc");
//        for(int i=0 ; i< students.size(); i++){
//            System.out.println(students.get(i).getName());
//        }
//        Collections.sort(students);
//        System.out.println(" sau");
//        for(int i=0 ; i< students.size(); i++){
//            System.out.println(students.get(i).getName());
//        }
        Collections.sort(students,new ComparaByAgeAndName());
        for(int i=0 ; i< students.size(); i++){
            System.out.println(students.get(i).getName());
        }
    }
}

