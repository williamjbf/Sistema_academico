package models;

import main.App;

import java.util.ArrayList;
import java.util.List;

public class Turma {

    private List<Materia> materias = new ArrayList<>();
    private List<Aluno> alunos = new ArrayList<>();
    private int codigo;
    
    public Turma(){
        this.codigo = App.turmas.size();
    }

    @Override
    public String toString() {
        return "Turma{" +
                "codigo=" + codigo +
                ", materias=" + materias +
                ", alunos=" + alunos +
                '}';
    }

    public void adiconar_materia(String nome){
        materias.add(new Materia(nome));
    }

    public void adicionar_aluno(Aluno aluno){
        alunos.add(aluno);
    }

    public List<Materia> getMateria() {
        return materias;
    }
    public List<Aluno> getAlunos() {
        return alunos;
    }

    public int getCodigo() {
        return codigo;
    }

}
