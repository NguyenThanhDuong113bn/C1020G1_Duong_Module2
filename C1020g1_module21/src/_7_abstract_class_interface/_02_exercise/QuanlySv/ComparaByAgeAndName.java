package _7_abstract_class_interface._02_exercise.QuanlySv;

import java.util.Comparator;

public class ComparaByAgeAndName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getAge() - o2.getAge() != 0){
            return o1.getAge() - o2.getAge();
        } else {
            return o1.getName().compareTo(o2.getName());
        }
    }
}
