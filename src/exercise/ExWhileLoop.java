package exercise;

import java.util.Scanner;

public class ExWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        while(sum<=100){
            System.out.print("Enter a number : ");
            sum+=input.nextInt();
        }
        System.out.println("Done : "+sum);
    }
}
