package dip.lab2.student.solution1;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class FoodServiceTipCalculator implements TipCalculator{
    private double minBill = 0.00;
    private String billEntryErr =
            "Error: bill must be greater than or equal to " + minBill;
    private double goodRate = 0.20;
    private double fairRate = 0.15;
    private double poorRate = 0.10;

    private double bill; 
    
    private ServiceQuality serviceQuality; 
    
    @Override
    public final void setServiceRating(ServiceQuality q) {
        serviceQuality = q;
    }


    public FoodServiceTipCalculator(ServiceQuality q, double billAmt) {
        this.setServiceRating(q);
        this.setBill(billAmt);
    }

    @Override
    public double getTip() {
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
            throw new IllegalArgumentException(billEntryErr);
        }
        bill = billAmt;
    }


    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public double getMinBill() {
        return minBill;
    }

    public String getBillEntryErr() {
        return billEntryErr;
    }

    public double getGoodRate() {
        return goodRate;
    }

    public double getFairRate() {
        return fairRate;
    }

    public double getPoorRate() {
        return poorRate;
    }

    public double getBill() {
        return bill;
    }

   
   
    
}
