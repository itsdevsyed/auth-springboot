package com.speezy.fastcommers.repository;

import com.speezy.fastcommers.entity.DeliveryBoy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryBoyRepository extends JpaRepository<DeliveryBoy, Long> {
    // Custom methods if needed
}
