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

/* 2.	Escreva um algoritmo que leia dois números que deverão 
 * ser colocados, respectivamente, nas variáveis VA e VB.  
 * O algoritmo deve, então, trocar os valores de VA por VB e 
 * vice-versa e mostrar o conteúdo destas variáveis.
 */

public class Exercicio02 {
    
public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int vA, vB;
		int aux1, aux2;
		System.out.print("Digite vA: ");
		vA = entrada.nextInt();
		System.out.print("Digite vB: ");
		vB = entrada.nextInt();

		System.out.print("vA= "+vB+"  vB= "+vA);

		aux1 = vA;
		aux2 = vB;
		vA = aux2;
		vB = aux1;
		
//		aux = vB;
//		vB = vA;
//		vA = aux;
		
//		System.out.print("vA= "+vA+"  vB= "+vB);
		
		
	}// final main
}// final classe
