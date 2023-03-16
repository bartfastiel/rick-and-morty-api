package com.example.rickandmortyapi;

import java.util.List;

public record RickAndMortyApiResponse(
        List<RickAndMortyCharacter> results
) {
}
