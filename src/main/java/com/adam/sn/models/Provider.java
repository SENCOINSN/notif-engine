package com.adam.sn.models;

import com.adam.sn.models.commons.Auditable;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_provider")
@Getter
@Setter
public class Provider extends Auditable<String> {
    @Column(unique = true)
    private String name;
    private String description;
    private String url_provider;
    @Embedded
    private CredentialsProvider credentialsProvider;

}
