package siit.gr8.narci.milestone;

import org.junit.Test;

import java.util.ArrayList;

public class TestUsedCarException {

    @Test(expected = IllegalArgumentException.class)
    public void testCustomerPurchaseUsedElectricCarWithGreenBonus ( ) throws IllegalArgumentException {
        // given

        Customer customer = new Customer ( "Narcisa Lontis", 70000, 1, "Volkswagen", "e-UP",
                false, false, false);


        Dealership dealership = new Dealership ( "Dealer", 40000, false, false, 0 );
        GreenBonusProgram greenBonusProgram = new GreenBonusProgram ( 20000, 100 );
        ArrayList <Car> cars = new ArrayList <> ();

        dealership.cars.add ( new Car ( "Volkswagen", "e-UP", false, 2000, 25000,
                1, 60, 90, true ) );


        customer.buyWithGreenBonus ( cars, dealership );
        dealership.cars.get ( 0 ).isItNew (false);
    }
}
