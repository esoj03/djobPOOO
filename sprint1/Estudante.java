package sprint1;

import java.util.List;

public class Estudante extends Isecmarini{
    private int codigo;
    private String curso;
    private int anomatricula;
    private int anocurso;
    private String status;

    // Construtor


    public Estudante(String username, String email, String nome, String apelido, String pseudonome, String alcunha, String password, boolean visivel, List<String> interesses, PedradaDigital pedradaDigital, int codigo, String curso, int anomatricula, int anocurso, String status) {
        super(username, email, nome, apelido, pseudonome, alcunha, password, visivel, interesses, pedradaDigital);
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

        // Exemplo de código para enviar mensagem para a turma
        List<String> colegas = (List<String>) this.getPedradaDigital();
        for (String colega : colegas) {
            System.out.println("Enviando mensagem para " + colega);
        }
    }


}
