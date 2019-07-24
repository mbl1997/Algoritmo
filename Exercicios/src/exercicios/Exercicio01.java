/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;
import java.util.Scanner;
/**
 *
 * @author marib
 */


/*
 * 1.	Ler dois números N1 e N2 (nesta ordem) e imprimir as 
 * variáveis N1 e N2, nesta ordem (ordem de digitação).
 */


public class Exercicio01 {
     public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
		int n1;
		int n2;
                
System.out.print("Digite n1: ");
		n1 = entrada.nextInt();
		System.out.print("Digite n2: ");
		n2 = entrada.nextInt();
		
		System.out.print("n1= "+n1+" e n2= "+n2);
		
	}// final do main
}// final da classe
