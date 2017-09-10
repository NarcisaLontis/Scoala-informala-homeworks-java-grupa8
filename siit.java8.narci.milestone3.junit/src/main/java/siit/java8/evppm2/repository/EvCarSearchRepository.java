package siit.java8.evppm2.repository;

import siit.java8.evppm2.domain.EvCar;
import siit.java8.evppm2.domain.SearchCriteria;

import java.util.List;
/**
 * Created by Narci on 10/09/2017
 */
public interface EvCarSearchRepository {

    List<EvCar> search ( SearchCriteria carSearchCriteria );


}