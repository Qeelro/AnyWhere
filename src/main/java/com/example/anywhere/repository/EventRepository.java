package com.example.anywhere.repository;

import com.example.anywhere.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

    @Query(value = "SELECT s FROM Event s WHERE s.nameEvent like %?1% ")
    List<Event> findByKeyword(@Param("keyword") String keyword);

}
