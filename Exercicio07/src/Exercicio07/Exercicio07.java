package Exercicio07;

public class Exercicio07 {

	public static void main(String[] args) {
		
		impar(0);
	}


	private static int impar(int numero) {
		if(numero == 0){
			numero = numero +1;
			return numero + impar (numero);
		} else if (numero < 100){
			System.out.println(numero);
			numero= numero +2;
			return numero + impar (numero);
		}
		
		return numero;
	}


}