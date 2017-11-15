package siit.gr8.narci.milestone;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestCustomerRequestForGreenBonus {
    // FEV5 - Customer requests Green Bonus for an ev from the dealership.

    @Test
    public void testCustomerRequestForGreenBonus ( ) {

        // given

        Customer customer = new Customer ( "Narcisa Lontis", 70000, 1, "Volkswagen", "e-UP",
                true, true, true );


        Dealership dealership = new Dealership ( "Dealer", 40000, true, true, 0 );
        GreenBonusProgram greenBonusProgram = new GreenBonusProgram ( 20000, 100 );
        ArrayList <Car> cars = new ArrayList <> ();

        dealership.cars.add ( new Car ( "Volkswagen", "e-Golf", true, 2017
                , 38000, 1, 70, 80, true ) );
        // when
        customer.customerRequestForGreenBonus ( cars, dealership );
        // then
        ArrayList <Car> expectedCar = new ArrayList <Car> ();
        expectedCar.add ( new Car ( "Volkswagen", "e-Golf", true, 2017
                , 38000, 1, 70, 80, true ) );
        assertEquals ( expectedCar.get ( 0 ), dealership.cars.get ( 0 ) );
        boolean expectedRequestResult = true;
        assertTrue ( expectedRequestResult = true );
        assertEquals ( expectedRequestResult, customer.getCustomerRequestForGreenBonus () );
    }
}


