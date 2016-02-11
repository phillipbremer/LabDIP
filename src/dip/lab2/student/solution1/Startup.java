package dip.lab2.student.solution1;

import java.text.NumberFormat;
import javax.swing.JOptionPane;

/** 
 * @author Phillip
 */
public class Startup {
    /*public static enum ServiceQuality {
           GOOD, FAIR, POOR
    };*/
 
    public static void main(String[] args) {
        TipCalculator calc = new FoodServiceTipCalculator(ServiceQuality.GOOD, 
                100);
        TipService foodMgr = new TipService(calc);
        double amt = foodMgr.getTip();
        System.out.println(amt);
        
        BarServiceTipCalculator bars = new BarServiceTipCalculator(30,
            ServiceQuality.FAIR);
        TipService barMgr = new TipService(bars);
        double amt2 = barMgr.getTip();
        System.out.println(amt2);
        
        BarberServiceTipCalculator barb = new BarberServiceTipCalculator(15.50,
            ServiceQuality.GOOD);
        TipService barbMgr = new TipService(barb);
        double amt3 = barbMgr.getTip();
        System.out.println(amt3);
        
        
    }

}
