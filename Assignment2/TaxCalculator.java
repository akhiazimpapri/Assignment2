package Assignment.TAX;

public class TaxCalculator {
    public static double calculator(int c, int Salary){
        double tax;
    if(c==1)
    {
       if(Salary>=0 && Salary<=8000) 
             tax = Salary*0.10;
       else if(Salary>8000 && Salary<=32000)
            tax = 800 + (Salary-8000)*0.15;
        else 
             tax = 4400 + (Salary-16000)*0.25;
    }
    else
    {
       if(Salary>=0 && Salary<=16000) 
             tax = Salary*0.10;
       else if(Salary>16000 && Salary<=64000)
            tax = 1600 + (Salary-16000)*0.15;
        else 
             tax = 8800 + (Salary-64000)*0.25;
    }
    return tax;

}
}
