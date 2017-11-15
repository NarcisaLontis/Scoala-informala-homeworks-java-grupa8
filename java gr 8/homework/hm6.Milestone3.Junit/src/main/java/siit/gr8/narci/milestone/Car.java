package siit.gr8.narci.milestone;

public class Car {


    private String manufacturer;
    private String model;
    private boolean isItNew;
    private int productionYear;
    private float price;
    private int stock;
    private int horsePower;
    private int rangePerCharge;
    private boolean fastCharging;
    private boolean inStock;
    private String electricMotor;
    private String electricBattery;
    private String energyConsumption;


    //constructor
    public Car ( ) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.isItNew = isItNew;
        this.productionYear = productionYear;
        this.price = price;
        this.stock = stock;
        this.horsePower = horsePower;
        this.rangePerCharge = rangePerCharge;
        this.fastCharging = fastCharging;
        this.inStock = inStock;
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

    public boolean isItNew ( ) {
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

    public int getStock ( ) {
        return stock;
    }

    public void setStock ( int stock ) {
        this.stock = stock;
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
        return fastCharging;
    }


    public void setFastCharging ( boolean fastCharging ) {
        this.fastCharging = fastCharging;
    }


    public boolean isInStock ( ) {
        return inStock;
    }

    public void setInStock ( boolean inStock ) {
        this.inStock = inStock;
    }

    public String getElectricMotor ( ) {
        return electricMotor;
    }

    public void setElectricMotor ( String electricMotor ) {
        this.electricMotor = electricMotor;
    }

    public String getElectricBattery ( ) {
        return electricBattery;
    }

    public void setElectricBattery ( String electricBattery ) {
        this.electricBattery = electricBattery;
    }

    public String getEnergyConsumption ( ) {
        return energyConsumption;
    }

    public void setEnergyConsumption ( String energyConsumption ) {
        this.energyConsumption = energyConsumption;
    }


    @Override
    public String toString ( ) {
        return super.toString ();
    }
}











