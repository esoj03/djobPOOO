package sprint1;

import java.util.List;

public class Alumni extends Estudante{

    private String trabalho;
    private String funcao;
    private String email;

    public Alumni(String username, String email, String nome, String apelido, String pseudonome, String alcunha, String password, boolean visivel, List<String> interesses, PedradaDigital pedradaDigital, int codigo, String curso, int anomatricula, int anocurso, String status, String trabalho, String funcao, String email1) {
        super(username, email, nome, apelido, pseudonome, alcunha, password, visivel, interesses, pedradaDigital, codigo, curso, anomatricula, anocurso, status);
        this.trabalho = trabalho;
        this.funcao = funcao;
        this.email = email1;
    }
}
