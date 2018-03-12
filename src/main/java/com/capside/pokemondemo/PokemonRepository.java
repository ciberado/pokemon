package com.capside.pokemondemo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ciber
 */
@Repository
public interface PokemonRepository extends CrudRepository<Pokemon, Integer> {
        

}
