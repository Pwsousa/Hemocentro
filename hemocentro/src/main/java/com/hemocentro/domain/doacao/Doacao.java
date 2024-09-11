package com.hemocentro.domain.doacao;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

import com.hemocentro.domain.doacao.triagem.EmAnalise;
import com.hemocentro.domain.doacao.triagem.Finalizado;
import com.hemocentro.domain.doacao.triagem.SituacaoTriagem;
import com.hemocentro.domain.doador.Doador;
import com.hemocentro.domain.laboratorio.Laboratorio;
import com.hemocentro.exception.DomainException;

public class Doacao {
    private String id;
    private Triagem triagem;
    private double volumeSangue;
    private TipoBolsa tipoBolsas;
    private Calendar calendar;

    public Doacao(Triagem triagem, TipoBolsa tipoBolsa, double volumeSangue){
        if (triagem.isFinalizado() == true){
            this.calendar = Calendar.getInstance();
            this.tipoBolsas = tipoBolsa;
            this.volumeSangue = volumeSangue;
            triagem.getDoador().novaDoacao(this);
        }
        else {
            throw new DomainException("Doacao nao pode ser finalizada");
        }
    }

    @Override
    public String toString() {
        return "Doacao [Data =" + calendar.getTime() + "]";
    }

    public void enviarParaAnalise(Laboratorio laboratorio){
        laboratorio.receberBolsa(this,true,true);
    }
}
