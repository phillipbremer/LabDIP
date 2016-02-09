package dip.lab1.student.solution1;


/*
 * @author Phillip
 */

public class SalariedEmployee implements Employee {

    /** default constructor. Is this the best way to go? */
    private double annualSalary;
    private double annualBonus;

    
    
    public SalariedEmployee(double annualSalary, double annualBonus) {
        setAnnualSalary(annualSalary);
        setAnnualBonus(annualBonus);
    }

    public double getAnnualWages() {
        return annualSalary + annualBonus;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getAnnualBonus() {
        return annualBonus;
    }

    public void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }

    
}
