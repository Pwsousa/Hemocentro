package com.hemocentro.domain.doador;

public class Endereco {
    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf; 

    public Endereco(String logradouro, String bairro, String cep, String numero, 
                    String complemento, String cidade, String uf) {
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cep = cep;
        this.uf = uf;
        this.cidade = cidade;
        this.complemento = complemento;
        this.numero = numero;
     }
}
