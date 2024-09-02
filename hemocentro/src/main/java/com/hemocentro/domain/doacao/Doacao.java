package com.hemocentro.domain.doacao;

import java.util.Calendar;
import java.util.List;
import java.util.Random;

import com.hemocentro.domain.doacao.triagem.EmAnalise;
import com.hemocentro.domain.doacao.triagem.Finalizado;
import com.hemocentro.domain.doacao.triagem.SituacaoTriagem;

public class Doacao {
    private String id;
    private Triagem triagem;
    private double volumeSangue;
    private TipoBolsa listaBolsas;
    private Calendar calendar;

    public Doacao(Triagem triagem){
        
    }


}
