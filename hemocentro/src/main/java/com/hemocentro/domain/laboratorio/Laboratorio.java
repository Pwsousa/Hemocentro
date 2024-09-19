package com.hemocentro.domain.laboratorio;

import java.util.List;

import com.hemocentro.domain.doacao.Doacao;
import com.hemocentro.domain.doador.Doador;
import com.hemocentro.domain.doador.TipoSanguineo;
import com.hemocentro.domain.hospital.Hospital;
import com.hemocentro.domain.laboratorio.processamento.Aprovado;
import com.hemocentro.domain.pedido.Pedido;


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

   public void receberPedido(Hospital hospital, Pedido pedido){
       
   }

   public void consultanoBanco(TipoSanguineo tipoSanguineo){
      this.estoque.contains(tipoSanguineo);
      this.estoque.iterator();
   }
  

}
