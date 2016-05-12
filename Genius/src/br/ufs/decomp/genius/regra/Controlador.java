/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufs.decomp.genius.regra;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Yago Oliveira
 */
public class Controlador {

    private int tamanhoMaximo;
    private List<Integer> sequenciaGenius;
    private List<Integer> sequenciaParcial;
    private int posicao;

    public Controlador(int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
        gerarSequencia();
        sequenciaParcial = new ArrayList<>();
        posicao = 0;
    }

    private void gerarSequencia() {
        Random random = new Random();
        sequenciaGenius = new ArrayList<>();
        for (int i = 0; i < tamanhoMaximo; i++) {
            int numero = random.nextInt(4) + 1;
            sequenciaGenius.add(numero);
        }
    }
    
    public Integer getProximaSequencia() {
        if (posicao < sequenciaGenius.size() - 1) {
            posicao++;
            return sequenciaGenius.get(posicao);
        } else {
            return null;
        }
        
    }

}
