package Assignment.LeapYear;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        int Year;
        boolean leap=false;
        Scanner sc = new Scanner(System.in);
        Year = sc.nextInt();   
        sc.close();
        Year ye = new Year();
        boolean Leap = ye.LeapYear(Year,leap);
        if(Leap==true)
            System.out.println(Year + " is leap year.");
        else
            System.out.println(Year + " is not leap year.");
    }
}
