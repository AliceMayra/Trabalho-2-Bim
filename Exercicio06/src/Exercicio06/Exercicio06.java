package Exercicio06;

public class Exercicio06 {

	public static void main(String [] args){
		par(0);
	}


	private static int par(int numero) {
		System.out.println(numero);
		if(numero == 100){
			return numero;
		}
		numero = numero + 2; 
		return numero + par(numero);
	}


}