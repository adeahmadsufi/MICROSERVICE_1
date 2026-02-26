package com.ade.produk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ade.produk.model.Produk;

@Repository
public interface ProdukRepository extends JpaRepository<Produk, Long> {
    
}
