package cz.cipisek;

import java.util.Scanner;

public class SumAllNumbers {

    public static int calculate(Scanner scanner) {
        int sum = 0;

        while(scanner.hasNext()){
            int n = scanner.nextInt();
            sum += n;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(calculate(new Scanner(System.in)));
    }
}



