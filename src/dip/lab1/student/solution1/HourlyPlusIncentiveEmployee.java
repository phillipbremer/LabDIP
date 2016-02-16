/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab1.student.solution1;

/**
 *
 * @author Phillip
 */
public class HourlyPlusIncentiveEmployee implements Employee{
    private double hourlyRate;
    private double totalHrsForYear;

    public HourlyPlusIncentiveEmployee(double hourlyRate, double totalHrsForYear) {
        setHourlyRate(hourlyRate);
        setTotalHrsForYear(totalHrsForYear);
    }
    
    public final double getAnnualWages(){
        return hourlyRate * totalHrsForYear + 50;
    }
    
    public final double getHourlyRate(){
        return hourlyRate;
    }
    
    public final double getTotalHrsForYear(){
        return totalHrsForYear;
    }

    public final void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public final void setTotalHrsForYear(double totalHrsForYear) {
        this.totalHrsForYear = totalHrsForYear;
    }
}
