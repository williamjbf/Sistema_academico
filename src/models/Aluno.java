package models;

import interfaces.Menu;
import main.App;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aluno extends Usuario implements Menu {
    private Scanner scan = new Scanner(System.in);
    private Turma turma;

    public Aluno(int id,String nome, String login, String senha) {
        super(id,nome, login, senha, 2);
    }

    public void entrar_turma(){
        System.out.println("Digite o codigo da materia");
        int codigo = scan.nextInt();
        for (Turma turma: App.turmas){
            if (turma.getCodigo() == codigo){
                turma.adicionar_aluno(this);
                this.turma = turma;
            }
        }
    }

    public void listar_materias(){
        for(Materia materia: turma.getMateria()){
            System.out.println(materia);
        }
    }
    public List<Materia> materias_cadastradas(){
        return turma.getMateria();
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void menu() {
        Scanner scan = new Scanner(System.in);
        boolean continuar = true;
        System.out.println("Seja bem-vindo(a) " + this.getNome());
        while (continuar){
            System.out.println("1- entrar na turma");
            System.out.println("2- listar materias");
            System.out.println("0- sair");
            int opcao = scan.nextInt();
            switch (opcao){
                case 1 -> entrar_turma();
                case 2 -> listar_materias();
                case 0 -> continuar = false;
            }

        }
    }
}
