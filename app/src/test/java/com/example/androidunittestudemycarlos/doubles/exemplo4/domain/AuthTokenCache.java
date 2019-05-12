package com.example.androidunittestudemycarlos.doubles.exemplo4.domain;

public interface AuthTokenCache {

    void cacheAuthToken(String authToken);

    String getAuthToken();
}