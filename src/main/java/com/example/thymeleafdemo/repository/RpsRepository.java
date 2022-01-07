package com.example.thymeleafdemo.repository;

import com.example.thymeleafdemo.model.RpsGame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RpsRepository extends JpaRepository<RpsGame,Integer> {
    List<RpsGame> findByResult(String id);
}
