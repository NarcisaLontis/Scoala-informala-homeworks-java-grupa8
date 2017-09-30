package ev.purchase.program.domain;

/**
 * Created by Narci on 9/24/2017
 */
public class PurchaseEvCar {
    private Customer purchaser;
    private EvCar selectedEvCar;
    private float price;

    public PurchaseEvCar ( Stock stock, Customer purchaser ) {

    }

    public PurchaseEvCar ( Object o, Customer purchaser, int bonus ) {

    }


    @Override
    public String toString ( ) {
        return "PurchaseEvCar{" +
                "purchaser=" + purchaser +
                ", selectedEvCar=" + selectedEvCar +
                ", price=" + price +
                '}';
    }

    public PurchaseEvCar ( Customer order, EvCar selectedEvCar, float price ) {
        this.purchaser = purchaser;
        this.selectedEvCar = selectedEvCar;
        this.price = price;
    }
}


