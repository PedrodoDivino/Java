package Cursos;

public class Curso {
	private String nome;
	private Double valor;
	private String duracao;
	private Integer idCurso;
	
	public Curso() {
		super();
	}
	public Curso(String nome, Double valor, String duracao, Integer idCurso) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.duracao = duracao;
		this.idCurso = idCurso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	
	
	public Integer getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}
	public String imprimirCurso() {
		return "Nome Curso: " + nome + "\n"
				+ "Valor: " + valor + "\n"
				+ "Duração: " + duracao + "\n";
	}
}
