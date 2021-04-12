package cz.cipisek;

import java.util.Scanner;

public class SumFromZeroTill {
    public static int sumFromZeroTill(int max){
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int sum = 0;

        for(int i=0;i<num;i++)
        {
            System.out.println(i);
        }
        for(int i = 1; i <= num; ++i)
        {
            sum += i;
        }
        System.out.println(sum);
    }
}
