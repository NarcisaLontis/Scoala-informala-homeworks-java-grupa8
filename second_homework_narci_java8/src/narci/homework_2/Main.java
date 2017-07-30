package narci.homework_2;
/**
 * Created by Narcisa
 * Implement a bubble sort algorithm to sort an array of SalesRepresentative objects in descending order.
 */
import static narci.homework_2.BubbleSortDescendingOrder.bubbleSort;

public class Main {

    public static void main ( String[] args ) {

        //create an int array we want to sort using bubble sort algorithm
      String[] name={"SalesRepresentative1","SalesRepresentative2","SalesRepresentative3","SalesRepresentative4"};

        int SalesRepresentative1 = 10 * 500;   /*10 sales with a quota of 500*/
        int SalesRepresentative2 = 7 * 800;    /*7 sales with a quota of 800*/
        int SalesRepresentative3 = 15 * 1000;  /*15 sales with a quota of 1000*/
        int SalesRepresentative4 = 11 * 200;   /*11 sales with a quota of 200*/
        int[] intSalesRepresentative = new int[]{SalesRepresentative1, SalesRepresentative2, SalesRepresentative3,
                SalesRepresentative4};

        //sort an array in descending order using bubble sort algorithm
        bubbleSort ( intSalesRepresentative, name);


        //print array after sorting using bubble sort algorithm
        System.out.println ( "Array of Sales Representative After Bubble Sort" );
        for (int i = 0; i < intSalesRepresentative.length; i++) {
            System.out.print ( name[i] + ":"+ intSalesRepresentative[ i ] + "   " +"  " );
        }

    }
}

