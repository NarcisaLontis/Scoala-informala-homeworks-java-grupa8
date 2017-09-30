package siit.java8.evppm2.domain;

/**
 * Created by Narci on 10/09/2017
 */

public class List {
    private Stock[] stock;
    private int numberOfEvCars = 0;

    public List ( Stock[] stock ) {
        this.stock = stock;
    }

    public Stock getStockItem ( int position ) {
        return stock[ position ];
    }

    public void filterIsInStock ( ) {
        for (Stock item : stock) {
            if (item != null) {
                if (item.getNumberOfEvCars () < 1) {
                    delete ( item );
                }
            }
        }
    }

    private void delete ( Stock item ) {
    }
    public void filterIsFastCharging (){

    }
}
