package com.example.userservice.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SecretService {

    @Value("${userservice.vault.db-username}")
    private String dbUsername;

    @Value("${userservice.vault.db-password}")
    private String dbPassword;

    @Value("${userservice.vault.api-key}")
    private String apiKey;

    public String getDbUsername() {
        return dbUsername;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public String getApiKey() {
        return apiKey;
    }
}