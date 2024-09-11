package com.hemocentro.domain.laboratorio;

import java.util.List;

import com.hemocentro.domain.doacao.Doacao;
import com.hemocentro.domain.laboratorio.processamento.Aprovado;


public class Laboratorio {
   private List<Doacao> estoque; 
   private String nome;
   private Processamento processamento;

   public Laboratorio(){
      
   }

   public void receberBolsa(Doacao doacao, boolean processamento, boolean testeAdicionais){
        this.processamento = new Processamento(processamento, testeAdicionais);
        this.processamento.fazerProcessamento();
        if (this.processamento.getSituacaoProcessamento() == new Aprovado()){
            estoque.add(doacao);
        } 
   }

   

  

}
