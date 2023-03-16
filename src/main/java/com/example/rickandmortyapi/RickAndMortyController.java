package com.example.rickandmortyapi;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class RickAndMortyController {

    private final RickAndMortyService service;

    @GetMapping("/characters")
    List<RickAndMortyCharacter> getAll() {
        return service.getAll();
    }

    @GetMapping("/characters/random")
    RickAndMortyCharacter getRandom() {
        return service.getRandom();
    }

    @GetMapping("/speciesstatistic/{species}")
    int getStatistic(@PathVariable String species) {
        return service.getStatistic(species);
    }
}
