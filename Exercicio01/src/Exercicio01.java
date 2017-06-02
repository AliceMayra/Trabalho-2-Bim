
public class Exercicio01 {

	public static void main(String[] args) {
		Imprimir(0);
		
	}
		
		static public void Imprimir(int val) {
			System.out.println("Num : " + val);
			val ++;
			
			if ( val <= 100)  Imprimir (val);
	}

}
