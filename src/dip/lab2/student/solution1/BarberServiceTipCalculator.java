/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author Phillip
 */
public class BarberServiceTipCalculator implements TipCalculator{
    private double minBill = 0.00;
    private double maxBill = 50.00;
    private double goodRate = 0.20;
    private double fairRate = 0.15;
    private double poorRate = 0.10;
    private double bill;
    private ServiceQuality serviceQuality;

    public BarberServiceTipCalculator(double billAmt, ServiceQuality q) {
        this.setBill(billAmt);
        this.setServiceRating(q);
    }
    public double getMinBill(){
        return minBill;
    }
    
    public void setMinBill(double minBill){
        this.minBill = minBill;
    }
    
    public double getMaxBill(){
        return maxBill;
    }
    
    public void setMaxBill(double maxBill){
        this.maxBill = maxBill;
    }
    
    public double getGoodRate(){
        return goodRate;
    }
    
    public void setGoodRate(double goodRate){
        this.goodRate = goodRate;
    }

    public double getFairRate() {
        return fairRate;
    }

    public void setFairRate(double fairRate) {
        this.fairRate = fairRate;
    }

    public double getPoorRate() {
        return poorRate;
    }

    public void setPoorRate(double poorRate) {
        this.poorRate = poorRate;
    }
    
    @Override
    public double getCalculatedTip() {
        double tip = 0.00;

        switch(serviceQuality) {
            case GOOD:
                tip = bill * goodRate;
                break;
            case FAIR:
                tip = bill * fairRate;
                break;
            case POOR:
                tip = bill * poorRate;
                break;
        }

        return tip;
    }
    public final void setBill(double billAmt) {
        if(billAmt < minBill) {
            System.out.println("Error");
        }
        bill = billAmt;
    }

    public final void setServiceRating(ServiceQuality q) {
        serviceQuality = q;
    }

    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }
}
