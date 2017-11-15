
package siit.gr8.narci.milestone;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static siit.gr8.narci.milestone.Dealership.filterByFastCharging;
import static siit.gr8.narci.milestone.Dealership.filterByIsInStock;


public class FilterSortTest {


    @Before
    public void EvCars ( ) {
        Dealership.addCars ( 0, 25000, "Volkswagen", "e-UP", 2, true );
        Dealership.addCars ( 1, 38000, "Volkswagen", "e-Golf", 3, false );
        Dealership.addCars ( 2, 33000, "Renault", "Zoe", 2, true );
        Dealership.addCars ( 3, 40000, "BMW", "i3", 5, true );
        Dealership.addCars ( 4, 22000, "Smart", "FourTwo", 4, true );
        Dealership.addCars ( 5, 22700, "Smart", "FourFour", 2, true );
        Dealership.addCars ( 6, 23000, "Smart", "FourTwo Cabrio", 3, false );
        Dealership.addCars ( 7, 34000, "KIA", "Soul", 1, false );
        Dealership.addCars ( 8, 23900, "Hyundai", "Ioniq", 6, false );
    }

    @Test
    public void testfilterByIsInStock ( ) {
        ArrayList listStock = new ArrayList <> ( Arrays.asList ( "Volkswagene-UP", "Volkswagene-Golf", "RenaultZoe", "BMWi3", "SmartFourTwo",
                "SmartFourFour", "SmartFourTwo Cabrio", "KIASoul", "HyundaiIoniq" ) );

        assertEquals ( listStock, filterByIsInStock () );

    }


    @Test
    public void testfilterByFastCharging ( ) {
        ArrayList listFastCharging = new ArrayList <> ( Arrays.asList ( "Volkswagene-UP", "RenaultZoe", "BMWi3", "SmartFourTwo", "SmartFourFour" ) );
        assertEquals ( listFastCharging, filterByFastCharging () );
        assertNotEquals ( null, filterByFastCharging () );
    }
}


