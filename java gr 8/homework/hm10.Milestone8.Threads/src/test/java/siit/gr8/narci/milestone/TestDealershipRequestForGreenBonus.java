package siit.gr8.narci.milestone;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestDealershipRequestForGreenBonus {

    @Test
    public void testDealerRequestForBonusFromGreenBonusProgram ( ) {

        // given

        Customer customer = new Customer ( "Narcisa Lontis", 70000, 1, "Volkswagen", "e-UP",
                true, true, true );


        Dealership dealership = new Dealership ( "Dealer", 40000, true, true, 0 );
        GreenBonusProgram greenBonusProgram = new GreenBonusProgram ( 20000, 100 );
        ArrayList <Car> cars = new ArrayList <> ();


        dealership.cars.add ( new Car ( "Volkswagen", "e-UP", true, 2000, 25000,
                1, 60, 90, true ) );

        // when

        dealership.dealershipRequestGreenBonus ( customer, greenBonusProgram );

        // then

        boolean expectedDealerRequestValue = false;
        assertEquals ( expectedDealerRequestValue, dealership.getDealershipGreenBonusOffer () );

    }
}


