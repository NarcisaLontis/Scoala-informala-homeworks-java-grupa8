package siit.gr8.narci.milestone;

import java.util.Comparator;

public class Car implements Comparable <Car> {

    public static Comparator <Car> carPriceComparator = new Comparator <Car> () {

        public int compare ( Car o1, Car o2 ) {
            int CarPrice1 = (int) o1.getPrice ();
            int CarPrice2 = (int) o2.getPrice ();

            return CarPrice1-CarPrice2;
        }


    };
    public static Comparator <Car> carRangeComparator = new Comparator <Car> () {

        public int compare ( Car o1, Car o2 ) {
            int CarRange1 = o1.getRangePerCharge ();
            int CarRange2 = o2.getRangePerCharge ();

            return CarRange1-CarRange2;
        }
    };
    public static Comparator <Car> carHorsePowerComparator = new Comparator <Car> () {

        public int compare ( Car o1, Car o2 ) {
            int CarHp1 = o1.horsePower;
            int CarHp2 = o2.horsePower;

            return CarHp1-CarHp2;
        }
    };
    private String manufacturer;
    private String model;
    private boolean isItNew;
    private int productionYear;
    private float price;
    private int dealerCarStock;
    private int horsePower;
    private int rangePerCharge;
    private boolean isFastCharging;
    private float pricePerDay;

    public Car ( String manufacturer, String model, boolean isItNew, int productionYear, float price, int dealerCarStock, int horsePower,
                 int rangePerCharge, boolean isFastCharging ) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.isItNew = isItNew;
        this.productionYear = productionYear;
        this.price = price;
        this.dealerCarStock = dealerCarStock;
        this.horsePower = horsePower;
        this.rangePerCharge = rangePerCharge;
        this.isFastCharging = isFastCharging;
        this.pricePerDay = pricePerDay;


    }

    public Car ( ) {

    }

    public String getManufacturer ( ) {
        return manufacturer;
    }

    public void setManufacturer ( String manufacturer ) {
        this.manufacturer = manufacturer;
    }

    public String getModel ( ) {
        return model;
    }

    public void setModel ( String model ) {
        this.model = model;
    }

    public boolean isItNew ( boolean b ) {
        return isItNew;
    }

    public void setItNew ( boolean itNew ) {
        isItNew = itNew;
    }

    public int getProductionYear ( ) {
        return productionYear;
    }

    public void setProductionYear ( int productionYear ) {
        this.productionYear = productionYear;
    }

    public float getPrice ( ) {
        return price;
    }

    public void setPrice ( float price ) {
        this.price = price;
    }

    public int getDealerCarStock ( ) {
        return dealerCarStock;
    }

    public void setDealerCarStock ( int dealerCarStock ) {
        this.dealerCarStock = dealerCarStock;
    }

    public int getHorsePower ( ) {
        return horsePower;
    }

    public void setHorsePower ( int horsePower ) {
        this.horsePower = horsePower;
    }

    public int getRangePerCharge ( ) {
        return rangePerCharge;
    }

    public void setRangePerCharge ( int rangePerCharge ) {
        this.rangePerCharge = rangePerCharge;
    }

    public boolean isFastCharging ( ) {
        return isFastCharging;
    }

    public void setFastCharging ( boolean isFastCharging ) {
        this.isFastCharging = isFastCharging;
    }

    @Override
    public boolean equals ( Object o ) {
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;
        Car car = (Car) o;
        if (isItNew != car.isItNew) return false;
        if (productionYear != car.productionYear) return false;
        if (Float.compare ( car.price, price ) != 0) return false;
        if (dealerCarStock != car.dealerCarStock) return false;
        if (horsePower != car.horsePower) return false;
        if (rangePerCharge != car.rangePerCharge) return false;
        if (isFastCharging != car.isFastCharging) return false;
        if (!manufacturer.equals ( car.manufacturer )) return false;
        return model.equals ( car.model );
    }

    @Override
    public int hashCode ( ) {
        int result = manufacturer.hashCode ();
        result = 31 * result+model.hashCode ();
        result = 31 * result+(isItNew ? 1 : 0);
        result = 31 * result+productionYear;
        result = 31 * result+(price != +0.0f ? Float.floatToIntBits ( price ) : 0);
        result = 31 * result+dealerCarStock;
        result = 31 * result+horsePower;
        result = 31 * result+rangePerCharge;
        result = 31 * result+(isFastCharging ? 1 : 0);
        return result;
    }

    @Override
    public String toString ( ) {
        return "\nCar{"+manufacturer+
                ", model='"+model+'\''+
                ", fastCharging="+isFastCharging+
                ", Stock="+dealerCarStock+
                ", price="+price+
                ", horsePower="+horsePower+
                ", rangePerCharge="+rangePerCharge+'}';
    }

    @Override
    public int compareTo ( Car o ) {
        return 0;
    }


}


