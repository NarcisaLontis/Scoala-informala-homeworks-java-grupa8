package narci;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

public class Pachet extends ArrayList <Pachet> implements Comparable {


    private String deliveryLocation;
    private String deliveryDate;
    private int distance;
    private float merchandiseValue;
    private int ID;


    public Pachet ( String deliveryLocation, String deliveryDate, int distance, float merchandiseValue, int ID ) {
        this.deliveryLocation = deliveryLocation;
        this.deliveryDate = deliveryDate;
        this.distance = distance;
        this.merchandiseValue = merchandiseValue;
        this.ID = ID;
    }


    public static Comparator <Pachet> pachetDeliveryLocationComparator = ( Pachet o1, Pachet o2 ) -> {

        String PachetLocation1 = (String) o1.getDeliveryLocation ();
        String PachetLocation2 = (String) o2.getDeliveryLocation ();
        return PachetLocation1.compareTo ( PachetLocation2 );

    };

    public static Comparator <Pachet> pachetDeliveryDateComparator = ( Pachet o1, Pachet o2 ) -> {

        String PachetDate1 = (String) o1.getDeliveryDate ();
        String PachetDate2 = (String) o2.getDeliveryDate ();
        return PachetDate1.compareTo ( PachetDate2 );

    };




    @Override
    public int compareTo ( Object o ) {
        return 0;
    }

    public String getDeliveryLocation ( ) {
        return deliveryLocation;
    }

    public void setDeliveryLocation ( String deliveryLocation ) {
        this.deliveryLocation = deliveryLocation;
    }

    public String getDeliveryDate ( ) {
        return deliveryDate;
    }

    public void setDeliveryDate ( String deliveryDate ) {
        this.deliveryDate = deliveryDate;
    }

    public int getDistance ( ) {
        return distance;
    }

    public void setDistance ( int distance ) {
        this.distance = distance;
    }

    public float getMerchandiseValue ( ) {
        return merchandiseValue;
    }

    public void setMerchandiseValue ( float merchandiseValue ) {
        this.merchandiseValue = merchandiseValue;
    }

    public int getID ( ) {
        return ID;
    }

    public void setID ( int ID ) {
        this.ID = ID;
    }




    @Override
    public Stream <Pachet> stream ( ) {
        return null;
    }


    @Override
    public String toString ( ) {
        return "Pachet{"+
                "deliveryLocation='"+deliveryLocation+'\''+
                ", deliveryDate='"+deliveryDate+'\''+
                ", distance="+distance+
                ", merchandiseValue="+merchandiseValue+
                ", ID="+ID+
                '}';
    }


}

