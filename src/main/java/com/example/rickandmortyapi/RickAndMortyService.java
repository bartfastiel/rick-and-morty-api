package com.example.rickandmortyapi;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.Objects;

@Service
public class RickAndMortyService {

    private final WebClient client = WebClient.create("https://rickandmortyapi.com/api/");

    public List<RickAndMortyCharacter> getAll() {

        ResponseEntity<RickAndMortyApiResponse> responseEntity = client.get()
                .uri("/character")
                .retrieve()
                .toEntity(RickAndMortyApiResponse.class)
                .block();

        var body = Objects.requireNonNull(responseEntity).getBody();
        return Objects.requireNonNull(body).results();
    }
}
