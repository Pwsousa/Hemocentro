package com.hemocentro.domain.doacao;

public class PressaoArterial {
    private double pdiastolica;
    private double psistolica;
    
    public PressaoArterial(double pdiastolica, double psistolica) {
        this.pdiastolica = pdiastolica;
        this.psistolica = psistolica;
    }

    public double getPdiastolica() {
        return pdiastolica;
    }

    public double getPsistolica() {
        return psistolica;
    }

    
}
