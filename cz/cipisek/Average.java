package cz.cipisek;

import java.util.Scanner;

public class Average {

    public static double average(Scanner scanner) {
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the required size of the array :: ");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int cislicka[] = new int [size];
        int sum = 0;
        System.out.println("Enter the elements of the array one by one ");

        for(int i=0; i<size; i++){
            cislicka[i] = s.nextInt();
            sum = sum + cislicka[i];
        }

        int z = 0;
        for (int value : cislicka) {
            z += value;
        }
        System.out.println("Average of your numbers is: " + sum/size);
    }
}
