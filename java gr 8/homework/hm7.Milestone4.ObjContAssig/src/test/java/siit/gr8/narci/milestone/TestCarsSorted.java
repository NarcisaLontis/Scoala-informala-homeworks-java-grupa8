package siit.gr8.narci.milestone;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static siit.gr8.narci.milestone.Car.*;

public class TestCarsSorted {

// FEV3 - Customer can sort list based on the following: price, range per charge, horsepower"

    @Test

    public void testCarsSortedByPrice ( ) {
        ArrayList <Car> cars = new ArrayList <> ();
        Car car1 = new Car ( "Wolkswagen", "e-UP", false, 2000, 25000,
                2, 60, 90, true );
        Car car2 = new Car ( "Wolkswagen", "e-Golf", true, 2017
                , 38000, 1, 70, 80, true );
        Car car3 = new Car ( "Renault", "Zoe", true, 2017
                , 33000, 3, 65, 80, true );

        cars.add ( car1 );
        cars.add ( car2 );
        cars.add ( car3 );

        System.out.println ( "\nTest @before sorted by price\n"+cars );

        Collections.sort ( cars, carPriceComparator );

        ArrayList <Car> expected = new ArrayList <Car> ();
        expected.add ( car1 );
        expected.add ( car3 );
        expected.add ( car2 );

        System.out.println ( "\nTest @afeter sorted by price\n"+cars );
        assertEquals ( expected, cars );

    }

    @Test
    public void testCarsSortedByRangePerCharge ( ) {
        ArrayList <Car> cars = new ArrayList <> ();
        Car car1 = new Car ( "Wolkswagen", "e-UP", false, 2000, 25000,
                2, 60, 90, true );
        Car car2 = new Car ( "Wolkswagen", "e-Golf", true, 2017
                , 38000, 1, 70, 80, true );
        Car car3 = new Car ( "Renault", "Zoe", true, 2017
                , 33000, 3, 65, 80, true );

        cars.add ( car1 );
        cars.add ( car2 );
        cars.add ( car3 );

        System.out.println ( "\nTest @before sorted by RangePerCharge\n"+cars );

        Collections.sort ( cars, carRangeComparator );

        ArrayList <Car> expected = new ArrayList <Car> ();
        expected.add ( car2 );
        expected.add ( car3 );
        expected.add ( car1 );

        System.out.println ( "\nTest @afeter sorted by by RangePerCharge\n"+cars );

        assertEquals ( expected, cars );

    }

    @Test
    public void testCarsSortedByHorsePower ( ) {
        ArrayList <Car> cars = new ArrayList <> ();
        Car car1 = new Car ( "Wolkswagen", "e-UP", false, 2000, 25000,
                2, 60, 90, true );
        Car car2 = new Car ( "Wolkswagen", "e-Golf", true, 2017
                , 38000, 1, 70, 80, true );
        Car car3 = new Car ( "Renault", "Zoe", true, 2017
                , 33000, 3, 65, 80, true );

        cars.add ( car1 );
        cars.add ( car2 );
        cars.add ( car3 );

        System.out.println ( "\nTest @before sorted by horse power\n"+cars );


        Collections.sort ( cars, carHorsePowerComparator );

        ArrayList <Car> expected = new ArrayList <Car> ();
        expected.add ( car1 );
        expected.add ( car3 );
        expected.add ( car2 );


        System.out.println ( "\nTest @afeter sorted by horse power\n"+cars );

        assertEquals ( expected, cars );

    }

}




