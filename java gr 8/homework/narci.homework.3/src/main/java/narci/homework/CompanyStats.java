/**
 * Created by Narcisa on 05/08/17.
 */
package narci.homework;

public class CompanyStats {
    static  SalesRepresentative [] company= new  SalesRepresentative[20];

    public static void main ( String[] args ) {

        company[ 0 ] = new SalesRepresentative ();
        company[ 0 ].name = "Alin";
        company[ 0 ].sales = 5000;
        company[ 0 ].department = 1;
        company[ 1 ] = new SalesRepresentative ();
        company[ 1 ].name = "Andrei";
        company[ 1 ].sales = 8000;
        company[ 1 ].department = 1;
        company[ 2 ] = new SalesRepresentative ();
        company[ 2 ].name = "Antoniu";
        company[ 2 ].sales = 15000;
        company[ 2 ].department = 1;
        company[ 3 ] = new SalesRepresentative ();
        company[ 3 ].name = "Alexandru";
        company[ 3 ].sales = 3000;
        company[ 3 ].department = 1;
        company[ 4 ] = new SalesRepresentative ();
        company[ 4 ].name = "Adrian";
        company[ 4 ].sales = 6000;
        company[ 4 ].department = 1;
        company[ 5 ] = new SalesRepresentative ();
        company[ 5 ].name = "Bogdan";
        company[ 5 ].sales = 2000;
        company[ 5 ].department = 2;
        company[ 6 ] = new SalesRepresentative ();
        company[ 6 ].name = "Benone";
        company[ 6 ].sales = 4000;
        company[ 6 ].department = 2;
        company[ 7 ] = new SalesRepresentative ();
        company[ 7 ].name = "Catalin";
        company[ 7 ].sales = 7000;
        company[ 7 ].department = 2;
        company[ 8 ] = new SalesRepresentative ();
        company[ 8 ].name = "Ciprian";
        company[ 8 ].sales = 5500;
        company[ 8 ].department = 2;
        company[ 9 ] = new SalesRepresentative ();
        company[ 9 ].name = "Costel";
        company[ 9 ].sales = 4500;
        company[ 9 ].department = 2;
        company[ 10 ] = new SalesRepresentative ();
        company[ 10 ].name = "Cosmin";
        company[ 10 ].sales = 6500;
        company[ 10 ].department = 3;
        company[ 11 ] = new SalesRepresentative ();
        company[ 11 ].name = "Cristian";
        company[ 11 ].sales = 7500;
        company[ 11 ].department = 3;
        company[ 12 ] = new SalesRepresentative ();
        company[ 12 ].name = "Claudiu";
        company[ 12 ].sales = 9000;
        company[ 12 ].department = 3;
        company[ 13 ] = new SalesRepresentative ();
        company[ 13 ].name = "Dan";
        company[ 13 ].sales = 17000;
        company[ 13 ].department = 3;
        company[ 14 ] = new SalesRepresentative ();
        company[ 14 ].name = "Darius";
        company[ 14 ].sales = 11000;
        company[ 14 ].department = 3;
        company[ 15 ] = new SalesRepresentative ();
        company[ 15 ].name = "Damian";
        company[ 15 ].sales = 9500;
        company[ 15 ].department = 4;
        company[ 16 ] = new SalesRepresentative ();
        company[ 16 ].name = "Dorel";
        company[ 16 ].sales = 11500;
        company[ 16 ].department = 4;
        company[ 17 ] = new SalesRepresentative ();
        company[ 17 ].name = "Eduard";
        company[ 17 ].sales = 13000;
        company[ 17 ].department = 4;
        company[ 18 ] = new SalesRepresentative ();
        company[ 18 ].name = "Emilian";
        company[ 18 ].sales = 10000;
        company[ 18 ].department = 4;
        company[ 19 ] = new SalesRepresentative ();
        company[ 19 ].name = "Marius";
        company[ 19 ].sales = 8100;
        company[ 19 ].department = 4;

        //Total sales for each department and thant Total sales of the Company from all 4 departements

        int TotalSales1 = 0;
        int department1 = 0;
        for (int i = 0; i < 5; i++) {
            TotalSales1 = company[ i ].sales + TotalSales1;
            department1 = company[ i ].department;
        }
        System.out.println ( "Total sales of department " + department1 + " : " + TotalSales1 );

        int TotalSales2= 0;
        int department2 = 0;
        for (int i = 5; i < 10; i++) {
        TotalSales2 = company[ i ].sales + TotalSales2;
        department2 = company[ i ].department;
    }
        System.out.println ( "Total sales of department " + department2 + " : " + TotalSales2 );

        int TotalSales3= 0;
        int department3 = 0;
        for (int i = 10; i < 15; i++) {
            TotalSales3 = company[ i ].sales + TotalSales3;
            department3 = company[ i ].department;
        }
        System.out.println ( "Total sales of department " + department3 + " : " + TotalSales3 );

        int TotalSales4= 0;
        int department4 = 0;
        for (int i = 15; i < 20; i++) {
            TotalSales4 = company[ i ].sales + TotalSales4;
            department4 = company[ i ].department;
        }
        System.out.println ( "Total sales of department " + department4 + " : " + TotalSales4 );
        System.out.println();
        int total = TotalSales1 + TotalSales2 + TotalSales3 + TotalSales4;
        System.out.println("Total sales of Company " +" : " + total);

        //most successful department with the most sales

        int[] sales= {TotalSales1, TotalSales2, TotalSales3, TotalSales4};
        int maxim = sales[0];
        for (int i = 0; i < 4; i++) {
            if (sales[i] > maxim) {
                maxim = sales[i];
            }
        }
        System.out.println();
        System.out.println("Most successful department with the most sales " + maxim );

        //the best sales representative
        SalesRepresentative best = new SalesRepresentative();
        best.sales = 0;
        for (int i = 0; i < 20; i++) {
            if (company[ i ].sales > best.sales) {
                best = company[i];
            }
        }
        System.out.println();
        System.out.println("The best sales representative is : " + best.name);
    }
}





