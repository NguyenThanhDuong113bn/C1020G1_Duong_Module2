package _02_loop.baitap.thuchanh;

import java.util.Scanner;

public class Tim_uoc_so_chung_lon_nhat {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = input.nextInt();
        System.out.println("Enter b: ");
        b = input.nextInt();
        a = Math.abs(a); // abs tra ve gia tri tuyet doi(phan duong)
        b = Math.abs(b);
        if (a == 0 || b == 0)
            System.out.println("No greatest common factor");
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;

        }
        System.out.println("Greatest common factor: " + a);
    }
}
