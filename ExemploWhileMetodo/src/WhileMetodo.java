/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author marib
 */
public class WhileMetodo {
     public static void main(String[] args) {
        System.out.println("um");
		do{
			System.out.println("dois");
		}while(continuar());
		System.out.println("quatro");
	}
/* */
	static boolean continuar() {
		Scanner e = new Scanner(System.in);
		char sn;
		do{
			System.out.println("Continuar? s/n");
			sn = e.next().charAt(0);
			sn = Character.toLowerCase(sn);
			if (digitouErrado(sn))
				System.out.println("***NNÃÃÃÃÃÃÃOOOOOOOOOOO");
		}while(digitouErrado(sn));
		if(sn == 's') return true;
		return false;
	}
	
	 static boolean digitouErrado(char sn) {
		if (sn != 's' && 
			sn != 'n'
		   )
			return true;
		return false;
	}
	
	 /* */
	
	 
	 
	 /** /
		static boolean continuar() {
			Scanner e = new Scanner(System.in);
			char sn;
			do{
				System.out.println("Continuar? s/n");
				sn = e.next().charAt(0);
				if (sn != 's' && sn != 'n')
					System.out.println("***NNÃÃÃÃÃÃÃOOOOOOOOOOO");
			}while(sn != 's' && sn != 'n');

			if(sn == 's') return true;
			return false;
		}
	/ **/	
}
