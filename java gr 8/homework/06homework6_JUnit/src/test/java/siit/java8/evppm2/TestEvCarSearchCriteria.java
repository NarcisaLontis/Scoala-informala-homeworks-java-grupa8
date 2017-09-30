package siit.java8.evppm2;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import siit.java8.evppm2.domain.*;
import siit.java8.evppm2.repository.EvCarSearch;
import siit.java8.evppm2.repository.EvCarSearchRepository;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class TestEvCarSearchCriteria {
    @Test
    public void testHasFastCharging ( ) throws Exception {
    }

    private EvCarSearch evCarSearch = new EvCarSearch ();

    @Before
    public void init ( ) {
        EvCarSearchRepository evCarSearchRepositoryMock = Mockito.mock ( EvCarSearchRepository.class );
        evCarSearch.EvCarSearchRepository ( evCarSearchRepositoryMock );

        List<EvCar> dummyList = new ArrayList<EvCar> ();
        when ( evCarSearchRepositoryMock.search ( any ( SearchCriteria.class ) ) ).thenReturn ( dummyList );
    }

    @Test
    public void testEvCarSearch() {

        SearchCriteria searchCriteria = new SearchCriteria () {
            @Override
            public String buildCriteria ( Object[] characteristics ) {
                return null;
            }
        };

        int foundCars = evCarSearch.search(searchCriteria, evCarSearch );

        assertNotEquals(null, foundCars);
    }

    @Test
    public void testStockCopy ( ) {
        Stock stock1 = new Stock ( new EvCar (), 4, 22000 );
        Stock stock2 = new Stock ();

        stock2.copy ( stock1, new Dealership ( "", new Stock[]{stock1, stock2} ) );

        assertEquals ( true, stock1.getEvCarPrice () == stock2.getEvCarPrice () );
        assertEquals ( true, stock1.getNumberOfEvCars () == stock2.getNumberOfEvCars () );
    }
    @Test
public void testList(){



}



    }




