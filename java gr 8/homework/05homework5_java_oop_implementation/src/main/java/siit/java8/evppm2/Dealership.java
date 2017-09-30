package siit.java8.evppm2;

/**
 * Created by Narci on 8/26/2017
 */
public class Dealership {

    static EvCar[] evCars = new EvCar[ 9 ];

    public Dealership ( ) {
    }

    public static void initEvCars ( int position, int price, String manufacturer, String model ) {
        evCars[ position ] = new EvCar ();
        evCars[ position ].price = price;
        evCars[ position ].manufacturer = manufacturer;
        evCars[ position ].model = model;

    }
}