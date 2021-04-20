package cz.cipisek;

import java.util.Scanner;

public class PrintedSquare {
    public static String printSquare(int side) {

        int i, j;
        String star = "*";
        String space = " ";
        String newLine = "\n";
        StringBuilder result = new StringBuilder();
        for (i = 1; i <= side; i++)
        {
            for (j = 1; j <= side; j++)
            {
                if (i == 1 || i == side || j == 1 || j == side)
                    result.append(star);
                else
                    result.append(space);
            }
            result.append(newLine);
        }
        result.delete(result.length() - 1, result.length());
        return result.toString();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the square's side");
        String result = printSquare(sc.nextInt());
        System.out.println(result);

    }
}
