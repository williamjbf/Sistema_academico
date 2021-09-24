package models;

public abstract class Usuario {

    protected int id;
    protected String nome;
    protected String login;
    protected String senha;
    protected int tipo_usuario;

    public Usuario(int id, String nome,String login, String senha, int tipo_usuario) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.tipo_usuario = tipo_usuario;
    }

    public boolean fazer_login(String login, String senha){
        if(this.login.equals(login) && this.senha.equals(senha)){
            return true;
        }else{
            return false;
        }
    }

    public void menu_professor(){

    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getTipo_usuario() {
        return tipo_usuario;
    }
}
