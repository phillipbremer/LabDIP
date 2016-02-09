package dip.lab2.student.solution1;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author Phillip
 */
public class FoodServiceTipCalculator implements TipCalculator {
    private double minBill = 0.00;
    private double maxBill = 100.00;
    private double goodRate = 0.20;
    private double fairRate = 0.15;
    private double poorRate = 0.10;
    
    /*private static final double MIN_BILL = 0.00;
    private static final String BILL_ENTRY_ERR =
            "Error: bill must be greater than or equal to " + MIN_BILL;
    private static final double GOOD_RATE = 0.20;
    private static final double FAIR_RATE = 0.15;
    private static final double POOR_RATE = 0.10;*/

    private double bill;
    /*public enum ServiceQuality {
        GOOD, FAIR, POOR
    }*/
    private ServiceQuality serviceQuality;

    FoodServiceTipCalculator(ServiceQuality q, double billAmt) {
        this.setServiceRating(q);
        this.setBill(billAmt);
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
      
    /*public FoodServiceTipCalculator(ServiceQuality q, double billAmt) {
        this.setServiceRating(q);
        this.setBill(billAmt);
    }*/

    @Override
    public double getCalculatedTip() {
        double tip = 0.00; // always initialize local variables

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
            System.out.println("Something");
        }
        bill = billAmt;
    }

    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

}
