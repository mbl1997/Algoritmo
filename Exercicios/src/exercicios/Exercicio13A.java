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
public class Exercicio13A {
    
public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		int i;
		int num;
		
		for(i=0; i<3; i++){
			System.out.print("Digite um número: ");
			num = e.nextInt();
			
			if (num <=10) System.out.println("F1");
			else if(num <= 100) System.out.println("F2");
			else System.out.println("F3");
		}// final do for
		System.out.println("FIM");
	}// final do main
}// final da classe

