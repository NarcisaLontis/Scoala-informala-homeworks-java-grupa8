
package narci;


import java.util.ArrayList;
import java.util.Collections;


public class DeliverySystem implements Runnable {

    public static ArrayList <Pachet> pachete = new ArrayList <> ();

    private String deliveryLocation;
    private String deliveryDate;
    private int distance;
    private float merchandiseValue;
    private int ID;

    public DeliverySystem ( String deliveryLocation, String deliveryDate, int distance, float merchandiseValue, int ID ) {
        this.deliveryLocation = deliveryLocation;
        this.deliveryDate = deliveryDate;
        this.distance = distance;
        this.merchandiseValue = merchandiseValue;
        this.ID = ID;
    }

    public static ArrayList getPachetSortedByDeliveryLocation ( ) {
        ArrayList sorted = new ArrayList ( pachete );
        Collections.sort ( sorted, Pachet.pachetDeliveryLocationComparator );
        return sorted;
    }

    public static ArrayList getPachetSortedByDeliveryDate ( ) {
        ArrayList sorted = new ArrayList ( pachete );
        Collections.sort ( sorted, Pachet.pachetDeliveryDateComparator );
        return sorted;
    }

    @Override
    public void run ( ) {
        calculateDelivery ( new Pachet ( "Turda", "20.11.2017", 30, 2000, 2 ) );

    }

    public synchronized void calculateDelivery ( ArrayList <Pachet> pachet ) {

        System.out.println ( "\nThe value of the merchandise is : "+merchandiseValue+" the value of the profit is "+2 * distance+
                " The total value of the package is : "+((merchandiseValue+2 * distance)) );


    }


}













