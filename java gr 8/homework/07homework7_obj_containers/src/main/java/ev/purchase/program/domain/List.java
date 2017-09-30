package ev.purchase.program.domain;

import java.util.ArrayList;

/**
 * Created by Narci on 10/09/2017
 */

public class List {
    private ArrayList<Stock> stock;


    private int numberOfEvCars = 0;

    public List ( ArrayList<Stock> stock ) {
        this.stock = stock;
    }

    public Stock getStockItem ( int position ) {
        return stock.get ( position );
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

    public void filterIsFastCharging ( ) {

    }

}