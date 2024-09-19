package com.hemocentro.domain.relatorio;

import java.util.List;

import com.hemocentro.domain.doacao.Doacao;

public class Relatorio {
    private String descricao;
    private List<Doacao> listaDoacoes;


    public Relatorio(List<Doacao> listaDoacaos){
        this.listaDoacoes = listaDoacoes;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

}
