package com.example.androidunittestudemycarlos.mockito.exercicio5.domain;

import com.example.androidunittestudemycarlos.doubles.exemplo4.domain.NetworkErrorException;

public interface UserProfileHttpEndpointSync {

    /**
     * Get user's profile from the server
     * @return the aggregated result
     * @throws NetworkErrorException if operation failed due to network error
     */
    EndpointResult getUserProfile(String userId) throws NetworkErrorException;

    enum EndpointResultStatus {
        SUCCESS,
        AUTH_ERROR,
        SERVER_ERROR,
        GENERAL_ERROR
    }

    class EndpointResult {
        private final EndpointResultStatus mStatus;
        private final String mUserId;
        private final String mFullName;

        public EndpointResult(EndpointResultStatus status, String userId, String fullName, String imageUrl) {
            mStatus = status;
            mUserId = userId;
            mFullName = fullName;
        }

        public EndpointResultStatus getStatus() {
            return mStatus;
        }

        public String getFullName() {
            return mFullName;
        }

    }
}