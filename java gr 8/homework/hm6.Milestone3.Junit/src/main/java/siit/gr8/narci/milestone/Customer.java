package siit.gr8.narci.milestone;

import java.util.ArrayList;


public class Customer {

    private String name;
    private int budget;
    private Dealership[] dealerships;
    private int evCar;
    private String carModel;

    // electric car of the Customer,NFEV1: Store cars in arrays.
    private ArrayList <Car> cars = new ArrayList <Car> ();


    //FEV1 Customer retrieves list of ev cars, number of stock, and their prices from car dealerships.


    public Customer ( String name, int budget, Dealership[] dealerships, int stockOfEvCar ) {
        this.name = name;
        this.budget = budget;
        this.dealerships = dealerships;
        this.evCar = stockOfEvCar;

    }


    public void setName ( String name ) {
        this.name = name;
    }

    public int getBudget ( ) {
        return budget;
    }

    public void setBudget ( int budget ) {
        this.budget = budget;
    }

    public String getDealerships ( ) {
        return String.valueOf ( dealerships );
    }

    public void setDealerships ( Dealership[] dealerships ) {
        this.dealerships = dealerships;
    }

    public int getEvCar ( ) {
        return evCar;
    }

    public void setEvCar ( int evCar ) {
        this.evCar = evCar;
    }

    public String getEvCarModel ( ) {
        return carModel;
    }

    public void setEvCarModel ( String carModel ) {
        this.carModel = carModel;
    }

    public void purchaseEvCar ( Car car ) {

    }
}
