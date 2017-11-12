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

        Customer customer = new Customer ( "Narcisa Lontis", 70000, 1, "Volkswagen", "e-UP",
                true, true, true );
        Dealership dealership = new Dealership ( "Dealer", 40000, true, true, 0 );

        ArrayList <Car> cars = new ArrayList <> ();

        dealership.cars.add ( new Car ( "Volkswagen", "e-UP", false, 2000, 25000,
                2, 60, 90, true ) );

        float customerBudgetBeforeBuy = customer.getCustomerBudget ();
        float priceOfCar = dealership.cars.get ( 0 ).getPrice ();
        float dealershipAccountBeforeBuy = dealership.getDealershipBudget ();
        int dealershipStockExpected = dealership.cars.get ( 0 ).getDealerCarStock ();
        int customerStockExpected = customer.getCustomerCarStock ();

        // when

        customer.buyCarAtFullPrice ( cars, dealership );

        // then

        //  Test if the budget of the customer is enought for buy a car, if pays the car, if the dealership get
        // the money and if the the customer's stock car  increases
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
        assertEquals ( dealershipStockExpected-1, dealership.cars.get ( 0 ).getDealerCarStock () );
        assertEquals ( customerStockExpected+1, customer.getCustomerCarStock () );

    }
}


