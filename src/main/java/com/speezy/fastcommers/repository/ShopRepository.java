package com.speezy.fastcommers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.speezy.fastcommers.entity.Shop;

@Repository
public interface ShopRepository extends JpaRepository<Shop, Long> {
    // Custom methods if needed
}
