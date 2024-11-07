package com.adam.sn.models;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class CredentialsProvider {
    private String applicationId;
    private String clientId;
    private String secret;
    private String apiKey;
}
