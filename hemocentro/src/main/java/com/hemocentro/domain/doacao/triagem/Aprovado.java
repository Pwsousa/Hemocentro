package com.hemocentro.domain.doacao.triagem;

import com.hemocentro.domain.doacao.Doacao;
import com.hemocentro.domain.doacao.Triagem;

public class Aprovado extends SituacaoTriagem{
    @Override
    public void finalizar(Triagem triagem){
        triagem.setSituacao(new Finalizado());
    }
}
