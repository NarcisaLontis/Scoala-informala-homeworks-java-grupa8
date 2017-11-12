package ev.purchase.program.domain;

import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.List;

/**
 * Created by Narci on 10/09/2017
 */
public class Stock implements List {
    public static Comparator<? super Object> SortByPrice;
    public static Comparator<? super Object> SortByRangeByCharge;
    public static Comparator<? super Object> SortByHorsePower;
    private Dealership dealership;
    private EvCar evCarType;
    private int numberOfEvCars;
    private float price;
    private EvCar evCar;

    public Stock ( ) {
        this.dealership = dealership;
        this.evCarType = evCarType;
        this.numberOfEvCars = numberOfEvCars;
        this.price = price;
    }

    public Stock ( EvCar evCar, int i, int i1 ) {
        this.evCarType = null;
        this.numberOfEvCars = 0;
        this.price = 0;
    }


    public void copy ( Stock stock, Dealership dealership ) {
        this.evCarType = new EvCar ();
        this.evCarType.copy ( stock.evCarType );
        this.numberOfEvCars = stock.numberOfEvCars;
        this.price = stock.price;
        this.dealership = dealership;
    }

    public EvCar getEvCarType ( ) {
        return evCarType;
    }

    public int getNumberOfEvCars ( ) {
        return numberOfEvCars;
    }

    public float getEvCarPrice ( ) {
        return price;
    }

    public String getEvCarDealership ( ) {
        return String.valueOf ( dealership );
    }

    public String getManufacturer ( ) {
        return evCarType.getManufacturer ();
    }

    public String getEvCarName ( ) {
        return evCarType.getName ();
    }

    public boolean getIsItNew ( ) {
        return evCarType.getIsItNew ();
    }

    public EvCar getEvCar ( ) {
        return evCar;
    }


    @Override
    public int size ( ) {
        return 0;
    }

    @Override
    public boolean isEmpty ( ) {
        return false;
    }

    @Override
    public boolean contains ( Object o ) {
        return false;
    }

    @NotNull
    @Override
    public Iterator iterator ( ) {
        return null;
    }


    @NotNull
    @Override
    public Object[] toArray ( ) {
        return new Object[ 0 ];
    }

    @NotNull
    @Override
    public Object[] toArray ( @NotNull Object[] a ) {
        return new Object[ 0 ];
    }

    @Override
    public boolean add ( Object o ) {
        return false;
    }

    @Override
    public boolean remove ( Object o ) {
        return false;
    }

    @Override
    public boolean addAll ( @NotNull Collection c ) {
        return false;
    }

    @Override
    public boolean addAll ( int index, @NotNull Collection c ) {
        return false;
    }

    @Override
    public void clear ( ) {

    }

    @Override
    public Object get ( int index ) {
        return null;
    }

    @Override
    public Object set ( int index, Object element ) {
        return null;
    }

    @Override
    public void add ( int index, Object element ) {

    }

    @Override
    public Object remove ( int index ) {
        return null;
    }

    @Override
    public int indexOf ( Object o ) {
        return 0;
    }

    @Override
    public int lastIndexOf ( Object o ) {
        return 0;
    }

    @NotNull
    @Override
    public ListIterator listIterator ( ) {
        return null;
    }

    @NotNull
    @Override
    public ListIterator listIterator ( int index ) {
        return null;
    }

    @NotNull
    @Override
    public List subList ( int fromIndex, int toIndex ) {
        return null;
    }

    @Override
    public boolean retainAll ( @NotNull Collection c ) {
        return false;
    }

    @Override
    public boolean removeAll ( @NotNull Collection c ) {
        return false;
    }

    @Override
    public boolean containsAll ( @NotNull Collection c ) {
        return false;
    }


}





