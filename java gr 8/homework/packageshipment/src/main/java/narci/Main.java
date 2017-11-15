package narci;

import java.util.ArrayList;

public class Main {

    public static void main ( String[] args ) {


        DeliverySystem deliverySystem = new DeliverySystem ( "Oradea", "20.11.2017", 150, 1500, 1 );
        DeliveryDate deliveryDate = new DeliveryDate ( "20.11.2017" );
        DeliveryLocation deliveryLocation = new DeliveryLocation ( "Oradea" );

        ArrayList <Pachet> pachete = new ArrayList <> ();
        deliverySystem.pachete.add ( new Pachet ( "Oradea", "20.11.2017", 150, 1500, 1 ) );
        deliverySystem.pachete.add ( new Pachet ( "Turda", "20.11.2017", 30, 2000, 2 ) );
        deliverySystem.pachete.add ( new Pachet ( "Oradea", "20.11.2017", 150, 2500, 3 ) );
        deliverySystem.pachete.add ( new Pachet ( "Turda", "22.11.2017", 30, 2800, 4 ) );
        deliverySystem.pachete.add ( new Pachet ( "Oradea", "23.11.2017", 150, 3000, 5 ) );
        System.out.println ( "Sort the packages based on the target location and delivery date\n" );

        System.out.println ( "Sort by location:\n"+DeliverySystem.getPachetSortedByDeliveryLocation () );
        System.out.println ( "\nSort by date:\n"+DeliverySystem.getPachetSortedByDeliveryDate () );

        deliverySystem.calculateDelivery ( pachete );
        Thread thread1 = new Thread ( new DeliverySystem ( "Turda", "20.11.2017", 30, 2000, 2 ) );
        thread1.start ();
        Thread thread2 = new Thread ( new DeliverySystem ( "Oradea", "20.11.2017", 150, 2500, 3 ) );
        thread2.start ();
        Thread thread3 = new Thread ( new DeliverySystem ( "Turda", "22.11.2017", 30, 2800, 4 ) );
        thread3.start ();
        try {
            thread1.join ();
            thread2.join ();
            thread3.join ();
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }
    }
}





