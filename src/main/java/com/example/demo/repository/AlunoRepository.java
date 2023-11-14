package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Aluno;

public interface AlunoRepository  extends JpaRepository<Aluno, Long>{
    
}
