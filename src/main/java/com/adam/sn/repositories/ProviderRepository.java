package com.adam.sn.repositories;

import com.adam.sn.models.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProviderRepository extends JpaRepository<Provider,String> {
}
