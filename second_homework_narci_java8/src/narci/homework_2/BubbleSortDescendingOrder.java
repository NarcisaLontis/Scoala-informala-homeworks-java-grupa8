package narci.homework_2;
/**
 * Created by Narcisa
 * Implement a bubble sort algorithm to sort an array of SalesRepresentative objects in descending order.
 */


public class BubbleSortDescendingOrder {

        public static void bubbleSort ( int[] intArray, String [] name ) {

            int n = intArray.length;
            int temp = 0;
            String temp2="";

            for(int i=0; i < n; i++){
                for(int j=1; j < (n-i); j++){

                    if(intArray[j-1] < intArray[j]){
                        //swap the elements!
                        temp = intArray[j-1];
                        intArray[j-1] = intArray[j];
                        intArray[j] = temp;

                        temp2 = name[j-1];
                        name[j-1] = name[j];
                        name[j] = temp2;
                    }

                }
            }

        }
    }


