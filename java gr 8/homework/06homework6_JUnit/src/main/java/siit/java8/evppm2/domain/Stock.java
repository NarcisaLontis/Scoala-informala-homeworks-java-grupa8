package siit.java8.evppm2.domain;

import java.nio.file.Path;
/**
 * Created by Narci on 10/09/2017
 */
public class Stock{
    private Dealership dealership;
    private EvCar evCarType;
    private int numberOfEvCars;
    private float price;

    public Stock ( ) {
        this.dealership = dealership;
        this.evCarType = evCarType;
        this.numberOfEvCars = numberOfEvCars;
        this.price = price;
    }

    public Stock ( EvCar evCar, int i, int i1 ) {
        this.evCarType = null;
        this.numberOfEvCars = 0;
        this.price = 0;
    }


    public void copy (Stock stock, Dealership dealership){
        this.evCarType = new EvCar ();
        this.evCarType.copy(stock.evCarType);
        this.numberOfEvCars = stock.numberOfEvCars;
        this.price = stock.price;
        this.dealership = dealership;
    }

    public EvCar getEvCarType ( ) {
        return evCarType;
    }

    public int getNumberOfEvCars ( ) {
        return numberOfEvCars;
    }
    public float getEvCarPrice (){return price;
    }
    public String getEvCarDealership () {return String.valueOf ( dealership );
    }
    public String getManufacturer() {
        return evCarType.getManufacturer();
    }
    public String getEvCarName() {
        return evCarType.getName();
    }
    public boolean getIsItNew() {
        return evCarType.getIsItNew();
    }
}








