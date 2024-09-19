package com.hemocentro.domain.pedido;

import com.hemocentro.domain.doador.TipoSanguineo;
import com.hemocentro.domain.hospital.Hospital;

public class Pedido {
    private TipoSanguineo tipoSanguineo;
    private int quantidade;
    private Hospital hospital;

    public Pedido(TipoSanguineo tipoSanguineo, int quantidade, Hospital hospital){
        this.hospital = hospital;
        this.quantidade = quantidade;
        this.tipoSanguineo = tipoSanguineo;
    }

}
