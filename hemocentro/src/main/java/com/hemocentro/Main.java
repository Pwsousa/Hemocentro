package com.hemocentro;

import java.util.Calendar;
import java.util.Calendar.Builder;

import com.hemocentro.domain.Doador;
import com.hemocentro.domain.Endereco;
import com.hemocentro.domain.TipoSanguineo;

public class Main {
    public static void main(String[] args) {
        Calendar c = new Calendar.Builder().setCalendarType("iso8601")
                    .setWeekDate(2000, 1, 1).build();
        Endereco e = new Endereco("123", "123","123","123","123", "123", "123");
        
        Doador d = new Doador("12345678912", "Pedro", c, TipoSanguineo.B, e, "123456789");

        System.out.println(d);
    }
}