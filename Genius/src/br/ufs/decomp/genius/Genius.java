/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufs.decomp.genius;

import br.ufs.decomp.genius.regra.Controlador;
import java.util.List;
import java.util.Scanner;
import javax.swing.text.html.HTML;

/**
 *
 * @author yagoliveira92
 */
public class Genius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        int opcao = 0;
        do {
            System.out.println("Genius");
            System.out.println("---------------------------");
            System.out.println("1 - Jogar");
            System.out.println("2 - Sair");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    jogo();

                    break;
                case 2:

                    break;
                case 3:
                    Thread.sleep(3000);
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 2);
        System.out.println("Jogo encerrado.");
    }

    public static void jogo() throws InterruptedException {
        Controlador controlador = new Controlador(36);
        List<Integer> sequencia = controlador.getSequencia();

        int i;
        int j = 0;
        String sequenciaParcial = new String();
        String sequenciaUsuario = new String();
        Scanner input = new Scanner(System.in);

        do {
            for (i = 0; i < sequencia.size(); i++) {
                sequenciaParcial = sequenciaParcial.concat(Integer.toString(sequencia.get(i)));
                System.out.println(sequenciaParcial);
                Thread.sleep(3000);
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("Qual foi o número?");
                sequenciaUsuario = input.next();
                if (! sequenciaUsuario.equals(sequenciaParcial)) {
                    System.out.println("ERROU!");
                    System.out.println("Você digitou "+sequenciaUsuario+" e era "+sequenciaParcial);
                    sequencia.clear();
                    j = 1;
                }

            }
        } while (j == 0);

    }

}

/**
 * boolean fim = false; while (!fim) {
 *
 * controlador.getSequencia(); String digitado = "1,3,4,2,1,1,2"; String[]
 * numeros = digitado.split(","); System.out.println("acabou"); fim = true; } }
 *
 * }*
 */
