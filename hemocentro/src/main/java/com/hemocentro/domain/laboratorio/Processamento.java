package com.hemocentro.domain.laboratorio;

import com.hemocentro.domain.laboratorio.processamento.EmAnalise;
import com.hemocentro.domain.laboratorio.processamento.SituacaoProcessamento;

public class Processamento {
    private SituacaoProcessamento situacaoProcessamento;
    private boolean testeAdicionais;
    private boolean processamento;

    public Processamento(boolean processamento, boolean testeAdicionais){
        this.situacaoProcessamento = new EmAnalise();
        this.processamento = processamento;
        this.testeAdicionais = testeAdicionais;
    }

    public void aprovar(){
        this.situacaoProcessamento.aprovar(this);
    }

    public void reprovar(){
        this.situacaoProcessamento.reprovar(this);
    }

    public void setSituacao(SituacaoProcessamento situacaoProcessamento){
        this.situacaoProcessamento = situacaoProcessamento;
    }

    public void fazerProcessamento(){
        if (this.processamento && this.testeAdicionais) {
           aprovar();
        }
        reprovar();
    }

    public SituacaoProcessamento getSituacaoProcessamento(){
        return this.situacaoProcessamento;
    }


}
