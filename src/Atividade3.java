
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
 * Crie de  uma classe Aluno com os seguintes atributos e m�todos: -String nome,
double[] notas,  aprovado(), maiorNota() e media() (al�m dos getters e setters
necess�rios).
dadas as notas: double[] notas = {10, 5.0, 7.0, 9.0, 10.0};, retorne as seguintes
observa��es sobre o aluno: a maior nota, m�dia e caso m�dia maior que 7 =
aprovado.*/
