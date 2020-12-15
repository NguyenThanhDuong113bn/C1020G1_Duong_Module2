package _7_abstract_class_interface.thuchanh.lop_animal_interface_edible.Fruit;

import _7_abstract_class_interface.thuchanh.lop_animal_interface_edible.edible.Edible;

public class Fruit implements Edible {
    @Override
    public String howToEat() {
        return "fruit an";
    }
}
