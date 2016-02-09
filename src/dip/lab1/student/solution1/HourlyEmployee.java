package dip.lab1.student.solution1;


/**
 * @author Phillip
 */

public class HourlyEmployee implements Employee {
       
    //public HourlyEmployee() {}
    
    public double hourlyRate;
    public double totalHrsForYear;
    
    public HourlyEmployee(double hourlyRate, double totalHrsForYear) {
        setHourlyRate(hourlyRate);
        setTotalHrsForYear(totalHrsForYear);
    }
    
    public final double getAnnualWages(){
        return hourlyRate * totalHrsForYear;
    }
    public final double getHourlyRate(){
        return hourlyRate;
    }
    public final void setHourlyRate(double hourlyRate){
        this.hourlyRate = hourlyRate;
    }
    public final void setTotalHrsForYear(double totalHrsForYear){
        this.totalHrsForYear = totalHrsForYear;
    }
}
