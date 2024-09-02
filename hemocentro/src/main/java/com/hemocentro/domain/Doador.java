package com.hemocentro.domain;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Doador {
    
    private String cpf;
    private String nome;
    private Calendar dataNascimento;
    private TipoSanguineo tipoSanguineo;
    // private char fatorRH;
    private Endereco endereco;
    private String telefone;
    private List<Doacao> listaDoacoes;


    public Doador(String cpf, String nome, Calendar dataNascimento, 
                  TipoSanguineo tipoSanguineo, Endereco endereco, String telefone){
        
        String regex = "(\\d{3})(\\d{3})(\\d{3})(\\d{2})";
        this.cpf = cpf.replaceAll(regex, "$1.$2.$3-$4");
        this.nome = nome;   
        this.dataNascimento = dataNascimento;
        this.tipoSanguineo = tipoSanguineo;
        this.endereco = endereco;
        this.telefone = telefone;
        this.listaDoacoes = new ArrayList<>();

    }


    @Override
    public String toString() {
        return "Doador [cpf=" + cpf + ", nome=" + nome + ", dataNascimento=" + dataNascimento.getTime() + ", tipoSanguineo="
                + this.tipoSanguineo + ", listaDoacoes=" + listaDoacoes + "]";
    }
    


}
