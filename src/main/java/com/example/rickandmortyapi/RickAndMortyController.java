package com.example.rickandmortyapi;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/characters")
@RequiredArgsConstructor
public class RickAndMortyController {

    private final RickAndMortyService service;

    @GetMapping
    List<RickAndMortyCharacter> getAll() {
        return service.getAll();
    }

    @GetMapping("/random")
    RickAndMortyCharacter getRandom() {
        return service.getRandom();
    }
}
