package com.example.sayhello;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SayHelloRepository extends JpaRepository<Sayhello, Integer> {

//    List<Sayhello> findAll();
    
}
