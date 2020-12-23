package _7_abstract_class_interface._02_exercise.QuanlyCn;

import java.util.Comparator;

public class CompaByAge implements Comparator<Worker> {
    @Override
    public int compare(Worker o1, Worker o2) {
        return o1.getAge()-o2.getAge();
    }
}
