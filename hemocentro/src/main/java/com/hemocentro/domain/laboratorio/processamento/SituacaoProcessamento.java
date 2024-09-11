package com.hemocentro.domain.laboratorio.processamento;



import com.hemocentro.domain.laboratorio.Processamento;
import com.hemocentro.exception.DomainException;

public abstract class SituacaoProcessamento {
    
    public void aprovar(Processamento processamento){
        throw new DomainException("Triagem nao pode ser aprovada");
    }

    public void reprovar(Processamento processamento){
        throw new DomainException("Triagem nao pode ser reprovada");
    }
}
