package siit.gr8.narci.milestone;


import static siit.gr8.narci.milestone.Dealership.cars;

/**
 * class Main
 *
 * @author Narcisa Lontis
 */


public class Main {


    public static void main ( String[] args ) {


        System.out.println ( "FEV1 Customer retrieves list of ev cars, number of stock, and their prices from car dealerships" );
        Dealership.addCars ( 0, 25000, "Volkswagen", "e-UP", 2 );
        Dealership.addCars ( 1, 38000, "Volkswagen", "Volkswagen", 3 );
        Dealership.addCars ( 2, 33000, "Renault", "Zoe", 2 );
        Dealership.addCars ( 3, 40000, "BMW", "i3", 5 );
        Dealership.addCars ( 4, 22000, "Smart", "FourTwo", 4 );
        Dealership.addCars ( 5, 22700, "Smart", "FourFour", 2 );
        Dealership.addCars ( 6, 23000, "Smart", "FourTwo Cabrio", 3 );
        Dealership.addCars ( 7, 34000, "KIA", "Soul", 1 );
        Dealership.addCars ( 8, 23900, "Hyundai", "Ioniq", 6 );
        for (int i = 0; i < 9; ++i) {
            System.out.println ( cars[ i ].getManufacturer ()+" the model  "+cars[ i ].getModel ()+" has the price "+
                    cars[ i ].getPrice ()+" and the number in the dealer's stock is "+cars[ i ].getStock () );
        }


        GovernmentFinancedProgram budget = new GovernmentFinancedProgram ();
        System.out.println ( "Government Finaced Program has this fixed budget : "+budget.fixedBudget );
        System.out.println ( "Government Finaced Program has this green bonus : "+budget.getGreenBonus () );
    }


}
