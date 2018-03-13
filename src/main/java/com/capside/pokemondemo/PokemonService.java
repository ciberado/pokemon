package com.capside.pokemondemo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ciberado
 */
@Service
public class PokemonService {
    
    private final PokemonRepository repository;

    @Autowired
    public PokemonService(PokemonRepository repository) {
        this.repository = repository;
    }
    
    public Pokemon getRandomPokemon() {
        List<Integer> ids = repository.findDistinctId();
        int idx = (int) (Math.random() * ids.size());
        int id = ids.get(idx);
        Pokemon pokemon = repository.findOne(id);
        return pokemon;
    }
}
