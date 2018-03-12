package com.capside.pokemondemo;

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
        long count = repository.count();
        int idx = (int) (Math.random() * count);
        Pokemon pokemon = repository.findOne(idx);
        return pokemon;
    }
}
