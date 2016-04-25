/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufs.decomp.genius.regra;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yago Oliveira
 */
public class Controlador {

    private List<Integer> sequenciaGenius;
    private List<Integer> sequenciaJogador;

    public Controlador() {
        sequenciaGenius = new ArrayList<>();
        sequenciaJogador = new ArrayList<>();
    }

    public void reiniciarSequencia() {
        sequenciaGenius.clear();
        sequenciaJogador.clear();
    }

    public List<Integer> getSequenciaGenius() {
        return sequenciaGenius;
    }

    public List<Integer> getSequenciaJogador() {
        return sequenciaJogador;
    }
    
    public boolean validaSequencia(int botao){
        
        return false;
    }
    

}
