import java.util.Scanner;

public class ForLoop6 {
    //fibonacci series
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter length of the fibonacci series : ");
        int len = input.nextInt();

        int num1 = 1;
        int num2 = 1;
        int numAtLen=0;

        for (int i=1;i<=len-2;i++) {
            numAtLen = num1 + num2;
            num1 =num2;
            num2 = numAtLen;
        }
        System.out.println("Number at " + len + (len==1?"st":(len==2?"nd":"th")) + " position : " + (numAtLen==0 ? 1 : numAtLen));
    }
}
