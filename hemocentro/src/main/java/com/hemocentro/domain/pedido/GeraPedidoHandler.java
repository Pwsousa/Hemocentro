package com.hemocentro.domain.pedido;

import java.util.List;

import com.hemocentro.domain.pedido.acao.AcaoAposGerarPedido;

public class GeraPedidoHandler {
    private List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes){
        this.acoes = acoes;
    }

    public void execute(GeraPedido dados){
        Pedido pedido = new Pedido(dados.getTipoSanguineo(), dados.getQuantidade(),dados.getHospital());
        acoes.forEach(a -> a.ExecutarAcao(pedido));
    }
}
