package com.portfoliobackend.portfoliobackend.repository;

import com.portfoliobackend.portfoliobackend.model.AcercaDe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcercaDeRepository extends JpaRepository<AcercaDe,Long> {
}
