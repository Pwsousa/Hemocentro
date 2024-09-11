package com.hemocentro.domain.laboratorio.processamento;


import com.hemocentro.domain.laboratorio.Processamento;

public class EmAnalise extends SituacaoProcessamento{
    
    @Override
    public void aprovar(Processamento processamento){
        processamento.setSituacao(new Aprovado());
    }
    
    @Override
    public void reprovar(Processamento processamento){
        processamento.setSituacao(new Reprovado());
    }
}
