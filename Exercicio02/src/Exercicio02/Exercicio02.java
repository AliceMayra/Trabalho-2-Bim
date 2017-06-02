package Exercicio02;

public class Exercicio02 {

	public static void main(String[] args) {
		ImprimirDec(100);

	}

	static public void ImprimirDec(int val) {
		System.out.println("Num : " + val);
		val --;

		if ( val >= 0)  ImprimirDec (val);
	}

}

