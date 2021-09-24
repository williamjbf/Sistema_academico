package main;

import models.Aluno;
import models.Materia;
import models.Professor;
import models.Turma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static List<Professor> professores = new ArrayList<>();
    public static List<Aluno> alunos = new ArrayList<>();
    public static List<Turma> turmas = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
                System.out.println("1- fazer login");
                System.out.println("2- cadastrar no sistema");
                System.out.println("0- sair");
                int opcao = scan.nextInt();
                if (opcao == 1) {
                    System.out.println("Você é 1-Professor ou 2-Aluno");
                    int opcao_usuario = scan.nextInt();
                    scan.nextLine();
                    if (opcao_usuario == 1) {
                        System.out.println("Digite o seu login");
                        String login = scan.nextLine();
                        System.out.println("Digite a sua senha");
                        String senha = scan.nextLine();
                        for (Professor professor : professores) {
                            if (professor.fazer_login(login, senha)) {
                                professor.menu();
                                break;
                            }
                        }
                    } else if (opcao_usuario == 2) {
                        System.out.println("Digite o seu login");
                        String login = scan.nextLine();
                        System.out.println("Digite a sua senha");
                        String senha = scan.nextLine();
                        for (Aluno aluno : alunos) {
                            if (aluno.fazer_login(login, senha)) {
                                aluno.menu();
                                break;
                            }
                        }
                    }
                } else if (opcao == 2) {
                    System.out.println("Você quer cadastrar 1-Professor ou 2-Aluno");
                    int opcao_cadastro = scan.nextInt();
                    scan.nextLine();
                    if (opcao_cadastro == 1) {
                        System.out.println("Digite seu nome");
                        String nome = scan.nextLine();
                        System.out.println("Digite seu login");
                        String login = scan.nextLine();
                        System.out.println("Digite sua senha");
                        String senha = scan.nextLine();
                        professores.add(new Professor(professores.size(), nome, login, senha));
                        System.out.println("Usuario criado com sucesso, faça o login");
                    } else if (opcao_cadastro == 2) {
                        System.out.println("Digite seu nome");
                        String nome = scan.nextLine();
                        System.out.println("Digite seu login");
                        String login = scan.nextLine();
                        System.out.println("Digite sua senha");
                        String senha = scan.nextLine();
                        alunos.add(new Aluno(alunos.size(), nome, login, senha));
                        System.out.println("Usuario criado com sucesso, faça o login");
                    }
                } else {
                    continuar = false;
                }

            }
        }

    }

