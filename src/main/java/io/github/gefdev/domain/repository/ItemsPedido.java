package io.github.gefdev.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.gefdev.domain.entity.ItemPedido;

public interface ItemsPedido extends JpaRepository<ItemPedido, Integer> {
}
