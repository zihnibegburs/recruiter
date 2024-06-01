package com.crypto.client.remotive.client;

import com.crypto.client.remotive.dto.RemotiveJobResponseDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class RemotiveClient {
    private static final String API_URL = "https://remotive.com/api/remote-jobs?limit=5";

    public static RemotiveJobResponseDTO fetchRemoteJobs() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(API_URL))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 200) {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(response.body(), RemotiveJobResponseDTO.class);
        } else {
            throw new RuntimeException("Failed to fetch jobs: " + response.statusCode());
        }
    }
}