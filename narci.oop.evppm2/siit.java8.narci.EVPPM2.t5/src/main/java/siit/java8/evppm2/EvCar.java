package siit.java8.evppm2;

/**
 * Created by Narci on 8/26/2017
 */
public class EvCar {


    private boolean isItNew;
    private boolean inStock;
    float price;
    String electricMotor;
    String electricBattery;
    String energyConsumption;
    String manufacturer;
    String model;
    int productionYear;
    boolean isFastCharging;
    int horsePower;
    int rangePerCharge;


    public boolean isItNew ( ) {

        return true;
    }

    public boolean isInStock ( ) {

        return true;
    }

    public boolean isFastCharging ( ) {

        return true;
    }

    public EvCar ( ) {


        this.electricMotor = electricMotor;
        this.electricBattery = electricBattery;
        this.energyConsumption = energyConsumption;
        this.manufacturer = manufacturer;
        this.model = model;
        this.productionYear = productionYear;
        this.horsePower = horsePower;
        this.rangePerCharge = rangePerCharge;

    }

    public String getElectricMotor ( ) {
        return electricMotor;
    }

    public String getElectricBattery ( ) {
        return electricBattery;
    }

    public String getEnergyConsumption ( ) {
        return energyConsumption;
    }

    public String getManufacturer ( ) {
        return manufacturer;
    }

    public String getModel ( ) {
        return model;
    }

    public int getProductionYear ( ) {
        return productionYear;
    }

    public int getHorsePower ( ) {
        return horsePower;
    }

    public int getRangePerCharge ( ) {
        return rangePerCharge;
    }

    @Override
    public String toString ( ) {
        return "EvCar [electricMotor=" + electricMotor + ",electricBattery=" + electricBattery + "," + "energyConsumption=" + energyConsumption + ", manufacturer=" + manufacturer + ", model=" + model + "," + "productionYear=" + productionYear + ",horsePower=" + horsePower + ",rangePerCharge=" + rangePerCharge + " ]";
    }
}

