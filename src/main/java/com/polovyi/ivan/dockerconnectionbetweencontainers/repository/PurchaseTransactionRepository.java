package com.polovyi.ivan.dockerconnectionbetweencontainers.repository;

import com.polovyi.ivan.dockerconnectionbetweencontainers.entity.PurchaseTransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseTransactionRepository extends JpaRepository<PurchaseTransactionEntity, String> {

}
