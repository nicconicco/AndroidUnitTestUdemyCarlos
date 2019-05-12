package com.example.androidunittestudemycarlos.mockito.exercicio5.domain;

public interface UsersCache {

    void cacheUser(User user);

    User getUser(String userId);

}