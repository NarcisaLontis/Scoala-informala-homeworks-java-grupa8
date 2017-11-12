package ev.purchase.program.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Narci on 8/26/2017
 */

public class Main {


    public Main ( ) {
    }

    public static void main ( String[] args ) throws BonusException {
        Customer purchaser = new Customer ();
        PurchaseEvCar order;
        ArrayList<Dealership> dealerships = new ArrayList<Dealership> ();
        ArrayList<EvCar> evCars = new ArrayList<EvCar> ();
        int bonus = 0;
        setData ( purchaser, dealerships );
        purchaser.getList ();
        printList ( purchaser );
        Scanner in = new Scanner ( System.in );

        System.out.print ( "sort list based on the following: price (1), range per charge (2), horsepower (3) " );

        char c = in.next ().toLowerCase ().charAt ( 0 );
        switch (c) {
            case '1':
                Collections.sort ( purchaser.getList (), Stock.SortByPrice );
                break;
            case '2':
                Collections.sort ( purchaser.getList (), Stock.SortByRangeByCharge );
                break;
            case '3':
                Collections.sort ( purchaser.getList (), Stock.SortByHorsePower );
                break;
            default:
                break;
        }
        printList ( purchaser );

        System.out.print ( "Customer purchases car at the full price, yes/no " );
        if (in.next ().toLowerCase ().equals ( "yes" )) {
            System.out.print ( "select the car " );
            int no = in.nextInt ();
            if (no > 0 && no <= purchaser.getList ().size ()) {
                order = new PurchaseEvCar ( (Stock) purchaser.getList ().get ( --no ), purchaser );

                System.out.println ( order.toString () );
            }
        }
        System.out.print ( "Customer requests Green Bonus for an ev from the dealership " );
        if (in.next ().toLowerCase ().equals ( "y" )) {
            System.out.print ( "Please select the car " );
            int no = in.nextInt ();
            if (no > 0 && no <= purchaser.getList ().size ()) {
                Dealership bonusDealer = purchaser.getDealer ( purchaser.getList ().get ( --no ) );
                bonus = bonusDealer.getGreenBonus ( purchaser.getList ().get ( no ), purchaser.getName () );
                System.out.println ( "Bonus = " + bonus );
                order = new PurchaseEvCar ( purchaser.getList ().get ( no ), purchaser, bonus );
                System.out.println ( order.toString () );
            }
        }


        System.out.println ( "Test" );
        Dealership.initEvCars ( 0, 25000, "Volkswagen", "e-UP" );
        Dealership.initEvCars ( 1, 38000, "Volkswagen", "Volkswagen" );
        Dealership.initEvCars ( 2, 33000, "Renault", "Zoe" );
        Dealership.initEvCars ( 3, 40000, "BMW", "i3" );
        Dealership.initEvCars ( 4, 22000, "Smart", "FourTwo" );
        Dealership.initEvCars ( 5, 22700, "Smart", "FourFour" );
        Dealership.initEvCars ( 6, 23000, "Smart", "FourTwo Cabrio" );
        Dealership.initEvCars ( 7, 34000, "KIA", "Soul" );
        Dealership.initEvCars ( 8, 23900, "Hyundai", "Ioniq" );

        for (int i = 0; i < 9; ++i) {
            System.out.println ( Dealership.evCars[ i ].price + " " + Dealership.evCars[ i ].manufacturer + " " + Dealership.evCars[ i ].model + " " );
        }

        GovernmentFinacedProgram budget = new GovernmentFinacedProgram ();
        System.out.println ( "Government Finaced Program has this fixed budget : " + budget.getFixedBudget () );
        System.out.println ( "Government Finaced Program has this green bonus : " + budget.getGreenBonus () );

    }

    private static void printList ( Customer purchaser ) {

    }


    private static void setData ( Customer purchaser, ArrayList<Dealership> dealerships ) {


    }

}





