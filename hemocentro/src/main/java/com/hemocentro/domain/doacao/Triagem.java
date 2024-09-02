package com.hemocentro.domain.doacao;

import com.hemocentro.domain.doacao.triagem.EmAnalise;
import com.hemocentro.domain.doacao.triagem.Finalizado;
import com.hemocentro.domain.doacao.triagem.SituacaoTriagem;

public class Triagem {
    private SituacaoTriagem situacao;
    private double nivelHemogloblina;
    private boolean doencas;
    private PressaoArterial pressaoArterial;

    public Triagem(double nivelHemogloblina, boolean doencas){
        this.nivelHemogloblina = nivelHemogloblina;
        this.doencas = doencas;
        this.situacao =  new EmAnalise();
    }

    public void aprovar(){
        this.situacao.aprovar(this);
    }

    public void reprovar(){
        this.situacao.reprovar(this);
    }

    public void finalizar(){
        this.situacao.finalizar(this);
    }

    public void setSituacao(SituacaoTriagem situacao){
        this.situacao = situacao;
    }

    public SituacaoTriagem getSituacao(){
        return situacao;
    }

    public boolean isFinalizado(){
        return situacao instanceof Finalizado;
    }

    public void fazerTriagem(){
        if (this.doencas == false && this.nivelHemogloblina <= 17.0){
            aprovar();
        } else {
            reprovar();}
    }


}
