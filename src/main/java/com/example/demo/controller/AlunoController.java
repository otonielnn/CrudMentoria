package com.example.demo.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Aluno;
import com.example.demo.service.AlunoService;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
    
    private AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @PostMapping("/criarAluno")
    public ResponseEntity criarAluno(@RequestBody Aluno aluno) {
        var request = alunoService.criar(aluno);
        return ResponseEntity.ok(request);
    }

    @DeleteMapping("/deletarAluno/{id}")
    public void deletarAluno(@PathVariable Long id) {
        alunoService.deletar(id);
    }

    @GetMapping("/buscarAluno/{id}")
    public ResponseEntity buscarAluno(@PathVariable Long id) {
        var request = alunoService.buscar(id);
        return ResponseEntity.ok(request);
    }
}
