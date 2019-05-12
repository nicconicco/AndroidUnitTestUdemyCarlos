package com.example.androidunittestudemycarlos.mockito.exercicio5.domain;

public class User {
    private final String mUserId;
    private final String mUsername;

    public User(String userId, String username) {
        mUserId = userId;
        mUsername = username;
    }

    public String getUserId() {
        return mUserId;
    }

    public String getUsername() {
        return mUsername;
    }
}