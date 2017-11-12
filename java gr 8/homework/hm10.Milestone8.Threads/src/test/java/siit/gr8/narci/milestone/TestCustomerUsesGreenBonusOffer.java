package siit.gr8.narci.milestone;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class TestCustomerUsesGreenBonusOffer {
// FEV9 - Customer uses the Green Bonus Offer to purchase the ev

    @Test
    public void testCustomerUsesGreenBonusToBuyElectricVehicle ( ) {

        // given

        Customer customer = new Customer ( "Narcisa Lontis", 70000, 1, "Volkswagen", "e-UP",
                true, true, true );
        Dealership dealership = new Dealership ( "Dealer", 40000, true, false, 0 );
        GreenBonusProgram greenBonusProgram = new GreenBonusProgram ( 20000, 100 );
        ArrayList <Car> cars = new ArrayList <> ();
        dealership.cars.add ( new Car ( "V"+
                "olkswagen", "e-UP", false, 2000, 25000,
                2, 60, 90, true ) );

        // when

        customer.customerRequestForGreenBonus ( cars, dealership );
        dealership.sendGreenBonusNotification ( customer, greenBonusProgram );
        customer.buyWithGreenBonus ( cars, dealership );
        float expectedPrice = dealership.cars.get ( 0 ).getPrice ()-10000;

        // then

        boolean offerValue = true;
        assertEquals ( offerValue, customer.getCustomerNotificationForGreenBonus () );

    }
}
