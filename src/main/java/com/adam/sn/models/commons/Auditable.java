package com.adam.sn.models.commons;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class Auditable<K> {
    @Id
    @Column(name="id")
    protected String id;

    @CreatedBy
    @JsonIgnore
    protected K createdBy;

    @CreationTimestamp
    @JsonIgnore
    protected LocalDateTime createdAt;

    @LastModifiedBy
    @JsonIgnore
    protected K lastModifiedBy;

    @UpdateTimestamp
    @JsonIgnore
    protected LocalDateTime lastModifiedAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public K getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(K createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public K getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(K lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public LocalDateTime getLastModifiedAt() {
        return lastModifiedAt;
    }

    public void setLastModifiedAt(LocalDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }
}
