package com.hemocentro.domain.doacao.triagem;


import com.hemocentro.domain.doacao.Triagem;


public class EmAnalise extends SituacaoTriagem{
    @Override
    public void aprovar(Triagem triagem){
        triagem.setSituacao(new Aprovado());
    }
    
    @Override
    public void reprovar(Triagem triagem){
        triagem.setSituacao(new Reprovado());
    }
}
