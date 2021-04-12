package cz.cipisek;

import java.util.Scanner;

public class SumSumsOfEvenAndMultipleOfOdd {

    public static int sumSumsOfEvenAndMultipleOfOdd(Scanner scanner) {
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the required size of the array :: ");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int numbers[] = new int[size];
        int sum = 0;
        System.out.println("Enter the elements of the array one by one ");

        for (int i = 0; i < size; i++) {
            numbers[i] = s.nextInt();
            sum = sum + numbers[i];
        }

        int odd = 1;
        int even = 0;

        System.out.println("Odd Numbers:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {

                odd *= numbers[i];
                System.out.println(numbers[i]);
            }
        }
        System.out.println(" = " + odd);
        System.out.println("Even Numbers:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {

                even += numbers[i];
                System.out.println(numbers[i]);
            }
        }
        System.out.println(" = " + even);
    }
}