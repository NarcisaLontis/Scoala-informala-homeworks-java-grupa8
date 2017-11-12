package siit.gr8.narci.milestone;

import org.junit.Test;

import java.util.ArrayList;

public class TestPurchaseOutOfStockException {
    @Test
    public void testCustomerPurchaseException ( ) throws Exception {
    }

    {

        // given

        Customer customer = new Customer ( "Narcisa Lontis", 70000, 0, "Volkswagen", "e-UP",
                true, true, true );


        Dealership dealership = new Dealership ( "Dealer", 40000, false, false, 0 );

        ArrayList <Car> cars = new ArrayList <> ();

        dealership.cars.add ( new Car ( "Volkswagen", "e-UP", true, 2000, 25000,
                0, 60, 90, true ) );


        // then
        customer.buyCarAtFullPrice ( cars, dealership );
        dealership.cars.get ( 0 ).setDealerCarStock ( 0 );


    }
}