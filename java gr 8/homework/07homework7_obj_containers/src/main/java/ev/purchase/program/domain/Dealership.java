package ev.purchase.program.domain;


import java.util.ArrayList;

/**
 * Created by Narci on 8/26/2017
 */
public class Dealership {


    static EvCar[] evCars = new EvCar[ 9 ];
    private String name;
    private Stock[] stock;
    private ArrayList<Stock> stocks;
    public ArrayList<Stock> getList() {
        return stocks;
    }
    public Dealership ( String name, Stock[] stock ) {
        this.name = name;
        this.stock = stock;
    }

    public static void initEvCars ( int position, int price, String manufacturer, String model ) {

    }

    public int getGreenBonus ( Object o, String name ) {
        return 0;
    }
}