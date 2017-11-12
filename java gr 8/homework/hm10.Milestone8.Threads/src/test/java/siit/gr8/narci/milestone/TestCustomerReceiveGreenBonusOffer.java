package siit.gr8.narci.milestone;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class TestCustomerReceiveGreenBonusOffer {
    //    FEV8 - Customer receives Green Bonus offer from dealership or notification that there are no more bonuses
    @Test
    public void testCustomerReceiveBonusOrNotification ( ) {
        // given


        Customer customer = new Customer ( "Narcisa Lontis", 70000, 1, "Volkswagen", "e-UP",
                true, true, true );


        Dealership dealership = new Dealership ( "Dealer", 40000, true, false, 0 );
        GreenBonusProgram greenBonusProgram = new GreenBonusProgram ( 20000, 100 );
        ArrayList <Car> cars = new ArrayList <> ();
        // when

        dealership.sendGreenBonusNotification ( customer, greenBonusProgram );

        // then

        boolean expectedValue = false;
        assertEquals ( expectedValue, greenBonusProgram.isNoMoreBonuses () );


        boolean expectedOfferValue = true;
        assertEquals ( expectedOfferValue, customer.getCustomerNotificationForGreenBonus () );
        assertEquals ( false, expectedValue );
    }
}



