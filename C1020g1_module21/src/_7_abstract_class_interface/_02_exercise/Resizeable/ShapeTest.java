package _7_abstract_class_interface._02_exercise.Resizeable;



public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);

        Square square = new Square();
        square.resize(2.3);
    }
}
