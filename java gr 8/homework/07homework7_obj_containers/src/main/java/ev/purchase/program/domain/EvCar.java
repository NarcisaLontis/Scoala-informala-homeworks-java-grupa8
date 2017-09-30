package ev.purchase.program.domain;

/**
 * Created by Narci on 8/26/2017
 */
public class EvCar {

    float price;
    String electricMotor;
    String electricBattery;
    String energyConsumption;
    String manufacturer;
    String model;
    String productionYear;
    boolean isFastCharging;
    String horsePower;
    String rangePerCharge;
    private String name = "";
    private boolean isItNew;
    private boolean inStock;
    private String evCarName;

    public EvCar ( ) {
        this.name = name;
    }

    public EvCar ( String electricMotor, String electricBattery, String energyConsumption, String manufacturer, String model,
                   String productionYear, String horsePower, String rangePerCharge ) {


        this.electricMotor = electricMotor;
        this.electricBattery = electricBattery;
        this.energyConsumption = energyConsumption;
        this.manufacturer = manufacturer;
        this.model = model;
        this.productionYear = productionYear;
        this.horsePower = horsePower;
        this.rangePerCharge = rangePerCharge;

    }

    public String getName ( ) {
        return model;
    }

    public void setName ( String name ) {
        this.model = name;
    }

    public boolean getIsItNew ( boolean itIsNew ) {
        return itIsNew;
    }

    public boolean isInStock ( ) {

        return true;
    }

    public boolean isFastCharging ( ) {

        return true;
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

    public String getProductionYear ( ) {
        return productionYear;
    }

    public String getHorsePower ( ) {
        return horsePower;
    }

    public String getRangePerCharge ( ) {
        return rangePerCharge;
    }

    @Override
    public String toString ( ) {
        return "EvCar [electricMotor=" + electricMotor + ",electricBattery=" + electricBattery + "," + "energyConsumption=" + energyConsumption + ", manufacturer=" + manufacturer + ", model=" + model + "," + "productionYear=" + productionYear + ",horsePower=" + horsePower + ",rangePerCharge=" + rangePerCharge + " ]";
    }

    public void copy ( EvCar evCarType ) {
    }

    public boolean getIsItNew ( ) {
        return isItNew;
    }
}
