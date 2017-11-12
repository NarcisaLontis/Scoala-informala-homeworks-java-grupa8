package siit.gr8.narci.milestone;

import java.util.ArrayList;
import java.util.List;

/**
 * class Dealership
 *
 * @author Narcisa Lontis
 */
public class Dealership {

    static Car[] cars = new Car[ 9 ];


    public static void addCars ( int position, int price, String manufacturer, String model, int stock, boolean FastCharging ) {
        cars[ position ] = new Car ();
        cars[ position ].setPrice ( price );
        cars[ position ].setManufacturer ( manufacturer );
        cars[ position ].setModel ( model );
        cars[ position ].setStock ( stock );
        cars[ position ].setFastCharging ( FastCharging );


    }

    //FEV2: Customer can filter the list based on the following information: - has fast-charging,- is in stock

    public static List <String> filterByIsInStock ( ) {
        List <String> listStock = new ArrayList <> ();
        for (Car car : cars) {
            if (car.getStock () > 0) {
                listStock.add ( car.getManufacturer ()+car.getModel () );
            }
        }
        return listStock;
    }

    public static List <String> filterByFastCharging ( ) {
        List <String> listFastCharging = new ArrayList <> ();
        for (Car list : cars)
            if (list.isFastCharging ()) {
                listFastCharging.add ( list.getManufacturer ()+list.getModel () );
            }
        return listFastCharging;
    }
}
