package Assignment.TAX;

import java.util.Scanner;

public class Tax {
    public static void main(String[] args){
        System.out.println("If you are single enter '1' or enter '2':");
        
        int Salary;
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        System.out.println("Enter the salary in dolar:");
        Salary = sc.nextInt();
        sc.close();
        TaxCalculator tx = new TaxCalculator();
        double Tax = tx.calculator(c,Salary);
        System.out.println("Total tax : " + Tax);


    }
}
