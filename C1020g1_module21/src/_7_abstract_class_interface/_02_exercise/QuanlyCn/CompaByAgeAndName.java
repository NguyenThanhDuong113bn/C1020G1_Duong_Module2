package _7_abstract_class_interface._02_exercise.QuanlyCn;

import java.util.Comparator;

public class CompaByAgeAndName implements Comparator<Worker> {
    @Override
    public int compare(Worker o1, Worker o2) {
        if(o1.getAge()-o2.getAge() !=0){
            return o1.getAge()-o2.getAge();
        } else {
            return o1.getName().compareTo(o2.getName());
        }
    }
}
