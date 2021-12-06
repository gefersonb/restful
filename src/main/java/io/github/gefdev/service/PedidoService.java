package io.github.gefdev.service;

import java.util.Optional;

import io.github.gefdev.domain.entity.Pedido;
import io.github.gefdev.domain.enums.StatusPedido;
import io.github.gefdev.rest.dto.PedidoDTO;

public interface PedidoService {
    Pedido salvar( PedidoDTO dto );
    Optional<Pedido> obterPedidoCompleto(Integer id);
    void atualizaStatus(Integer id, StatusPedido statusPedido);
}
