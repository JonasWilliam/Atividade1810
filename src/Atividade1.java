
public class Atividade1 {

	public static void main(String[] args) {
		int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
		int maiorAtual = 0, menorAtual = array[0];
		double somaTotal = 0, media;
		for (int i : array) {
			somaTotal += i;
			if (i >= maiorAtual) {
				maiorAtual = i;
			}
			if (i <= menorAtual) {
				menorAtual = i;
			}
		}
		media = somaTotal / array.length;
		System.out.println("A Soma �: " + somaTotal );
		System.out.println("A Media �: " + media);
		System.out.println("O maior �: " + maiorAtual);
		System.out.println("O maior �: " + menorAtual);
	}

}
/*
 * Dado o seguinte array: int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76,
 * 87 }; A. Retorno o valor total da soma de todos os elementos com foreach B.
 * Retorne a m�dia de todos os elementos C. Retorne o maior valor e o menor
 * elemento
 */