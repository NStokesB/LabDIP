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
    private static final double MIN_BILL = 0.00;
    private static final String BILL_ENTRY_ERR =
            "Error: bill must be greater than or equal to " + MIN_BILL;
    private static final double GOOD_RATE = 0.20;
    private static final double FAIR_RATE = 0.15;
    private static final double POOR_RATE = 0.10;

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
                tip = bill * GOOD_RATE;
                break;
            case FAIR:
                tip = bill * FAIR_RATE;
                break;
            case POOR:
                tip = bill * POOR_RATE;
                break;
        }

        return tip;
    }

    public final void setBill(double billAmt) {
        if(billAmt < MIN_BILL) {
            throw new IllegalArgumentException(BILL_ENTRY_ERR);
        }
        bill = billAmt;
    }


    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public static double getMIN_BILL() {
        return MIN_BILL;
    }

    public static String getBILL_ENTRY_ERR() {
        return BILL_ENTRY_ERR;
    }

    public static double getGOOD_RATE() {
        return GOOD_RATE;
    }

    public static double getFAIR_RATE() {
        return FAIR_RATE;
    }

    public static double getPOOR_RATE() {
        return POOR_RATE;
    }

    public double getBill() {
        return bill;
    }
    
    
}
