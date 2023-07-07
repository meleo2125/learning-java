import java.util.Scanner;

public class FormattedString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.next();
        int i1 = input.nextInt();
        String s2 = input.next();
        int i2 = input.nextInt();
        String s3 = input.next();
        int i3 = input.nextInt();

        System.out.println("================================");
        System.out.printf("%-14s %s%n",s1,String.format("%03d",i1) );
        System.out.printf("%-14s %s%n",s2,String.format("%03d",i2) );
        System.out.printf("%-14s %s%n",s3,String.format("%03d",i3) );
        System.out.println("================================");
    }
}