package com.hemocentro.domain.laboratorio;

import java.util.List;

import com.hemocentro.domain.doacao.Doacao;

public class Laboratorio {
   private List<Doacao> estoque; 
   private String nome;


   public void receberBolsa(Doacao doacao){
        estoque.add(doacao);
   }
}
