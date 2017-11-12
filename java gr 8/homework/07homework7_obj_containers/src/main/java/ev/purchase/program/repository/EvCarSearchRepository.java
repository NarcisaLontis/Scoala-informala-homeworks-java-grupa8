package ev.purchase.program.repository;

import ev.purchase.program.domain.EvCar;
import ev.purchase.program.domain.SearchCriteria;

import java.util.List;

/**
 * Created by Narci on 10/09/2017
 */
public interface EvCarSearchRepository {

    List<EvCar> search ( SearchCriteria carSearchCriteria );


}