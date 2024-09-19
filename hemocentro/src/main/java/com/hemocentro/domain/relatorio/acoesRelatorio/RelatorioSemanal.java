package com.hemocentro.domain.relatorio.acoesRelatorio;

import com.hemocentro.domain.relatorio.Relatorio;

public class RelatorioSemanal implements AcaoGeraRelatorio{

    @Override
    public void gereRelatorio(Relatorio relatorio) {
        System.out.println("Exibindo relatorio semanal");
    }
    
}
