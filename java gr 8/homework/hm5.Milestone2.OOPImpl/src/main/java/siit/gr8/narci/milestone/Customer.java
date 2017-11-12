package siit.gr8.narci.milestone;


public class Customer {

    private String name;
    private int budget;
    private Dealership[] dealerships;
    private int car;
    private String carModel;

    //FEV1 Customer retrieves list of ev cars, number of stock, and their prices from car dealerships.


    public Customer ( String name, int budget, Dealership[] dealerships, int stockOfCar ) {
        this.name = name;
        this.budget = budget;
        this.dealerships = dealerships;
        this.car = stockOfCar;

    }

//create getter and setter

    public void setName ( String name ) {
        this.name = name;
    }

    public int getBudget ( ) {
        return budget;
    }

    public void setBudget ( int budget ) {
        this.budget = budget;
    }

    public Dealership[] getDealerships ( ) {
        return dealerships;
    }

    public void setDealerships ( Dealership[] dealerships ) {
        this.dealerships = dealerships;
    }

    public int getCar ( ) {
        return car;
    }

    public void setCar ( int car ) {
        this.car = car;
    }

    public String getCarModel ( ) {
        return carModel;
    }

    public void setCarModel ( String carModel ) {
        this.carModel = carModel;
    }

    public void OrderCar ( Car car ) {

    }
}
