/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import  java.util.Scanner ;
/**
 *
 * @author marib
 */
public class Intervalos {
    
                   int contNeg  = 0;
	static int contZero = 0;
	static int contUnid = 0;
	static int contDez  = 0;
	static int contCent = 0;
	static int contMil  = 0;

	public static void main(String[] args) {
		Scanner e = new Scanner(System.in);
		do{
			System.out.println("\n**** Para finalizar digite [-9999]");
			System.out.print("Digite um número: ");
			System.out.println("\n....Este é um número "+teste(e.nextInt()));
			mostraContagem();
		}while(true);
	}//-------------------------------------

	static boolean finalizar(){
		Scanner e = new Scanner(System.in);
		System.out.print("finalizar? s/n: ");
		if (e.next().charAt(0) == 's') return true;
		return false;
	}//------------------------
	
	static void mostraContagem(){
		System.out.print("\n\n****Quantidade de números em cada faixa: ");
		System.out.print("\n    Negativos: "+contNeg);
		System.out.print("\n    Zeros    : "+contZero);
		System.out.print("\n    Unidades : "+contUnid);
		System.out.print("\n    Dezenas  : "+contDez);
		System.out.print("\n    Centenas : "+contCent);
		System.out.print("\n    Milhares : "+contMil);
	}//--------------------------
	
	static String teste(int numero){
		if (numero == -9999 && finalizar())
			System.exit(0);
		
		if((numero >= -1000)&&(numero <= 9999)){
			//System.out.print("\n....Este é um número ");
			if (numero < 0){
				contNeg++;  return "negativo. ";
			}
			if (numero == 0){
				contZero++; return "igual a zero.";
			}
			if ((numero > 0) && (numero < 10)){
				contUnid++; return "de unidade.";
			}
			if ((numero > 9)&&(numero < 100)){
				contDez++;  return "de dezena.";
			}
			if ((numero>99)&&(numero < 1000)){
				contCent++; return "de centena.";
			}
			if ((numero > 999)&& (numero < 10000)){
				contMil++;  return "de milhar.";
			}
		}
		return "\n***ERRO. Número fora do intervalo.";
		
	}//-------------------------------------
}
