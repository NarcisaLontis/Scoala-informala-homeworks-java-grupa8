package ev.purchase.program.domain;

/**
 * Created by Narci on 9/24/2017
 */

public class GreenBonus {

    private String customerName;
    private String dealershipName;
    private String evCarManufacturer;
    private String evCarModel;


    public GreenBonus ( String customerName, String dealershipName, String evCarManufacturer, String evCarModel ) {
        this.customerName = customerName;
        this.dealershipName = dealershipName;
        this.evCarManufacturer = evCarManufacturer;
        this.evCarModel = evCarModel;
    }


    public void add ( GreenBonus bonus ) {
        this.customerName = bonus.customerName;
        this.dealershipName = bonus.dealershipName;
        this.evCarManufacturer = bonus.evCarManufacturer;
        this.evCarModel = bonus.evCarModel;
    }
}


