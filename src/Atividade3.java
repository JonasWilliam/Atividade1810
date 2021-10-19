
public class Atividade3 {

	public static void main(String[] args) {
		double[] notas = {10, 5.0, 7.0, 9.0, 10.0};
		Aluno a1 = new Aluno("Jonas W." , notas);
		Aluno a2 = new Aluno("Fernanda" , notas);
		Aluno a3 = new Aluno("Jonas" , notas);
		Aluno a4 = new Aluno("Fabio" , notas);

	}

}
/*
 * Crie de  uma classe Aluno com os seguintes atributos e métodos: -String nome,
double[] notas,  aprovado(), maiorNota() e media() (além dos getters e setters
necessários).
dadas as notas: double[] notas = {10, 5.0, 7.0, 9.0, 10.0};, retorne as seguintes
observações sobre o aluno: a maior nota, média e caso média maior que 7 =
aprovado.*/
