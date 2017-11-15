package siit.gr8.narci.milestone;

public class ElectricCar extends Car {

    public ElectricCar ( String manufacturer, String model, boolean isItNew, int productionYear, float price, int dealerCarStock,
                         int horsePower, int rangePerCharge, boolean isFastCharging ) {
        super ( manufacturer, model, isItNew, productionYear, price, dealerCarStock, horsePower, rangePerCharge, isFastCharging );
    }

    @Override
    public String getManufacturer ( ) {
        return super.getManufacturer ();
    }

    @Override
    public void setManufacturer ( String manufacturer ) {
        super.setManufacturer ( manufacturer );
    }

    @Override
    public String getModel ( ) {
        return super.getModel ();
    }

    @Override
    public void setModel ( String model ) {
        super.setModel ( model );
    }

    @Override
    public boolean isItNew ( boolean b ) {
        return super.isItNew ( b );
    }

    @Override
    public void setItNew ( boolean itNew ) {
        super.setItNew ( itNew );
    }

    @Override
    public int getProductionYear ( ) {
        return super.getProductionYear ();
    }

    @Override
    public void setProductionYear ( int productionYear ) {
        super.setProductionYear ( productionYear );
    }

    @Override
    public float getPrice ( ) {
        return super.getPrice ();
    }

    @Override
    public void setPrice ( float price ) {
        super.setPrice ( price );
    }

    @Override
    public int getDealerCarStock ( ) {
        return super.getDealerCarStock ();
    }

    @Override
    public void setDealerCarStock ( int dealerCarStock ) {
        super.setDealerCarStock ( dealerCarStock );
    }

    @Override
    public int getHorsePower ( ) {
        return super.getHorsePower ();
    }

    @Override
    public void setHorsePower ( int horsePower ) {
        super.setHorsePower ( horsePower );
    }

    @Override
    public int getRangePerCharge ( ) {
        return super.getRangePerCharge ();
    }

    @Override
    public void setRangePerCharge ( int rangePerCharge ) {
        super.setRangePerCharge ( rangePerCharge );
    }

    @Override
    public boolean isFastCharging ( ) {
        return super.isFastCharging ();
    }

    @Override
    public void setFastCharging ( boolean isFastCharging ) {
        super.setFastCharging ( isFastCharging );
    }

    @Override
    public boolean equals ( Object o ) {
        return super.equals ( o );
    }

    @Override
    public int hashCode ( ) {
        return super.hashCode ();
    }

    @Override
    public String toString ( ) {
        return super.toString ();
    }

    @Override
    public int compareTo ( Car o ) {
        return super.compareTo ( o );
    }


}
