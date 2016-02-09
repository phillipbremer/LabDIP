package dip.lab1.student.solution1;

import javax.swing.JOptionPane;

/**
 * A high-level class that delegates to employee objects to do the work. Does
 * this class design follow the DIP? If not, fix it.
 *
 * @author Phillip
 */
public class HRService {
    
    public double getAnnualCompensationForEmployee(Employee e){
        return e.getAnnualWages();
    }
    
    /*public static final String SALARIED_TYPE = "Salaried";
    public static final String HOURLY_TYPE = "Hourly";

    
    public enum WageType {
        SALARIED,
        HOURLY
    }

    private static final String ERROR_MSG =
            "Cannot get annual wages because no valid employee type provided";
    private static final String ERROR_TITLE = "Employee Type Unknown";

    
    public double getAnnualCompensationForEmployee(Employee e,
            String employeeType)
    {
        double annualCompensation = 0;

        
        if(employeeType.equals(HOURLY_TYPE)) {
            annualCompensation = e.getAnnualWages();

        } else if(employeeType.equals(SALARIED_TYPE)) {
            annualCompensation = e.getAnnualSalary();

        } else {
            JOptionPane.showMessageDialog(
                    null, ERROR_MSG, ERROR_TITLE, JOptionPane.ERROR_MESSAGE);
        }

        return annualCompensation;
    }


    
    public double getAnnualCompensationForEmployee(Employee e) {
        double annualCompensation = 0;

        
        if(e instanceof HourlyEmployee) {
            annualCompensation = e.getAnnualWages();

        } else if(e instanceof SalariedEmployee) {
            annualCompensation = e.getAnnualSalary();

        } else {
            JOptionPane.showMessageDialog(
                    null, ERROR_MSG, ERROR_TITLE, JOptionPane.ERROR_MESSAGE);
        }

        return annualCompensation;
    }*/
}
