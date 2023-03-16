package com.example.rickandmortyapi;

import java.util.List;

public record RickAndMortyApiResponse(
        RickAndMortyNumbers info,
        List<RickAndMortyCharacter> results
) {
}
