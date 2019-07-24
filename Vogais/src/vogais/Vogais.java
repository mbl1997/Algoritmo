/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vogais;
import java.util.Scanner;
/**
 *
 * @author marib
 */

    /**
     * Faça um algoritmo que leia uma frase de até 15 caracteres.

Após a digitação, mostre a quantidade de caracteres desta frase e,
se a quantidade for maior que 15 mostre a mensagem. "ERRO.".
após mostre a quantidade de vogais existentes na frase.
     */

public class Vogais {
    
  public static void main(String[] args) {
		String texto;
		do{
			texto = digitaTexto();
		}while(textoErrado(texto));
		
		System.out.println("Este texto possui "
				+texto.length()+" caracteres.");
		System.out.println("Este texto possui "
				+qtVogais(texto)+" vogais.");
		System.out.println("Este texto possui "
				+qtConsoantes(texto)+" consoantes.");
	}

	static int qtConsoantes(String texto){
		int qt = 0;
		for (int i = 0; i < texto.length(); i++) {
			if ( (texto.charAt(i) != 'a') &&
			     (texto.charAt(i) != 'e') &&
			     (texto.charAt(i) != 'i') &&
			     (texto.charAt(i) != 'o') &&
			     (texto.charAt(i) != ' ') &&
			     (texto.charAt(i) != 'u') )   qt++;
		}
		return qt;
	}
	static int qtVogais(String texto) {
		int qt = 0;
		for (int i = 0; i < texto.length(); i++) {
			if ( (texto.charAt(i) == 'a') ||
			     (texto.charAt(i) == 'e') ||
			     (texto.charAt(i) == 'i') ||
			     (texto.charAt(i) == 'o') ||
			     (texto.charAt(i) == 'u') )   qt++;
		}
		return qt;
	}

	static boolean textoErrado(String texto){
		if (texto.length() > 15){
			System.out.println("***ERRO.");
		    return true;
		}
		return false;
	}
	
	static String digitaTexto(){
		Scanner e = new Scanner(System.in);
		System.out.println("Please, Digita o teu texto: ");
		return e.nextLine();
	}
}
