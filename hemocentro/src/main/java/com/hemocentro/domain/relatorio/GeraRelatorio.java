package com.hemocentro.domain.relatorio;

import java.util.Calendar;
import java.util.List;

import com.hemocentro.domain.doacao.Doacao;

public class GeraRelatorio {
    
    private String descricao;
    private List<Doacao> listDoacoes;
    private Calendar calendar;

    public GeraRelatorio(String descricao, List<Doacao> listDoacoes) {
        this.descricao = descricao;
        this.listDoacoes = listDoacoes;
        this.calendar = Calendar.getInstance();
    }

    public String getDescricao() {
        return descricao;
    }

    public List<Doacao> getListDoacoes() {
        return listDoacoes;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    
    
}
