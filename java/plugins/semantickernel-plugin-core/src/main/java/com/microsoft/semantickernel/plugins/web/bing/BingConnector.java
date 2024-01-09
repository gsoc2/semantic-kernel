package com.microsoft.semantickernel.plugins.web.bing;

import java.util.List;

import com.azure.core.http.HttpClient;

import reactor.core.publisher.Mono;

public class BingConnector {    

    private final String apiKey;
    private final HttpClient httpClient;
    public BingConnector(String apiKey, HttpClient httpClient) {
        this.apiKey = apiKey;
        this.httpClient = httpClient;
    }

    public Mono<List<String>> searchAsync(String query, int count, int offset) {
        return Mono.error(() -> new UnsupportedOperationException("Not implemented yet"));
    }

}
