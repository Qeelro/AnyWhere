package com.example.anywhere.repository;

import com.example.anywhere.model.Happening;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HappeningRepository extends JpaRepository<Happening, Long> {
}
