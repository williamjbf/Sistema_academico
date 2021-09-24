package models;

import interfaces.Menu;
import main.App;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Professor extends Usuario implements Menu {
    Scanner scan = new Scanner(System.in);

    List<Turma> turmas = new ArrayList<>();
    public Professor(int id, String nome, String login, String senha) {
        super(id, nome, login, senha, 1);
    }

    public void listar_turma(){
        for(Turma turma:turmas){
            System.out.println(turma);
        }
    }

    public void criar_turma(){
        String limpar = scan.nextLine();
        Turma turma = new Turma();
        this.turmas.add(turma);
        App.turmas.add(turma);
    }

    public void adicionar_materia(){
        String limpar = scan.nextLine();
        System.out.println("Digite o codigo da turma");
        int codigo = scan.nextInt();
        for (Turma turma: turmas){
            if(turma.getCodigo() == codigo) {
                limpar = scan.nextLine();
                System.out.println("Digite o nome da materia");
                String nome = scan.nextLine();
                turma.adiconar_materia(nome);
            }
        }
    }


    @Override
    public void menu() {
        boolean continuar = true;
        while (continuar) {
            System.out.println("1- listar turmas");
            System.out.println("2- criar turmas");
            System.out.println("3- adiciona materia");
            System.out.println("1- listar turmas");
            System.out.println("0- sair");
            int opcao = scan.nextInt();
            switch (opcao) {
                case 1 -> listar_turma();
                case 2 -> criar_turma();
                case 3 -> adicionar_materia();
                case 0 -> continuar = false;
            }
        }
    }
}
