package siit.java8.evppm2.domain;



import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


/**
 * Created by Narci on 8/26/2017
 */

public class Customer {

    private String name;
    private String address;
    private String userId;
    private int founds;
    private Dealership[] dealer;


    private List list = new List () {
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

        @Override
        public Iterator iterator ( ) {
            return null;
        }

        @Override
        public Object[] toArray ( ) {
            return new Object[ 0 ];
        }

        @Override
        public Object[] toArray ( Object[] a ) {
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
        public boolean addAll ( Collection c ) {
            return false;
        }

        @Override
        public boolean addAll ( int index, Collection c ) {
            return false;
        }

        @Override
        public void clear ( ) {

        }

        @Override
        public boolean equals ( Object o ) {
            return false;
        }

        @Override
        public int hashCode ( ) {
            return 0;
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

        @Override
        public ListIterator listIterator ( ) {
            return null;
        }

        @Override
        public ListIterator listIterator ( int index ) {
            return null;
        }

        @Override
        public List subList ( int fromIndex, int toIndex ) {
            return null;
        }

        @Override
        public boolean retainAll ( Collection c ) {
            return false;
        }

        @Override
        public boolean removeAll ( Collection c ) {
            return false;
        }

        @Override
        public boolean containsAll ( Collection c ) {
            return false;
        }


    };

    public Customer ( String name ) {
        this.name = name;
    }

    public Customer ( ) {
    }

    public String getName ( ) {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public String getAddress ( ) {
        return address;
    }

    public void setAddress ( String address ) {
        this.address = address;
    }

    public String getUserId ( ) {
        return userId;
    }

    void setUserId ( String userId ) {
        this.userId = userId;
    }

    public void puchaseEvCar ( EvCar evCar ) {

    }
}

