package siit.gr8.narci.milestone;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestCsvWriter {


    // NFEV3 - Store cars in CSV files.

    @Test
    public void testCsvWriter ( ) throws IOException {

        //given


        ArrayList <Car> cars = new ArrayList <> ();

        cars.add ( new Car ( "Volkswagen", "e-UP", true, 2000, 25000,
                1, 60, 90, true ) );
        cars.add ( new Car ( "Volkswagen", "e-Golf", true, 2017
                , 38000, 1, 70, 80, true ) );
        cars.add ( new Car ( "Renault", "Zoe", true, 2017
                , 33000, 3, 65, 80, true ) );
        // when
        CarDataWriterReader carDataWriterReader = new CarDataWriterReader ();
        carDataWriterReader.writeToCsv ( cars, "test.csv" );
        BufferedReader bufferedReader = new BufferedReader ( new FileReader ( "test.csv" ) );

        String firstReadedLine = bufferedReader.readLine ();
        String secondReadedLine = bufferedReader.readLine ();


        String firstExpectedLine = cars.get ( 0 ).getManufacturer ()+","+cars.get ( 0 ).getModel ()+","+
                cars.get ( 0 ).isItNew ( false )+","+cars.get ( 0 ).getProductionYear ()+","+cars.get ( 0 ).getPrice ()+","+
                cars.get ( 0 ).getDealerCarStock ()+","+cars.get ( 0 ).getHorsePower ()+","+cars.get ( 0 ).getRangePerCharge ()
                +","+cars.get ( 0 ).isFastCharging ();

        String secondExpectedLine = cars.get ( 1 ).getManufacturer ()+","+cars.get ( 1 ).getModel ()+","+
                cars.get ( 1 ).isItNew ( false )+","+cars.get ( 1 ).getProductionYear ()+","+cars.get ( 1 ).getPrice ()+","+
                cars.get ( 1 ).getDealerCarStock ()+","+cars.get ( 1 ).getHorsePower ()+","+cars.get ( 1 ).getRangePerCharge ()
                +","+cars.get ( 1 ).isFastCharging ();
        // then
        assertEquals ( firstExpectedLine, firstReadedLine );
        assertEquals ( secondExpectedLine, secondReadedLine );

    }
}


