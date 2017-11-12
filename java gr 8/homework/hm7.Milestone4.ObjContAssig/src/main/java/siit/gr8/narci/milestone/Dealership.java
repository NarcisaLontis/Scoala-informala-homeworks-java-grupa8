package siit.gr8.narci.milestone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dealership {


    public ArrayList <Car> cars = new ArrayList <> ();
    private String dealershipName;
    private float dealershipBudget;
    private boolean requestForBonus;
    private boolean dealershipGreenBonusOffer;
    private int stockOfCar;
    private float revenue;


    public Dealership ( String dealershipName, float dealershipBudget, boolean requestForBonus, boolean dealershipGreenBonusOffer, float revenue ) {
        this.dealershipName = dealershipName;
        this.dealershipBudget = dealershipBudget;
        this.requestForBonus = requestForBonus;
        this.revenue = revenue;
    }

    //getter and setter
    public String getDealershipName ( ) {
        return dealershipName;
    }

    public void setDealershipName ( String dealershipName ) {
        this.dealershipName = dealershipName;
    }

    public float getDealershipBudget ( ) {
        return dealershipBudget;
    }

    public void setDealershipBudget ( float dealershipBudget ) {
        this.dealershipBudget = dealershipBudget;
    }

    public boolean getRequestForBonus ( ) {
        return requestForBonus;
    }

    public void setRequestForBonus ( boolean requestForBonus ) {
        this.requestForBonus = requestForBonus;
    }

    public boolean getDealershipGreenBonusOffer ( ) {
        return dealershipGreenBonusOffer;
    }

    public void setDealershipGreenBonusOffer ( boolean dealershipGreenBonusOffer ) {
        this.dealershipGreenBonusOffer = dealershipGreenBonusOffer;
    }

    public ArrayList <Car> getCars ( ) {
        return cars;
    }

    public void setCars ( ArrayList <Car> cars ) {
        this.cars = cars;
    }

    public float getRevenue ( ) {
        return revenue;
    }

    public void setRevenue ( float revenue ) {
        this.revenue = revenue;
    }

    public int getStockOfCar ( ) {
        return stockOfCar;
    }

    public void setStockOfCar ( int stockOfCar ) {
        this.stockOfCar = stockOfCar;
    }

    @Override
    public boolean equals ( Object o ) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;

        Dealership that = (Dealership) o;

        if (Float.compare ( that.dealershipBudget, dealershipBudget ) != 0) return false;
        if (requestForBonus != that.requestForBonus) return false;
        if (dealershipGreenBonusOffer != that.dealershipGreenBonusOffer) return false;
        if (stockOfCar != that.stockOfCar) return false;
        if (Float.compare ( that.revenue, revenue ) != 0) return false;
        if (dealershipName != null ? !dealershipName.equals ( that.dealershipName ) : that.dealershipName != null)
            return false;
        return cars != null ? cars.equals ( that.cars ) : that.cars == null;
    }

    @Override
    public int hashCode ( ) {
        int result = dealershipName != null ? dealershipName.hashCode () : 0;
        result = 31 * result+(dealershipBudget != +0.0f ? Float.floatToIntBits ( dealershipBudget ) : 0);
        result = 31 * result+(requestForBonus ? 1 : 0);
        result = 31 * result+(dealershipGreenBonusOffer ? 1 : 0);
        result = 31 * result+stockOfCar;
        result = 31 * result+(cars != null ? cars.hashCode () : 0);
        result = 31 * result+(revenue != +0.0f ? Float.floatToIntBits ( revenue ) : 0);
        return result;
    }


    //FEV1-Customer retrieves list of ev cars, number of stock, and their prices from car dealerships:
    public void getListCar ( Dealership dealership ) {
        for (Car car : cars) {
            System.out.println ( "Manufacturer: "+car.getManufacturer ()+" Model: "+car.getModel ()+" Number of Stock: "+
                    car.getStock ()+" Price: "+car.getPrice () );
        }
    }

    //FEV2 - Customer can filter the list based on the following information: has fast-charging, is in stock
    public List <String> getCarsFilteredByStock ( Dealership dealership ) {

        List <String> listStock = new ArrayList <> ();
        for (Car car : cars) {
            if (car.getStock () > 0) {
                listStock.add ( car.getManufacturer ()+car.getModel () );
            }
        }
        return listStock;
    }

    public List <String> getCarsFilteredByFastCharging ( ) {

        List <String> listIsFastCharging = new ArrayList <> ();
        for (Car car : cars) {
            if (car.isFastCharging ()) {
                listIsFastCharging.add ( car.getManufacturer ()+car.getModel () );
            }
        }
        return listIsFastCharging;
    }

    //FEV3 - Customer can sort list based on the following: price, range per charge, horsepower

    public ArrayList getCarsSortedByPrice ( ) {
        ArrayList sorted = new ArrayList ( cars );
        Collections.sort ( sorted, Car.carPriceComparator );
        return sorted;
    }

    public ArrayList getCarsSortedByRangePerCharge ( ) {
        ArrayList sorted = new ArrayList ( cars );
        Collections.sort ( sorted, Car.carRangeComparator );
        return sorted;
    }

    public ArrayList getCarsSortedByHorsePower ( ) {
        ArrayList sorted = new ArrayList ( cars );
        Collections.sort ( sorted, Car.carHorsePowerComparator );
        return sorted;
    }
    //   FEV8 - Customer receives Green Bonus offer from dealership or notification that there are no more bonuses

    public void sendGreenBonusNotification ( Customer customer, GreenBonusProgram greenBonusProgram ) {
        if (!greenBonusProgram.isNoMoreBonuses ()) {
            System.out.println ( "Dear customer, you received 10000 bonus discount to buy an car" );
        } else {
            System.out.println ( "There are not more bonuses" );
        }
    }
}















