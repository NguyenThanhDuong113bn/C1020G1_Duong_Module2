package baitap;

import java.util.Scanner;

public class Chuyen_doi_tien_te {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int rate=23000;
        System.out.println(" Nhap dola chuyen sang VND :");
        double USD= scanner.nextDouble();
        System.out.println("VND:"+USD*rate);
    }
}
