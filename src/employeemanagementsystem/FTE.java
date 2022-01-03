
package employeemanagementsystem;

import java.io.*;
// FULL TIME EMPLOYEE

public class FTE extends EmployeeInfo implements Serializable {
    
    /**
     *
     */
    private double yearlySalary;
    
    /**
     *
     * @param eN
     * @param fN
     * @param lN
     * @param s
     * @param wL
     * @param dR
     * @param yS
     */
    public FTE(int eN, String fN, String lN, String g, String wL, double dR, double yS) {
        super(eN, fN, lN, g, wL, dR);
        yearlySalary = yS;
        
    }
    
    
    
    public double getYearlySalary() {
        return yearlySalary;
    }
    
    
    public double calcAnnualNetIncome() {
        return (yearlySalary *(1.0 - deductRate));
    }
    
}