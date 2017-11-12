package ev.purchase.program.repository;

import ev.purchase.program.domain.SearchCriteria;

/**
 * Created by Narci on 9/24/2017
 */
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