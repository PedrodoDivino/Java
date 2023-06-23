package Cursos;

public abstract class Aluno {
	private String nome;
	private String email;
	private String cpf;
	private Integer idade;
	private Double valorMensalidade;
	private Integer matricula;
	
	public Aluno() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getValorMensalidade() {
		return valorMensalidade;
	}

	public void setValorMensalidade(Double valorMensalidade) {
		this.valorMensalidade = valorMensalidade;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public Aluno(String nome, String email, String cpf, Integer idade, Double  valorMensalidade, Integer matricula) {
		super();
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.idade = idade;
		this.valorMensalidade = valorMensalidade;
		this.matricula = matricula;
	}


	//POLIMORFISMO
	public double mensalidade() {

		double valorMensal = 99.00;
		double desconto = 0.1;
		
		double totalValor = valorMensal  - desconto ;
		
		return totalValor;
	}

	public String toString() {
		return "Nome: " + nome + "\n"
				+ "Idade: " + idade + "\n"
				+ "Cpf: " + cpf + "\n"
				+ "Email: " + email + "\n"
				+ "Mensalidade: " + valorMensalidade + "\n";
	}
}
