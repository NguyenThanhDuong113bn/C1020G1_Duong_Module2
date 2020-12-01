package _02_Loop.baitap.thuchanh;

import java.util.Scanner;

public class Kiem_tra_so_nguyen_to {
    public static void main(String[] args) {
        Scanner  scanner= new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = scanner. nextInt();
         if (number <2);
        System.out.println(number + " is not a prime");

                {
                    int i =2;
                    boolean check = true ;
                      while ( i <=  Math.sqrt(number)){
                          if (number % i == 0){
                              check = true;
                              break;
                          }
                          i++;
                      }
                        if( check)
                            System.out.println( number + " is  a prime");
                        else
                            System.out.println(number + " is not a prime");
        }

    }

}
