package Assignment.LeapYear;

public class Year {
    public static boolean LeapYear(int Year, boolean leap)
    {
        if(Year%4==0)
        {
            if(Year%100==0)
            {
                if(Year%400==0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;
    return leap;
    
     
    }
    
}
