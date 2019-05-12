package com.example.androidunittestudemycarlos.doubles.exercicio4.user;

import android.support.annotation.Nullable;

public interface UsersCache {

    void cacheUser(User user);

    @Nullable
    User getUser(String userId);

}