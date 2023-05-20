package sprint1;

public class Estudante extends Isecmarini{
    private int codigo;
    private String curso;
    private int anomatricula;
    private int anocurso;
    private String status;

    // Construtor
    public Estudante(int codigo, String curso, int anomatricula, int anocurso, String status) {
        super();
        this.codigo = codigo;
        this.curso = curso;
        this.anomatricula = anomatricula;
        this.anocurso = anocurso;
        this.status = status;
    }

    // Getters e Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAnoMatricula() {
        return anomatricula;
    }

    public void setAnoMatricula(int anomatricula) {
        this.anomatricula = anomatricula;
    }

    public int getAnoCurso() {
        return anocurso;
    }

    public void setAnoCurso(int anocurso) {
        this.anocurso = anocurso;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Método mandaPaTurma
    public void mandaPaTurma() {
        System.out.println("Mandando mensagem para a turma...");
        // Lógica para enviar mensagem para a turma
    }



}
