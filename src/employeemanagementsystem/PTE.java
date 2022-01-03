package employeemanagementsystem;

import java.io.*;


   // PART TIME EMPLOYEE

public class PTE extends EmployeeInfo implements Serializable{
    
    
    public double hourlyWage;
    public double hoursPerWeek;
    public double weeksPerYear;
    
    
    public PTE(int eN, String fN, String lN, String g, String wL, double dR, double hW, double hPW, double wPY) {
        super(eN, fN, lN, g, wL, dR);
        hourlyWage = hW;
        hoursPerWeek = hPW;
        weeksPerYear = wPY;
        
    }
    
    
    
}