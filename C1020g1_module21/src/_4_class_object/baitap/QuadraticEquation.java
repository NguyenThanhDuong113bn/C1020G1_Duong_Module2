package _4_class_object.baitap;
import java.util.Scanner;
public class QuadraticEquation {
    private  double a;
    private double b;
    private double c;
    public  QuadraticEquation (double a, double b, double c){
        this.a = a ;
        this.b = b ;
        this.c = c ;
    }
    public double calculateDiscriminant (){
        return (b * b - 4 * a * c);
    }
    public static void main(String[] args) {

        Scanner Dialog = new Scanner(System.in);
        System.out.println(" Enter a :");
        double a = Dialog.nextDouble();
        System.out.println(" Enter b:");
        double b = Dialog.nextDouble();
        System.out.println("Enter c");
        double c = Dialog.nextDouble();


        QuadraticEquation eq = new QuadraticEquation(a, b, c);

        double disc = eq.calculateDiscriminant();
        if(disc < 0) {
            System.out.println("The equation has no roots");
        }else if(disc > 0) {
            double x1 = (-b - Math.sqrt(disc)) / 2 * a;
            double x2 = (-b + Math.sqrt(disc)) / 2 * a;
            System.out.println("The equation have two  roots " + x1 + " " + x2);
        }else {
            double x0 = -b / (2 * a);
            System.out.println("The equation one roots" + x0);
        }

    }

    }





