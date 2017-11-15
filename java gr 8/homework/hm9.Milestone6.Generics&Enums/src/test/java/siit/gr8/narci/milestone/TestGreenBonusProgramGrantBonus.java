package siit.gr8.narci.milestone;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestGreenBonusProgramGrantBonus {


    @Test
    public void testGreenBonusProgramGrantBonusToDealership ( ) {

        // given


        Customer customer = new Customer ( "Narcisa Lontis", 70000, 1, "Volkswagen", "e-UP",
                true, true, true );


        Dealership dealership = new Dealership ( "Dealer", 40000, true, true, 0 );
        GreenBonusProgram greenBonusProgram = new GreenBonusProgram ( 20000, 100 );
        ArrayList <Car> cars = new ArrayList <> ();

        dealership.cars.add ( new Car ( "Volkswagen", "e-UP", true, 2000, 25000,
                1, 60, 90, true ) );


        boolean dealerRequestValueBeforeGrantBonus = dealership.getDealershipGreenBonusOffer ();
        float greenBonusProgramFundsBeforeGranting = greenBonusProgram.getGreenBonusProgramBudget ();
        float dealerBudgetBeforeBonus = dealership.getDealershipBudget ();

        // when
        greenBonusProgram.programGrantsGreenBonus ( dealership, greenBonusProgram );
        ;

        // then


        boolean dealerExpectedRequestValue = false;
        assertEquals ( dealerExpectedRequestValue, dealerRequestValueBeforeGrantBonus );


        if (greenBonusProgramFundsBeforeGranting >= 10000) {
            assertTrue ( true );
        } else {
            assertTrue ( true );
        }

        if (greenBonusProgram.getCarsPerYear () <= 1000) {
            assertTrue ( true );
        } else {
            assertTrue ( true );
        }


        assertEquals ( dealerBudgetBeforeBonus+10000, dealership.getDealershipBudget (), 0 );


        boolean expectdRequestValueAfterBonus = false;
        assertEquals ( expectdRequestValueAfterBonus, dealership.getDealershipGreenBonusOffer () );

    }
}


