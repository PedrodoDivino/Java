package Cursos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Plataforma plataforma = new Plataforma();
        Scanner scanner = new Scanner(System.in);

        String nome;
        String email;
        String cpf;
        int idade;
        double mensalidade = 0;
        double matricula;
        int opcao;

        do {
            System.out.println("\n Escolha uma opção: \n"
                    + "1- Adicionar um Aluno básico à turma. \n"
                    + "2- Adicionar um Aluno VIP à turma. \n"
                    + "3- Remover um Aluno da turma.\n"
                    + "4- Buscar um Aluno na Turma. \n"
                    + "5- Calcular o total de lucro do Curso.\n"
                    + "6- Editar aluno na Turma.\n"
                    + "7- Imprimir.\n"
                    + "9- Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1: {
                    try {
                        AlunoBasico aluno = new AlunoBasico();
                        System.out.println("Digite o nome do Aluno Básico: ");
                        nome = scanner.nextLine();
                        System.out.println("Digite o email do Aluno Básico: ");
                        email = scanner.nextLine();
                        System.out.println("Digite o CPF do Aluno Básico: ");
                        cpf = scanner.nextLine();
                        System.out.println("Digite a idade do Aluno Básico: ");
                        idade = scanner.nextInt();

                        System.out.println("Digite a matrícula do Aluno Básico: ");
                        matricula = scanner.nextDouble();
                        System.out.println("Digite a mensalidade do Aluno VIP: ");
                        mensalidade = scanner.nextDouble();

                        aluno.setNome(nome);
                        aluno.setEmail(email);
                        aluno.setCpf(cpf);
                        aluno.setIdade(idade);
                        aluno.setMatricula((int) matricula);
                        plataforma.adicionarAluno(aluno);
                        aluno.setValorMensalidade(mensalidade);
                        System.out.println("Voltando ao menu..: ");

                    } catch (InputMismatchException error) {
                        System.out.println("Tente novamente: " + error);
                        System.out.println("Voltando ao menu..: ");
                    }
                    break;
                }
                case 2:
                    try {
                        AlunoVip alunoVip = new AlunoVip();
                        System.out.println("Digite o nome do Aluno VIP: ");
                        nome = scanner.nextLine();
                        System.out.println("Digite o email do Aluno VIP: ");
                        email = scanner.nextLine();
                        System.out.println("Digite o CPF do Aluno VIP: ");
                        cpf = scanner.nextLine();
                        System.out.println("Digite a idade do Aluno VIP: ");
                        idade = scanner.nextInt();
                        System.out.println("Digite a matrícula do Aluno VIP: ");
                        matricula = scanner.nextDouble();
                        System.out.println("Digite a mensalidade do Aluno VIP: ");
                        mensalidade = scanner.nextDouble();

                        alunoVip.setNome(nome);
                        alunoVip.setEmail(email);
                        alunoVip.setCpf(cpf);
                        alunoVip.setIdade(idade);
                        alunoVip.setMatricula((int) matricula);
                        alunoVip.setValorMensalidade(mensalidade);
                        plataforma.adicionarAluno(alunoVip);
                        System.out.println("Voltando ao menu..: ");
                    } catch (InputMismatchException error) {
                        System.out.println("Tente novamente: " + error);
                        System.out.println("Voltando ao menu..: ");
                    }
                    break;
                case 3:
                    System.out.println("Digite o CPF do aluno para remover: ");
                    cpf = scanner.nextLine();
                    plataforma.removerAluno(cpf);
                    break;
                case 4:
                    System.out.println("Digite o CPF do aluno para buscar: ");
                    cpf = scanner.nextLine();
                    plataforma.buscar(cpf);
                    break;
                case 5:

                        System.out.println(plataforma.lucroCurso());

                    break;
                case 6:
                    System.out.println("Digite o CPF do aluno para editar: ");
                    cpf = scanner.nextLine();
                    System.out.println("Digite o nome do aluno para editar: ");
                    nome = scanner.nextLine();
                    System.out.println("Digite o email do aluno para editar: ");
                    email = scanner.nextLine();
                    System.out.println("Digite a idade do aluno para editar: ");
                    idade = scanner.nextInt();
                    System.out.println("Digite a matrícula do aluno para editar: ");
                    matricula = scanner.nextInt();
                    plataforma.editarAluno(cpf, nome, email, idade, (int) matricula);
                    System.out.println("Voltando ao menu..: ");
                    break;
                case 7:
                    System.out.println(plataforma.imprimirTurma());
                    break;
                case 9:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 9);

    }

}
