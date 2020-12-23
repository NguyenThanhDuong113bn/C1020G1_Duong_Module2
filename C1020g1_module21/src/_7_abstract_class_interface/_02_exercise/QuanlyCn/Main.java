package _7_abstract_class_interface._02_exercise.QuanlyCn;

import _7_abstract_class_interface._02_exercise.QuanlySv.ComparaByAgeAndName;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Worker worker = new Worker( " A", 18);
        Worker worker1 = new Worker( " B", 19);
        Worker worker2= new Worker( " D", 20);
        Worker worker3 = new Worker( " D", 18);
        Worker worker4 = new Worker( " E", 21);
        Worker worker5 = new Worker( " G", 23);

        ArrayList<Worker>workers = new ArrayList();
        workers.add(worker);
        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);
        workers.add(worker4);
        workers.add(worker5);

        Collections.sort(workers,new CompaByAgeAndName());
        for(int i=0 ; i< workers.size(); i++){
            System.out.println(workers.get(i).getAge());
            System.out.println(workers.get(i).getName());

        }
    }
}
