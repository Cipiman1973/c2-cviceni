package cz.cipisek;

import java.util.Arrays;
import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] cinema = {  {0, 0, 0, 0},
                            {1, 1, 0, 0} ,
                            {0, 0, 1, 0} ,
                            {0, 0, 0, 0} };

        System.out.println("0 = a free seat" + "1 = occupied seat");
        System.out.println(Arrays.deepToString(cinema));


        System.out.println("Enter rows number");
        int rows = sc.nextInt();

        System.out.println("Enter columns number");
        int column = sc.nextInt();


        if (rows < 5 && column < 5){
            if (rows >= 0 && column >= 0){

                if (cinema[rows][column] == Integer.parseInt("1")){
                    System.out.println("This seat is taken");
                }else {
                    cinema[rows][column]= Integer.parseInt("1");
                    System.out.println("You just reserved a place at position " + rows + " " + column);
                    System.out.println(Arrays.deepToString(cinema));
                }

            }else {
                System.out.println("Wrong row or column");
            }

        } else {
            System.out.println("Wrong row or column");
        }

    }
}
