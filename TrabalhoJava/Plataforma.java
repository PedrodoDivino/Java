package Cursos;

import java.util.ArrayList;

public class Plataforma {
	private ArrayList<Aluno> turma01;
	private ArrayList<Curso> curso;
 	
	public Plataforma() {
		turma01 = new ArrayList<Aluno>();
	}

	public ArrayList<Aluno> getTurma01() {
		return turma01;
	}

	public void setTurma01(ArrayList<Aluno> turma01) {
		this.turma01 = turma01;
	}

	public ArrayList<Curso> getCurso() {
		return curso;
	}

	public void setCurso(ArrayList<Curso> curso) {
		this.curso = curso;
	}

	public Plataforma(ArrayList<Aluno> turma01) {
		super();
		this.turma01 = turma01;
	}


	public ArrayList<Aluno> getListaCurso() {
		return turma01;
	}


	public void setListaCurso(ArrayList<Aluno> turma01) {
		this.turma01 = turma01;
	}
	public void adicionarAluno(Aluno aluno) {
				turma01.add(aluno);
	}
	
	public void removerAluno(String cpf) {
		for(int i = 0; i < turma01.size(); i++) {
			if(turma01.get(i).getCpf().equals(cpf)) {
				turma01.remove(i);
			}
		}
		
	}
	
	public void buscar(String cpf) {
		for(int i = 0; i < turma01.size(); i++) {
			if(turma01.get(i).getCpf().equals(cpf)) {
				System.out.println(turma01.get(i).toString());
				break;
			}
		}
	}
	//Polimorfismo
	public double lucroCurso() {
		double calculoLucro = 0.0;
		for(int i = 0; i < turma01.size(); i++) {
			calculoLucro += turma01.get(i).mensalidade();
		}
		return calculoLucro;
	}

	public void editarAluno(String cpf, String nome, String email, int idade,int matricula){
		for (int i = 0; i <turma01.size(); i++){
			if(turma01.get(i).getCpf().equals(cpf)){
				turma01.get(i).setNome(nome);
				turma01.get(i).setIdade(idade);
				turma01.get(i).setEmail(email);
				turma01.get(i).setMatricula(matricula);
			}
		}
	}


	public String imprimirTurma() {
		return "Minha turma é :  " + turma01 ;
	}
}
