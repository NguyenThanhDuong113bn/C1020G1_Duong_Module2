package _3_array_method.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class timMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of matrix, sequentially rows and cols : ");
        int rows = scanner.nextInt();
        int cols= scanner.nextInt();

        int[][]number= new int[rows][cols];
        int max = Integer.MIN_VALUE;
        int maxRow=0;
        int maxCol=0;
        for (int i =0 ; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.print("numbers["+ i +"] + ["+ j +"] :");
                number[i][j] = scanner.nextInt();

                if(max < number[i][j]){
                    max = number[i][j];
                    maxRow = i;
                    maxCol= j ;


                }
            }
        }

        for (int i = 0 ; i < rows; i++){
            System.out.println(Arrays.toString(number[i]));
        }
        System.out.println(" Max value is " + max +" at position (" + maxRow +" ; "+ maxCol +")");
    }
}

