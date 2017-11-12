package siit.gr8.narci.milestone;


import java.util.ArrayList;


public class Main {


    public static void main ( String[] args ) throws IllegalArgumentException {

        Customer customer = new Customer ( "Narcisa Lontis", 70000, 1, "Volkswagen", "e-UP",
                true, true, true );


        Dealership dealership = new Dealership ( "Dealer", 40000, true, true, 0 );
        GreenBonusProgram greenBonusProgram = new GreenBonusProgram ( 30000, 100);
        CarDataWriterReader carDataWriterReader = new CarDataWriterReader ();
        ArrayList <Car> cars = new ArrayList <> ();

        dealership.cars.add ( new Car ( "Volkswagen", "e-UP", true, 2000, 25000,
                1, 60, 90, true ) );
        dealership.cars.add ( new Car ( "Volkswagen", "e-Golf", true, 2017
                , 38000, 1, 70, 80, true ) );
        dealership.cars.add ( new Car ( "Renault", "Zoe", true, 2017
                , 33000, 3, 65, 80, true ) );
        dealership.cars.add ( new Car ( "BMW", "i3", true, 2017
                , 40000, 2, 80, 90, true ) );
        dealership.cars.add ( new Car ( "Smart", "FourTwo", false, 2015
                , 22000, 0, 55, 60, false ) );
        dealership.cars.add ( new Car ( "Smart", "FourFour", true, 2017
                , 27000, 1, 57, 65, false ) );
        dealership.cars.add ( new Car ( "Smart", "FourTwo Cabrio", false, 2016
                , 23000, 5, 58, 65, false ) );
        dealership.cars.add ( new Car ( "KIA", "Soul", true, 2017
                , 34000, 3, 70, 75, false ) );
        dealership.cars.add ( new Car ( "Hyundai", "Ioniq", false, 2014
                , 23900, 3, 70, 75, false ) );

        System.out.print ( "\n"+"FEV1-Customer retrieves list of ev cars, number of stock, and their prices from car dealerships: "+"\n\n" );
        dealership.getListCar ( dealership );
        System.out.println ( "\n"+"FEV2 - Customer can filter the list based on the following information: has fast-charging, is in stock.\n" );
        System.out.println ( "These cars are in stock: "+dealership.getCarsFilteredByStock ( dealership ) );
        System.out.println ( "These cars have fast charge: "+dealership.getCarsFilteredByFastCharging () );
        System.out.println ( "\n"+"FEV3 - Customer can sort list based on the following: price, range per charge, horsepower" );
        System.out.println ( "\n"+"Sort by Price:"+dealership.getCarsSortedByPrice () );
        System.out.println ( "\n"+"Sort by range per charge:"+dealership.getCarsSortedByRangePerCharge () );
        System.out.println ( "\n"+"Sort by horse power:"+dealership.getCarsSortedByHorsePower () );

        System.out.println ( "\nFEV4 - Customer purchases car at the full price." );
        customer.buyCarAtFullPrice ( cars, dealership );

        System.out.println ( "\nFEV5 - Customer requests Green Bonus for an ev from the dealership" );
        customer.customerRequestForGreenBonus ( cars, dealership );

        System.out.println ( "\nFEV8 - Customer receives Green Bonus offer from dealership or notification that there are no more bonuses.\n" );
        dealership.sendGreenBonusNotification ( customer, greenBonusProgram );

        System.out.println ( "\nFEV9 - Customer uses the Green Bonus Offer to purchase the ev" );
        customer.buyWithGreenBonus ( cars, dealership );


        System.out.println ( "\nFEV6-Car Dealership requests Green Bonus from the Green Bonus Program" );
        dealership.dealershipRequestGreenBonus ( customer, greenBonusProgram );
        System.out.println ( "\nFEV7 Green Bonus Program grants the 10000€ to the dealership, if there is still money in the budget. "+
                "There is a limit of 1000 cars per year " );
        greenBonusProgram.programGrantsGreenBonus ( dealership, greenBonusProgram );

        System.out.println ( "\nFEV10 - Customer is not allowed to purchase a car which is out of stock." );


        System.out.println ( "\nFEV11 - Customer is not allowed to purchase a car when does not have enough funds." );
        System.out.println ( "Implemented with exception" );


        System.out.println ( "\nFEV12 - Customer is not allowed to purchase a used ev with a green bonus" );
        System.out.println ( "Implemented with exception" );

// NFEV3 - Store cars in CSV files.
        System.out.println ( "\nNFEV3 - Store cars in CSV files." );
        carDataWriterReader.writeToCsv ( cars, "cars.csv" );
        String csvFile = "src/target/cars.csv";

    }
}






