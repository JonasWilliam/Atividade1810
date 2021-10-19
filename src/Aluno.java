
public class Aluno {
	private String nome;
	private double[] notas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public Aluno(String nome, double[] notas) {
		this.nome = nome;
		this.notas = notas;
		media();
		maiorNota();
	}

	public void aprovado() {
		System.out.println("Aprovado.");
	}

	public void media() {
		double somaTotal = 0, media = 0;
		for (double i : this.getNotas()) {
			somaTotal += i;
		}
		media = somaTotal / this.getNotas().length;
		System.out.println("Media: " + media);
		if (media >= 7) {
			aprovado();
		} else {
			reprovado();
		}
	}

	public void maiorNota() {
		double maiorNota = 0;
		for (double i : this.getNotas()) {
			if (i >= maiorNota) {
				maiorNota = i;
			}
		}
		System.out.println("Maior nota: " + maiorNota);
	}

	public void reprovado() {
		System.out.println("Reprovado.");
	}
}
