package siit.java8.evppm2.repository;

import siit.java8.evppm2.domain.SearchCriteria;

public class EvCarSearch {


    public int search ( SearchCriteria criteria, EvCarSearch evCarSearch ) {
        System.out.println ( criteria.buildCriteria ( null ) );

        return evCarSearch.search ( criteria );
    }

    private int search ( SearchCriteria criteria ) {
        return 0;
    }

    public void EvCarSearchRepository ( EvCarSearchRepository evCarSearchRepositoryMock ) {
    }
}