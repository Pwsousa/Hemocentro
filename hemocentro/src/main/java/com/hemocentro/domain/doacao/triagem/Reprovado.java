package com.hemocentro.domain.doacao.triagem;

import com.hemocentro.domain.doacao.Triagem;

public class Reprovado extends SituacaoTriagem{
    @Override
    public void finalizar(Triagem triagem){
        triagem.setSituacao(new Finalizado());
    }
}
