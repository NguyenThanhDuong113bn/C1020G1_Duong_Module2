package _02_loop.baitap1;

import java.util.Scanner;

public class Hien_thi_cac_so_nguyen_to_nho_hon_100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int N = 2 ; N <= 100; N++){
            boolean check = false;
            for (int i = 2 ; i <= Math.sqrt(N); i++){
                check = false;
                if (N % i == 0){
                    check = true ;
                    break;
                }
            }
            if (!check){
                System.out.println( N + " is prime");
            }

        }
    }
}
