package com.example.androidunittestudemycarlos.doubles.exercicio4;

import com.example.androidunittestudemycarlos.doubles.exemplo4.LoginUseCaseSync;
import com.example.androidunittestudemycarlos.doubles.exemplo4.domain.LoggedInEvent;
import com.example.androidunittestudemycarlos.doubles.exemplo4.domain.LoginHttpEndpointSync;
import com.example.androidunittestudemycarlos.doubles.exemplo4.domain.NetworkErrorException;
import com.example.androidunittestudemycarlos.doubles.exercicio4.networking.UserProfileHttpEndpointSync;
import com.example.androidunittestudemycarlos.doubles.exercicio4.user.User;
import com.example.androidunittestudemycarlos.doubles.exercicio4.user.UsersCache;

public class FetchUserProfileUseCaseSync {

    public enum UseCaseResult {
        SUCCESS,
        FAILURE,
        NETWORK_ERROR
    }

    private final UserProfileHttpEndpointSync mUserProfileHttpEndpointSync;
    private final UsersCache mUsersCache;

    public FetchUserProfileUseCaseSync(UserProfileHttpEndpointSync userProfileHttpEndpointSync,
                                       UsersCache usersCache) {
        mUserProfileHttpEndpointSync = userProfileHttpEndpointSync;
        mUsersCache = usersCache;
    }

    public UseCaseResult fetchUserProfileSync(String userId) {

        UserProfileHttpEndpointSync.EndpointResult endpointResult;
        try {
            endpointResult = mUserProfileHttpEndpointSync.getUserProfile(userId);
        } catch (NetworkErrorException e) {
            return UseCaseResult.NETWORK_ERROR;
        }

        if (isSuccessfulEndpointResult(endpointResult)) {
            mUsersCache.cacheUser(
                    new User(userId, endpointResult.getFullName(), endpointResult.getImageUrl()));
            return UseCaseResult.SUCCESS;
        } else {
            return UseCaseResult.FAILURE;
        }
    }

    private boolean isSuccessfulEndpointResult(UserProfileHttpEndpointSync.EndpointResult endpointResult) {
        return endpointResult.getStatus() == UserProfileHttpEndpointSync.EndpointResultStatus.SUCCESS;
    }
}