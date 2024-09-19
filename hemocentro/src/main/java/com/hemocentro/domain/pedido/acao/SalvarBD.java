package com.hemocentro.domain.pedido.acao;

import com.hemocentro.domain.pedido.Pedido;

public class SalvarBD implements AcaoAposGerarPedido{

    @Override
    public void ExecutarAcao(Pedido pedido) {
        System.out.println("Salvando no banco de dados");
    }
    
}
