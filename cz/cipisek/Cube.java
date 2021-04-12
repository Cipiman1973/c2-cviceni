package cz.cipisek;

import java.util.Scanner;

public class Cube {
    public static int sumOfAreasAndVolumes(Scanner scanner) {
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the required size of the array :");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int numbers[] = new int[size];
        int sum = 0;
        System.out.println("Enter the elements of the array one by one in cm ");

        for (int i = 0; i < size; i++) {
            numbers[i] = s.nextInt();
            sum = sum + numbers[i];
        }

        int tres = 3;

        for(int i = 0; i < size; i++){
            tres *= numbers[i];
            System.out.println(numbers[i] + " * " + numbers[i] + " * " + numbers[i]);

        }
        System.out.println("Volume of all " + size + " cubes " + tres);
    }
}
