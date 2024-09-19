package com.hemocentro.domain.hospital;

import java.util.ArrayList;
import java.util.List;

import com.hemocentro.domain.doador.TipoSanguineo;
import com.hemocentro.domain.laboratorio.Laboratorio;
import com.hemocentro.domain.pedido.Pedido;

public class Hospital {
    private String nome;
    private List<Pedido> listaPedidos; 
    private Laboratorio laboratorio;

    public Hospital(String nome, Laboratorio laboratorio){
        this.listaPedidos = new ArrayList<>();
        this.nome = nome;
        this.laboratorio = laboratorio; 
    }

    public void novoPedido(TipoSanguineo tipoSanguineo, int quantidade){
        Pedido pedido = new Pedido(tipoSanguineo,quantidade,this);
        this.laboratorio.receberPedido(this,pedido);
        listaPedidos.add(pedido);
    }
}
