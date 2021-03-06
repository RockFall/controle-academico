package model;

public class Disciplina {
    private String nome;
    private String professor;
    private int qntCreditos;
    private String codigo;
    private int cargaHoraria;

    /*
        CONSTRUTORES
    */
    public Disciplina(String nome, int qntCreditos, String codigo) {
        this.nome = nome;
        this.qntCreditos = qntCreditos;
        this.codigo = codigo;
        this.cargaHoraria = qntCreditos * 15;
        
    }

    public void ExibirDisciplina(){

        System.out.printf("- %s - %s - Professor: %s - Creditos: %d\n", this.nome, this.codigo, this.professor, this.qntCreditos);
    }

    /*
        SETTERS
    */
    public void setProfessor( String professor) {
        this.professor = professor;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQntCreditos(int qntCreditos){
        this.qntCreditos = qntCreditos;
    }

    /*
        GETTERS
    */
    public String getProfessor() {
        return professor;
    }

    public String getNome() {
        return nome;
    }

    public int getQntCreditos(){
        return qntCreditos;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public int getcargaHoraria(){
        return this.cargaHoraria;
    }

}
