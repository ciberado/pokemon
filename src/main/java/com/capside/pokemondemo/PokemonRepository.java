package com.capside.pokemondemo;


import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ciber
 */
@Repository
public interface PokemonRepository extends CrudRepository<Pokemon, Integer> {
        
    @Query("select distinct(p.id) from Pokemon p")
    List<Integer> findDistinctId();

}
