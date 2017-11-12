package siit.gr8.narci.milestone;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestBuyCarAtFullPrice {


    // FEV4 - Customer purchases car at the full price. Not an electric one i guess, since is not mentioned "ev", so i overloaded buy method from customer so he can buy gasolineCar and electricCar.

    @Test
    public void testBuyCarAtFullPrice ( ) {

        // given
        Customer customer = new Customer ( "Narcisa Lontis", 70000, 1, "Wolkswagen", "e-UP",
                true, true );

        Dealership dealership = new Dealership ( "Dealer", 40000, true, false, 0 );

        ArrayList <Car> cars = new ArrayList <> ();

        dealership.cars.add ( new Car ( "Wolkswagen", "e-UP", false, 2000, 25000,
                2, 60, 90, true ) );

        float customerBudgetBeforeBuy = customer.getCustomerBudget ();
        float priceOfCar = dealership.cars.get ( 0 ).getPrice ();
        float dealershipAccountBeforeBuy = dealership.getDealershipBudget ();
        int dealershipStockExpected = dealership.cars.get ( 0 ).getStock ();
        int customerStockExpected = customer.getCustomerCarStock ();

        // when

        customer.buyCarAtFullPrice ( cars, dealership );

        // then


        if (customerBudgetBeforeBuy >= priceOfCar) {
            assertTrue ( true );
        } else {
            assertTrue ( false );
        }

        if (customer.getCustomerBudget () == customerBudgetBeforeBuy-priceOfCar) {
            assertTrue ( true );
        } else {
            assertTrue ( false );
        }

        float dealershipBudgetAfterBuy = dealership.getDealershipBudget ();
        assertEquals ( dealershipBudgetAfterBuy, dealershipAccountBeforeBuy+priceOfCar, 0 );
        assertEquals ( dealershipStockExpected-1, dealership.cars.get ( 0 ).getStock () );
        assertEquals ( customerStockExpected+1, customer.getCustomerCarStock () );

    }
}


