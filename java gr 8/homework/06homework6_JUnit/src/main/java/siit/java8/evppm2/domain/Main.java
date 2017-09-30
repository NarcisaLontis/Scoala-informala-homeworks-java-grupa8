package siit.java8.evppm2.domain;
/**
 * Created by Narci on 8/26/2017
 */

public class Main {
    public Main ( ) {
    }

    public static void main ( String[] args ) {

        System.out.println ( "Test" );
        Dealership.initEvCars ( 0, 25000, "Volkswagen", "e-UP" );
        Dealership.initEvCars ( 1, 38000, "Volkswagen", "Volkswagen" );
        Dealership.initEvCars ( 2, 33000, "Renault", "Zoe" );
        Dealership.initEvCars ( 3, 40000, "BMW", "i3" );
        Dealership.initEvCars ( 4, 22000, "Smart", "FourTwo" );
        Dealership.initEvCars ( 5, 22700, "Smart", "FourFour" );
        Dealership.initEvCars ( 6, 23000, "Smart", "FourTwo Cabrio" );
        Dealership.initEvCars ( 7, 34000, "KIA", "Soul" );
        Dealership.initEvCars ( 8, 23900, "Hyundai", "Ioniq" );

        for (int i = 0; i < 9; ++i) {
            System.out.println (Dealership.evCars[ i ].price + " "+ Dealership.evCars[ i ].manufacturer + " " + Dealership.evCars[ i ].model + " " );
        }

        GovernmentFinacedProgram budget = new GovernmentFinacedProgram ();
        System.out.println ( "Government Finaced Program has this fixed budget : " + budget.getFixedBudget () );
        System.out.println ( "Government Finaced Program has this green bonus : " + budget.getGreenBonus () );

    }

}


