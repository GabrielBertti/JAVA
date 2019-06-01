/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contagemregressiva;

import java.util.Scanner;

/**
 *
 * @author NoteP000
 */
public class ContagemRegressiva_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int valorInicial;
        do{
            System.out.println("valor iniciaal>0");
            valorInicial= teclado.nextInt();
        }while(valorInicial<=0);
        
        int contador = valorInicial;//Contador e valor inicial
        int valorFinal=0;
        int passo = 1;
        while(contador > valorFinal){//valor final = 0
            System.out.println(contador);
            contador=contador -passo;//atualização do contador com passo
                                // passo é decremento de um 
            Thread.sleep(1000);//1000ms = 1s
        }
        System.out.println("Explodiu");
        for (int i = valorInicial; i > valorFinal; i=i - passo) {
            System.out.println(i);
            Thread.sleep(500);
            
        }
        System.out.println("Explodiu");
    }
    
}
