import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        //number pattern
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a integer : ");
        int n = input.nextInt();

        for (int i = 1;i <= n;i++){
            for (int j = 1;j <= i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
