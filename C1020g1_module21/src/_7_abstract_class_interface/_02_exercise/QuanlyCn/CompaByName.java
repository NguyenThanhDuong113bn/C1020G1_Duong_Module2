package _7_abstract_class_interface._02_exercise.QuanlyCn;

import java.util.Comparator;

public class CompaByName implements Comparator<Worker> {
    @Override
    public int compare(Worker o1, Worker o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
