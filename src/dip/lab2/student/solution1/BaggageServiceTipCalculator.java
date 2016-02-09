package dip.lab2.student.solution1;

/**
 * An example low-level class. Does this class definition follow the DIP?
 * If not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author your name goes here
 */
public class BaggageServiceTipCalculator implements TipCalculator{
    private double MIN_BILL = 0.00;
    private double MAX_BILL = 100.00;
    private String BILL_ENTRY_ERR =
            "Error: bill must be between " + MIN_BILL + " and "
            + MAX_BILL;
    private double GOOD_RATE = 0.20;
    private double FAIR_RATE = 0.15;
    private double POOR_RATE = 0.10;

    private double baseTipPerBag;
    private int bagCount;
    
    private ServiceQuality serviceQuality;

    public BaggageServiceTipCalculator(ServiceQuality q, int bags) {
        if (bags < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        } else {

            this.setServiceRating(q); // its an enum I thought we didn't need to validate this.
            this.setBagCount(bags);

            baseTipPerBag = 1.00; // set default value
        }
    }
    
    @Override
    public final double getTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = baseTipPerBag * bagCount * (1 + GOOD_RATE);
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (1 + FAIR_RATE);
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * (1 + POOR_RATE);
                break;
        }

        return tip;
    }
    
    @Override
    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }
    
    
    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        if(bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }

    public double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public void setBaseTipPerBag(double baseTipPerBag) {
        if(baseTipPerBag < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }

    public double getMIN_BILL() {
        return MIN_BILL;
    }

    public double getMAX_BILL() {
        return MAX_BILL;
    }

    public String getBILL_ENTRY_ERR() {
        return BILL_ENTRY_ERR;
    }

    public double getGOOD_RATE() {
        return GOOD_RATE;
    }

    public double getFAIR_RATE() {
        return FAIR_RATE;
    }

    public double getPOOR_RATE() {
        return POOR_RATE;
    }
    
}