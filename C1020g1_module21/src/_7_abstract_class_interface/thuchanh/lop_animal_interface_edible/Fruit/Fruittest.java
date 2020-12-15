package _7_abstract_class_interface.thuchanh.lop_animal_interface_edible.Fruit;


import _7_abstract_class_interface.thuchanh.lop_animal_interface_edible.Orange;

public class Fruittest {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[2];

        fruits[0] = new Fruit();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }


    }
}