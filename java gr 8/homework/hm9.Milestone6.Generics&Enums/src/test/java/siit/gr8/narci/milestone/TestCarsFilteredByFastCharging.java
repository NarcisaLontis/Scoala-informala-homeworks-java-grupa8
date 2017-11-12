package siit.gr8.narci.milestone;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestCarsFilteredByFastCharging {


    // FEV2

    @Test
    public void testCarsFilteredByFastCharging ( ) {

        // given

        Dealership dealership = new Dealership ( "Dealer", 40000, true, false, 0 );


        List <String> listIsFastCharging = new ArrayList <> ();
        dealership.cars.add ( new Car ( "Volkswagen", "e-UP", false, 2000, 25000,
                2, 60, 90, true ) );
        dealership.cars.add ( new Car ( "Volkswagen", "e-Golf", true, 2017
                , 38000, 1, 70, 80, true ) );
        dealership.cars.add ( new Car ( "Renault", "Zoe", true, 2017
                , 33000, 3, 65, 80, true ) );
        dealership.cars.add ( new Car ( "BMW", "i3", true, 2017
                , 40000, 2, 80, 90, true ) );


        // when

        dealership.getCarsFilteredByFastCharging ();

        // then
        listIsFastCharging = new ArrayList <> ();
        List <Car> expected = new ArrayList <> ();
        expected.add ( new Car ( "Volkswagen", "e-UP", false, 2000, 25000,
                2, 60, 90, true ) );
        expected.add ( new Car ( "Volkswagen", "e-Golf", true, 2017
                , 38000, 1, 70, 80, true ) );
        expected.add ( new Car ( "Renault", "Zoe", true, 2017
                , 33000, 3, 65, 80, true ) );
        expected.add ( new Car ( "BMW", "i3", true, 2017
                , 40000, 2, 80, 90, true ) );


        assertEquals ( expected, dealership.cars );

    }
}