package com.hemocentro.domain.pedido;

import com.hemocentro.domain.doador.TipoSanguineo;
import com.hemocentro.domain.hospital.Hospital;

public class GeraPedido {
    private Hospital hospital;
    private int quantidade;
    private TipoSanguineo tipoSanguineo;
    
    public Hospital getHospital() {
        return hospital;
    }

    
    public TipoSanguineo getTipoSanguineo() {
        return tipoSanguineo;
    }

    

    public int getQuantidade() {
        return quantidade;
    }

    public GeraPedido(Hospital hospital, TipoSanguineo tipoSanguineo, int quantidade) {
        this.hospital = hospital;
        this.tipoSanguineo = tipoSanguineo;
        this.quantidade = quantidade;
    }

    
    
}
