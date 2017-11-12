package siit.gr8.narci.milestone;


// Define the algorithm for computing the renting price by using generic types.

import java.util.ArrayList;

public class CarRentalService extends Car {


    public CarRentalService ( String manufacturer, String model, boolean isItNew, int productionYear, float price, int dealerCarStock,
                              int horsePower, int rangePerCharge, boolean isFastCharging ) {
        super ( manufacturer, model, isItNew, productionYear, price, dealerCarStock, horsePower, rangePerCharge, isFastCharging );
    }


    public void getRentalCostPerDay ( ArrayList <? extends Car> cars, CarRentalService carRentalService ) {
        for (Car car : cars) {
            System.out.println ( "Price per day for: "+carRentalService.getManufacturer ()+" "+carRentalService.getModel ()+" is: "
                    +carRentalService.getPrice () / 1000+"$" );
        }
    }


    public void getRentalCost ( ArrayList <? extends Car> cars, int numberOfDays ) {
        for (Car car : cars) {

            float pricePerDay = car.getPrice () / 1000;
            float pricePerNumberOfDays = pricePerDay * numberOfDays;
            System.out.println ( "Price for "+car.getManufacturer ()+" "+car.getModel ()+" rented for "+numberOfDays+" days"+" is: "+pricePerNumberOfDays+"Euro" );
        }


    }
}
