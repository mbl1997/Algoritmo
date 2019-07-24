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
public class Exercicio04 {
    
public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		int numero1, numero2, numero3;
		double media;
		
		System.out.print("Digite o primeiro número: ");
		numero1 = e.nextInt();
		System.out.print("Digite o segundo número: ");
		numero2 = e.nextInt();
		System.out.print("Digite o terceiro número: ");
		numero3 = e.nextInt();
		System.out.print("O resultado da soma é "+
		   (double)(numero1 + numero2+numero3)/3);
		
	}// final main
}// final classe


