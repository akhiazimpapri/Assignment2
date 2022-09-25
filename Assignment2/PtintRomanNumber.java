package Assignment.RomanNumber;
import java.util.Scanner;

public class PtintRomanNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        RomanNumber Num = new RomanNumber();
        Num.Roman(num);


    }
}

