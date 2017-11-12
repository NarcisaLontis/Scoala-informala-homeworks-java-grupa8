package siit.gr8.narci.milestone;

import java.util.ArrayList;


public class Customer {


    private String name;
    private float customerBudget;
    private int customerCarStock;
    private String carManufacturer;
    private String carModel;
    private Object dealerCarStock;

    public boolean isCarIsItNew ( ) {
        return carIsItNew;
    }

    public void setCarIsItNew ( boolean carIsItNew ) {
        this.carIsItNew = carIsItNew;
    }

    private boolean carIsItNew;
    private boolean customerRequestForGreenBonus;
    private boolean customerNotificationForGreenBonus;

    private ArrayList cars = new ArrayList <> ();

    public String getName ( ) {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public float getCustomerBudget ( ) {
        return customerBudget;
    }

    public void setCustomerBudget ( float customerBudget ) {
        this.customerBudget = customerBudget;
    }

    public int getCustomerCarStock ( ) {
        return customerCarStock;
    }

    public void setCustomerCarStock ( int customerCarStock ) {
        this.customerCarStock = customerCarStock;
    }

    public String getCarManufacturer ( ) {
        return carManufacturer;
    }

    public void setCarManufacturer ( String carManufacturer ) {
        this.carManufacturer = carManufacturer;
    }

    public String getCarModel ( ) {
        return carModel;
    }

    public void setCarModel ( String carModel ) {
        this.carModel = carModel;
    }


    public boolean getCustomerRequestForGreenBonus ( ) {
        return customerRequestForGreenBonus;
    }

    public void setCustomerRequestForGreenBonus ( boolean customerRequestForGreenBonus ) {
        this.customerRequestForGreenBonus = customerRequestForGreenBonus;
    }

    public boolean getCustomerNotificationForGreenBonus ( ) {
        return customerNotificationForGreenBonus;
    }

    public void setCustomerNotificationForGreenBonus ( boolean customerNotificationForGreenBonus ) {
        this.customerNotificationForGreenBonus = customerNotificationForGreenBonus;
    }

    public ArrayList <Car> getCars ( ) {
        return cars;
    }

    public void setCars ( ArrayList <Car> cars ) {
        this.cars = cars;
    }

    public Customer ( String name, float customerBudget, int customerCarStock, String carManufacturer, String carModel, boolean carIsItNew,
                      boolean customerRequestForGreenBonus, boolean customerNotificationForGreenBonus ) {
        this.name = name;
        this.customerBudget = customerBudget;
        this.customerCarStock = customerCarStock;
        this.carManufacturer = carManufacturer;
        this.carModel = carModel;
        this.carIsItNew = carIsItNew;
        this.customerRequestForGreenBonus = customerRequestForGreenBonus;
        this.customerNotificationForGreenBonus = customerNotificationForGreenBonus;
    }
//FEV4 - Customer purchases car at the full price

    public void buyCarAtFullPrice ( ArrayList <Car> cars, Dealership dealership ) throws IllegalArgumentException {

        if (getCustomerBudget () > dealership.cars.get ( 0 ).getPrice ()) {
            if (dealership.cars.get ( 0 ).getDealerCarStock () > 0) {
                System.out.println ( "Your current account: "+getCustomerBudget () );
                setCustomerBudget ( getCustomerBudget ()-dealership.cars.get ( 0 ).getPrice () );
                System.out.println ( "Payment successful. Your bank account is: "+getCustomerBudget () );
                System.out.println ( "Dealer budget before selling the car to the customer: "+dealership.getDealershipBudget () );
                dealership.setDealershipBudget ( dealership.getDealershipBudget ()+dealership.cars.get ( 0 ).getPrice () );
                System.out.println ( "Dealer budget after selling the car to the customer: "+dealership.getDealershipBudget () );
                dealership.cars.get ( 0 ).setDealerCarStock ( dealership.cars.get ( 0 ).getDealerCarStock ()-1 );
                setCustomerCarStock ( getCustomerCarStock ()+1 );
                System.out.println ( "Your current stock of car is: "+getCustomerCarStock () );
            }
// FEV10 - Customer is not allowed to purchase a car which is out of stock
        } else if (dealership.cars.get ( 0 ).getDealerCarStock () < 1) {
            throw new IllegalArgumentException ( "This car it out of stock" );
            // FEV11 - Customer is not allowed to purchase a car when does not have enough funds
        } else if ((getCustomerBudget () < dealership.cars.get ( 0 ).getPrice ())) {
            throw new IllegalArgumentException ( "Insufficient funds!" );
        }
    }

//   FEV5 - Customer requests Green Bonus for an ev from the dealership
    public void customerRequestForGreenBonus ( ArrayList <Car> cars, Dealership dealership ) {
        System.out.println ( "I'm the customer: Narcisa Lontis and I request Green Bonus  for: " );
        System.out.println ( dealership.cars.get ( 0 ).getManufacturer ()+" "+dealership.cars.get ( 0 ).getModel () );
        setCustomerRequestForGreenBonus ( true );
        System.out.println ( "Customer request: "+getCustomerNotificationForGreenBonus () );
    }

//FEV9 - Customer uses the Green Bonus Offer to purchase the ev
    public void buyWithGreenBonus ( ArrayList <Car> cars, Dealership dealership ) throws IllegalArgumentException {

        if (getCustomerNotificationForGreenBonus ()) {

            System.out.println ( "Selected car: "+dealership.cars.get ( 0 ).getManufacturer ()+" Model: "+
                    dealership.cars.get ( 0 ).getModel ()+" New Car: "+dealership.cars.get ( 0 ).isItNew ( false )+" Production year: "
                    +dealership.cars.get ( 0 ).getProductionYear ()+" Price: "+dealership.cars.get ( 0 ).getPrice ()
                    +" Stock: "+getCustomerCarStock ()+" Horse Power: "+dealership.cars.get ( 0 ).getHorsePower ()
                    +" Fast Charging: "+dealership.cars.get ( 0 ).isFastCharging () );

            dealership.setDealershipBudget ( dealership.getDealershipBudget ()-10000 );
            dealership.cars.get ( 0 ).setPrice ( dealership.cars.get ( 0 ).getPrice ()-10000 );
            System.out.println ( "The reduced price with Green Bonus: "+dealership.cars.get ( 0 ).getPrice () );


            System.out.println ( "Your current balance account is: "+getCustomerBudget () );
            setCustomerBudget ( getCustomerBudget ()-dealership.cars.get ( 0 ).getPrice () );
            System.out.println ( "Your account after buy is: "+getCustomerBudget () );


            System.out.println ( "Dealer budget before selling the car to the customer: "+dealership.getDealershipBudget () );
            dealership.setDealershipBudget ( dealership.getDealershipBudget ()+dealership.cars.get ( 0 ).getPrice () );
            System.out.println ( "Dealer budget after selling the car to the customer: "+dealership.getDealershipBudget () );
            dealership.cars.get ( 0 ).setDealerCarStock  ( dealership.cars.get ( 0 ).getDealerCarStock  ()-1 );




            System.out.println ( "This new car was delivered to you:"+dealership.cars.get ( 0 ).getManufacturer ()+" Model: "+
                    dealership.cars.get ( 0 ).getModel ()+" New Car: "+dealership.cars.get ( 0 ).isItNew ( false )+" Production year: "
                    +dealership.cars.get ( 0 ).getProductionYear ()+" Price: "+dealership.cars.get ( 0 ).getPrice ()
                    +" Stock: "+getCustomerCarStock ()+" Horse Power: "+dealership.cars.get ( 0 ).getHorsePower ()
                    +" Fast Charging: "+dealership.cars.get ( 0 ).isFastCharging () );


        }

// FEV10 - Customer is not allowed to purchase a car which is out of stock
        else if (dealership.cars.get ( 0 ).getDealerCarStock () < 1) {
            throw new IllegalArgumentException ( "This car it not in stock" );
            // FEV11 - Customer is not allowed to purchase a car when does not have enough funds
        } else if ((getCustomerBudget () < dealership.cars.get ( 0 ).getPrice ())) {
            throw new IllegalArgumentException ( "You don't have enough money for this car!" );

//FEV12 - Customer is not allowed to purchase a used ev with a green bonus
        } else if (!dealership.cars.get ( 0 ).isItNew ( false )) {
            throw new IllegalArgumentException ( "You cannot buy a used car with Green Bonus!" );
        }
    }

}





