package siit.gr8.narci.milestone;


public class Dealership {
    static Car[] cars = new Car[ 9 ];


    public Dealership ( ) {

    }

    public static void addCars ( int position, int price, String manufacturer, String model, int stock ) {
        cars[ position ] = new Car ();
        cars[ position ].setPrice ( price );
        cars[ position ].setManufacturer ( manufacturer );
        cars[ position ].setModel ( model );
        cars[ position ].setStock ( stock );

    }
}
