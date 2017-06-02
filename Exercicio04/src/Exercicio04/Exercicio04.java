package Exercicio04;

import java.util.Scanner;

public class Exercicio04 {
	static Scanner leitor = new Scanner(System.in);

	public static void main(String[] args) {
		int [] vetor = new int [10];
		int k = 0;


		for (int a = 0; a < vetor.length; a++){
			System.out.println("Digite o "+ (a+1)+" número. ");
			vetor[a] = leitor.nextInt();
		}
		int menor= buscarmenor(vetor, k, vetor[k]);
		System.out.println("O menor número é "+ menor);
	}

	 static int buscarmenor(int[] vetor, int i, int j) {
		if (i == j)
			return vetor [i];
		else {
			int n1, n2;
			int m;
			m = ( i+ j) / 2;
			n1 = buscarmenor(vetor, i, m);
			n2= buscarmenor (vetor, m+1, j);

			if (n1 < n2) return n1;
			else return n2;


		}
	}

}


