package Cursos;

public class AlunoBasico extends Aluno{

	public AlunoBasico(String nome, String email, String cpf, Integer idade, Double  valorMensalidade, Integer matricula) {
		super(nome, email, cpf, idade, valorMensalidade, matricula);
	}

	public AlunoBasico() {

	}


	public double mensalidade() {
		double desconto = 0;
		double valorMensal = 99.00;
		desconto = getValorMensalidade()  * 0.1;
		
		valorMensal = getValorMensalidade() - desconto;
		
		return valorMensal;
	}
}
