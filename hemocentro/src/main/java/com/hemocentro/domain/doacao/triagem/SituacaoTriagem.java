package com.hemocentro.domain.doacao.triagem;

import com.hemocentro.domain.doacao.Doacao;
import com.hemocentro.domain.doacao.Triagem;
import com.hemocentro.exception.DomainException;

public abstract class SituacaoTriagem {
    
    public void aprovar(Triagem triagem){
        throw new DomainException("Triagem nao pode ser aprovada");
    }

    public void reprovar(Triagem triagem){
        throw new DomainException("Triagem nao pode ser reprovada");
    }

    public void finalizar(Triagem triagem){
        throw new DomainException("Triagem nao pode ser finalizada");
    }

    
}
