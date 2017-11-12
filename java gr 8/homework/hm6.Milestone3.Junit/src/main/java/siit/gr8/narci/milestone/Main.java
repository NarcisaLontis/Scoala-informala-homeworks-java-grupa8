package siit.gr8.narci.milestone;

import static siit.gr8.narci.milestone.Dealership.*;

public class Main {

    public Main ( ) {

    }


    public static void main ( String[] args ) {

        System.out.println ( "FEV1 Customer retrieves list of ev cars, number of stock, and their prices from car dealerships" );
        Dealership.addCars ( 0, 25000, "Volkswagen", "e-UP", 2, false );
        Dealership.addCars ( 1, 38000, "Volkswagen", "e-Golf", 3, false );
        Dealership.addCars ( 2, 33000, "Renault", "Zoe", 2, true );
        Dealership.addCars ( 3, 40000, "BMW", "i3", 5, false );
        Dealership.addCars ( 4, 22000, "Smart", "FourTwo", 4, false );
        Dealership.addCars ( 5, 22700, "Smart", "FourFour", 2, false );
        Dealership.addCars ( 6, 23000, "Smart", "FourTwo Cabrio", 3, false );
        Dealership.addCars ( 7, 34000, "KIA", "Soul", 1, false );
        Dealership.addCars ( 8, 23900, "Hyundai", "Ioniq", 6, false );


        for (Car car : cars) {
            System.out.println ( car.getManufacturer ()+" the model  "+car.getModel ()+" has the price "+
                    car.getPrice ()+" and the number in the dealer's stock is "+car.getStock () );
        }
        GovernmentFinancedProgram budget = new GovernmentFinancedProgram ();
        System.out.println ( "Government Finaced Program has this fixed budget : "+budget.fixedBudget );
        System.out.println ( "Government Finaced Program has this green bonus : "+budget.getGreenBonus () );
        System.out.println ( "FEV 2- Customer can filter the list based on the following information:  has fast-charging, is in stock" );
        System.out.println ( "This cars have fast charging: "+filterByFastCharging () );
        System.out.println ( "This cars are available  in stock: "+filterByIsInStock () );

    }
}

