package com.hemocentro.domain.pedido.acao;

import com.hemocentro.domain.pedido.Pedido;

public class notificaHemocentro implements AcaoAposGerarPedido{

    @Override
    public void ExecutarAcao(Pedido pedido) {
        System.out.println("Notificando hemocentro");
    }
    
}
