package com.hemocentro;

import java.util.Calendar;
import java.util.Calendar.Builder;

import com.hemocentro.domain.doacao.Triagem;
import com.hemocentro.domain.doacao.triagem.SituacaoTriagem;
import com.hemocentro.domain.doador.Doador;
import com.hemocentro.domain.doador.Endereco;
import com.hemocentro.domain.doador.TipoSanguineo;

public class Main {
    public static void main(String[] args) {
        Calendar c = new Calendar.Builder().setCalendarType("iso8601")
                    .setWeekDate(2000, 1, 1).build();
        Endereco e = new Endereco("123", "123","123","123","123", "123", "123");
        
        Doador d = new Doador("12345678912", "Pedro", c, TipoSanguineo.B, e, "123456789");

        System.out.println(d);

        Triagem t = new Triagem(16.9,true);
        
        t.fazerTriagem();
        System.out.println(t.getSituacao());

    }
}