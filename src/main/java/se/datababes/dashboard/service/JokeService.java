package se.datababes.dashboard.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import se.datababes.dashboard.dto.Joke;

@Service
public class JokeService {
    
    private final RestTemplate restTemplate = new RestTemplate();

    public Joke getJoke() {
        String url = "https://icanhazdadjoke.com/";

        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", "application/json");
        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<Joke> response = restTemplate.exchange(url, HttpMethod.GET, entity, Joke.class);
        return response.getBody();
    }
}
