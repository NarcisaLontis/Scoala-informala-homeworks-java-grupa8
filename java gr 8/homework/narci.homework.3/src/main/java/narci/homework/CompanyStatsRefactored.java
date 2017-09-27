/**
 * Created by Narcisa on 05/08/17.
 */
package narci.homework;

public class CompanyStatsRefactored {
    static  SalesRepresentative [] company= new  SalesRepresentative[20];

    public static void main ( String[] args ) {

        InitCompanyRepresentative( 0, "Alin", 5000, 1);
        InitCompanyRepresentative( 1, "Andrei", 8000, 1);
        InitCompanyRepresentative( 2, "Antoniu", 15000, 1);
        InitCompanyRepresentative( 3, "Alexandru", 3000, 1);
        InitCompanyRepresentative( 4, "Adrian", 6000, 1);
        InitCompanyRepresentative( 5, "Bogdan", 2000, 2);
        InitCompanyRepresentative( 6, "Benone", 4000, 2);
        InitCompanyRepresentative( 7, "Catalin", 7000, 2);
        InitCompanyRepresentative( 8, "Ciprian", 5500, 2);
        InitCompanyRepresentative( 9, "Costel", 4500, 2);
        InitCompanyRepresentative( 10, "Cosmin", 6500, 3);
        InitCompanyRepresentative( 11, "Cristian", 7500, 3);
        InitCompanyRepresentative( 12, "Claudiu", 9000, 3);
        InitCompanyRepresentative( 13, "Dan", 17000, 3);
        InitCompanyRepresentative( 14, "Darius", 11000, 3);
        InitCompanyRepresentative( 15, "Damian", 9500, 4);
        InitCompanyRepresentative( 16, "Dorel", 11500, 4);
        InitCompanyRepresentative( 17, "Eduard", 13000, 4);
        InitCompanyRepresentative( 18, "Emilian", 10000, 4);
        InitCompanyRepresentative( 19, "Marius", 8100, 4);

        // how much total sales has the company achieved
        int TotalSales = 0;
        for (int i = 0; i < 20; i++) {
            TotalSales = company[ i ].sales + TotalSales;
                   }
        System.out.println ( "The value of total sales of the company is : " + TotalSales );

        //the total sales for each department

        int department1Sales = 0;
        for (int i = 0; i < 5; i++) {
            department1Sales = company[ i ].sales + department1Sales;
        }
        System.out.println ( "Total sales of department 1 is : "+ department1Sales  );

        int department2Sales = 0;
        for (int i = 5; i < 10; i++) {
            department2Sales = company[ i ].sales + department2Sales;
        }
        System.out.println ( "Total sales of department 2 is : "+department2Sales  );

        int department3Sales  = 0;
        for (int i = 10; i < 15; i++) {
            department3Sales = company[ i ].sales + department3Sales ;
        }
        System.out.println ( "Total sales of department 3 is : "+department3Sales );

        int department4Sales = 0;
        for (int i = 15; i < 20; i++) {
            department4Sales = company[ i ].sales + department4Sales;
        }
        System.out.println ( "Total sales of department 4 is : "+department4Sales);

        //most successful department with the most sales

        int[] sales= new int[]{department1Sales, department2Sales, department3Sales, department4Sales};
        int maxim = sales[0];
        for (int i = 0; i < 4; i++) {
            if (sales[i] > maxim) {
                maxim = sales[i];
            }
        }
        System.out.println();
        System.out.println("Most successful department with the most sales is Department 4 with:  " + maxim );

        //the best sales representative

        SalesRepresentative bestSellerSalesRepresentative = getBestSellerSalesRepresentative();
        System.out.println("The best sales representative with most sales is "+ ": "+ bestSellerSalesRepresentative.name);
     }

    private static  SalesRepresentative  getBestSellerSalesRepresentative() {
        SalesRepresentative maxim = new SalesRepresentative ();
        maxim.sales = 0;
        for (int i = 0; i < 20; i++) {
            if (company[i].sales > maxim.sales) {
                maxim = company[i];
            }
        }
        return maxim;
    }

    private static void InitCompanyRepresentative ( int position, String name, int sales, int department ) {

        company[position] = new SalesRepresentative();
        company[position].name = name;
        company[position].sales = sales;
        company[position].department = department;
    }
 }
