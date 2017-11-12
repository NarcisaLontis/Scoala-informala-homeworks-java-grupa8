package siit.gr8.narci.milestone;

import java.io.*;
import java.util.ArrayList;

public class CarDataWriterReader extends Writer {

    // create constructor
    public CarDataWriterReader ( ) {
    }

    @Override
    public void write ( char[] cbuf, int off, int len ) throws IOException {

    }

    @Override
    public void flush ( ) throws IOException {

    }

    @Override
    public void close ( ) throws IOException {

    }


    public void writeToCsv ( ArrayList <Car> cars, String fileName ) {


        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter ( fileName, true );
        } catch (IOException e) {
            e.printStackTrace ();
            System.out.println ( "Cannot create FileWriter." );
        }

        BufferedWriter bufferedWriter = new BufferedWriter ( fileWriter );
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader ( new FileReader ( fileName ) );
        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        }
        try {


            if (bufferedReader.readLine () == null) {
                for (Car car : cars) {
                    bufferedWriter.write ( car.getManufacturer ()+","+car.getModel ()+","+car.isItNew ( false )+","+car.getProductionYear ()+","+
                            car.getPrice ()+","+car.getDealerCarStock ()+","+car.getHorsePower ()+","+car.getRangePerCharge ()+","+car.isFastCharging () );

                }
            } else {
                System.out.println ( "CSV File is in src-target folder and has the name cars.csv" );
            }
        } catch (Exception e) {
            e.printStackTrace ();
            System.out.println ( "Cannot pass the ArrayList." );
        } finally {
            try {
                bufferedWriter.flush ();
                bufferedWriter.close ();
            } catch (Exception e) {
                e.getMessage ();
                e.printStackTrace ();
                System.out.println ( "Cannot close and flush the BufferedWriter." );
            }
        }
    }
}

