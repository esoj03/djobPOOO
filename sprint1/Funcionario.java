package sprint1;

import java.util.List;

public class Funcionario extends Isecmarini{
    private String uo;
    private String funcao;

    public Funcionario(String username, String email, String nome, String apelido, String pseudonome, String alcunha, String password, boolean visivel, List<String> interesses, PedradaDigital pedradaDigital, String uo, String funcao) {
        super(username, email, nome, apelido, pseudonome, alcunha, password, visivel, interesses, pedradaDigital);
        this.uo = uo;
        this.funcao = funcao;
    }

    public String getuo() {
        return uo;
    }

    public String getfuncao() {
        return funcao;
    }
}

