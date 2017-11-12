package siit.gr8.narci.milestone;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestCarsFilteredByStock {


    // FEV2 - Customer can filter the list based on the following information: has fast-charging, is in stock.

    @Test
    public void testCarsFilteredByStock ( ) {

        // given

        Customer customer = new Customer ( "Narcisa Lontis", 70000, 1, "Volkswagen", "e-UP",
                true, true, true );

        Dealership dealership = new Dealership ( "Dealer", 40000, true, false, 0 );

        List <String> listStock = new ArrayList <> ();


        dealership.cars.add ( new Car ( "Volkswagen", "e-UP", false, 2000, 25000,
                2, 60, 90, true ) );
        dealership.cars.add ( new Car ( "Volkswagen", "e-Golf", true, 2017
                , 38000, 1, 70, 80, true ) );
        dealership.cars.add ( new Car ( "Renault", "Zoe", true, 2017
                , 33000, 3, 65, 80, true ) );
        dealership.cars.add ( new Car ( "BMW", "i3", true, 2017
                , 40000, 2, 80, 90, true ) );

        dealership.cars.add ( new Car ( "Smart", "FourFour", true, 2017
                , 27000, 1, 57, 65, false ) );
        dealership.cars.add ( new Car ( "Smart", "FourTwo Cabrio", false, 2016
                , 23000, 5, 58, 65, false ) );
        dealership.cars.add ( new Car ( "KIA", "Soul", true, 2017
                , 34000, 3, 70, 75, false ) );
        dealership.cars.add ( new Car ( "Hyundai", "Ioniq", false, 2014
                , 23900, 3, 70, 75, false ) );
        // when

        dealership.getCarsFilteredByStock ( dealership );

        // then


        List <Car> expected = new ArrayList <> ();

        expected.add ( new Car ( "Volkswagen", "e-UP", false, 2000, 25000,
                2, 60, 90, true ) );
        expected.add ( new Car ( "Volkswagen", "e-Golf", true, 2017
                , 38000, 1, 70, 80, true ) );
        expected.add ( new Car ( "Renault", "Zoe", true, 2017
                , 33000, 3, 65, 80, true ) );
        expected.add ( new Car ( "BMW", "i3", true, 2017
                , 40000, 2, 80, 90, true ) );

        expected.add ( new Car ( "Smart", "FourFour", true, 2017
                , 27000, 1, 57, 65, false ) );
        expected.add ( new Car ( "Smart", "FourTwo Cabrio", false, 2016
                , 23000, 5, 58, 65, false ) );
        expected.add ( new Car ( "KIA", "Soul", true, 2017
                , 34000, 3, 70, 75, false ) );
        expected.add ( new Car ( "Hyundai", "Ioniq", false, 2014
                , 23900, 3, 70, 75, false ) );


        assertEquals ( expected, dealership.cars );

    }
}