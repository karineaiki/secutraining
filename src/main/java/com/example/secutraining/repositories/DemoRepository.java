package com.example.secutraining.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.secutraining.entities.DemoEntity;

@Repository
public interface DemoRepository extends JpaRepository<DemoEntity, String> {

}