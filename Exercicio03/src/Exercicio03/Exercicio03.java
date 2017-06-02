package Exercicio03;

import java.util.Scanner;

public class Exercicio03 {

	static Scanner Leitor = new Scanner(System.in);

	public static void main(String[] args) {
		
		int [] vetor = new int [10];

	for (int a = 0 ; a < vetor.length ; a++){
		System.out.println("Digite o "+(a+1)+"º número: \n" );
		vetor[a] = Leitor.nextInt();
	}

	int resultado = soma(vetor, 0);
	System.out.println("O resultado da soma é: "+resultado);

	}

	static int soma(int [] vetor, int a) {
		if (a < vetor.length){
			return vetor[a] + soma(vetor, a+1);
		}
		return 0;
	}
}



