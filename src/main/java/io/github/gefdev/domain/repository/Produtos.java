package io.github.gefdev.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.gefdev.domain.entity.Produto;

public interface Produtos extends JpaRepository<Produto,Integer> {
}
