package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity // especifica que a classe é uma entidade
@Getter @Setter // para o lombok gerar os gets e sets
@AllArgsConstructor // construtor com todos os argumentos
@NoArgsConstructor // construtor sem nenhum argumento
public class Aluno {
    @Id // fala que o próximo atributo é uma primary key
    private Long id;
    private String nome;
    private Integer idade;
}
